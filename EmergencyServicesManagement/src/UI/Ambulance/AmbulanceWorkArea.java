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
        btnSendAmbulance = new javax.swing.JButton();
        lblAmbulanceWorkArea = new javax.swing.JLabel();

        tblAmbulanceRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Incident Type", "Address", "ZipCode", "Status", "Message", " Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAmbulance.setViewportView(tblAmbulanceRequest);

        btnSendAmbulance.setText("Send Ambulance");
        btnSendAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendAmbulanceActionPerformed(evt);
            }
        });

        lblAmbulanceWorkArea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAmbulanceWorkArea.setText("Ambulance Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btnSendAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAmbulanceWorkArea)
                    .addComponent(tblAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAmbulanceWorkArea)
                .addGap(60, 60, 60)
                .addComponent(tblAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSendAmbulance)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblAmbulanceRequest.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest req : enterprise.getWorkQueue().getWorkRequestList()){
            
            if( req instanceof AmbulanceWorkRequest){
                
                AmbulanceWorkRequest ambulanceRequest = (AmbulanceWorkRequest)req;
                Object[] row =new Object[7];
                row[0] = ambulanceRequest;
                row[1] = ambulanceRequest.getIncidentType();
                row[2] = ambulanceRequest.getAddress();
                row[3] = ambulanceRequest.getZipCode();
                row[4] = ambulanceRequest.getStatus();
                row[5] = ambulanceRequest.getMessage();
                row[6] = ambulanceRequest.getIncidentOcuredDate();
                
                dtm.addRow(row);   
            }   
        } 
    }
    
    private void btnSendAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendAmbulanceActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow= tblAmbulanceRequest.getSelectedRow();

        if (selectedRow >= 0) {

            AmbulanceWorkRequest request = (AmbulanceWorkRequest) tblAmbulanceRequest.getValueAt(selectedRow, 0);
            request.setStatus("Departed");
            populateTable();
            JOptionPane.showMessageDialog(null, "Ambulance sent");

        }

        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnSendAmbulanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendAmbulance;
    private javax.swing.JLabel lblAmbulanceWorkArea;
    private javax.swing.JScrollPane tblAmbulance;
    private javax.swing.JTable tblAmbulanceRequest;
    // End of variables declaration//GEN-END:variables
}
