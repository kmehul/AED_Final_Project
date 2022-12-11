/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Fire;

/**
 *
 * @author mehul
 */
public class FireMarshalSubmitReport extends javax.swing.JPanel {

    /**
     * Creates new form FireMarshalSubmitReport
     */
    public FireMarshalSubmitReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneupdate = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReport1 = new javax.swing.JTable();
        lblCity3 = new javax.swing.JLabel();
        lblUserName3 = new javax.swing.JLabel();
        txtFireReportVictimID1 = new javax.swing.JPasswordField();
        txtFireReportWorkID1 = new javax.swing.JTextField();
        lblVictimID1 = new javax.swing.JLabel();
        lblPassword8 = new javax.swing.JLabel();
        lblWorkID1 = new javax.swing.JLabel();
        txtFireReportStatus1 = new javax.swing.JPasswordField();
        txtFireReportAlertTime1 = new javax.swing.JPasswordField();
        txtFireReportIncDesc1 = new javax.swing.JTextField();
        txtFireReportAssignedMarshal1 = new javax.swing.JPasswordField();
        lblPassword9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        txtFireReportWorkID = new javax.swing.JTextField();
        txtFireReportVictimID = new javax.swing.JPasswordField();
        lblCity2 = new javax.swing.JLabel();
        txtFireReportAlertTime = new javax.swing.JPasswordField();
        txtFireReportStatus = new javax.swing.JPasswordField();
        lblWorkID = new javax.swing.JLabel();
        lblPassword6 = new javax.swing.JLabel();
        lblVictimID = new javax.swing.JLabel();
        lblPassword7 = new javax.swing.JLabel();
        txtFireReportAssignedMarshal = new javax.swing.JPasswordField();
        txtFireReportIncDesc = new javax.swing.JTextField();
        lblUserName2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FIRE DEPARTMENTS REPORTS");

        btnBack1.setText("Back");

        btnView.setText("View");

        btnUpdate.setText("Update");

