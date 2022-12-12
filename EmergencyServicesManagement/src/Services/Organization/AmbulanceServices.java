/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Organization;

/**
 *
 * @author Anirudh
 */
public class AmbulanceServices {
    int ambulance_report_id;
    int user_id;
    int work_id;
    int victim_id;
    String hospital_name;
    String hospital_address;
    String comments;

    public int getAmbulance_report_id() {
        return ambulance_report_id;
    }

    public void setAmbulance_report_id(int ambulance_report_id) {
        this.ambulance_report_id = ambulance_report_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getWork_id() {
        return work_id;
    }

    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }

    public int getVictim_id() {
        return victim_id;
    }

    public void setVictim_id(int victim_id) {
        this.victim_id = victim_id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospital_address() {
        return hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        this.hospital_address = hospital_address;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
