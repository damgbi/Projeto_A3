package model;


public class Professor extends Usuario{
    String disciplina;
    
    public Professor(String nome, String email, String senha, int matricula, String disciplina){
        super(nome, email, senha, matricula);        
        this.disciplina = disciplina;
    }
    
    
}
