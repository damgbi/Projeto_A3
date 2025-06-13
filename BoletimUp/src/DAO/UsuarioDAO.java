
package DAO;
import java.sql.*;
import model.Usuario;

public class UsuarioDAO {
    private Connection conn;
    
    public UsuarioDAO() {
        conn = ConexaoMySQL.conectar();
    }
    
    public boolean cadastrarUsuario(String nomeCompleto, String email, String senha, String tipoUsuario){
        try {
            conn.setAutoCommit(false);
            
            String sqlUsuario = "INSERT INTO usuario (nome, perfil_usuario) VALUES (?,?)";
            PreparedStatement stmtUsuario = conn.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, nomeCompleto);
            stmtUsuario.setString(2, tipoUsuario);
            stmtUsuario.executeUpdate();
            
            ResultSet rs = stmtUsuario.getGeneratedKeys();
            int usuarioId = -1;
            if (rs.next()) {
                usuarioId = rs.getInt(1);
            }
            
            if (tipoUsuario.equals("aluno")){
                String sqlAluno = "INSERT INTO aluno (usario_id, email, senha) VALUES (?, ?, ?)";
                PreparedStatement stmtAluno = conn.prepareStatement(sqlAluno);
                stmtAluno.setInt(1, usuarioId);
                stmtAluno.setString(2, email);
                stmtAluno.setString(3, senha);
                stmtAluno.executeUpdate();
                
                String sqlMat = "INSERT INTO matricula (usuario_id) VALUES (?)";
                PreparedStatement stmtMat = conn.prepareStatement(sqlMat);
                stmtMat.setInt(1, usuarioId);
                stmtMat.executeUpdate();
                
                String sqlNotas = "INSERT INTO notas (usuario_id, avaliacao1, avaliacao2, avaliacao3) VALUES (?, 0, 0, 0)";
                PreparedStatement stmtNotas = conn.prepareStatement(sqlNotas);
                stmtNotas.setInt(1, usuarioId);
                stmtNotas.executeUpdate();
                
            } else if ( tipoUsuario.equals("professor")){
                String sqlProf = "INSERT INTO professor (usuario_id, email, senha) VALUES (?, ?, ?)";
                PreparedStatement stmtProf = conn.prepareStatement(sqlProf);
                stmtProf.setInt(1,usuarioId);
                stmtProf.setString(2,email);
                stmtProf.setString(3, senha);
                stmtProf.executeUpdate();
                
            }
            
            conn.commit();
            return true;
            
        } catch(SQLException e){
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            return false;
        }
    }
}
