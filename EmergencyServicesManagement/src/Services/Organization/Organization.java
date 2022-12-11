/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Organization;

import Services.UserAccount.UserAccountDirectory;

/**
 *
 * @author Anirudh
 */
public abstract class Organization {
    private String name;
//    private WorkQueue workQueue;
//    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;
//    public HashSet<Role> roles;
    

    public Organization(String name) {
        this.name = name;
//        workQueue = new WorkQueue();
//        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
//        roles = new HashSet<>();
        counter++;
    }

//    public abstract HashSet<Role> getSupportedRole();
//    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
//
//    public EmployeeDirectory getEmployeeDirectory() {
//        return employeeDirectory;
//    }
    
    public String getName() {
        return name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    @Override
    public String toString() {
        return name;
    }

}
