
package model;

import java.math.BigDecimal;

public class Aluno extends Usuario {
    
    public BigDecimal notaA1;
    public BigDecimal notaA2;
    public BigDecimal notaA3;

    public Aluno(String nome, String email, String senha, int matricula, BigDecimal notaA1, BigDecimal notaA2, BigDecimal notaA3) {
        super(nome, email, senha, matricula );
        this.notaA1 = notaA1;
        this.notaA2 = notaA2;
        this.notaA3 = notaA3;          
}

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public BigDecimal getNotaA1() {
        return notaA1;
    }
    
    public void setNotaA1(BigDecimal notaA1) {
        this.notaA1 = notaA1;
    }
    
    public BigDecimal getNotaA2() {
        return notaA2;
    }
    
    public void setNotaA2(BigDecimal notaA2) {
        this.notaA2 = notaA2;
    }
    
    public BigDecimal getNotaA3() {
        return notaA3;
    }

    public void setNotaA3(BigDecimal notaA3) {
        this.notaA3 = notaA3;
    }
    
}
