package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.RelatorioAluno;

public class RelatorioAlunoDAO {
    private Connection conn;

    public RelatorioAlunoDAO() {
        this.conn = ConexaoMySQL.conectar();
    }

    public List<RelatorioAluno> listarRelatorioAlunos() throws SQLException {
        List<RelatorioAluno> lista = new ArrayList<>();

        String sql = """
            SELECT u.nome, m.id AS matricula, 
                   n.avaliacao1, n.avaliacao2, n.avaliacao3,
                   ROUND((n.avaliacao1 + n.avaliacao2 + n.avaliacao3)/3, 2) AS media_notas,
                   ROUND((SUM(CASE p.status WHEN 'presente' THEN 1 ELSE 0 END) / COUNT(p.id)) * 100, 2) AS media_presenca,
                   CASE 
                     WHEN ROUND((n.avaliacao1 + n.avaliacao2 + n.avaliacao3)/3, 2) >= 7 AND
                          (SUM(CASE p.status WHEN 'presente' THEN 1 ELSE 0 END) / COUNT(p.id)) >= 0.75
                     THEN 'Aprovado'
                     ELSE 'Reprovado'
                   END AS situacao
            FROM usuario u
            JOIN aluno a ON u.id = a.usuario_id
            JOIN matricula m ON m.usuario_id = a.usuario_id
            LEFT JOIN notas n ON n.usuario_id = a.usuario_id
            LEFT JOIN presenca p ON p.usuario_id = a.usuario_id
            GROUP BY u.nome, m.id, n.avaliacao1, n.avaliacao2, n.avaliacao3;
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                RelatorioAluno aluno = new RelatorioAluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setAvaliacao1(rs.getDouble("avaliacao1"));
                aluno.setAvaliacao2(rs.getDouble("avaliacao2"));
                aluno.setAvaliacao3(rs.getDouble("avaliacao3"));
                aluno.setMediaNotas(rs.getDouble("media_notas"));
                aluno.setMediaPresenca(rs.getDouble("media_presenca"));
                aluno.setSituacao(rs.getString("situacao"));

                lista.add(aluno);
            }
        }

        return lista;
    }
    
    public RelatorioAluno buscarRelatorioPorEmail(String email) {
        String sql = """
            SELECT u.nome, a.email, m.id AS matricula, 
                   n.avaliacao1, n.avaliacao2, n.avaliacao3,
                   ROUND((n.avaliacao1 + n.avaliacao2 + n.avaliacao3) / 3, 2) AS media_notas,
                   (
                       SELECT 
                           ROUND(COUNT(*) * 100.0 / NULLIF((SELECT COUNT(*) FROM presenca p2 WHERE p2.usuario_id = u.id), 0), 2)
                       FROM presenca p
                       WHERE p.usuario_id = u.id AND p.status = 'presente'
                   ) AS media_presenca,
                   CASE 
                       WHEN ROUND((n.avaliacao1 + n.avaliacao2 + n.avaliacao3) / 3, 2) >= 7
                            AND (
                                SELECT COUNT(*) FROM presenca p WHERE p.usuario_id = u.id AND p.status = 'presente'
                            ) >= (
                                SELECT COUNT(*) * 0.75 FROM presenca p2 WHERE p2.usuario_id = u.id
                            )
                       THEN 'Aprovado'
                       ELSE 'Reprovado'
                   END AS situacao
            FROM usuario u
            JOIN aluno a ON a.usuario_id = u.id
            JOIN matricula m ON m.usuario_id = u.id
            JOIN notas n ON n.usuario_id = u.id
            WHERE a.email = ?
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new RelatorioAluno(
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getInt("matricula"),
                    rs.getDouble("avaliacao1"),
                    rs.getDouble("avaliacao2"),
                    rs.getDouble("avaliacao3"),
                    rs.getDouble("media_presenca"),
                    rs.getString("situacao")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}