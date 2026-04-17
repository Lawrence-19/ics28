
package Frames;

import javax.swing.JOptionPane;

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
        setLocationRelativeTo(null); // para mag pop up ni nga jframe sa tunga kung I run
    
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
        txtusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        line1 = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        bttnlogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BttnRecruit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 250, 175));
        jLabel2.setText("Slayer Records Access");
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        Lpassword.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(252, 211, 2));
        Lpassword.setText("Password");
        Main.add(Lpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, 30));

        line2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line2.setForeground(new java.awt.Color(255, 255, 255));
        line2.setText("______________________________________________");
        Main.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        Lusername2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lusername2.setForeground(new java.awt.Color(252, 211, 2));
        Lusername2.setText("Username");
        Main.add(Lusername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        txtusername.setBackground(new java.awt.Color(51, 51, 51));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        Main.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 330, 40));

        jpassword.setBackground(new java.awt.Color(51, 51, 51));
        jpassword.setForeground(new java.awt.Color(255, 255, 255));
        jpassword.setToolTipText("");
        jpassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        Main.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 330, 40));

        line1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("______________________________________________");
        Main.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        showpass.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(252, 211, 2));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        Main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 137, -1));

        bttnlogin.setBackground(new java.awt.Color(229, 62, 23));
        bttnlogin.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        bttnlogin.setForeground(new java.awt.Color(254, 250, 175));
        bttnlogin.setText("Login");
        bttnlogin.setMaximumSize(new java.awt.Dimension(110, 40));
        bttnlogin.setMinimumSize(new java.awt.Dimension(110, 40));
        bttnlogin.setPreferredSize(new java.awt.Dimension(110, 40));
        bttnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnloginActionPerformed(evt);
            }
        });
        Main.add(bttnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 330, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Not a slayer yet?");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 110, -1));

        BttnRecruit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnRecruit.setForeground(new java.awt.Color(255, 255, 153));
        BttnRecruit.setText("Become a Recruit");
        BttnRecruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BttnRecruitMouseClicked(evt);
            }
        });
        Main.add(BttnRecruit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 110, -1));

        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText(" © 2026 Demon Slayer - All Rights Reserved");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

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

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
           jpassword.setEchoChar((char)0); //I reveal ang password
       }else {
           jpassword.setEchoChar('*');//Taguan ang password
       }
    }//GEN-LAST:event_showpassActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void BttnRecruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BttnRecruitMouseClicked
       Register reg = new Register();
       reg.setVisible(true);
       dispose();
    }//GEN-LAST:event_BttnRecruitMouseClicked

    private void bttnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnloginActionPerformed
       String user = txtusername.getText().trim();
       String pass = new String(jpassword.getPassword()).trim();
       
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your username and password!.",
                    "Login Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        try{
            String url = "jdbc:mysql://localhost/demon_slayer_db";
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, "root", "");

            String sql = "SELECT * FROM users Where username=? AND password=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            
            java.sql.ResultSet rs = pst.executeQuery();
            
            if(rs.next()) {
                //kung makita ang account
                JOptionPane.showMessageDialog(this , "Access Granted. Welcome, " + user);
                
                Dashboard dash = new Dashboard();
                dash.setVisible(true);
                this.dispose();
            }else {
                //kung wala nakita ang account
                JOptionPane.showMessageDialog(this, "Incorrect password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading users file", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_bttnloginActionPerformed

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
    private javax.swing.JButton bttnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
