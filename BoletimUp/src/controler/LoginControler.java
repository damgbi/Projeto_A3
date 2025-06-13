
package controler;

import DAO.LoginDAO;

public class LoginControler {

    public String autenticar(String email, String senha) {
        LoginDAO dao = new LoginDAO();
        return dao.autenticar(email, senha);
    }
}