        tblReport1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work ID", "Victim ID", "Alert Time", "Status", "Assigned Marshal"
            }
        ));
        jScrollPane3.setViewportView(tblReport1);

        lblCity3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCity3.setText("Alert Time");

        lblUserName3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUserName3.setText("Incident Description");

        txtFireReportVictimID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportVictimID1ActionPerformed(evt);
            }
        });

        txtFireReportWorkID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportWorkID1ActionPerformed(evt);
            }
        });

        lblVictimID1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblVictimID1.setText("Victim ID");

        lblPassword8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword8.setText("Status");

        lblWorkID1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblWorkID1.setText("Work ID");

        txtFireReportStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportStatus1ActionPerformed(evt);
            }
        });

        txtFireReportAlertTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportAlertTime1ActionPerformed(evt);
            }
        });

        txtFireReportIncDesc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportIncDesc1ActionPerformed(evt);
            }
        });

        txtFireReportAssignedMarshal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportAssignedMarshal1ActionPerformed(evt);
            }
        });

        lblPassword9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword9.setText("Assigned Marshal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUserName3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(590, 590, 590))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblWorkID1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFireReportWorkID1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblVictimID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCity3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFireReportVictimID1)
                                            .addComponent(txtFireReportAlertTime1)
                                            .addComponent(txtFireReportIncDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPassword9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFireReportAssignedMarshal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFireReportStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWorkID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFireReportWorkID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVictimID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFireReportVictimID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFireReportStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFireReportAlertTime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCity3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPassword9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFireReportAssignedMarshal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFireReportIncDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );

        paneupdate.addTab("VIEW", jPanel1);

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack2.setText("Back");

        txtFireReportWorkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportWorkIDActionPerformed(evt);
            }
        });

        txtFireReportVictimID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportVictimIDActionPerformed(evt);
            }
        });

        lblCity2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCity2.setText("Alert Time");

        txtFireReportAlertTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportAlertTimeActionPerformed(evt);
            }
        });

        txtFireReportStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportStatusActionPerformed(evt);
            }
        });

        lblWorkID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblWorkID.setText("Work ID");

        lblPassword6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword6.setText("Status");

        lblVictimID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblVictimID.setText("Victim ID");

        lblPassword7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword7.setText("Assigned Marshal");

        txtFireReportAssignedMarshal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportAssignedMarshalActionPerformed(evt);
            }
        });

        txtFireReportIncDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFireReportIncDescActionPerformed(evt);
            }
        });

        lblUserName2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUserName2.setText("Incident Description");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFireReportWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 477, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblVictimID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFireReportVictimID)
                                            .addComponent(txtFireReportAlertTime)
                                            .addComponent(txtFireReportIncDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblPassword7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFireReportAssignedMarshal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblPassword6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFireReportStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFireReportWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVictimID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFireReportVictimID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFireReportAlertTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFireReportIncDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFireReportStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFireReportAssignedMarshal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        paneupdate.addTab("CREATE", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneupdate, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneupdate, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
//        if(!txtName.getText().equals("")){
//            //            Enterprise enterprise = (Enterprise) cbEnterprise.getSelectedItem();
//
//            String username = txtMarshalID.getText();
//            String password = String.valueOf(txtMarshalName.getPassword());
//            String name = txtName.getText();
//
//            //            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
//            //            if (EcoSystem.checkIfUsernameIsUnique(username)) {
//                //                UserAccount account = null;
//                //                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.PoliceEnterprise) {
//                    //                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PoliceAdminRole());
//                    //                }
//                //                else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.HospitalEnterprise) {
//                    //                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
//                    //                }
//                //                else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.GovernmentEnterprise) {
//                    //                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new GovernmentAdminRole());
//                    //                }
//
//                //                populateTable();
//                JOptionPane.showMessageDialog(null, "Admin employee created");
//                txtName.setText("");
//                txtMarshalID.setText("");
//                txtMarshalName.setText("");
                //            }
            //else {
                //JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
                //}
            //            else{
                //                JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
                //            }
//        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtFireReportWorkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportWorkIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportWorkIDActionPerformed

    private void txtFireReportVictimIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportVictimIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportVictimIDActionPerformed

    private void txtFireReportAlertTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportAlertTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportAlertTimeActionPerformed

    private void txtFireReportStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportStatusActionPerformed

    private void txtFireReportAssignedMarshalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportAssignedMarshalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportAssignedMarshalActionPerformed

    private void txtFireReportIncDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportIncDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportIncDescActionPerformed

    private void txtFireReportVictimID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportVictimID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportVictimID1ActionPerformed

    private void txtFireReportWorkID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportWorkID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportWorkID1ActionPerformed

    private void txtFireReportStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportStatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportStatus1ActionPerformed

    private void txtFireReportAlertTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportAlertTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportAlertTime1ActionPerformed

    private void txtFireReportIncDesc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportIncDesc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportIncDesc1ActionPerformed

    private void txtFireReportAssignedMarshal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFireReportAssignedMarshal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFireReportAssignedMarshal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblCity3;
    private javax.swing.JLabel lblPassword6;
    private javax.swing.JLabel lblPassword7;
    private javax.swing.JLabel lblPassword8;
    private javax.swing.JLabel lblPassword9;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JLabel lblUserName3;
    private javax.swing.JLabel lblVictimID;
    private javax.swing.JLabel lblVictimID1;
    private javax.swing.JLabel lblWorkID;
    private javax.swing.JLabel lblWorkID1;
    private javax.swing.JTabbedPane paneupdate;
    private javax.swing.JTable tblReport1;
    private javax.swing.JPasswordField txtFireReportAlertTime;
    private javax.swing.JPasswordField txtFireReportAlertTime1;
    private javax.swing.JPasswordField txtFireReportAssignedMarshal;
    private javax.swing.JPasswordField txtFireReportAssignedMarshal1;
    private javax.swing.JTextField txtFireReportIncDesc;
    private javax.swing.JTextField txtFireReportIncDesc1;
    private javax.swing.JPasswordField txtFireReportStatus;
    private javax.swing.JPasswordField txtFireReportStatus1;
    private javax.swing.JPasswordField txtFireReportVictimID;
    private javax.swing.JPasswordField txtFireReportVictimID1;
    private javax.swing.JTextField txtFireReportWorkID;
    private javax.swing.JTextField txtFireReportWorkID1;
    // End of variables declaration//GEN-END:variables
}