/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ambulance;

import Services.UserAccount.UserAccount;
import UI.MainJFrame;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anirudh
 */
public class Ambulance_master_qeue extends javax.swing.JPanel {

    private Connection con;
    private UserAccount user;
    PreparedStatement p = null;
        PreparedStatement p2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;

    public Ambulance_master_qeue(UserAccount user, Connection con) {
        initComponents();
       	this.user = user;
        this.con = con;
        populateTables();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmbulanceWorkArea = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnAssignToMe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        lblAmbulanceWorkArea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAmbulanceWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmbulanceWorkArea.setText("Ambulance Work QUEUE");

        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnAssignToMe.setText("Assign to Myself");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work ID", "OPERATOR ID", "VICTIM NAME", "VICTIM PHONE", "VICTIM ADDRESS", "VICTIM CITY", "VICTIM STATE", "VICTIM ZIP", "DESCRIPTION", "ASSIGN TO", "STATUS", "RECEIVED DATE", "RESOLVED DATE"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAmbulanceWorkArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblAmbulanceWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnAssignToMe)
                .addGap(62, 62, 62)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        Ambulance_work_queue cityInt = new Ambulance_work_queue(user, con);
        new MainJFrame().replaceSplitPaneChild(this, cityInt);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
     
    }//GEN-LAST:event_btnAssignToMeActionPerformed

       
    private void populateTables(){
        
        try {
            ArrayList<String> directory = new ArrayList<>();
            
            String sql = "select w.*,v.* from work_queue w join victim v on v.victim_id = w.victim_id;";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
     
            while (rs.next()) {
                String victimName = rs.getString("victim_name");
                String victimphone = rs.getString("victim_phone");
                String victimaddress = rs.getString("victim_address");
                String victimcity = rs.getString("victim_city");
                String victimstate = rs.getString("victim_state");
                String victimzip = rs.getString("victim_zip");
                String description = rs.getString("initial_description");
                System.out.println(victimzip);

                    String workid = rs.getString("work_id");
                    String operatorid = rs.getString("user_id");
                    String assignTo = rs.getString("assign_to");
                    String status = rs.getString("case_status");
                    String receivedDate = String.valueOf(rs.getDate("received_date"));
                    String resolvedDate = String.valueOf(rs.getDate("resolved_date"));
                    System.out.println(status);
                    directory.add(workid);
                    directory.add(operatorid);
                    directory.add(victimName);
                    directory.add(victimphone);
                    directory.add(victimaddress);
                    directory.add(victimcity);
                    directory.add(victimstate);
                    directory.add(victimzip);
                    directory.add(description);
                    directory.add(assignTo);
                    directory.add(status);
                    directory.add(receivedDate);
                    directory.add(resolvedDate);
                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            Object data[] = new Object[13];
            
            for (int i = 0; i < directory.size(); i+=13){
                    
                data[0] = directory.get(i);
                data[1] = directory.get(i+1);
                data[2] = directory.get(i+2);
                data[3] = directory.get(i+3);
                data[4] = directory.get(i+4);
                data[5] = directory.get(i+5);
                data[6] = directory.get(i+6);
                data[7] = directory.get(i+7);
                data[8] = directory.get(i+8);
                data[9] = directory.get(i+9);
                data[10] = directory.get(i+10);
                data[11] = directory.get(i+11);
                data[12] = directory.get(i+12);
                 
                model.addRow(data);
            }
                
            }
        }
 
        
        catch (SQLException e) {
            
            System.out.println(e.getMessage());
        }
            
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnback;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAmbulanceWorkArea;
    // End of variables declaration//GEN-END:variables
}
