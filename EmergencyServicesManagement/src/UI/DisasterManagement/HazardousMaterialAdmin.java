/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DisasterManagement;

/**
 *
 * @author Anirudh
 */
public class HazardousMaterialAdmin extends javax.swing.JPanel {

    /**
     * Creates new form HazardousMaterialAdmin
     */
    public HazardousMaterialAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHazMatAdminInterface = new javax.swing.JLabel();
        btnAddHazMatLead = new javax.swing.JButton();
        btnManageHazMatLead = new javax.swing.JButton();
        btnHazMatAnalysis = new javax.swing.JButton();

        lblHazMatAdminInterface.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHazMatAdminInterface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHazMatAdminInterface.setText("Hazardous Materials Admin Interface");

        btnAddHazMatLead.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAddHazMatLead.setText("Add New Employee ");
        btnAddHazMatLead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHazMatLeadActionPerformed(evt);
            }
        });

        btnManageHazMatLead.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnManageHazMatLead.setText("Manage Work Queue");

        btnHazMatAnalysis.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnHazMatAnalysis.setText("Analysis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHazMatAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageHazMatLead, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddHazMatLead, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHazMatAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblHazMatAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnAddHazMatLead, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnManageHazMatLead, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnHazMatAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddHazMatLeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHazMatLeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddHazMatLeadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHazMatLead;
    private javax.swing.JButton btnHazMatAnalysis;
    private javax.swing.JButton btnManageHazMatLead;
    private javax.swing.JLabel lblHazMatAdminInterface;
    // End of variables declaration//GEN-END:variables
}
