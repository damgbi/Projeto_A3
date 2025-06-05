
package controler;

import java.util.regex.*;

public class campotxtEmail {
    
   public boolean isEmailValido(String email){
       String regex = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(email);
       return matcher.matches();
   }
}


