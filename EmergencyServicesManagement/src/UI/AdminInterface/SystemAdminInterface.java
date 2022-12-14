/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminInterface;

import Services.UserAccount.UserAccount;
import UI.MainJFrame;
import java.sql.*;  

/**
 *
 * @author Anirudh
 */
public class SystemAdminInterface extends javax.swing.JPanel {

    Connection con;
    UserAccount user;
    
    /**
     * Creates new form SystemAdminInterface
     */
    public SystemAdminInterface(UserAccount user, Connection con) {
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

        btnManageAdmin = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageCity = new javax.swing.JButton();
        lblSystemAdminInterface = new javax.swing.JLabel();

        btnManageAdmin.setText("Manage Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageCity.setText("Manage City");
        btnManageCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCityActionPerformed(evt);
            }
        });

        lblSystemAdminInterface.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSystemAdminInterface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemAdminInterface.setText("System Admin Interface");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSystemAdminInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(112, 112, 112)
                        .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblSystemAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        // TODO add fyour handling code here:
        ManageEnterpriseAdminInterface manageEnterpriseAdminInterface = new ManageEnterpriseAdminInterface(user, con);
        new MainJFrame().replaceSplitPaneChild(this, manageEnterpriseAdminInterface);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:      
        ManageEnterpriseInterface manageEnterpriseInterface = new ManageEnterpriseInterface(user, con);
        new MainJFrame().replaceSplitPaneChild(this, manageEnterpriseInterface);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCityActionPerformed
        // TODO add your handling code here:
        ManageCityAdminInterface cityInt = new ManageCityAdminInterface(user, con);
        new MainJFrame().replaceSplitPaneChild(this, cityInt);
    }//GEN-LAST:event_btnManageCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageCity;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JLabel lblSystemAdminInterface;
    // End of variables declaration//GEN-END:variables
}
