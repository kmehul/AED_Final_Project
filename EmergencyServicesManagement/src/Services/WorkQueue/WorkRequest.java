/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.WorkQueue;

import Services.Victim.Victim;
import java.time.LocalDate;

/**
 *
 * @author Anirudh
 */
public class WorkRequest extends Victim {
    private int work_id;
    private int user_id;
    private int victim_id;
    private String assign_to;
    private String case_status;
    private String description;
    private LocalDate recievedDate;

    public LocalDate getRecievedDate() {
        return recievedDate;
    }

    public void setRecievedDate(LocalDate recievedDate) {
        this.recievedDate = recievedDate;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getAssign_to() {
        return assign_to;
    }

    public void setAssign_to(String assign_to) {
        this.assign_to = assign_to;
    }

    public String getCase_status() {
        return case_status;
    }

    public void setCase_status(String case_status) {
        this.case_status = case_status;
    }
}
