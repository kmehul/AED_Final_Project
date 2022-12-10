/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Fire;

/**
 *
 * @author mehul
 */
public class FireMarshalCase extends javax.swing.JPanel {

    /**
     * Creates new form FireMarshalCase
     */
    public FireMarshalCase() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssignToMe = new javax.swing.JButton();
        lblHazMAtWorkArea = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        tblAmbulance = new javax.swing.JScrollPane();
        tblhazmatRequest = new javax.swing.JTable();
        tblAmbulance1 = new javax.swing.JScrollPane();
        tblhazmatRequest1 = new javax.swing.JTable();
        btnCompleteCase = new javax.swing.JButton();
        btnSubmitReport = new javax.swing.JButton();

        btnAssignToMe.setText("Assign to Myself");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        lblHazMAtWorkArea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHazMAtWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHazMAtWorkArea.setText("Fire Marshal Assignment Panel");

        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        tblhazmatRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work ID", "Victim ID", "Alert Time", "Incident Description", "Status", "Assigned Marshal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAmbulance.setViewportView(tblhazmatRequest);

        tblhazmatRequest1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work ID", "Victim ID", "Alert Time", "Incident Description", "Status", "Assigned Marshal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAmbulance1.setViewportView(tblhazmatRequest1);

        btnCompleteCase.setText("Mark as Resolved");
        btnCompleteCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteCaseActionPerformed(evt);
            }
        });

        btnSubmitReport.setText("Submit Report");
        btnSubmitReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHazMAtWorkArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblAmbulance)
                    .addComponent(tblAmbulance1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCompleteCase, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btnSubmitReport, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHazMAtWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tblAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAssignToMe)
                .addGap(28, 28, 28)
                .addComponent(tblAmbulance1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompleteCase)
                    .addComponent(btnSubmitReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnCompleteCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompleteCaseActionPerformed

    private void btnSubmitReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnCompleteCase;
    private javax.swing.JButton btnSubmitReport;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel lblHazMAtWorkArea;
    private javax.swing.JScrollPane tblAmbulance;
    private javax.swing.JScrollPane tblAmbulance1;
    private javax.swing.JTable tblhazmatRequest;
    private javax.swing.JTable tblhazmatRequest1;
    // End of variables declaration//GEN-END:variables
}