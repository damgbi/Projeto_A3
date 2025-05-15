package com.mycompany.boletimup.Cadastro;

public class Cadastro {
        
        protected String nome;
        protected String email;
        protected int matricula;
        protected String senha;
        protected String confirmarSenha;
    
    public Cadastro(String nome, String email, int matricula, String senha, String confirmarSenha){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    
    } 
        public String getNome(){
            return nome;
            
        }
        
        public void setNome(String nome){
            this.nome = nome;
            
        }
        
        public String getEmail(){
            return email;
                    
        }
        
        public void setEmail(String email){
            this.email = email;
            
        }
        
        public int getMatricula(){
            return matricula;
            
        }
        
        public void setMatricula(int matricula){
            this.matricula = matricula;
        
        }
        
        public String getSenha(){
            return senha;
            
        }
        
        public void setSenha(String senha){
            this.senha = senha;
            
        }
        
        public String getConfirmarSenha(){
            return confirmarSenha;
            
        }
        
        public void setConfirmarSenha(String confirmarSenha){
            this.confirmarSenha = confirmarSenha;
        }
    
        public void CriarConta(){
        
        }
        
        private boolean validadorEmail(){
        
        }
               
        private boolean ValidadorMatricula(){

}
        
}
