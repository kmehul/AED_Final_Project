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
public class policecrud extends javax.swing.JPanel {

private Connection con;
private UserAccount user;
    /**
     * Creates new form policecrud
     */
    public policecrud(UserAccount user, Connection con) {
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

        paneupdate = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMarshalName2 = new javax.swing.JPasswordField();
        lblPassword2 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JPasswordField();
        txtMarshalID2 = new javax.swing.JTextField();
        lblCity2 = new javax.swing.JLabel();
        lblMarshalID2 = new javax.swing.JLabel();
        lblMarshalName2 = new javax.swing.JLabel();
        cmbMarshalCity2 = new javax.swing.JComboBox<>();
        btnSubmit3 = new javax.swing.JButton();
        txtUserName2 = new javax.swing.JTextField();
        lblUserName2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSubmit2 = new javax.swing.JButton();
        lblSearchMarshalID = new javax.swing.JLabel();
        txtSearchMarshalID = new javax.swing.JTextField();
        btnSearchMarshalID = new javax.swing.JButton();
        lblPassword1 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        txtMarshalID1 = new javax.swing.JTextField();
        lblCity1 = new javax.swing.JLabel();
        lblMarshalID1 = new javax.swing.JLabel();
        lblMarshalName1 = new javax.swing.JLabel();
        cmbMarshalCity1 = new javax.swing.JComboBox<>();
        txtUserName1 = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        txtMarshalName1 = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        lblSearchMarshalID1 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Officer ID", "Name", "City", "UserName", "Password"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CURRENT POLICE OFFICERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneupdate.addTab("VIEW", jPanel2);

        txtMarshalName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarshalName2ActionPerformed(evt);
            }
        });

        lblPassword2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPassword2.setText(" PASSWORD");

        txtPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword2ActionPerformed(evt);
            }
        });

        txtMarshalID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarshalID2ActionPerformed(evt);
            }
        });

        lblCity2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCity2.setText(" CITY");

        lblMarshalID2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMarshalID2.setText("OFFICER ID");

        lblMarshalName2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMarshalName2.setText(" NAME");

        cmbMarshalCity2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSubmit3.setText("CREATE");
        btnSubmit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit3ActionPerformed(evt);
            }
        });

        txtUserName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserName2ActionPerformed(evt);
            }
        });

        lblUserName2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUserName2.setText(" USERNAME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity2)
                                    .addComponent(lblMarshalName2)
                                    .addComponent(lblMarshalID2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarshalName2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarshalID2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMarshalCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword2)
                                    .addComponent(lblUserName2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName2)
                                    .addComponent(txtPassword2)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btnSubmit3, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtMarshalID2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtMarshalName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMarshalID2)
                        .addGap(35, 35, 35)
                        .addComponent(lblMarshalName2)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity2)
                            .addComponent(cmbMarshalCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblUserName2)
                        .addGap(35, 35, 35)
                        .addComponent(lblPassword2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        paneupdate.addTab("CREATE", jPanel3);

        btnSubmit2.setText("UPDATE");
        btnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit2ActionPerformed(evt);
            }
        });

        lblSearchMarshalID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSearchMarshalID.setText("ENTER OFFICER ID TO UPDATE");

        btnSearchMarshalID.setText("SEARCH");
        btnSearchMarshalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMarshalIDActionPerformed(evt);
            }
        });

        lblPassword1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPassword1.setText(" PASSWORD");

        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });

        txtMarshalID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarshalID1ActionPerformed(evt);
            }
        });

        lblCity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCity1.setText(" CITY");

        lblMarshalID1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMarshalID1.setText("OFFICER ID");

        lblMarshalName1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMarshalName1.setText(" NAME");

        cmbMarshalCity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtUserName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserName1ActionPerformed(evt);
            }
        });

        lblUserName1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUserName1.setText(" USERNAME");

        txtMarshalName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarshalName1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(669, 669, 669)
                        .addComponent(btnSearchMarshalID))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity1)
                                    .addComponent(lblMarshalName1)
                                    .addComponent(lblMarshalID1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarshalName1)
                                    .addComponent(txtMarshalID1)
                                    .addComponent(cmbMarshalCity1, 0, 678, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblSearchMarshalID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchMarshalID, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword1)
                                    .addComponent(lblUserName1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword1)
                                    .addComponent(btnSubmit2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                                    .addComponent(txtUserName1))))))
                .addGap(125, 125, 125))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchMarshalID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchMarshalID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchMarshalID))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtMarshalID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtMarshalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMarshalID1)
                        .addGap(35, 35, 35)
                        .addComponent(lblMarshalName1)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity1)
                            .addComponent(cmbMarshalCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblUserName1)
                        .addGap(35, 35, 35)
                        .addComponent(lblPassword1)))
                .addGap(69, 69, 69)
                .addComponent(btnSubmit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        paneupdate.addTab("UPDATE", jPanel4);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSearchMarshalID1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSearchMarshalID1.setText("ENTER OFFICER ID TO UPDATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(paneupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblSearchMarshalID1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblSearchMarshalID1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(paneupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarshalName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarshalName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarshalName2ActionPerformed

    private void txtPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword2ActionPerformed

    private void txtMarshalID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarshalID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarshalID2ActionPerformed

    private void btnSubmit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmit3ActionPerformed

    private void txtUserName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserName2ActionPerformed

    private void btnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmit2ActionPerformed

    private void btnSearchMarshalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMarshalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMarshalIDActionPerformed

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed

    private void txtMarshalID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarshalID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarshalID1ActionPerformed

    private void txtUserName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserName1ActionPerformed

    private void txtMarshalName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarshalName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarshalName1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Police_Admin panel = new Police_Admin(user, con);
        new MainJFrame().replaceSplitPaneChild(this, panel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchMarshalID;
    private javax.swing.JButton btnSubmit2;
    private javax.swing.JButton btnSubmit3;
    private javax.swing.JComboBox<String> cmbMarshalCity1;
    private javax.swing.JComboBox<String> cmbMarshalCity2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblMarshalID1;
    private javax.swing.JLabel lblMarshalID2;
    private javax.swing.JLabel lblMarshalName1;
    private javax.swing.JLabel lblMarshalName2;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblSearchMarshalID;
    private javax.swing.JLabel lblSearchMarshalID1;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JTabbedPane paneupdate;
    private javax.swing.JTextField txtMarshalID1;
    private javax.swing.JTextField txtMarshalID2;
    private javax.swing.JPasswordField txtMarshalName1;
    private javax.swing.JPasswordField txtMarshalName2;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtSearchMarshalID;
    private javax.swing.JTextField txtUserName1;
    private javax.swing.JTextField txtUserName2;
    // End of variables declaration//GEN-END:variables
}
