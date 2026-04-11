
package Frames;

/**
 *
 * @author ADMIN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Lpassword = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        Lusername2 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        jPassfield = new javax.swing.JPasswordField();
        line1 = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BttnRecruit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 250, 175));
        jLabel2.setText("Slayer Records Access");
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        Lpassword.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(252, 211, 2));
        Lpassword.setText("Password");
        Main.add(Lpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        line2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line2.setForeground(new java.awt.Color(255, 255, 255));
        line2.setText("______________________________________________");
        Main.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        Lusername2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lusername2.setForeground(new java.awt.Color(252, 211, 2));
        Lusername2.setText("Username");
        Main.add(Lusername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        tuser.setBackground(new java.awt.Color(51, 51, 51));
        tuser.setForeground(new java.awt.Color(0, 0, 0));
        tuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuserActionPerformed(evt);
            }
        });
        Main.add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 330, 40));

        jPassfield.setBackground(new java.awt.Color(51, 51, 51));
        jPassfield.setForeground(new java.awt.Color(0, 0, 0));
        jPassfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassfieldActionPerformed(evt);
            }
        });
        Main.add(jPassfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 330, 40));

        line1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("______________________________________________");
        Main.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        showpass.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(252, 211, 2));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        Main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 346, 137, -1));

        jButton1.setBackground(new java.awt.Color(229, 62, 23));
        jButton1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 250, 175));
        jButton1.setText("Login");
        Main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 384, 330, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Not a slayer yet?");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 130, -1));

        BttnRecruit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnRecruit.setForeground(new java.awt.Color(255, 255, 153));
        BttnRecruit.setText("Become a Recruit");
        Main.add(BttnRecruit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/tanjirobg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        Main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPassfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassfieldActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showpassActionPerformed

    private void tuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuserActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BttnRecruit;
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lusername2;
    private javax.swing.JPanel Main;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassfield;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
