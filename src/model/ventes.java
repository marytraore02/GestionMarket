
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventes extends javax.swing.JInternalFrame {

    //Les variables de connection
    Connection con = null;
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;

    public ventes() {
        initComponents();
        TableClt();
        TablePro();
        Dateheure();
        //update();
        //GetToday();
      
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
        AddToBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Qtytb = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CustNamelbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        TotAmtlbl = new javax.swing.JLabel();
        heurelbl = new javax.swing.JLabel();
        AddToBtn1 = new javax.swing.JButton();
        SearchCostome = new javax.swing.JTextField();
        SearchProduit = new javax.swing.JTextField();
        TotAmtlbl1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1300, 496));

        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 24)); // NOI18N
        jLabel1.setText("INFORMATIONS VENTES");

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AddToBtn.setBackground(new java.awt.Color(51, 204, 0));
        AddToBtn.setFont(new java.awt.Font("Mshtakan", 0, 18)); // NOI18N
        AddToBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); // NOI18N
        AddToBtn.setText("AddFacture");
        AddToBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtnMouseClicked(evt);
            }
        });
        AddToBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBtnActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Mshtakan", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/004-businessman.png"))); // NOI18N
        jButton3.setText("VoirVente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel12.setText("Liste produits ");

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num", "Produit", "Quantite", "Prix", "Total"
            }
        ));
        jTable2.setRowHeight(25);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel13.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel13.setText("Liste des clients ");

        jLabel5.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("VenteId:");

        BillId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BillId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillIdMouseClicked(evt);
            }
        });
        BillId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Quantite:");

        Qtytb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("Mshtakan", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); // NOI18N
        jButton2.setText("AddVente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Nom Client:");

        jLabel10.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Date:");

        CustNamelbl.setText("NomClt");

        Datelbl.setText("Date");

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setRowHeight(25);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        TotAmtlbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        TotAmtlbl.setText("Montant");

        heurelbl.setText("Date");

        AddToBtn1.setBackground(new java.awt.Color(51, 204, 0));
        AddToBtn1.setFont(new java.awt.Font("Mshtakan", 0, 18)); // NOI18N
        AddToBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/imprimer.png"))); // NOI18N
        AddToBtn1.setText("Imprimer");
        AddToBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtn1MouseClicked(evt);
            }
        });
        AddToBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBtn1ActionPerformed(evt);
            }
        });

        SearchCostome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchCostome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCostomeActionPerformed(evt);
            }
        });
        SearchCostome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchCostomeKeyReleased(evt);
            }
        });

        SearchProduit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchProduitMouseClicked(evt);
            }
        });
        SearchProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProduitActionPerformed(evt);
            }
        });
        SearchProduit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchProduitKeyReleased(evt);
            }
        });

        TotAmtlbl1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        TotAmtlbl1.setText("Rs");

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SearchCostome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SearchProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CustNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(heurelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddToBtn1)
                                    .addGap(4, 4, 4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AddToBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TotAmtlbl1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TotAmtlbl)
                                            .addGap(194, 194, 194))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)))))
                            .addGap(535, 535, 535)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(955, 955, 955))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(SearchCostome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(SearchProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddToBtn1)
                                    .addComponent(AddToBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotAmtlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotAmtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(CustNamelbl))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(Datelbl)
                                    .addComponent(heurelbl))
                                .addGap(35, 35, 35)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
        
    //TABLE contenant les infos du client 
    private void TableClt() {
        String client[] = {
            "Reference",
            "Nom",
            "Prenom",
            "Telephone",
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, client);
        String sql = "select * from client where type='CLIENT'";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("reference");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("prenom");
                vue[3] = rs.getString("telephone");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
      //TABLE contenant les infos du produit
    private void TablePro() {
        String achat[] = {
            "Code",
            "Nom",
            "Quantite",
            "Prix",
            "Categorie",
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
                vue[2] = rs.getString("quantites");
                vue[3] = rs.getString("prixvente");
                vue[4] = rs.getString("categories");
                model.addRow(vue);
            }
            jTable3.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Date et l'heure
    /*private void GetToday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDate now = LocalDate.now();
        Datelbl.setText(dtf.format(now));
    }*/
    private void Dateheure() {
        Thread tr = new Thread() {
            //Methode public pour les conditions d'affichage
            public void run() {
                //condition boucle infinie
                for (;;) {
                    //Les exceptions pour gerer le erreurs
                    try {
                        Calendar cal = new GregorianCalendar();
                        //la partie date
                        int annee = cal.get(Calendar.YEAR);
                        int mois = cal.get(Calendar.MONTH);
                        int jour = cal.get(Calendar.DAY_OF_MONTH);
                        //Affichage
                        Datelbl.setText(jour + "/" + mois + "/" + annee);

                        //la partie date
                        int heure = cal.get(Calendar.HOUR_OF_DAY);
                        int minute = cal.get(Calendar.MINUTE);
                        int seconde = cal.get(Calendar.SECOND);
                        //Affichage
                        heurelbl.setText(heure + ":" + minute + ":" + seconde);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //activer
        tr.start();
    }
    
    private void update()
    {
        int newqty = oldqty - Integer.valueOf(Qtytb.getText());
        try {
            
            
             //String sql = "SELECT * FROM categories";
            //Statement st = con.createStatement();
            //pst = con.prepareStatement(sql);
            
          
            
                Connect();
                String sql = "UPDATE achat SET quantites="+newqty+""+" where codebarre="+productId;
                //String sql = "UPDATE achat SET quantites=? where codebarre=?";
                //Statement Add = con.createStatemet();
                //Statement st = con.createStatement();
                //rs = st.executeQuery(sql);
                 //rs = st.executeQuery(sql);
            
                pst = con.prepareStatement(sql);
                pst.setString(2, productId);
                pst.setInt(1, oldqty); 
                //pst.setInt(1, newqty);
                pst.executeUpdate();
                con.close();
                //Actualiser();
                TablePro();
                //JOptionPane.showMessageDialog(null, Qtytb.getText() + " Modifier avec succes");
        }catch(Exception e){
             e.printStackTrace();
        }
}
    
    //la methode RECHERCHER du prenom des clients
    private void Table_RechercheClt(String recherche) {
        String client[] = {
            "Reference",
            "Nom",
            "Prenom",
            "Telephone",
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
                vue[3] = rs.getString("telephone");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        //la methode RECHERCHER du nom des produits
    private void Table_RecherchePro(String recherche) {
        String achat[] = {
            "Code",
            "Nom",
            "Quantite",
            "Prix",
            "Categorie",
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
                vue[2] = rs.getString("quantites");
                vue[3] = rs.getString("prixvente");
                vue[4] = rs.getString("categories");
                model.addRow(vue);
            }
            jTable3.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    //Fonction d'appel du champ nom de la table categorie
    /*private void GetCat() {
        try {
            Connect();
            //st = con.createStatement();
            String sql = "SELECT * FROM stock.categories";
            pst = con.prepareStatement(sql);
            //rs = st.executeQuery(sql);
            while (rs.next()) {
                String MyCat = rs.getString("NomCat");
                CatCbAchat.getItem(MyCat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
   
    
 
    //Ajout de la fonction AJOUTER
    private void AddToBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtnActionPerformed
      
    }//GEN-LAST:event_AddToBtnActionPerformed


   
//Ajout de la fonction MODIFIER
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //AJOUT de la SUPPRIMER
    //Ajout de la fionction affichage des champs
    //Double Uprice;
    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

    }//GEN-LAST:event_jTable1MouseReleased

    //Buttom Actualiser
    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ligne = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //CBVente.setText(model.getValueAt(ligne, 0).toString());
        
        CustNamelbl.setText(model.getValueAt(ligne, 2).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    int i = 0,prix,tot=0;
    int total;
    String Prodname,productId;
    //String ProdId;
    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
        if(flag == 0 || BillId.getText().isEmpty() || Qtytb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Donner un idVente\n Puis entrer la quantite de la commande");
        } else{
        //prix = Integer.valueOf(price.getText());
        tot = prix * Integer.valueOf(Qtytb.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(Prodname);
        v.add(Qtytb.getText());
        v.add(prix);
        v.add(tot);
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.addRow(v);
         total = total + tot;
         TotAmtlbl.setText(""+total);
         update();
        i++;
        
        if(i == 1){
            BillTxt.setText(BillTxt.getText()+"=========GESTION SUPERMARKET=======\n\n"+" NUM       PRODUCT       QUANTITE       PRICE       TOTAL\n"+" "
                    +i+"             "+Prodname+"              "+Qtytb.getText()+"                    "+prix+"        "+tot+"\n ");
        }else{
             BillTxt.setText(BillTxt.getText()+" "+i+"             "+Prodname+"              "+Qtytb.getText()+"                    "+prix+"        "+tot+"\n ");
                    
        }
       
        }
    }//GEN-LAST:event_AddToBtnMouseClicked

    int flag = 0,oldqty;
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int ligne = jTable3.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        //txtNomVente1.setText(model.getValueAt(ligne, 0).toString());
        productId = model.getValueAt(ligne, 0).toString();
        Prodname = model.getValueAt(ligne, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(ligne, 2).toString());
        prix = Integer.valueOf(model.getValueAt(ligne, 3).toString());
        flag = 1;
    }//GEN-LAST:event_jTable3MouseClicked

    private void AddToBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtn1MouseClicked
        try{
            jTable2.print();
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }//GEN-LAST:event_AddToBtn1MouseClicked

    private void AddToBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtn1ActionPerformed
        
    }//GEN-LAST:event_AddToBtn1ActionPerformed

    private void SearchCostomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchCostomeKeyReleased
        Table_RechercheClt(SearchCostome.getText());
    }//GEN-LAST:event_SearchCostomeKeyReleased

    private void SearchCostomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCostomeActionPerformed
        Table_RechercheClt(SearchCostome.getText());
    }//GEN-LAST:event_SearchCostomeActionPerformed

    private void BillIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIdActionPerformed

    private void BillIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIdMouseClicked

    private void SearchProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProduitActionPerformed
        Table_RecherchePro(SearchProduit.getText());
    }//GEN-LAST:event_SearchProduitActionPerformed

    private void SearchProduitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchProduitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchProduitKeyReleased

    private void SearchProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchProduitMouseClicked
        //Table_RecherchePro(SearchProduit.getText());
    }//GEN-LAST:event_SearchProduitMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       if(BillId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Entrer id de la vente");
        } else{
             try {
                Connect();
                String sql = "INSERT INTO OrderTbl (OrderId,CustName,OrderDate,Amount)" + "VALUES(?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.valueOf(BillId.getText()));
                pst.setString(2, CustNamelbl.getText());
                pst.setString(3, Datelbl.getText());
                pst.setInt(4, Integer.valueOf(TotAmtlbl.getText())); 
                pst.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(this, "Commande enregistrer au nom du client " + CustNamelbl.getText());
            }catch (Exception e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, " L'id " + BillId.getText() + " " + "Est deja dans la base de donnee");
            }
        }
        
       
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBtn;
    private javax.swing.JButton AddToBtn1;
    private javax.swing.JTextField BillId;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JLabel CustNamelbl;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JTextField Qtytb;
    private javax.swing.JTextField SearchCostome;
    private javax.swing.JTextField SearchProduit;
    private javax.swing.JLabel TotAmtlbl;
    private javax.swing.JLabel TotAmtlbl1;
    private javax.swing.JLabel heurelbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
