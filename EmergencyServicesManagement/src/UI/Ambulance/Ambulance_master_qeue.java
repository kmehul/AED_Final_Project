/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ambulance;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anirudh
 */
public class Ambulance_master_qeue extends javax.swing.JPanel {

    public Ambulance_master_qeue() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssign = new javax.swing.JButton();
        lblAmbulanceWorkArea = new javax.swing.JLabel();
        cbAmbulanceDriver = new javax.swing.JComboBox<>();
        lblAmbulanceTea = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblAmbulanceWorkArea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAmbulanceWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmbulanceWorkArea.setText("Ambulance Work Area");

        cbAmbulanceDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAmbulanceDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAmbulanceDriverActionPerformed(evt);
            }
        });

        lblAmbulanceTea.setText("Ambulance Employee");

        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OPERATOR ID", "VICTIM NAME", "VICTIM PHONE", "VICTIM ADDRESS", "VICTIM CITY", "VICTIM STATE", "VICTIM ZIP", "DESCRIPTION", "ASSIGN TO", "STATUS", "RECEIVED DATE", "RESOLVED DATE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAssignToMe.setText("Assign to Myself");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmbulanceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAmbulanceDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(717, 717, 717)))
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addComponent(lblAmbulanceWorkArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(447, 447, 447)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(556, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblAmbulanceWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(lblAmbulanceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAmbulanceDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAssign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(292, 292, 292)
                    .addComponent(btnAssignToMe)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

//    public void populateTable(){
//        
//        DefaultTableModel dtm = (DefaultTableModel) tblAmbulanceRequest.getModel();
//        dtm.setRowCount(0);
//        
//        for(WorkRequest req : enterprise.getWorkQueue().getWorkRequestList()){
//            
//            if( req instanceof AmbulanceWorkRequest){
//                
//                AmbulanceWorkRequest ambulanceRequest = (AmbulanceWorkRequest)req;
//                Object[] row =new Object[7];
//                row[0] = ambulanceRequest;
//                row[1] = ambulanceRequest.getIncidentType();
//                row[2] = ambulanceRequest.getAddress();
//                row[3] = ambulanceRequest.getZipCode();
//                row[4] = ambulanceRequest.getStatus();
//                row[5] = ambulanceRequest.getMessage();
//                row[6] = ambulanceRequest.getIncidentOcuredDate();
//                
//                dtm.addRow(row);   
//            }   
//        } 
//    }
//    
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
//        int selectedRow;
//        selectedRow= tblAmbulanceRequest.getSelectedRow();
//
//        if (selectedRow >= 0) {
//
//            AmbulanceWorkRequest request = (AmbulanceWorkRequest) tblAmbulanceRequest.getValueAt(selectedRow, 0);
//            request.setStatus("Departed");
//            populateTable();
//            JOptionPane.showMessageDialog(null, "Ambulance sent");
//
//        }
//
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void cbAmbulanceDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAmbulanceDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAmbulanceDriverActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        //        int selectedRow;
        //        selectedRow= tblAmbulanceRequest.getSelectedRow();
        //
        //        if (selectedRow >= 0) {
            //
            //            AmbulanceWorkRequest request = (AmbulanceWorkRequest) tblAmbulanceRequest.getValueAt(selectedRow, 0);
            //            request.setStatus("Departed");
            //            populateTable();
            //            JOptionPane.showMessageDialog(null, "Ambulance sent");
            //
            //        }
        //
        //        else
        //        {
            //            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
            //            return;
            //        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cbAmbulanceDriver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAmbulanceTea;
    private javax.swing.JLabel lblAmbulanceWorkArea;
    // End of variables declaration//GEN-END:variables
}
