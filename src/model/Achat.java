/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siby
 */
public class Achat extends javax.swing.JInternalFrame {

    //Les variables de connection
    Connection con = null;
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form Utilisateurs
     */
    public Achat() {
        initComponents();
        Table();
        GetCat();
        GetFrs();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        CBAchat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomAchat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PrixVenteAchat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        StockAlerteAchat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        DateAchat = new javax.swing.JFormattedTextField();
        CatCbAchat = new javax.swing.JComboBox<>();
        QuantiteAchat = new javax.swing.JTextField();
        PrixHtAchat = new javax.swing.JTextField();
        FrsCbAchat = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1265, 496));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 24)); // NOI18N
        jLabel1.setText("INFORMATIONS ACHATS PRODUITS");

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
        jLabel2.setText("CODE BARRE");

        CBAchat.setBackground(new java.awt.Color(255, 0, 0));
        CBAchat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CBAchat.setForeground(new java.awt.Color(255, 255, 255));
        CBAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAchatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NOM");

        txtNomAchat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CATEGORIES");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NOM FOURNISSEURS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("PRIX HT");

        PrixVenteAchat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("PRIX VENTES");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("QUANTITE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("DATE INSCRIPTION");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("STOCK ALERTE");

        StockAlerteAchat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StockAlerteAchat.setHorizontalAlignment(javax.swing.JTextField.LEFT);

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.png"))); // NOI18N
        jLabel11.setText("RECHERCHER");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        try {
            DateAchat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DateAchat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DateAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateAchatActionPerformed(evt);
            }
        });

        CatCbAchat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CatCbAchat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatCbAchatMouseClicked(evt);
            }
        });
        CatCbAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbAchatActionPerformed(evt);
            }
        });

        QuantiteAchat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuantiteAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantiteAchatActionPerformed(evt);
            }
        });

        PrixHtAchat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        FrsCbAchat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(StockAlerteAchat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PrixHtAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(QuantiteAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DateAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PrixVenteAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CatCbAchat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(FrsCbAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(245, 245, 245))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CBAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CatCbAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FrsCbAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PrixHtAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrixVenteAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(QuantiteAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StockAlerteAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(DateAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Fonction d'appel du champ nom de la table categorie
    private void GetCat() {
        try {
             //Connect();
           // Statement st = con.createStatement();
           // rs = st.executeQuery(sql);
            Connect();
            //st = con.createStatement();
            String sql = "SELECT * FROM categories";
            Statement st = con.createStatement();
            //pst = con.prepareStatement(sql);
            
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String MyCat = rs.getString("NomCat");
                CatCbAchat.addItem(MyCat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Fonction d'appel du champ prenom de la table client
    private void GetFrs() {
        try {
             //Connect();
           // Statement st = con.createStatement();
           // rs = st.executeQuery(sql);
            Connect();
            //st = con.createStatement();
            String sql = "SELECT * FROM client where type='FOURNISSEUR'";
            Statement st = con.createStatement();
            //pst = con.prepareStatement(sql);
            
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String MyFrs = rs.getString("Prenom");
                FrsCbAchat.addItem(MyFrs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     
    //Ajout de la fonction AJOUTER
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (CBAchat.getText().isEmpty() || txtNomAchat.getText().isEmpty()
                || CatCbAchat.getSelectedItem().toString().isEmpty() || FrsCbAchat.getSelectedItem().toString().isEmpty() 
                ||PrixHtAchat.getText().isEmpty() || PrixVenteAchat.getText().isEmpty()
                || QuantiteAchat.getText().isEmpty()
                || StockAlerteAchat.getText().isEmpty() || DateAchat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires");
        } else {
            try {
                Connect();
                String sql = "INSERT INTO achat (codebarre,nom,categories,fournisseurs,prixht,prixvente,quantites,stockalerte,dateIns)" + "VALUES(?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, CBAchat.getText());
                pst.setString(2, txtNomAchat.getText());
                pst.setString(3, CatCbAchat.getSelectedItem().toString());
                pst.setString(4, FrsCbAchat.getSelectedItem().toString());
                pst.setInt(5, Integer.valueOf(PrixHtAchat.getText()));
                pst.setInt(6, Integer.valueOf(PrixVenteAchat.getText()));
                pst.setString(7, QuantiteAchat.getText());
                pst.setString(8, StockAlerteAchat.getText());
                pst.setString(9, DateAchat.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                //JOptionPane.showMessageDialog(null, jTextField7.getText() + " Ajouter avec succes");
            } catch (Exception e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, " L'utilisation " + CBAchat.getText() + " " + "Est deja dans la base de donnee");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    }
    //Creons la TABLE

    private void Table() {
        String achat[] = {
            "code",
            "Nom",
            "Categories",
            "Fournisseurs",
            "Prix",
            "Vente",
            "Quantite",
            "Alert",
            "Date"
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, achat);
        String sql = "select * from achat";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("codebarre");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("categories");
                vue[3] = rs.getString("fournisseurs");
                vue[4] = rs.getString("prixht");
                vue[5] = rs.getString("prixvente");
                vue[6] = rs.getString("quantites");
                vue[7] = rs.getString("stockalerte");
                vue[8] = rs.getString("dateIns");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Creons la TABLE de la methode RECHERCHER
    private void Table_Recherche(String recherche) {
        String achat[] = {
            "code",
            "Nom",
            "Categories",
            "Fournisseurs",
            "Prix",
            "Vente",
            "Quantite",
            "Alert",
            "Date"
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, achat);
        String sql = "select * from achat where nom like'%" + recherche + "%'";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("codebarre");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("categories");
                vue[3] = rs.getString("fournisseurs");
                vue[4] = rs.getString("prixht");
                vue[5] = rs.getString("prixvente");
                vue[6] = rs.getString("quantites");
                vue[7] = rs.getString("stockalerte");
                vue[8] = rs.getString("dateIns");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //AJOUT de la fonction ACTUALISATION
    private void Actualiser() {
        CBAchat.setText("");
        txtNomAchat.setText("");
        CatCbAchat.getSelectedItem().toString();
        FrsCbAchat.getSelectedItem().toString();
        PrixHtAchat.setText("");
        PrixVenteAchat.setText("");
        QuantiteAchat.setText("");
        StockAlerteAchat.setText("");
        DateAchat.setText("");
        jButton1.setEnabled(true);
    }

    //Ajout de la fonction MODIFIER
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if (CBAchat.getText().isEmpty() || txtNomAchat.getText().isEmpty()
                || CatCbAchat.getSelectedItem().toString().isEmpty() || FrsCbAchat.getSelectedItem().toString().isEmpty() 
                ||PrixHtAchat.getText().isEmpty() || PrixVenteAchat.getText().isEmpty()
                || QuantiteAchat.getText().isEmpty()
                || StockAlerteAchat.getText().isEmpty() || DateAchat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Aucune modification\n s'il vous plait veuillez selectionner un enregistrement");
        } else {
            try {
                Connect();
                String sql = "UPDATE achat SET nom=?,categories=?,fournisseurs=?,prixht=?,prixvente=?,quantites=?,stockalerte=?,dateIns=? where codebarre=?";
                pst = con.prepareStatement(sql);
                pst.setString(9, CBAchat.getText());
                pst.setString(1, txtNomAchat.getText());
                pst.setString(2, CatCbAchat.getSelectedItem().toString());
                pst.setString(3, FrsCbAchat.getSelectedItem().toString()); 
                pst.setInt(4, Integer.valueOf(PrixHtAchat.getText()));
                pst.setInt(5, Integer.valueOf(PrixVenteAchat.getText()));
                pst.setString(6, QuantiteAchat.getText());
                pst.setString(7, StockAlerteAchat.getText());
                pst.setString(8, DateAchat.getText());
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
        if (CBAchat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires");
        } else {
            try {
                Connect();
                String sql = "DELETE from achat WHERE codebarre=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, CBAchat.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                JOptionPane.showMessageDialog(null, CBAchat.getText() + " Supprimer avec succes");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " ERREUR " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //Ajout e la fionction affichage des champs
    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int ligne = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        CBAchat.setText(model.getValueAt(ligne, 0).toString());
        txtNomAchat.setText(model.getValueAt(ligne, 1).toString());
        CatCbAchat.setSelectedItem(model.getValueAt(ligne, 2).toString());
        FrsCbAchat.setSelectedItem(model.getValueAt(ligne, 3).toString());
        PrixHtAchat.setText(model.getValueAt(ligne, 4).toString());
        PrixVenteAchat.setText(model.getValueAt(ligne, 5).toString());
        QuantiteAchat.setText(model.getValueAt(ligne, 6).toString());
        StockAlerteAchat.setText(model.getValueAt(ligne, 7).toString());
        DateAchat.setText(model.getValueAt(ligne, 8).toString());
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseReleased

    //Buttom Actualiser
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    //Buttom RECHERCHER
    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        Table_Recherche(jTextField10.getText());
    }//GEN-LAST:event_jTextField10KeyReleased

    private void QuantiteAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantiteAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantiteAchatActionPerformed

    private void DateAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateAchatActionPerformed

    private void CBAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBAchatActionPerformed

    private void CatCbAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbAchatActionPerformed

    private void CatCbAchatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatCbAchatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbAchatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CBAchat;
    private javax.swing.JComboBox<String> CatCbAchat;
    private javax.swing.JFormattedTextField DateAchat;
    private javax.swing.JComboBox<String> FrsCbAchat;
    private javax.swing.JTextField PrixHtAchat;
    private javax.swing.JTextField PrixVenteAchat;
    private javax.swing.JTextField QuantiteAchat;
    private javax.swing.JTextField StockAlerteAchat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField txtNomAchat;
    // End of variables declaration//GEN-END:variables
}
