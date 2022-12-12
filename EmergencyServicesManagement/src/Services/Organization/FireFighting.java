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
public class FireFighting {
    int fire_report_id;
    int work_id;
    int user_id;
    int victim_id;
    Date incident_date;
    Date resolution_date;
    String suspect_name;
    String suspect_address;
    String suspect_motive;
    String comments;

    public int getFire_report_id() {
        return fire_report_id;
    }

    public void setFire_report_id(int fire_report_id) {
        this.fire_report_id = fire_report_id;
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

    public Date getResolution_date() {
        return resolution_date;
    }

    public void setResolution_date(Date resolution_date) {
        this.resolution_date = resolution_date;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
