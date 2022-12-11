/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constants;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Anirudh
 */
public class CustomValidations {
   
    public static void onlyString(KeyEvent evt, JTextField field) {
        char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || (c==evt.VK_SPACE) || (c==evt.VK_SHIFT)||
            (c == evt.VK_BACK_SPACE) ||
            (c == evt.VK_DELETE))) {

                JOptionPane.showMessageDialog(null, "Enter Alphabets only");
                field.setText("");
        }
    }
     
    public static void onlyInteger(KeyEvent evt, JTextField field, String text, int lengthLimit) {
        int txtLen = text.length();
        
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(txtLen < lengthLimit)
                field.setEditable(true);
            else
                field.setEditable(false);
        }
        else{
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE)
                field.setEditable(true);
            else
                field.setEditable(false);   
        }
        
//        char c = evt.getKeyChar();
//        if (!((c >= '0') && (c <= '9')||
//            (c == evt.VK_BACK_SPACE) ||
//            (c == evt.VK_DELETE))) {

//            JOptionPane.showMessageDialog(null, "Enter Integers only");
//            field.setText("");
//        }
    }   
}