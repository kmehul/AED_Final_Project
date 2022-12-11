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
    private String password;
    private String role;
    private String name;

    
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
//    private WorkQueue workQueue;
    private ArrayList<Integer> IncidentList;

    public ArrayList<Integer> getIncidentList() {
        return IncidentList;
    }

    public void setIncidentList(ArrayList<Integer> IncidentList) {
        this.IncidentList = IncidentList;
    }

    public UserAccount() {
        //workQueue = new WorkQueue();
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
        Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication("verma.tanu@northeastern.edu","Jagdishgeeta@1995");  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress("harshsdw1@gmail.com"));    
           message.setSubject("Test");    
           message.setText("Txt nahi test");    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
    }
    
    
    public static void main(String[] args) {
        UserAccount ua = new UserAccount();
        ua.sendemail();
    }
    
}


