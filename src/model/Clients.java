package model;

import java.awt.Color;
//import java.awt.GradientPaint;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clients extends javax.swing.JInternalFrame {

    //Les variables de connection
    Connection con;
    PreparedStatement pst;
    ResultSet rs, rs1;
    Statement st, st1;

    public Clients() {

        initComponents();
        Table();
        SumEleve();
//        color1 = Color.BLACK;
//        color2 = Color.WHITE;
//        setOpaque(false);
//        
//          setBackground(new Color(0, 0, 0, 0));

        //card11.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"PRODUITS","5"));
    }

    //Maintenant nous allons connecter avec la base de donnee 
    public void Connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:stock.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* 
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        RefClt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NomClt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PrenomClt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailClt = new javax.swing.JTextField();
        TelClt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AdClt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BonusClt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        TypeClt = new javax.swing.JComboBox<>();
        DateClt = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        OrdersNum = new javax.swing.JLabel();
        nbrAchat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        amntlbl = new javax.swing.JLabel();
        montantTotal = new javax.swing.JLabel();
        TypeFiltre = new javax.swing.JComboBox<>();
        BtnFiltre = new javax.swing.JButton();
        BtnActualiserFiltre = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtClt = new javax.swing.JLabel();
        montantTotal1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1265, 496));

        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 24)); // NOI18N
        jLabel1.setText("INFORMATIONS CLIENTS/FOURNISSEURS");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("REFERENCE");

        RefClt.setBackground(new java.awt.Color(255, 0, 0));
        RefClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RefClt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NOM");

        NomClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PRENOM");

        PrenomClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("EMAIL");

        EmailClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TelClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("TELEPHONE");

        AdClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ADRESSE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("TYPE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("DATE INSCRIPTION");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("BONUS");

        BonusClt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BonusClt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Mshtakan", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); // NOI18N
        jButton1.setText("AJOUTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Mshtakan", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier.png"))); // NOI18N
        jButton3.setText("MODIFIER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Mshtakan", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/supprimer.png"))); // NOI18N
        jButton4.setText("SUPPRIMER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Mshtakan", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/actualiser.png"))); // NOI18N
        jButton5.setText("ACTUALISER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        TypeClt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TypeClt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENT", "FOURNISSEUR" }));

        try {
            DateClt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DateClt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.png"))); // NOI18N
        jLabel12.setText("RECHERCHER");

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OrdersNum.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        OrdersNum.setText("X");

        nbrAchat.setFont(new java.awt.Font("Courier", 1, 28)); // NOI18N
        nbrAchat.setText("Nombre achat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrdersNum, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbrAchat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nbrAchat)
                .addGap(18, 18, 18)
                .addComponent(OrdersNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        amntlbl.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        amntlbl.setText("X");

        montantTotal.setFont(new java.awt.Font("Courier", 1, 28)); // NOI18N
        montantTotal.setText("Montant Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amntlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montantTotal))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(montantTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amntlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TypeFiltre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TypeFiltre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENT", "FOURNISSEUR" }));

        BtnFiltre.setBackground(new java.awt.Color(0, 102, 51));
        BtnFiltre.setFont(new java.awt.Font("Mshtakan", 0, 18)); // NOI18N
        BtnFiltre.setText("Filtrer");
        BtnFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFiltreActionPerformed(evt);
            }
        });

        BtnActualiserFiltre.setBackground(new java.awt.Color(0, 102, 51));
        BtnActualiserFiltre.setFont(new java.awt.Font("Mshtakan", 0, 18)); // NOI18N
        BtnActualiserFiltre.setText("Actualiser");
        BtnActualiserFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualiserFiltreActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtClt.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        txtClt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClt.setText("0");

        montantTotal1.setFont(new java.awt.Font("Courier", 1, 28)); // NOI18N
        montantTotal1.setText("Total nom");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtClt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(montantTotal1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(montantTotal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PrenomClt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmailClt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TelClt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AdClt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RefClt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomClt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(BonusClt))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DateClt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(TypeClt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(TypeFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnFiltre)
                                .addGap(60, 60, 60)
                                .addComponent(BtnActualiserFiltre))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RefClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(TypeFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnActualiserFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrenomClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TypeClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(DateClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BonusClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ajout de la fonction AJOUTER 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (RefClt.getText().isEmpty() || NomClt.getText().isEmpty()
                || PrenomClt.getText().isEmpty() || EmailClt.getText().isEmpty()
                || TelClt.getText().isEmpty() || AdClt.getText().isEmpty()
                || TypeClt.getSelectedItem().toString().isEmpty()
                || BonusClt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires");
        } else {
            try {
                Connect();
                String sql = "INSERT INTO client (reference,nom,prenom,email,telephone,adresse,type,dateIns,bonus)" + "VALUES(?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, RefClt.getText());
                pst.setString(2, NomClt.getText());
                pst.setString(3, PrenomClt.getText());
                pst.setString(4, EmailClt.getText());
                pst.setString(5, TelClt.getText());
                pst.setString(6, AdClt.getText());
                pst.setString(7, TypeClt.getSelectedItem().toString());
                pst.setString(8, DateClt.getText());
                pst.setString(9, BonusClt.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                JOptionPane.showMessageDialog(null, " Ajouter avec succes");
            } catch (Exception e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, " L'utilisation " + RefClt.getText() + " " + "Est deja dans la base de donnee");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Creons la TABLE
    private void Table() {
        String client[] = {
            "Reference",
            "Nom",
            "Prenom",
            "email",
            "telephone",
            "Ad",
            "Type",
            "dateIns",
            "bonus"
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, client);
        String sql = "select * from client";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("reference");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("prenom");
                vue[3] = rs.getString("email");
                vue[4] = rs.getString("telephone");
                vue[5] = rs.getString("adresse");
                vue[6] = rs.getString("type");
                vue[7] = rs.getString("dateIns");
                vue[8] = rs.getString("bonus");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Creons la TABLE de la methode RECHERCHER
    private void Table_Recherche(String recherche) {
        String client[] = {
            "Reference",
            "Nom",
            "Prenom",
            "email",
            "telephone",
            "Ad",
            "Type",
            "dateIns",
            "bonus"
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, client);
        String sql = "select * from client where prenom like'%" + recherche + "%'";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("reference");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("prenom");
                vue[3] = rs.getString("email");
                vue[4] = rs.getString("telephone");
                vue[5] = rs.getString("adresse");
                vue[6] = rs.getString("type");
                vue[7] = rs.getString("dateIns");
                vue[8] = rs.getString("bonus");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //AJOUT de la table ACTUALISATION
    private void Actualiser() {
        RefClt.setText("");
        NomClt.setText("");
        PrenomClt.setText("");
        EmailClt.setText("");
        TelClt.setText("");
        AdClt.setText("");
        TypeClt.getSelectedItem().toString();
        DateClt.setText("");
        BonusClt.setText("");
        jButton1.setEnabled(true);
    }

    //Ajout de la fonction MODIFIER
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (RefClt.getText().isEmpty() || NomClt.getText().isEmpty()
                || PrenomClt.getText().isEmpty() || EmailClt.getText().isEmpty()
                || TelClt.getText().isEmpty() || AdClt.getText().isEmpty()
                || TypeClt.getSelectedItem().toString().isEmpty()
                || BonusClt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aucune modification\n s'il vous plait veuillez selectionner un enregistrement");
        } else {
            try {
                Connect();
                String sql = "UPDATE client SET nom=?,prenom=?,email=?,telephone=?,adresse=?,type=?,dateIns=?,bonus=? where reference=?";
                pst = con.prepareStatement(sql);
                pst.setString(9, RefClt.getText());
                pst.setString(1, NomClt.getText());
                pst.setString(2, PrenomClt.getText());
                pst.setString(3, EmailClt.getText());
                pst.setString(4, TelClt.getText());
                pst.setString(5, AdClt.getText());
                pst.setString(6, TypeClt.getSelectedItem().toString());
                pst.setString(7, DateClt.getText());
                pst.setString(8, BonusClt.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                //JOptionPane.showMessageDialog(null, jTextField7.getText() + " Modifier avec succes");
                JOptionPane.showMessageDialog(null, " Modifier avec succes");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " ERREUR " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //AJOUT de la SUPPRIMER
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (RefClt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un enregistrement");
        } else {
            try {
                Connect();
                String sql = "DELETE from client WHERE reference=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, RefClt.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                JOptionPane.showMessageDialog(null, RefClt.getText() + " Supprimer avec succes");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " ERREUR " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int ligne = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RefClt.setText(model.getValueAt(ligne, 0).toString());
        NomClt.setText(model.getValueAt(ligne, 1).toString());
        PrenomClt.setText(model.getValueAt(ligne, 2).toString());
        EmailClt.setText(model.getValueAt(ligne, 3).toString());
        TelClt.setText(model.getValueAt(ligne, 4).toString());
        AdClt.setText(model.getValueAt(ligne, 5).toString());
        TypeClt.setSelectedItem(model.getValueAt(ligne, 6).toString());
        if (TypeClt.getSelectedItem().equals("FOURNISSEUR")) {
            BonusClt.setEnabled(false);
        } else if (TypeClt.getSelectedItem().equals("CLIENT")) {
            BonusClt.setEnabled(true);
        }
        DateClt.setText(model.getValueAt(ligne, 7).toString());
        BonusClt.setText(model.getValueAt(ligne, 8).toString());
        //Rendre le buttom ajouter enable
        jButton1.setEnabled(false);

        try {
            Connect();
            st = con.createStatement();
            st1 = con.createStatement();
            rs = st.executeQuery("select count(*) from OrderTbl where CustName='" + model.getValueAt(ligne, 2).toString() + "'");
            rs1 = st1.executeQuery("select sum(Amount) from OrderTbl where CustName='" + model.getValueAt(ligne, 2).toString() + "'");
            while (rs.next()) {
                OrdersNum.setText("" + rs.getInt(1));
            }
            while (rs1.next()) {
                amntlbl.setText("Rs" + rs1.getInt(1));
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jTable1MouseReleased

    //Appel fonction Actualiser
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    //AJOUT de la fonction RECHERCHER
    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        Table_Recherche(jTextField10.getText());
    }//GEN-LAST:event_jTextField10KeyReleased

    //Le buttom de filtrage pour user et fournisseurs
    private void BtnFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFiltreActionPerformed
        if (TypeFiltre.getSelectedItem().equals("CLIENT")) {
            String client[] = {
                "Reference",
                "Nom",
                "Prenom",
                "email",
                "telephone",
                "Ad",
                "Type",
                "dateIns",
                "bonus"
            };
            String vue[] = new String[10];
            DefaultTableModel model = new DefaultTableModel(null, client);
            String sql = "select * from client where type='CLIENT' ";
            try {
                Connect();
                Statement st = con.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    vue[0] = rs.getString("reference");
                    vue[1] = rs.getString("nom");
                    vue[2] = rs.getString("prenom");
                    vue[3] = rs.getString("email");
                    vue[4] = rs.getString("telephone");
                    vue[5] = rs.getString("adresse");
                    vue[6] = rs.getString("type");
                    vue[7] = rs.getString("dateIns");
                    vue[8] = rs.getString("bonus");
                    model.addRow(vue);
                }
                jTable1.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String client[] = {
                "Reference",
                "Nom",
                "Prenom",
                "email",
                "telephone",
                "Ad",
                "Type",
                "dateIns",
                "bonus"
            };
            String vue[] = new String[10];
            DefaultTableModel model = new DefaultTableModel(null, client);
            String sql = "select * from client where type='FOURNISSEUR' ";
            try {
                Connect();
                Statement st = con.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    vue[0] = rs.getString("reference");
                    vue[1] = rs.getString("nom");
                    vue[2] = rs.getString("prenom");
                    vue[3] = rs.getString("email");
                    vue[4] = rs.getString("telephone");
                    vue[5] = rs.getString("adresse");
                    vue[6] = rs.getString("type");
                    vue[7] = rs.getString("dateIns");
                    vue[8] = rs.getString("bonus");
                    model.addRow(vue);
                }
                jTable1.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BtnFiltreActionPerformed

    private void BtnActualiserFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualiserFiltreActionPerformed
        Table();
    }//GEN-LAST:event_BtnActualiserFiltreActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10MouseClicked

//     public void setData(model_card data){
//        IDIcon.setIcon(data.getIcon());
//        IDTitle.setText(data.getTitle());
//        IDValue.setText(data.getValue());
//        //IDValue.setText(String.valueOf(calcul));
//    }
//    
    public void SumEleve() {
        try {
            Connect();
            pst = con.prepareStatement("select count(prenom) from client");
            rs = pst.executeQuery();
            //Pour afficher les informations
            while (rs.next()) {
                int calcul = rs.getInt("count(prenom)");
                txtClt.setText(String.valueOf(calcul));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
      @Override
    protected void paintComponent (Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(gra);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponents(grphcs);
    }
     */
//                  
//    private javax.swing.JLabel IDIcon;
//    private javax.swing.JLabel IDTitle;
//    private javax.swing.JLabel IDValue;
//  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdClt;
    private javax.swing.JTextField BonusClt;
    private javax.swing.JButton BtnActualiserFiltre;
    private javax.swing.JButton BtnFiltre;
    private javax.swing.JFormattedTextField DateClt;
    private javax.swing.JTextField EmailClt;
    private javax.swing.JTextField NomClt;
    private javax.swing.JLabel OrdersNum;
    private javax.swing.JTextField PrenomClt;
    private javax.swing.JTextField RefClt;
    private javax.swing.JTextField TelClt;
    private javax.swing.JComboBox<String> TypeClt;
    private javax.swing.JComboBox<String> TypeFiltre;
    private javax.swing.JLabel amntlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel montantTotal;
    private javax.swing.JLabel montantTotal1;
    private javax.swing.JLabel nbrAchat;
    private javax.swing.JLabel txtClt;
    // End of variables declaration//GEN-END:variables
}
