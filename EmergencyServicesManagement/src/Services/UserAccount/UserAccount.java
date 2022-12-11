/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.UserAccount;

import java.util.ArrayList;

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
}
