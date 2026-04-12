
import Frames.create;

/*
package Frames;

/**
 *
 * @author ADMIN
 */
public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bttnCreate = new javax.swing.JButton();
        BttnRead = new javax.swing.JButton();
        BttnUpdate = new javax.swing.JButton();
        BttnDelete = new javax.swing.JButton();
        BttnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 248, 248));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(44, 44, 46, 180));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Welcome Back! The Corps awaits your next move");

        bttnCreate.setBackground(new java.awt.Color(153, 153, 255));
        bttnCreate.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 14)); // NOI18N
        bttnCreate.setForeground(new java.awt.Color(0, 0, 0));
        bttnCreate.setText("Create");
        bttnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCreateActionPerformed(evt);
            }
        });

        BttnRead.setBackground(new java.awt.Color(153, 153, 255));
        BttnRead.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 14)); // NOI18N
        BttnRead.setForeground(new java.awt.Color(0, 0, 0));
        BttnRead.setText("Read");
        BttnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnReadActionPerformed(evt);
            }
        });

        BttnUpdate.setBackground(new java.awt.Color(153, 153, 255));
        BttnUpdate.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 14)); // NOI18N
        BttnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        BttnUpdate.setText("Update");
        BttnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnUpdateActionPerformed(evt);
            }
        });

        BttnDelete.setBackground(new java.awt.Color(153, 153, 255));
        BttnDelete.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 14)); // NOI18N
        BttnDelete.setForeground(new java.awt.Color(0, 0, 0));
        BttnDelete.setText("Delete");
        BttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnDeleteActionPerformed(evt);
            }
        });

        BttnLogout.setBackground(new java.awt.Color(153, 153, 255));
        BttnLogout.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 18)); // NOI18N
        BttnLogout.setForeground(new java.awt.Color(0, 0, 0));
        BttnLogout.setText("Log Out");
        BttnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(111, 111, 111))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BttnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BttnRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BttnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BttnUpdate)
                            .addComponent(bttnCreate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttnRead)
                    .addComponent(bttnCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttnUpdate)
                    .addComponent(BttnDelete))
                .addGap(73, 73, 73)
                .addComponent(BttnLogout)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 30, 940, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Forestbg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCreateActionPerformed
       create cr = new create();
       cr.setVisible(true);
       desktopright.removeAll();
       desktopright.add(cr).setVisible(true);
    }//GEN-LAST:event_bttnCreateActionPerformed

    private void BttnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnReadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttnReadActionPerformed

    private void BttnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttnUpdateActionPerformed

    private void BttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttnDeleteActionPerformed

    private void BttnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnLogoutActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_BttnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttnDelete;
    private javax.swing.JButton BttnLogout;
    private javax.swing.JButton BttnRead;
    private javax.swing.JButton BttnUpdate;
    private javax.swing.JButton bttnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
