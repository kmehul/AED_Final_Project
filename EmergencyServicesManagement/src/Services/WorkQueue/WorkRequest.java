/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.WorkQueue;

import java.util.Date;

/**
 *
 * @author Anirudh
 */
public abstract class WorkRequest {
    private int workId;
    private int operatorId;
    private String initDesc;
    private String assignedToDept;
    private char status;
    private Date recievedDate;
    private Date resolvedDate;

    public WorkRequest(){
        recievedDate = new Date();
    }
        
    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getInitDesc() {
        return initDesc;
    }

    public void setInitDesc(String initDesc) {
        this.initDesc = initDesc;
    }

    public String getassignedToDept() {
        return assignedToDept;
    }

    public void setassignedToDept(String assignedToDept) {
        this.assignedToDept = assignedToDept;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getRecievedDate() {
        return recievedDate;
    }

    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }   
}
