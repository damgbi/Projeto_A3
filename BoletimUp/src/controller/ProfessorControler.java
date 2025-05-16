
package controller;

import model.Professor;
import DAO.ProfessorDAO;
import java.util.ArrayList;
import java.util.List;


public class ProfessorControler {
    private ProfessorDAO professorDAO = new ProfessorDAO();
    
    public void CadastrarProfessor(String nome, String email, String senha, int matricula) {
        Professor professor = new Professor( nome, email, senha, matricula);
        professorDAO.adicionarprofessorDAO(professor);
    }
    
}
