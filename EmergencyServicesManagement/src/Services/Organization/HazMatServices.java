/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Organization;

import java.util.Date;

/**
 *
 * @author Anirudh
 */
public class HazMatServices {
    int hazmat_report_id;
    int work_id;
    int user_id;
    int victim_id;
    Date incident_date;
    String material_name;
    String incident_address;
    int casualties;
    String comments;

    public int getHazmat_report_id() {
        return hazmat_report_id;
    }

    public void setHazmat_report_id(int hazmat_report_id) {
        this.hazmat_report_id = hazmat_report_id;
    }

    public int getWork_id() {
        return work_id;
    }

    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getVictim_id() {
        return victim_id;
    }

    public void setVictim_id(int victim_id) {
        this.victim_id = victim_id;
    }

    public Date getIncident_date() {
        return incident_date;
    }

    public void setIncident_date(Date incident_date) {
        this.incident_date = incident_date;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public String getIncident_address() {
        return incident_address;
    }

    public void setIncident_address(String incident_address) {
        this.incident_address = incident_address;
    }

    public int getCasualties() {
        return casualties;
    }

    public void setCasualties(int casualties) {
        this.casualties = casualties;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
