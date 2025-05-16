
package controler;

import dao.AlunoDAO;
import model.Aluno;
import java.math.BigDecimal;
import java.util.List;

public class AlunoControler {
    private AlunoDAO alunoDAO = new AlunoDAO();

    public void cadastrarAluno(String nome, String matricula, BigDecimal notaA1, BigDecimal notaA2, BigDecimal notaA3) {
        Aluno aluno = new Aluno(nome, matricula, notaA1, notaA2, notaA3);
        alunoDAO.adicionarAluno(aluno);
    }

    public List<Aluno> listarTodosAlunos() {
        return alunoDAO.listarAlunos();
    }
}