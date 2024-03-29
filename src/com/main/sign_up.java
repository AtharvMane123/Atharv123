
package com.main;

import javax.swing.JOptionPane;

public class sign_up extends javax.swing.JFrame {

    
    public sign_up() {
                this.setUndecorated(true);

        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/username_icon.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/password_icon.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, 40));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel2.setText("Sign Up");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 60));

        email_txt.setText("Enter Your Email Id");
        email_txt.setToolTipText("Enter your password");
        email_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        email_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_txtFocusLost(evt);
            }
        });
        roundPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 320, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 130, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Already have an Account");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 160, -1));

        username_txt.setText("Create an Username");
        username_txt.setToolTipText("Enter your username");
        username_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        username_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_txtFocusLost(evt);
            }
        });
        roundPanel1.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 320, 40));

        pass_txt.setText("Create a password");
        pass_txt.setToolTipText("Enter your password");
        pass_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pass_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_txtFocusLost(evt);
            }
        });
        roundPanel1.add(pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 320, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/password_icon.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 30, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/signin-image.jpg"))); // NOI18N
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jPanel1.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 100, 1016, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void email_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_txtFocusGained
        if(email_txt.getText().equals("Enter Your Email Id"))
        {
            email_txt.setText("");
        }
    }//GEN-LAST:event_email_txtFocusGained

    private void email_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_txtFocusLost
        if(email_txt.getText().equals(""))
        {
            email_txt.setText("Enter Your Email Id");
        }
    }//GEN-LAST:event_email_txtFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(username_txt.getText().equals("Create an Username")|| pass_txt.getText().equals("Create a Password")|| email_txt.getText().equals("Enter Your Email Id"))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER USERNAME AND PASSWORD..");
        }
        else if(username_txt.getText().equals("atharv123")|| pass_txt.getText().equals("@atharv123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome back Atharv");
        }
        else  if(username_txt.getText().equals("omkar123")|| pass_txt.getText().equals("@omkar123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome back omakar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new sign_in().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void username_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_txtFocusGained
        if(username_txt.getText().equals("Create an Username"))
        {
            username_txt.setText("");
        }
    }//GEN-LAST:event_username_txtFocusGained

    private void username_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_txtFocusLost
        if(username_txt.getText().equals(""))
        {
            username_txt.setText("Create an Username");
        }
    }//GEN-LAST:event_username_txtFocusLost

    private void pass_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_txtFocusGained
        if(pass_txt.getText().equals("Create a password"))
        {
            pass_txt.setText("");
        }
    }//GEN-LAST:event_pass_txtFocusGained

    private void pass_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_txtFocusLost
        if(pass_txt.getText().equals(""))
        {
            pass_txt.setText("Create a password");
        }
    }//GEN-LAST:event_pass_txtFocusLost

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pass_txt;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
