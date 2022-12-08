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
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
//    private Employee employee;
    private String role;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    @Override
    public String toString() {
        return userName;
    }
}
