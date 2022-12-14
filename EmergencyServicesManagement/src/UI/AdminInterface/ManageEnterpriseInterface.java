/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminInterface;

import javax.swing.JOptionPane;
import Constants.CustomValidations;

import Services.UserAccount.UserAccount;
import UI.MainJFrame;
import java.sql.*;  
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Anirudh
 */
public class ManageEnterpriseInterface extends javax.swing.JPanel {

    private Connection con;
    private UserAccount user;
    PreparedStatement p = null;
            ResultSet rs = null;
    
    /**
     * Creates new form ManageEnterpriseInterface
     */
    public ManageEnterpriseInterface(UserAccount user, Connection con) {
        initComponents();
        this.con = con;
        this.user = user;
        
        populateCityDropdown();
        populateEnterpriseTable();
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
            String city = cdCity.getSelectedItem().toString();
            String enterprise = cbEnterpriseType.getSelectedItem().toString();
            String name = txtEnterpriseName.getText();
            
       
        if(!name.equals("")){  
       try { 
           

            String sql2 = "INSERT INTO Enterprise (city_name, Enterprise_Name, type) values (?, ?, ?)";
            
            PreparedStatement statement = con.prepareStatement(sql2);
            statement.setString(1, city);
            statement.setString(2, name);
            statement.setString(3, enterprise);
            int row = statement.executeUpdate();
            if(row>0){
                populateEnterpriseTable();

            }
            else{
                System.out.println("Error in inserting!");
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
       
              
        }
        else 
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
            txtEnterpriseName.setText("");
        }else
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        txtEnterpriseName.setText("");
        SystemAdminInterface cityInt = new SystemAdminInterface(user, con);
        new MainJFrame().replaceSplitPaneChild(this, cityInt);
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
    
    private void populateEnterpriseTable(){
        try {
 
            String sql = "select * from Enterprise";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            
            ArrayList<String> enterprise = new ArrayList<String>();
            
            while (rs.next()) {
                String name = rs.getString("enterprise_name");
                String city_name = rs.getString("city_name");
                String type = rs.getString("type");
                enterprise.add(name);
                enterprise.add(city_name);
                enterprise.add(type);
            }
            DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
            model.setRowCount(0);
            Object data[] = new Object[3];
            
            for (int i = 0; i < enterprise.size(); i+=3){
                
                String name = enterprise.get(i);
                String city_name = enterprise.get(i+1);
                String type = enterprise.get(i+2);
                data[0] = name;
                data[1] = city_name;
                data[2] = type;
                 
                model.addRow(data);
                
            }
        }
 
        
        catch (SQLException e) {
 
            
            System.out.println(e);
        }
    }
    
    public void populateCityDropdown(){
        try{
            PreparedStatement p = null;
            ResultSet rs = null;
  
            String sql = "select * from city";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            while (rs.next()) {
                String name = rs.getString("city_name");
                
                cdCity.addItem(name);
            }
        }catch(SQLException ex){
            System.out.println("Database error. Please Logout & Login again.");
        }
    }

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
