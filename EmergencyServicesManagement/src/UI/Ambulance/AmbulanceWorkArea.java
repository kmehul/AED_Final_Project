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
public class AmbulanceWorkArea extends javax.swing.JPanel {

    public AmbulanceWorkArea() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblAmbulance = new javax.swing.JScrollPane();
        tblAmbulanceRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        lblAmbulanceWorkArea = new javax.swing.JLabel();
        cbAmbulanceDriver = new javax.swing.JComboBox<>();
        lblAmbulanceTea = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();

        tblAmbulanceRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work ID", "Operator Name", "Description", "Address", "City", "Zip Code", "Date", "Time", "Assigned To", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAmbulance.setViewportView(tblAmbulanceRequest);

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblAmbulanceWorkArea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAmbulanceWorkArea.setText("Ambulance Work Area");

        cbAmbulanceDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAmbulanceDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAmbulanceDriverActionPerformed(evt);
            }
        });

        lblAmbulanceTea.setText("Ambulance Driver");

        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAmbulanceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbAmbulanceDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tblAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAmbulanceWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAmbulanceWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(tblAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lblAmbulanceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAmbulanceDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAssign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cbAmbulanceDriver;
    private javax.swing.JLabel lblAmbulanceTea;
    private javax.swing.JLabel lblAmbulanceWorkArea;
    private javax.swing.JScrollPane tblAmbulance;
    private javax.swing.JTable tblAmbulanceRequest;
    // End of variables declaration//GEN-END:variables
}
