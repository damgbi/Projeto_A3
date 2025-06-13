
package controler;

import DAO.UsuarioDAO;

public class UsuarioControler {
    private UsuarioDAO dao;
    
    public UsuarioControler() {
        dao = new UsuarioDAO();
    }
    
    public boolean cadastrar (String nomeCompleto, String email, String senha, String tipoUsuario) {
        return dao.cadastrarUsuario(nomeCompleto, email, senha, tipoUsuario);
    }
    
}
