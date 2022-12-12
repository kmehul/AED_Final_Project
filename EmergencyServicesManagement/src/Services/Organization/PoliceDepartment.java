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
public class PoliceDepartment {
    int police_report_id;
    int user_id;
    int victim_id;
    Date incident_date;
    String suspect_name;
    String suspect_address;
    String suspect_motive;
    char has_history;
    char has_association;
    String association_group;
    String comments;

    public int getPolice_report_id() {
        return police_report_id;
    }

    public void setPolice_report_id(int police_report_id) {
        this.police_report_id = police_report_id;
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

    public String getSuspect_name() {
        return suspect_name;
    }

    public void setSuspect_name(String suspect_name) {
        this.suspect_name = suspect_name;
    }

    public String getSuspect_address() {
        return suspect_address;
    }

    public void setSuspect_address(String suspect_address) {
        this.suspect_address = suspect_address;
    }

    public String getSuspect_motive() {
        return suspect_motive;
    }

    public void setSuspect_motive(String suspect_motive) {
        this.suspect_motive = suspect_motive;
    }

    public char getHas_history() {
        return has_history;
    }

    public void setHas_history(char has_history) {
        this.has_history = has_history;
    }

    public char getHas_association() {
        return has_association;
    }

    public void setHas_association(char has_association) {
        this.has_association = has_association;
    }

    public String getAssociation_group() {
        return association_group;
    }

    public void setAssociation_group(String association_group) {
        this.association_group = association_group;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
