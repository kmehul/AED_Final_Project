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
public class PoliceRequest extends WorkRequest{
    
    private int requestId;
    private int workId;
    private int victimId;
    private String caseType;
    private Date caseDate;
    private String comments;
    private Suspect suspect;
}
