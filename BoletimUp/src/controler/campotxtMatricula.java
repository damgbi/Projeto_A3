package controler;

import javax.swing.text.*;

public class campotxtMatricula extends PlainDocument {
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if( str == null) return;
        if(!str.matches("\\d+")) return;
        if((getLength() + str.length()) <= 20) {
            super.insertString(offs, str, a);
        }
    }
}
