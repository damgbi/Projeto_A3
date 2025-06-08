package DAO;

import model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    private List<Professor> professorDAO = new ArrayList<Professor>();
    
    public void adicionarprofessorDAO(Professor professor){
        professorDAO.add(professor);
    }
}
