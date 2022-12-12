/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.UserAccount;

import java.util.ArrayList;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;


/**
 *
 * @author Anirudh
 */
public class UserAccount {
    
    private int id;
    private String userName;

    public int getEnterprise_Id() {
        return Enterprise_Id;
    }

    public void setEnterprise_Id(int Enterprise_Id) {
        this.Enterprise_Id = Enterprise_Id;
    }
    private String password;
    private String role;
    private String name;
    private int Enterprise_Id;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private ArrayList<Integer> IncidentList;

    public ArrayList<Integer> getIncidentList() {
        return IncidentList;
    }

    public void setIncidentList(ArrayList<Integer> IncidentList) {
        this.IncidentList = IncidentList;
    }

    public UserAccount() {
        IncidentList = new ArrayList<>();
        this.setIncidentList(IncidentList);
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return userName;
    }
    
    
    public void sendemail()
    {
      
       String to = "harshsdw1@gmail.com";
      String from = "tanujverma68@gmail.com";
      String host = "142.251.163.109";

      Properties properties = System.getProperties();
      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "587");
      properties.put("mail.smtp.ssl.enable", "true");
      properties.put("mail.smtp.auth", "true");

      Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication("tanujverma68@gmail.com", "Tanuj@0912");
        }
      });

      try {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("This is the email subject");
        message.setText("This is the email body");

        Transport.send(message);
      } catch (MessagingException mex) {
        mex.printStackTrace();
      }
    }
   
    
}


