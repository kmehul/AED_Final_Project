/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Role;

/**
 *
 * @author Anirudh
 */
public class OperatorRole {
    
    private int operator_Id;
    private String operatorName;
    private String emergencyType;
    private int victimId;

    public int getOperator_Id() {
        return operator_Id;
    }

    public void setOperator_Id(int operator_Id) {
        this.operator_Id = operator_Id;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public int getVictimId() {
        return victimId;
    }

    public void setVictimId(int victimId) {
        this.victimId = victimId;
    }
}
