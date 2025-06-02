
package controler;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class campotxtDouble extends PlainDocument {
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) return;
        
        String original = getText(0,getLength());
        String newText = new StringBuilder(original).insert(offs, str).toString();
       
        if (newText.matches("\\d{0,2}(\\.\\d{0,2})?")){
            try {
                if (!newText.equals(".") && !newText.isEmpty()){
                    double value = Double.parseDouble(newText);   
                    if ( value < 0 || value > 10) return;
                }
                super.insertString(offs, str, a);
        }catch (NumberFormatException e){
            
        }
        }
    }
}
