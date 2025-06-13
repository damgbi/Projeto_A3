package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class AlunoDAO {
    private Connection conn;

    public AlunoDAO() {
        this.conn = ConexaoMySQL.conectar();
    }

    public boolean emailJaExiste(String email) {
        String sql = "SELECT COUNT(*) FROM aluno WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean registrarAluno(String nome, String email) throws SQLException {
        try {
            
            if (emailJaExiste(email)) {
                System.out.println("E-mail já cadastrado: " + email);
                return false;
            }
            
            String sqlUsuario = "INSERT INTO usuario (nome, perfil_usuario) VALUES (?, 'aluno')";
            PreparedStatement stmtUsuario = conn.prepareStatement(sqlUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, nome);
            stmtUsuario.executeUpdate();

            ResultSet rs = stmtUsuario.getGeneratedKeys();
            int usuarioId = 0;

            if (rs.next()) {
                usuarioId = rs.getInt(1);
            } else {
                return false;
            }

            String sqlAluno = "INSERT INTO aluno (usuario_id, email, senha) VALUES (?, ?, NULL)";
            PreparedStatement stmtAluno = conn.prepareStatement(sqlAluno);
            stmtAluno.setInt(1, usuarioId);
            stmtAluno.setString(2, email);
            stmtAluno.executeUpdate();

            String sqlNotas = "INSERT INTO notas (usuario_id, avaliacao1, avaliacao2, avaliacao3) VALUES (?, 0.0, 0.0, 0.0)";
            PreparedStatement stmtNotas = conn.prepareStatement(sqlNotas);
            stmtNotas.setInt(1, usuarioId);
            stmtNotas.executeUpdate();

            String sqlMatricula = "INSERT INTO matricula (usuario_id) VALUES (?)";
            PreparedStatement stmtMatricula = conn.prepareStatement(sqlMatricula);
            stmtMatricula.setInt(1, usuarioId);
            stmtMatricula.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        
    }  
    
    public Aluno buscarAlunoPorMatricula(int matricula) {
        String sql = """
            SELECT u.id AS usuario_id, u.nome, a.email, n.avaliacao1, n.avaliacao2, n.avaliacao3
            FROM matricula m
            JOIN aluno a ON m.usuario_id = a.usuario_id
            JOIN usuario u ON u.id = a.usuario_id
            JOIN notas n ON n.usuario_id = a.usuario_id
            WHERE m.id = ?
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, matricula);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Aluno aluno = new Aluno(
                    rs.getString("nome"),
                    rs.getString("email"),
                    null,
                    matricula,
                    rs.getBigDecimal("avaliacao1"),
                    rs.getBigDecimal("avaliacao2"),
                    rs.getBigDecimal("avaliacao3")
                );

                aluno.setUsuarioId(rs.getInt("usuario_id"));

                return aluno;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public boolean atualizarNotasAluno(int matricula, BigDecimal a1, BigDecimal a2, BigDecimal a3) {
        String sql = """
            UPDATE notas n
            JOIN matricula m ON n.usuario_id = m.usuario_id
            SET n.avaliacao1 = ?, n.avaliacao2 = ?, n.avaliacao3 = ?
            WHERE m.id = ?
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBigDecimal(1, a1);
            stmt.setBigDecimal(2, a2);
            stmt.setBigDecimal(3, a3);
            stmt.setInt(4, matricula);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Aluno> listarTodos() {
        List<Aluno> lista = new ArrayList<>();

        String sql = """
            SELECT u.nome, m.id AS matricula
            FROM usuario u
            JOIN aluno a ON u.id = a.usuario_id
            JOIN matricula m ON m.usuario_id = u.id
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getInt("matricula"));
                lista.add(aluno);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    public boolean senhaJaDefinida(String email) {
        String sql = "SELECT senha FROM aluno WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("senha") != null; // ← impede redefinição
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean atualizarSenha(String email, String novaSenha) {
        String sql = "UPDATE aluno SET senha = ? WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, novaSenha);
            stmt.setString(2, email);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}