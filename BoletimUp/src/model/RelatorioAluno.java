
package model;


public class RelatorioAluno {
    private String nome;
    private int matricula;
    private double avaliacao1;
    private double avaliacao2;
    private double avaliacao3;
    private double mediaNotas;
    private double mediaPresenca;
    private String situacao;
    private String email;
    
    public RelatorioAluno(){
        
    }
    
    public RelatorioAluno(String nome, String email, int matricula, double avaliacao1, double avaliacao2, double avaliacao3, double mediaPresenca, String situacao) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.avaliacao1 = avaliacao1;
        this.avaliacao2 = avaliacao2;
        this.avaliacao3 = avaliacao3;
        this.mediaPresenca = mediaPresenca;
        this.mediaNotas = (avaliacao1 + avaliacao2 + avaliacao3) / 3.0;
        this.situacao = situacao;
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

    public double getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(double avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public double getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(double avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    public double getAvaliacao3() {
        return avaliacao3;
    }

    public void setAvaliacao3(double avaliacao3) {
        this.avaliacao3 = avaliacao3;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public double getMediaPresenca() {
        return mediaPresenca;
    }

    public void setMediaPresenca(double mediaPresenca) {
        this.mediaPresenca = mediaPresenca;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
