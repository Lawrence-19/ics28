package Frames;

import javax.swing.JOptionPane;

/**
 *
 * @author SOMBRENO
 */
public class Register extends javax.swing.JFrame {

   
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
        line1 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        Lpassword = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        BttnRecruit = new javax.swing.JLabel();
        cmbreating = new javax.swing.JComboBox<>();
        Lpassword1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bttnenlist = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();
        Nezukobg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(252, 248, 248));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 250, 175));
        jLabel2.setText("Join The Corps");
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        Lusername2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lusername2.setForeground(new java.awt.Color(252, 211, 2));
        Lusername2.setText("Username");
        Main.add(Lusername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        line1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("______________________________________________");
        Main.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        line3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        line3.setForeground(new java.awt.Color(255, 255, 255));
        line3.setText("______________________________________________");
        Main.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        Lpassword.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(252, 211, 2));
        Lpassword.setText("Breathing Style");
        Main.add(Lpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, 20));

        showpass.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(252, 211, 2));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        Main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 137, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Already a Slayer?");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 110, -1));

        BttnRecruit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnRecruit.setForeground(new java.awt.Color(255, 255, 153));
        BttnRecruit.setText("Login");
        BttnRecruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BttnRecruitMouseClicked(evt);
            }
        });
        Main.add(BttnRecruit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 50, -1));

        cmbreating.setBackground(new java.awt.Color(51, 51, 51));
        cmbreating.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cmbreating.setForeground(new java.awt.Color(255, 255, 255));
        cmbreating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flame ", "Snow", "Beast", "Thunder", "Sun", "Insect", "Mist", "Water", "Wind", "Sound" }));
        cmbreating.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbreating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbreatingActionPerformed(evt);
            }
        });
        Main.add(cmbreating, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 330, -1));

        Lpassword1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Lpassword1.setForeground(new java.awt.Color(252, 211, 2));
        Lpassword1.setText("Password");
        Main.add(Lpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

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
        Main.add(bttnenlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 330, 40));

        jpassword.setBackground(new java.awt.Color(51, 51, 51));
        jpassword.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jpassword.setForeground(new java.awt.Color(255, 255, 255));
        jpassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Main.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 330, 40));

        txtusername.setBackground(new java.awt.Color(51, 51, 51));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        Main.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 330, 40));

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

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
       if(showpass.isSelected()){
           jpassword.setEchoChar((char)0); //I reveal ang password
       }else {
           jpassword.setEchoChar('*');//Taguan ang password
       }
    }//GEN-LAST:event_showpassActionPerformed

    private void BttnRecruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BttnRecruitMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_BttnRecruitMouseClicked

    private void bttnenlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnenlistActionPerformed
       
        String newuser,newpass, newbrstyle;
        
        newuser = txtusername.getText();
        newpass = new String(jpassword.getPassword()).trim();
        newbrstyle = cmbreating.getSelectedItem().toString();
        
        if (newuser.isEmpty() || newpass.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "The Corps requires a name and a secret pass!.",
                    "Entry Denied", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            String url = "jdbc:mysql://localhost/demon_slayer_db";
            String user = "root"; // Deafault ang sa XAMPP Username
            String password = "";  // walay password sa XAMPP
            
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);
            
            String sql = "INSERT INTO users (username, password, breathing_style) VALUES (?, ?, ?)";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, newuser);
            pst.setString(2, newpass);
            pst.setString(3, newbrstyle);
            
            pst.executeUpdate();
            
            //kung mahuman ug himo account
            JOptionPane.showMessageDialog(this, "Welcome to the corps, " + newuser + "!\nYour " + newbrstyle + " breathing has been recorded");
            
            Login log = new Login();
            log.setVisible(true);
            dispose();
            
            conn.close();
            
        }catch(java.sql.SQLException e){
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(this, "That Slayer name is already taken!", "Error" , JOptionPane.ERROR_MESSAGE);
            
            }else{
                JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
            }
        }catch(Exception e) {
                JOptionPane.showMessageDialog(this, "System Error: " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_bttnenlistActionPerformed

    private void cmbreatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbreatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbreatingActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

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
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lpassword1;
    private javax.swing.JLabel Lusername2;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel Nezukobg;
    private javax.swing.JButton bttnenlist;
    private javax.swing.JComboBox<String> cmbreating;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line3;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
