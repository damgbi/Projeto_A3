package dao;

import model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos); 
    }
}
