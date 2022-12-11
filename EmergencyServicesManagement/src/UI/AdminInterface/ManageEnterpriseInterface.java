/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminInterface;

import javax.swing.JOptionPane;
import Constants.CustomValidations;
import Services.City.City;
import Services.UserAccount.UserAccount;
import java.sql.*;  
import java.awt.CardLayout;
import java.awt.Component;


/**
 *
 * @author Anirudh
 */
public class ManageEnterpriseInterface extends javax.swing.JPanel {

    Connection con;
    UserAccount user;
    
    /**
     * Creates new form ManageEnterpriseInterface
     */
    public ManageEnterpriseInterface(UserAccount user, Connection con) {
        initComponents();
        this.con = con;
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        lblCity = new javax.swing.JLabel();
        cdCity = new javax.swing.JComboBox();
        lblEnterpriseName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        lblEnterpriseType = new javax.swing.JLabel();
        cbEnterpriseType = new javax.swing.JComboBox();
        btnAddEnterprise = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblManageEnterprise = new javax.swing.JLabel();

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "City", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        lblCity.setText("City:");

        cdCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cdCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cdCityItemStateChanged(evt);
            }
        });
        cdCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdCityActionPerformed(evt);
            }
        });

        lblEnterpriseName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEnterpriseName.setText("Name:");

        txtEnterpriseName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnterpriseNameKeyPressed(evt);
            }
        });

        lblEnterpriseType.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEnterpriseType.setText("Type:");

        cbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Law Enforcement", "Disaster Management", "Fire Department", "Operator Handling", "Ambulance Service", " " }));
        cbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnterpriseTypeActionPerformed(evt);
            }
        });

        btnAddEnterprise.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAddEnterprise.setText("Add");
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManageEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblManageEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEnterprise.setText("Manage Enterprises");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cdCity, 0, 200, Short.MAX_VALUE)
                        .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(lblEnterpriseType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbEnterpriseType, 0, 200, Short.MAX_VALUE)
                        .addComponent(txtEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterpriseNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterpriseNameKeyPressed
        // TODO add your handling code here:
        CustomValidations.onlyString(evt, txtEnterpriseName);
    }//GEN-LAST:event_txtEnterpriseNameKeyPressed

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed
        
        if(!txtEnterpriseName.getText().trim().isEmpty()){
            City city = (City) cdCity.getSelectedItem();
//            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cbEnterpriseType.getSelectedItem();

//            if (network == null || type == null) {
//                JOptionPane.showMessageDialog(null, "Invalid Input!");
//                return;
//            }

//            boolean enterpriseExixts = false;
//            for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
//                if(ent.getEnterpriseType().getValue().equals(type.getValue())){
//                    enterpriseExixts = true;
//                }
//            }

//            if(enterpriseExixts == false){
//
//                String name = txtEnterpriseName.getText();
//                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
//                populateTable();
//            } else {
//                JOptionPane.showMessageDialog(null, "Enterprise for this type already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
//            }

            txtEnterpriseName.setText("");
        }else
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        SystemAdminInterface sysAdminwjp = (SystemAdminInterface) component;
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEnterpriseTypeActionPerformed

    private void cdCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdCityActionPerformed

    private void cdCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cdCityItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cdCityItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cbEnterpriseType;
    private javax.swing.JComboBox cdCity;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblManageEnterprise;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables
}
