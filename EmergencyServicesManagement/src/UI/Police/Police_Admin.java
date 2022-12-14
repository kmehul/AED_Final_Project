/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Police;

import Services.UserAccount.UserAccount;
import UI.MainJFrame;
import java.sql.*;
/**
 *
 * @author tanujverma
 */
public class Police_Admin extends javax.swing.JPanel {

    UserAccount user;
    Connection con;
    
    /**
     * Creates new form Police_Admin
     */
    public Police_Admin(UserAccount user, Connection con) {
        initComponents();
        this.user = user;
        this.con = con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lblOperatorAdminInterface = new javax.swing.JLabel();
        btnManageFireMarshal = new javax.swing.JButton();
        btnAssignFire = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnAnalysis = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        lblOperatorAdminInterface.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblOperatorAdminInterface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperatorAdminInterface.setText("POLICE  ADMIN  INTERFACE");

        btnManageFireMarshal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnManageFireMarshal.setText("Manage Police Officers");
        btnManageFireMarshal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFireMarshalActionPerformed(evt);
            }
        });

        btnAssignFire.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAssignFire.setText(" Police Work Queue");
        btnAssignFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignFireActionPerformed(evt);
            }
        });

        btnReports.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReports.setText("Reports");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnAnalysis.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAnalysis.setText("Analysis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOperatorAdminInterface, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnManageFireMarshal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(68, 68, 68)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAssignFire, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblOperatorAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(607, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(279, 279, 279)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnManageFireMarshal)
                        .addComponent(btnAssignFire))
                    .addGap(100, 100, 100)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReports)
                        .addComponent(btnAnalysis))
                    .addContainerGap(279, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnManageFireMarshalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFireMarshalActionPerformed
        // TODO add your handling code here:
        policecrud panel = new policecrud(user, con);
        new MainJFrame().replaceSplitPaneChild(this, panel);
    }//GEN-LAST:event_btnManageFireMarshalActionPerformed

    private void btnAssignFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignFireActionPerformed
        // TODO add your handling code here:
        Master_workqueue panel = new Master_workqueue(user, con);
        new MainJFrame().replaceSplitPaneChild(this, panel);
    }//GEN-LAST:event_btnAssignFireActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnAssignFire;
    private javax.swing.JButton btnManageFireMarshal;
    private javax.swing.JButton btnReports;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel lblOperatorAdminInterface;
    // End of variables declaration//GEN-END:variables
}
