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
    private String name;;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;

    public Organization(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        counter++;
    }
   
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
