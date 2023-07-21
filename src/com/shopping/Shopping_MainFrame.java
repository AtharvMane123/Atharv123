
package com.shopping;

import com.main.MainFrame;
import com.shopping.electronics.Electronic_MainFrame;
import com.shopping.fashion.Fashion_MainFrame;
import com.shopping.footwear.Footwear_MainFrame;
import com.shopping.watches.Watches_MainFrame;
import javax.swing.JInternalFrame;


public class Shopping_MainFrame extends javax.swing.JFrame{

    public Shopping_MainFrame() {
        
        initComponents();
        ScrollPane.getVerticalScrollBar().setUnitIncrement(20);//to set the speed of the scrollbar
        
     
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        fashion_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        watches_label = new javax.swing.JLabel();
        sneakers_label = new javax.swing.JLabel();
        electronics_label = new javax.swing.JLabel();
        groceries_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        books_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cart_label = new javax.swing.JLabel();
        deskpane = new javax.swing.JDesktopPane();
        ScrollPane = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        fashion_panel = new com.raven.swing.RoundPanel();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        sneakers_panel = new com.raven.swing.RoundPanel();
        rSPanelImage3 = new rojerusan.RSPanelImage();
        jLabel9 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));

        fashion_label.setBackground(new java.awt.Color(204, 204, 255));
        fashion_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        fashion_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fashion_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/clothes.png"))); // NOI18N
        fashion_label.setText("FASHION");
        fashion_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        fashion_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fashion_labelMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CATEGORY");

        watches_label.setBackground(new java.awt.Color(204, 204, 255));
        watches_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        watches_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        watches_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/classic_watch.png"))); // NOI18N
        watches_label.setText("WATCHES");
        watches_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        watches_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watches_labelMouseClicked(evt);
            }
        });

        sneakers_label.setBackground(new java.awt.Color(204, 204, 255));
        sneakers_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        sneakers_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sneakers_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/sneakers .png"))); // NOI18N
        sneakers_label.setText("FOOTWEAR");
        sneakers_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sneakers_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sneakers_labelMouseClicked(evt);
            }
        });

        electronics_label.setBackground(new java.awt.Color(204, 204, 255));
        electronics_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        electronics_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        electronics_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/gadgets.png"))); // NOI18N
        electronics_label.setText("ELECTRONICS");
        electronics_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        electronics_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electronics_labelMouseClicked(evt);
            }
        });

        groceries_label.setBackground(new java.awt.Color(204, 204, 255));
        groceries_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        groceries_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groceries_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/grocery.png"))); // NOI18N
        groceries_label.setText("GROCERIES");
        groceries_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/user.png"))); // NOI18N

        jLabel8.setText("username");

        books_label.setBackground(new java.awt.Color(204, 204, 255));
        books_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        books_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        books_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/book.png"))); // NOI18N
        books_label.setText("  BOOKS");
        books_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jButton1.setText("GO BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cart_label.setBackground(new java.awt.Color(204, 204, 255));
        cart_label.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        cart_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cart_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/shopping-cart.png"))); // NOI18N
        cart_label.setText("CART");
        cart_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(fashion_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(sneakers_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(watches_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(electronics_label))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(groceries_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cart_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(books_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(fashion_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(sneakers_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(watches_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(electronics_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(groceries_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(books_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cart_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 200, 800));

        deskpane.setMinimumSize(new java.awt.Dimension(960, 790));

        ScrollPane.setBorder(null);
        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPane.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        ScrollPane.setPreferredSize(new java.awt.Dimension(1060, 790));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/mens.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        fashion_panel.setBackground(new java.awt.Color(255, 255, 255));
        fashion_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fashion_panelMouseClicked(evt);
            }
        });
        fashion_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/Fashion.png"))); // NOI18N
        rSPanelImage2.setInheritsPopupMenu(true);

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        fashion_panel.add(rSPanelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 250));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FASHION");
        fashion_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        sneakers_panel.setBackground(new java.awt.Color(255, 255, 255));
        sneakers_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sneakers_panelMouseClicked(evt);
            }
        });
        sneakers_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/Footwear.png"))); // NOI18N
        rSPanelImage3.setInheritsPopupMenu(true);

        javax.swing.GroupLayout rSPanelImage3Layout = new javax.swing.GroupLayout(rSPanelImage3);
        rSPanelImage3.setLayout(rSPanelImage3Layout);
        rSPanelImage3Layout.setHorizontalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        rSPanelImage3Layout.setVerticalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        sneakers_panel.add(rSPanelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 250));

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FOOTWEAR");
        sneakers_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        watches_panel.setBackground(new java.awt.Color(255, 255, 255));
        watches_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watches_panelMouseClicked(evt);
            }
        });
        watches_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage4.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelImage4.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/Watches.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage4Layout = new javax.swing.GroupLayout(rSPanelImage4);
        rSPanelImage4.setLayout(rSPanelImage4Layout);
        rSPanelImage4Layout.setHorizontalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        rSPanelImage4Layout.setVerticalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        watches_panel.add(rSPanelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 250));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WATCHES");
        watches_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        electronics_panel.setBackground(new java.awt.Color(255, 255, 255));
        electronics_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electronics_panelMouseClicked(evt);
            }
        });
        electronics_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/electronics.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage5Layout = new javax.swing.GroupLayout(rSPanelImage5);
        rSPanelImage5.setLayout(rSPanelImage5Layout);
        rSPanelImage5Layout.setHorizontalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        rSPanelImage5Layout.setVerticalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        electronics_panel.add(rSPanelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 250));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELECTRONICS");
        electronics_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        books_panel.setBackground(new java.awt.Color(255, 255, 255));
        books_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage6.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/books 3d.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage6Layout = new javax.swing.GroupLayout(rSPanelImage6);
        rSPanelImage6.setLayout(rSPanelImage6Layout);
        rSPanelImage6Layout.setHorizontalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        rSPanelImage6Layout.setVerticalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        books_panel.add(rSPanelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 280));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BOOKS");
        books_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 40));

        groceries_panel.setBackground(new java.awt.Color(255, 255, 255));
        groceries_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage7.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/shopping/icons/groceries.png"))); // NOI18N

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
                .addContainerGap(284, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(electronics_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(books_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groceries_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        ScrollPane.setViewportView(jPanel2);

        deskpane.setLayer(ScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskpaneLayout = new javax.swing.GroupLayout(deskpane);
        deskpane.setLayout(deskpaneLayout);
        deskpaneLayout.setHorizontalGroup(
            deskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskpaneLayout.setVerticalGroup(
            deskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskpaneLayout.createSequentialGroup()
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(deskpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1060, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fashion_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fashion_labelMouseClicked
        deskpane.removeAll();
        deskpane.add(new Fashion_MainFrame()).setVisible(true);
    }//GEN-LAST:event_fashion_labelMouseClicked

    private void fashion_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fashion_panelMouseClicked

        deskpane.removeAll();
        deskpane.add(new Fashion_MainFrame()).setVisible(true);
    }//GEN-LAST:event_fashion_panelMouseClicked

    private void sneakers_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sneakers_labelMouseClicked
        deskpane.removeAll();
        deskpane.add(new Footwear_MainFrame()).setVisible(true);
    }//GEN-LAST:event_sneakers_labelMouseClicked

    private void electronics_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electronics_labelMouseClicked
        deskpane.removeAll();
        deskpane.add(new Electronic_MainFrame()).setVisible(true);
    }//GEN-LAST:event_electronics_labelMouseClicked

    private void watches_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watches_labelMouseClicked
         deskpane.removeAll();
        deskpane.add(new Watches_MainFrame()).setVisible(true);
    }//GEN-LAST:event_watches_labelMouseClicked

    private void sneakers_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sneakers_panelMouseClicked
        deskpane.removeAll();
        deskpane.add(new Footwear_MainFrame()).setVisible(true);
    }//GEN-LAST:event_sneakers_panelMouseClicked

    private void watches_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watches_panelMouseClicked
           deskpane.removeAll();
        deskpane.add(new Watches_MainFrame()).setVisible(true);
    }//GEN-LAST:event_watches_panelMouseClicked

    private void electronics_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electronics_panelMouseClicked
        deskpane.removeAll();
        deskpane.add(new Electronic_MainFrame()).setVisible(true);
    }//GEN-LAST:event_electronics_panelMouseClicked

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
            java.util.logging.Logger.getLogger(Shopping_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shopping_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shopping_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shopping_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shopping_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel books_label;
    private com.raven.swing.RoundPanel books_panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cart_label;
    public javax.swing.JDesktopPane deskpane;
    private javax.swing.JLabel electronics_label;
    private com.raven.swing.RoundPanel electronics_panel;
    private javax.swing.JLabel fashion_label;
    private com.raven.swing.RoundPanel fashion_panel;
    private javax.swing.JLabel groceries_label;
    private com.raven.swing.RoundPanel groceries_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private rojerusan.RSPanelImage rSPanelImage3;
    private rojerusan.RSPanelImage rSPanelImage4;
    private rojerusan.RSPanelImage rSPanelImage5;
    private rojerusan.RSPanelImage rSPanelImage6;
    private rojerusan.RSPanelImage rSPanelImage7;
    private javax.swing.JLabel sneakers_label;
    private com.raven.swing.RoundPanel sneakers_panel;
    private javax.swing.JLabel watches_label;
    private com.raven.swing.RoundPanel watches_panel;
    // End of variables declaration//GEN-END:variables


  
}
