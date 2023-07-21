
package com.emoji;

import com.main.MainFrame;


public class Emoji_MainFrame extends javax.swing.JFrame {
String emoji;
    public Emoji_MainFrame() {
        this.setUndecorated(true);//to  remove the symbols ( - [] x ) 
        initComponents();
    }

 public  void name(String st){
     st=st.toUpperCase();
            for(int i1=0;i1<st.length();i1++){
            char c1=st.charAt(i1);
        
            String a="😖😖😖😖\n😖          😖\n😖          😖\n😖😖😖😖\n😖          😖\n😖          😖\n😖          😖\n\n";
          
            String b="🌻🌻🌻🌻\n🌻            🌻\n🌻            🌻\n🌻🌻🌻🌻\n🌻            🌻\n🌻            🌻\n🌻🌻🌻🌻\n\n";
            String c="  🍎🍎🍎\n🍎      🍎\n🍎\n🍎\n🍎\n🍎      🍎\n  🍎🍎🍎\n\n";
            String d="😁😁😁\n😁      😁\n😁      😁\n😁      😁\n😁      😁\n😁      😁\n😁😁😁\n\n";
            String e="🌟🌟🌟🌟\n🌟\n🌟\n🌟🌟🌟🌟\n🌟\n🌟\n🌟🌟🌟🌟\n";
            String f="🙂🙂🙂🙂\n🙂\n🙂\n🙂🙂🙂\n🙂\n🙂\n🙂\n\n";
            String g="  😅😅😅\n😅      😅\n😅\n😅\n😅    😅😅\n😅        😅\n  😅😅😅\n\n";
            String h="😭          😭\n😭          😭\n😭          😭\n😭😭😭😭\n😭          😭\n😭          😭\n😭          😭\n\n";
            String i="😍😍😍😍😍\n          😍    \n          😍    \n          😍    \n          😍    \n          😍    \n😍😍😍😍😍\n\n";
            String j="🌺🌺🌺🌺🌺\n          🌺\n          🌺\n          🌺\n🌺    🌺\n🌺  🌺\n\n";
            String k="😄      😄\n😄    😄\n😄  😄\n😄😄\n😄😄\n😄  😄\n😄    😄\n😄      😄\n\n";
            String l="🍫\n🍫\n🍫\n🍫\n🍫\n🍫🍫🍫🍫🍫\n\n";
            String m="😜              😜\n😜😜    😜😜\n😜  😜😜  😜\n😜    😜     😜\n😜              😜\n😜              😜\n\n";
            String n="😎           😎\n😎😎      😎\n😎  😎    😎\n😎    😎  😎\n😎      😎😎\n😎          😎\n\n";
            String o="  😁😁😁\n😁        😁\n😁        😁\n😁        😁\n😁        😁\n😁        😁\n  😁😁😁\n\n";
            String p="💕💕💕💕\n💕          💕\n💕          💕\n💕💕💕💕\n💕\n💕\n💕\n\n";
            String q="  😁😁😁\n😁        😁\n😁        😁\n😁        😁\n😁        😁\n😁      😁😁\n  😁😁😁😁\n                 😁\n\n";
            String r="🎈🎈🎈🎈\n🎈          🎈\n🎈          🎈\n🎈🎈🎈🎈\n🎈🎈\n🎈  🎈\n🎈    🎈\n🎈      🎈\n\n";
            String s="  🌹🌹🌹🌹\n🌹\n🌹\n  🌹🌹🌹🌹\n                  🌹\n                  🌹\n 🌹🌹🌹🌹\n\n";
            String t="🌺🌺🌺🌺🌺\n          🌺\n          🌺\n          🌺\n          🌺\n          🌺\n\n";
            String u="😁        😁\n😁        😁\n😁        😁\n😁        😁\n😁        😁\n😁        😁\n  😁😁😁\n\n";
            String v="😂              😂\n  😂          😂\n    😂      😂\n      😂  😂\n        😂\n\n";
            String w="😜              😜\n😜              😜\n😜    😜     😜\n😜  😜 😜 😜\n😜😜    😜😜\n😜              😜\n\n";
            String x="😂          😂\n  😂      😂\n    😂  😂\n      😂\n    😂  😂\n  😂      😂\n😂          😂\n\n";
            String y="😂          😂\n  😂      😂\n    😂  😂\n      😂\n    😂\n  😂\n😂\n\n";
            String z="❤❤❤❤\n          ❤\n        ❤\n      ❤\n  ❤\n❤❤❤❤";
          
            switch (c1){
                case 'A':
                emoji_txt.append(a);
                continue ;
                case 'B':
                emoji_txt.append(b);
                continue ;
                case 'C':
                emoji_txt.append(c);
                continue ;
                case 'D':
                emoji_txt.append(d);
                continue ;
                case 'E':
                emoji_txt.append(e);
                continue ;
                case 'F':
                emoji_txt.append(f);
                continue ;
                case 'G':
                emoji_txt.append(g);
                continue ;
                case 'H':
                emoji_txt.append(h);
                continue ;
                case 'I':
                emoji_txt.append(i);
                continue ;
                case 'J':
                emoji_txt.append(j);
                continue ;
                case 'K':
                emoji_txt.append(k);
                continue ;
                case 'L':
                emoji_txt.append(l);
                continue ;
                case 'M':
                emoji_txt.append(m);
                continue ;
                case 'N':
                emoji_txt.append(n);
                continue ;
                case 'O':
                emoji_txt.append(o);
                continue ;
                case 'P':
                emoji_txt.append(p);
                continue ;
                case 'Q':
                emoji_txt.append(q);
                continue ;
                case 'R':
                emoji_txt.append(r);
                continue ;
                case 'S':
                emoji_txt.append(s);
                continue ;
                case 'T':
                emoji_txt.append(t);
                continue ;
                case 'U':
                emoji_txt.append(u);
                continue ;
                case 'V':
                emoji_txt.append(v);
                continue ;
                case 'W':
                emoji_txt.append(w);
                continue ;
                case 'X':
                emoji_txt.append(x);
                continue ;
                case 'Y':
                emoji_txt.append(y);
                continue ;
                case 'Z':
                emoji_txt.append(z);
                continue ;
                default:
                emoji_txt.append("\n\n\n\n\n\n\n");
                continue ;
            }    
            }
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        name_txt = new rojerusan.RSMetroTextPlaceHolder();
        emoji_btn = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        emoji_txt = new javax.swing.JTextArea();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(204, 204, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_txt.setForeground(new java.awt.Color(0, 0, 0));
        name_txt.setBorderColor(new java.awt.Color(0, 0, 0));
        name_txt.setBotonColor(new java.awt.Color(0, 0, 0));
        name_txt.setPhColor(new java.awt.Color(0, 0, 0));
        name_txt.setPlaceholder("Enter your name");
        roundPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 33, 340, -1));

        emoji_btn.setBackground(new java.awt.Color(255, 255, 255));
        emoji_btn.setForeground(new java.awt.Color(0, 0, 0));
        emoji_btn.setText("Click Me");
        emoji_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emoji_btnActionPerformed(evt);
            }
        });
        roundPanel1.add(emoji_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 197, 52));

        emoji_txt.setEditable(false);
        emoji_txt.setBackground(new java.awt.Color(255, 255, 255));
        emoji_txt.setColumns(20);
        emoji_txt.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        emoji_txt.setRows(5);
        emoji_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emoji_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(emoji_txt);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 153, 570, 495));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 0, 0));
        rSMaterialButtonCircle1.setText("GO BACK");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        roundPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 134, 49));

        jPanel1.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 38, 660, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emoji_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emoji_btnActionPerformed
     emoji_txt.setText("");
        name(name_txt.getText());
    }//GEN-LAST:event_emoji_btnActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
      new MainFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Emoji_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emoji_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emoji_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emoji_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emoji_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle emoji_btn;
    private javax.swing.JTextArea emoji_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMetroTextPlaceHolder name_txt;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private com.raven.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
