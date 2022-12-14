/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ambulance;

import Services.UserAccount.UserAccount;
import UI.AdminInterface.ManageCityAdminInterface;
import UI.MainJFrame;
import java.sql.*;
/**
 *
 * @author Anirudh
 */
public class AmbulanceAdmin extends javax.swing.JPanel {

    private UserAccount user;
    private Connection con;
    /**
     * Creates new form HospitalAdmin
     */
    public AmbulanceAdmin(UserAccount user, Connection con) {
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

        lblOperatorAdminInterface = new javax.swing.JLabel();
        btnAddAmbulance = new javax.swing.JButton();
        btnManageAmbulance = new javax.swing.JButton();
        btnAmbulanceAnalysis = new javax.swing.JButton();

        lblOperatorAdminInterface.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOperatorAdminInterface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperatorAdminInterface.setText("Ambulance Admin Interface");

        btnAddAmbulance.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAddAmbulance.setText("Add New Ambulance Employee");
        btnAddAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAmbulanceActionPerformed(evt);
            }
        });

        btnManageAmbulance.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnManageAmbulance.setText("Manage Ambulance Work Queue");
        btnManageAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAmbulanceActionPerformed(evt);
            }
        });

        btnAmbulanceAnalysis.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAmbulanceAnalysis.setText("REPORT");
        btnAmbulanceAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbulanceAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAmbulanceAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblOperatorAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblOperatorAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(btnAddAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnManageAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnAmbulanceAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAmbulanceActionPerformed
        // TODO add your handling code here:
        AddNewAmbulanceEmployee panel = new AddNewAmbulanceEmployee(user, con);
        new MainJFrame().replaceSplitPaneChild(this, panel);
    }//GEN-LAST:event_btnAddAmbulanceActionPerformed

    private void btnAmbulanceAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbulanceAnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAmbulanceAnalysisActionPerformed

    private void btnManageAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAmbulanceActionPerformed
        // TODO add your handling code here:
        AMBULANCE_REPORTS panel = new AMBULANCE_REPORTS(user, con);
        new MainJFrame().replaceSplitPaneChild(this, panel);
    }//GEN-LAST:event_btnManageAmbulanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAmbulance;
    private javax.swing.JButton btnAmbulanceAnalysis;
    private javax.swing.JButton btnManageAmbulance;
    private javax.swing.JLabel lblOperatorAdminInterface;
    // End of variables declaration//GEN-END:variables
}
