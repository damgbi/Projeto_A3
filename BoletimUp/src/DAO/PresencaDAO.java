package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;
import model.Presenca;
import java.sql.ResultSet;

public class PresencaDAO {
    private Connection conn;

    public PresencaDAO() {
        conn = ConexaoMySQL.conectar();
    }

    public boolean salvarOuAtualizarPresenca(int usuarioId, Date data, String novoStatus) {
        String verificarSql = "SELECT status FROM presenca WHERE usuario_id = ? AND data_presenca = ?";
        String atualizarSql = "UPDATE presenca SET status = ? WHERE usuario_id = ? AND data_presenca = ?";
        String inserirSql = "INSERT INTO presenca (usuario_id, data_presenca, status) VALUES (?, ?, ?)";

        try (PreparedStatement verificarStmt = conn.prepareStatement(verificarSql)) {
            verificarStmt.setInt(1, usuarioId);
            verificarStmt.setDate(2, new java.sql.Date(data.getTime()));
            ResultSet rs = verificarStmt.executeQuery();

            if (rs.next()) {
                try (PreparedStatement atualizarStmt = conn.prepareStatement(atualizarSql)) {
                    atualizarStmt.setString(1, novoStatus);
                    atualizarStmt.setInt(2, usuarioId);
                    atualizarStmt.setDate(3, new java.sql.Date(data.getTime()));
                    atualizarStmt.executeUpdate();
                }

            } else {
                try (PreparedStatement inserirStmt = conn.prepareStatement(inserirSql)) {
                    inserirStmt.setInt(1, usuarioId);
                    inserirStmt.setDate(2, new java.sql.Date(data.getTime()));
                    inserirStmt.setString(3, novoStatus);
                    inserirStmt.executeUpdate();
                }
            }

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}