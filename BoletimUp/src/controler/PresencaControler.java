package controler;

import DAO.PresencaDAO;
import java.util.Date;
import model.Presenca;

public class PresencaControler {
    private PresencaDAO dao = new PresencaDAO();

    public boolean registrarPresenca(int usuarioId, Date dataUtil, String status) {
        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
        return dao.salvarOuAtualizarPresenca(usuarioId, dataSql, status);
    }
}