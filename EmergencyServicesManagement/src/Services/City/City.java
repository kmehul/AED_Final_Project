/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.City;

import Services.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Anirudh
 */
public class City {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public City() {
       
        enterpriseDirectory = new EnterpriseDirectory();
    }
    
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
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