/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.SqlConn;

import Services.UserAccount.UserAccountDirectory;
import UI.MainJFrame;
import java.sql.*;  
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Anirudh
 */
public class SqlConn {
 
    public Connection SqlConnDB(){
    
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dummy","root","password");  
 
            return con;
        }
        catch(Exception e){ 
            DisplayMessage(e.getMessage()); 
            return null;
        }  
    }
 
    public void DisplayMessage(String message) {
          JOptionPane.showMessageDialog(null, "There was an unexpected error. Please login again. \nException Details - " + message);
    }
    
}

