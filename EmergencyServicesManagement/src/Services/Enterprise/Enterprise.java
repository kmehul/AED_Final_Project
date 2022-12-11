/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Enterprise;

import Services.City.City;

/**
 *
 * @author Anirudh
 */
public class Enterprise extends City {
    
    private int Enterprise_Id;
    private int Enterprise_Name;
    private int user_Id;

    public int getEnterprise_Id() {
        return Enterprise_Id;
    }

    public void setEnterprise_Id(int Enterprise_Id) {
        this.Enterprise_Id = Enterprise_Id;
    }

    public int getEnterprise_Name() {
        return Enterprise_Name;
    }

    public void setEnterprise_Name(int Enterprise_Name) {
        this.Enterprise_Name = Enterprise_Name;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }
}
