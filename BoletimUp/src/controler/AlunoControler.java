package controler;

import DAO.AlunoDAO;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;

public class AlunoControler {

    private AlunoDAO alunoDAO;

    public AlunoControler() {
        alunoDAO = new AlunoDAO();
    }

    public boolean cadastrarAluno(String nome, String email) {
    try {
            if (alunoDAO.emailJaExiste(email)) {
                JOptionPane.showMessageDialog(null, "E-mail já está cadastrado para um aluno.");
                return false;
            }

            boolean sucesso = alunoDAO.registrarAluno(nome, email);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Aluno registrado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao registrar aluno.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + e.getMessage());
            return false;
        }
    }
    
    public Aluno buscarAlunoPorMatricula(int matricula) {
        return alunoDAO.buscarAlunoPorMatricula(matricula);
    }
    
    public boolean salvarNotasAluno(int matricula, BigDecimal a1, BigDecimal a2, BigDecimal a3) {
        return alunoDAO.atualizarNotasAluno(matricula, a1, a2, a3);
    }
    
    public List<Aluno> listarAlunosMatriculaENome() {
        return alunoDAO.listarTodos();  
    }
    
    public boolean definirSenhaParaAluno(String email, String novaSenha) {
        if (alunoDAO.senhaJaDefinida(email)) {
            JOptionPane.showMessageDialog(null, "A senha já foi definida anteriormente.");
            return false;
        }
        return alunoDAO.atualizarSenha(email, novaSenha);
    }
}