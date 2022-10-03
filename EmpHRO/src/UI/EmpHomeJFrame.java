/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import model.Employee;
import model.EmployeeHistory;
/**
 *
 * @author sumit
 */
public class EmpHomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EmpHomeJFrame
     */
    EmployeeHistory emphistory;
    Employee newEmp;
    public EmpHomeJFrame() {
        initComponents();
        newEmp = new Employee();
        emphistory = new EmployeeHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane = new javax.swing.JSplitPane();
        ButtonJPanel = new javax.swing.JPanel();
        BtnCreateEmp = new javax.swing.JButton();
        BtnViewEmp = new javax.swing.JButton();
        BtnSearchEmp = new javax.swing.JButton();
        MainJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 370));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Human Resource Management System");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        BtnCreateEmp.setText("Create Employee");
        BtnCreateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateEmpActionPerformed(evt);
            }
        });

        BtnViewEmp.setText("View Employee");
        BtnViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewEmpActionPerformed(evt);
            }
        });

        BtnSearchEmp.setText("Search Employee");
        BtnSearchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonJPanelLayout = new javax.swing.GroupLayout(ButtonJPanel);
        ButtonJPanel.setLayout(ButtonJPanelLayout);
        ButtonJPanelLayout.setHorizontalGroup(
            ButtonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSearchEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(BtnCreateEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnViewEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ButtonJPanelLayout.setVerticalGroup(
            ButtonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonJPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BtnCreateEmp)
                .addGap(50, 50, 50)
                .addComponent(BtnViewEmp)
                .addGap(45, 45, 45)
                .addComponent(BtnSearchEmp)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ButtonJPanel);

        javax.swing.GroupLayout MainJPanelLayout = new javax.swing.GroupLayout(MainJPanel);
        MainJPanel.setLayout(MainJPanelLayout);
        MainJPanelLayout.setHorizontalGroup(
            MainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        MainJPanelLayout.setVerticalGroup(
            MainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(MainJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCreateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateEmpActionPerformed
        // TODO add your handling code here:
        CreateEmployeeJPanel createEmp = new CreateEmployeeJPanel(emphistory,newEmp);
        jSplitPane.setRightComponent(createEmp);
    }//GEN-LAST:event_BtnCreateEmpActionPerformed

    private void BtnViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewEmpActionPerformed
        // TODO add your handling code here:
        ViewEmployeeJPanel viewEmp = new ViewEmployeeJPanel(emphistory);
        jSplitPane.setRightComponent(viewEmp);
    }//GEN-LAST:event_BtnViewEmpActionPerformed

    private void BtnSearchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchEmpActionPerformed
        // TODO add your handling code here:
        SearchEmployeeJPanel searchEmp = new SearchEmployeeJPanel(emphistory);
        jSplitPane.setRightComponent(searchEmp);
    }//GEN-LAST:event_BtnSearchEmpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpHomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateEmp;
    private javax.swing.JButton BtnSearchEmp;
    private javax.swing.JButton BtnViewEmp;
    private javax.swing.JPanel ButtonJPanel;
    private javax.swing.JPanel MainJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
