
package model;

import java.math.BigDecimal;

public class Aluno {
    public String nome;
    public String matricula;
    public BigDecimal notaA1;
    public BigDecimal notaA2;
    public BigDecimal notaA3;

    public Aluno(String nome, String matricula, BigDecimal notaA1, BigDecimal notaA2, BigDecimal notaA3) {
        this.nome = nome;
        this.matricula = matricula;
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
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
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
