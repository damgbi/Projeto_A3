package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.RelatorioPresenca;

public class RelatorioPresencaDAO {
    private Connection conn;

    public RelatorioPresencaDAO() {
        this.conn = ConexaoMySQL.conectar();
    }

    public List<RelatorioPresenca> listarRelatorioPresenca() {
        List<RelatorioPresenca> lista = new ArrayList<>();

        String sql = """
            SELECT u.nome, m.id AS matricula, p.data, p.status
            FROM presenca p
            JOIN usuario u ON p.usuario_id = u.id
            JOIN matricula m ON m.usuario_id = u.id
            ORDER BY p.data DESC, u.nome
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                RelatorioPresenca rp = new RelatorioPresenca();
                rp.setNome(rs.getString("nome"));
                rp.setMatricula(rs.getInt("matricula"));
                rp.setData(rs.getDate("data"));
                rp.setStatus(rs.getString("status"));
                lista.add(rp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}