
package com.main;

import com.emoji.Emoji_MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class sign_in extends javax.swing.JFrame implements ActionListener {

    
    public sign_in() {
        this.setUndecorated(true);

        initComponents();
        pass_txt.addActionListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/username_icon.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/password_icon.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 30, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resources/icon/signin-image.jpg"))); // NOI18N
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 330, 390));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel2.setText("Log In");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 150, 60));

        pass_txt.setText("Enter Your Password");
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
        roundPanel1.add(pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 320, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 130, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Create New Account");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Forget Password");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 110, -1));

        username_txt.setText("Enter Your Username");
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
        roundPanel1.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 320, 40));

        jPanel1.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 100, 1016, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(username_txt.getText().equals("Enter Your Username")|| pass_txt.getText().equals("Enter Your Password"))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER USERNAME AND PASSWORD..");
        }
        else if(username_txt.getText().equals("atharv123")|| pass_txt.getText().equals("@atharv123"))
        {
            new MainFrame().setVisible(true);
            this.dispose();
            //JOptionPane.showMessageDialog(null,"Welcome back Atharv");
        }
        else  if(username_txt.getText().equals("omkar123")|| pass_txt.getText().equals("@omkar123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome back omakar");
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new sign_up().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        JOptionPane.showMessageDialog(rootPane, "This Feature is not available for now");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pass_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_txtFocusLost
        if(pass_txt.getText().equals(""))
        {
            pass_txt.setText("Enter Your Password");

        }
    }//GEN-LAST:event_pass_txtFocusLost
public void actionPerformed(ActionEvent e)//to open the mainframe form when user hits enter button
{
    if(username_txt.getText().equals("Enter Your Username")|| pass_txt.getText().equals("Enter Your Password"))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER USERNAME AND PASSWORD..");
        }
        else if(username_txt.getText().equals("atharv123")|| pass_txt.getText().equals("@atharv123"))
        {
            new MainFrame().setVisible(true);
            this.dispose();
            //JOptionPane.showMessageDialog(null,"Welcome back Atharv");
        }
        else  if(username_txt.getText().equals("omkar123")|| pass_txt.getText().equals("@omkar123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome back omakar");
        }
    
}
    private void pass_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_txtFocusGained
        if(pass_txt.getText().equals("Enter Your Password"))
        {
            pass_txt.setText("");

        }
    }//GEN-LAST:event_pass_txtFocusGained

    private void username_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_txtFocusLost
        if(username_txt.getText().equals(""))
        {
            username_txt.setText("Enter Your Username");

        }
    }//GEN-LAST:event_username_txtFocusLost

    private void username_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_txtFocusGained
        if(username_txt.getText().equals("Enter Your Username"))
        {
            username_txt.setText("");

        }
    }//GEN-LAST:event_username_txtFocusGained

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
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pass_txt;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
