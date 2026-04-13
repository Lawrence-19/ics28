/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author ADMIN
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null); // para mag pop up ni nga jframe sa tunga kung I run
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Lusername2 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        line1 = new javax.swing.JLabel();
        Lemail = new javax.swing.JLabel();
        tuser1 = new javax.swing.JTextField();
        line3 = new javax.swing.JLabel();
        Lpassword = new javax.swing.JLabel();
        jPassfield = new javax.swing.JPasswordField();
        line2 = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        BttnRecruit = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Lpassword1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bttnenlist = new javax.swing.JButton();
        Nezukobg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(252, 248, 248));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 250, 175));
        jLabel2.setText("Join The Corps");
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        Lusername2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lusername2.setForeground(new java.awt.Color(252, 211, 2));
        Lusername2.setText("Username");
        Main.add(Lusername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        tuser.setBackground(new java.awt.Color(51, 51, 51));
        tuser.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tuser.setForeground(new java.awt.Color(255, 255, 255));
        tuser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tuser.setCaretColor(new java.awt.Color(51, 51, 51));
        tuser.setOpaque(true);
        tuser.setRequestFocusEnabled(false);
        tuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuserActionPerformed(evt);
            }
        });
        Main.add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 330, 40));

        line1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("______________________________________________");
        Main.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        Lemail.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lemail.setForeground(new java.awt.Color(252, 211, 2));
        Lemail.setText("Email");
        Main.add(Lemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 210, -1, -1));

        tuser1.setBackground(new java.awt.Color(51, 51, 51));
        tuser1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tuser1.setForeground(new java.awt.Color(255, 255, 255));
        tuser1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuser1ActionPerformed(evt);
            }
        });
        Main.add(tuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 330, 40));

        line3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line3.setForeground(new java.awt.Color(255, 255, 255));
        line3.setText("______________________________________________");
        Main.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        Lpassword.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(252, 211, 2));
        Lpassword.setText("Breathing Style");
        Main.add(Lpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, 40));

        jPassfield.setBackground(new java.awt.Color(51, 51, 51));
        jPassfield.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPassfield.setForeground(new java.awt.Color(255, 255, 255));
        jPassfield.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPassfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassfieldActionPerformed(evt);
            }
        });
        Main.add(jPassfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 330, 40));

        line2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line2.setForeground(new java.awt.Color(255, 255, 255));
        line2.setText("______________________________________________");
        Main.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        showpass.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(252, 211, 2));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        Main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 137, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Already a Slayer?");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 110, -1));

        BttnRecruit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnRecruit.setForeground(new java.awt.Color(255, 255, 153));
        BttnRecruit.setText("Login");
        BttnRecruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BttnRecruitMouseClicked(evt);
            }
        });
        Main.add(BttnRecruit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 50, -1));

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flame ", "Snow", "Beast", "Thunder", "Sun", "Insect", "Mist", "Water", "Wind", "Sound" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Main.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 330, -1));

        Lpassword1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lpassword1.setForeground(new java.awt.Color(252, 211, 2));
        Lpassword1.setText("Password");
        Main.add(Lpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText(" © 2026 Demon Slayer - All Rights Reserved");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        bttnenlist.setBackground(new java.awt.Color(229, 62, 23));
        bttnenlist.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        bttnenlist.setForeground(new java.awt.Color(254, 250, 175));
        bttnenlist.setText("Enlist Now");
        bttnenlist.setMaximumSize(new java.awt.Dimension(110, 40));
        bttnenlist.setMinimumSize(new java.awt.Dimension(110, 40));
        bttnenlist.setPreferredSize(new java.awt.Dimension(110, 40));
        bttnenlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnenlistActionPerformed(evt);
            }
        });
        Main.add(bttnenlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 330, 40));

        Nezukobg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/nezukobg.jpg"))); // NOI18N
        Main.add(Nezukobg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuserActionPerformed

    private void jPassfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassfieldActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showpassActionPerformed

    private void tuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuser1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BttnRecruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BttnRecruitMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_BttnRecruitMouseClicked

    private void bttnenlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnenlistActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttnenlistActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For detaMain http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BttnRecruit;
    private javax.swing.JLabel Lemail;
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lpassword1;
    private javax.swing.JLabel Lusername2;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel Nezukobg;
    private javax.swing.JButton bttnenlist;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPassfield;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField tuser;
    private javax.swing.JTextField tuser1;
    // End of variables declaration//GEN-END:variables
}
