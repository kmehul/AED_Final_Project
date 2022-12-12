/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.SqlConn;

import java.sql.*;  
import javax.swing.JOptionPane;

/**
 *
 * @author Anirudh
 */
public class SqlConn {
 
    public Connection SqlConnDB(){
    
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aed","root","password");  
 
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

