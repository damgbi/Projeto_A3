
package controler;

import java.util.regex.*;

public class campotxtSenha {
    public boolean isSenhaValida(String senha){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        
        return senha.matches(regex);
    }
}
