/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Police;

/**
 *
 * @author tanujverma
 */
public class Master_workqueue extends javax.swing.JPanel {

    /**
     * Creates new form Master_workqueue
     */
    public Master_workqueue() {
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

        btnAssignToMe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        btnAssignToMe.setText("Assign to Myself");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work ID", "OPERATOR ID", "VICTIM NAME", "VICTIM PHONE", "VICTIM ADDRESS", "VICTIM CITY", "VICTIM STATE", "VICTIM ZIP", "DESCRIPTION", "ASSIGN TO", "STATUS", "RECEIVED DATE", "RESOLVED DATE"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POLICE OFFICER MASTER WORK QUEUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(btnAssignToMe)
                .addGap(44, 44, 44))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
