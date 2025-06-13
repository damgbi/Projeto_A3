package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private Connection conn;

    public LoginDAO() {
        conn = ConexaoMySQL.conectar();
    }

    public String autenticar(String email, String senha) {
        String[] tipos = {"aluno", "professor", "admin"};

        for (String tipo : tipos) {
            String sql = "SELECT u.nome, u.perfil_usuario " +
                         "FROM usuario u " +
                         "JOIN " + tipo + " t ON u.id = t.usuario_id " +
                         "WHERE t.email = ? AND t.senha = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, email.trim());
                stmt.setString(2, senha.trim());

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getString("perfil_usuario");
                    }
                }
            } catch (SQLException e) {
                System.err.println("Erro ao autenticar como " + tipo);
                e.printStackTrace();
            }
        }

        return null;
    }
}