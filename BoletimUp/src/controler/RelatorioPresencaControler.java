package controler;

import DAO.RelatorioPresencaDAO;
import java.util.List;
import model.RelatorioPresenca;

public class RelatorioPresencaControler {
    private RelatorioPresencaDAO dao;

    public RelatorioPresencaControler() {
        this.dao = new RelatorioPresencaDAO();
    }

    public List<RelatorioPresenca> listarRelatorioPresenca() {
        return dao.listarRelatorioPresenca();
    }
}