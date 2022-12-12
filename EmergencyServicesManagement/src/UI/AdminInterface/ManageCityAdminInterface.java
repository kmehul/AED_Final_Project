/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminInterface;

import Services.UserAccount.UserAccount;
import UI.MainJFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anirudh
 */
public class ManageCityAdminInterface extends javax.swing.JPanel {

    Connection con;
    UserAccount user;
            ResultSet rs = null;
        Statement stmt = null;
    
    /**
     * Creates new form ManageCityAdminInterface11
     */
    public ManageCityAdminInterface(UserAccount user, Connection con) {
        initComponents();
        this.con = con;
        this.user = user;
        try{
        populateCityTable();
        }catch(SQLException e){
              System.out.println("Database error. Please Logout & Login again.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCityName = new javax.swing.JLabel();
        lblManageCity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageCity = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSubmitCity = new javax.swing.JButton();
        txtCityName = new javax.swing.JTextField();

        lblCityName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCityName.setText("Name:");

        lblManageCity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManageCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCity.setText("Manage Cities");

        tblManageCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageCity);

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmitCity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSubmitCity.setText("Submit");
        btnSubmitCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCityActionPerformed(evt);
            }
        });

        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });
        txtCityName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityNameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblManageCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmitCity, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblManageCity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmitCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        txtCityName.setText("");
        
        SystemAdminInterface cityInt = new SystemAdminInterface(user, con);
        new MainJFrame().replaceSplitPaneChild(this, cityInt);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCityActionPerformed

        String name = txtCityName.getText();
        System.out.println(name);
        if(!name.equals("")){  
        try { 
            String sql = "INSERT INTO city (city_name) values (?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, name);

            int row = statement.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
       
              
            try {
                populateCityTable();
            } catch (SQLException ex) {
                Logger.getLogger(ManageCityAdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else 
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSubmitCityActionPerformed

    private void txtCityNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityNameKeyPressed
        
    }//GEN-LAST:event_txtCityNameKeyPressed

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void populateCityTable() throws SQLException {
        PreparedStatement p = null;
        ResultSet rs = null;
  
        try {
 
            String sql = "select * from city";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            ArrayList<String> city = new ArrayList<String>();

            while (rs.next()) {
                String name = rs.getString("city_name");
                city.add(name);
            }
            DefaultTableModel model = (DefaultTableModel) tblManageCity.getModel();
            model.setRowCount(0);
            Object data[] = new Object[5];
            
            for (int i = 0; i < city.size(); i++){
                
                String name = city.get(i);
                  
                data[0] = name;
                 
                model.addRow(data);
                
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitCity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblManageCity;
    private javax.swing.JTable tblManageCity;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables
}
