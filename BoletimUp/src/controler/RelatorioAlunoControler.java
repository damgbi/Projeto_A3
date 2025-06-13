package controler;

import DAO.RelatorioAlunoDAO;
import java.sql.SQLException;
import java.util.List;
import model.RelatorioAluno;

public class RelatorioAlunoControler {
    private RelatorioAlunoDAO dao;

    public RelatorioAlunoControler() {
        this.dao = new RelatorioAlunoDAO();
    }

    public List<RelatorioAluno> listarRelatorioAlunos() throws SQLException {
        return dao.listarRelatorioAlunos();
    }

    public RelatorioAluno buscarRelatorioPorEmail(String email) {
        return dao.buscarRelatorioPorEmail(email);
    }
}