package DAO;

public class TesteConexao {
     
    public static void main(String[] args) {
        if (ConexaoMySQL.conectar() != null) {
            System.out.println(" Conexao bem-sucedida com o banco de dados!");
        } else {
            System.out.println(" Falha na conexao com o banco.");
        }
        
    } 
 }