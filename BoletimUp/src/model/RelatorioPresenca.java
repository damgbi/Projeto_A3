package model;

import java.sql.Date;

public class RelatorioPresenca {
    private String nome;
    private int matricula;
    private Date data;
    private String status;

    public RelatorioPresenca() {
    }

    public RelatorioPresenca(String nome, int matricula, Date data, String status) {
        this.nome = nome;
        this.matricula = matricula;
        this.data = data;
        this.status = status;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}