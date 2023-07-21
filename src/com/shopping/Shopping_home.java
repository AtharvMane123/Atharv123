
package com.shopping;

import java.awt.Graphics;
import javax.swing.Icon;
import rojerusan.RSPanelImage;
import com.raven.swing.RoundPanel;
import com.shopping.fashion.Fashion_MainFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Shopping_home extends javax.swing.JInternalFrame {

   
    public Shopping_home() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
          ui.setNorthPane(null);
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fashion_panel = new com.raven.swing.RoundPanel();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        sneakers_panel = new com.raven.swing.RoundPanel();
        rSPanelImage3 = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        watches_panel = new com.raven.swing.RoundPanel();
        rSPanelImage4 = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        electronics_panel = new com.raven.swing.RoundPanel();
        rSPanelImage5 = new rojerusan.RSPanelImage();
        jLabel4 = new javax.swing.JLabel();
        books_panel = new com.raven.swing.RoundPanel();
        rSPanelImage6 = new rojerusan.RSPanelImage();
        jLabel5 = new javax.swing.JLabel();
        groceries_panel = new com.raven.swing.RoundPanel();
        rSPanelImage7 = new rojerusan.RSPanelImage();
        jLabel6 = new javax.swing.JLabel();

        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1060, 920));
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1060, 790));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 790));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/mens.jpg"))); // NOI18N

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(154, 154, 154))
        );

        fashion_panel.setBackground(new java.awt.Color(255, 255, 255));
        fashion_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fashion_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fashion_panelMouseClicked(evt);
            }
        });
        fashion_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/fashion.jpeg"))); // NOI18N
        rSPanelImage2.setInheritsPopupMenu(true);

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        fashion_panel.add(rSPanelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FASHION");
        fashion_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        sneakers_panel.setBackground(new java.awt.Color(255, 255, 255));
        sneakers_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sneakers_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/shoes.jpg"))); // NOI18N
        rSPanelImage3.setInheritsPopupMenu(true);

        javax.swing.GroupLayout rSPanelImage3Layout = new javax.swing.GroupLayout(rSPanelImage3);
        rSPanelImage3.setLayout(rSPanelImage3Layout);
        rSPanelImage3Layout.setHorizontalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        rSPanelImage3Layout.setVerticalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        sneakers_panel.add(rSPanelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SNEAKERS");
        sneakers_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        watches_panel.setBackground(new java.awt.Color(255, 255, 255));
        watches_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        watches_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage4.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/watches.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage4Layout = new javax.swing.GroupLayout(rSPanelImage4);
        rSPanelImage4.setLayout(rSPanelImage4Layout);
        rSPanelImage4Layout.setHorizontalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        rSPanelImage4Layout.setVerticalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        watches_panel.add(rSPanelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WATCHES");
        watches_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        electronics_panel.setBackground(new java.awt.Color(255, 255, 255));
        electronics_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        electronics_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/electronics.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage5Layout = new javax.swing.GroupLayout(rSPanelImage5);
        rSPanelImage5.setLayout(rSPanelImage5Layout);
        rSPanelImage5Layout.setHorizontalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        rSPanelImage5Layout.setVerticalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        electronics_panel.add(rSPanelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELECTRONICS");
        electronics_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        books_panel.setBackground(new java.awt.Color(255, 255, 255));
        books_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        books_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage6.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/books.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage6Layout = new javax.swing.GroupLayout(rSPanelImage6);
        rSPanelImage6.setLayout(rSPanelImage6Layout);
        rSPanelImage6Layout.setHorizontalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        rSPanelImage6Layout.setVerticalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        books_panel.add(rSPanelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BOOKS");
        books_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        groceries_panel.setBackground(new java.awt.Color(255, 255, 255));
        groceries_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        groceries_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage7.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/grocery.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage7Layout = new javax.swing.GroupLayout(rSPanelImage7);
        rSPanelImage7.setLayout(rSPanelImage7Layout);
        rSPanelImage7Layout.setHorizontalGroup(
            rSPanelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        rSPanelImage7Layout.setVerticalGroup(
            rSPanelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        groceries_panel.add(rSPanelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GROCERIES");
        groceries_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fashion_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(sneakers_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(electronics_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(books_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groceries_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(watches_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fashion_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(sneakers_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(watches_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(electronics_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(books_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groceries_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/gudi-padwa-date.jpg")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/diwali sale.jpg")));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fashion_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fashion_panelMouseClicked


      System.out.println("HELLO");
        

    }//GEN-LAST:event_fashion_panelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.RoundPanel books_panel;
    private com.raven.swing.RoundPanel electronics_panel;
    private com.raven.swing.RoundPanel fashion_panel;
    private com.raven.swing.RoundPanel groceries_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private rojerusan.RSPanelImage rSPanelImage3;
    private rojerusan.RSPanelImage rSPanelImage4;
    private rojerusan.RSPanelImage rSPanelImage5;
    private rojerusan.RSPanelImage rSPanelImage6;
    private rojerusan.RSPanelImage rSPanelImage7;
    private com.raven.swing.RoundPanel sneakers_panel;
    private com.raven.swing.RoundPanel watches_panel;
    // End of variables declaration//GEN-END:variables

  
}
