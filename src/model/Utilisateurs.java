package model;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Utilisateurs extends javax.swing.JInternalFrame {

    //Les variables de connection
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Utilisateurs() {
        initComponents();
        Table();
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
        RefUtil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NameUtil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserUtil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MdpUtil = new javax.swing.JTextField();
        PhoneUtil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AdUtil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SalaireUtil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ContratUtil = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        TypeUtil = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1265, 496));

        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 24)); // NOI18N
        jLabel1.setText("INFORMATIONS UTILISATEURS");

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

        RefUtil.setBackground(new java.awt.Color(255, 0, 0));
        RefUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RefUtil.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NOM & PRENOM");

        NameUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("NOM UTILISATEUR");

        UserUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("PASSWORD");

        MdpUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        PhoneUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("TELEPHONE");

        AdUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ADRESSE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("TYPE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("SALAIRE");

        SalaireUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalaireUtil.setActionCommand("<Not Set>");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("CONTRAT");

        ContratUtil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContratUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratUtilActionPerformed(evt);
            }
        });

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
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField10MouseReleased(evt);
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

        TypeUtil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TypeUtil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UserUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MdpUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PhoneUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AdUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RefUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NameUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TypeUtil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(ContratUtil))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(SalaireUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RefUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MdpUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TypeUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalaireUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContratUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ajout de la fonction AJOUTER
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (RefUtil.getText().isEmpty() || NameUtil.getText().isEmpty()
                || UserUtil.getText().isEmpty() || MdpUtil.getText().isEmpty()
                || PhoneUtil.getText().isEmpty() || AdUtil.getText().isEmpty()
                || TypeUtil.getSelectedItem().toString().isEmpty()
                || SalaireUtil.getText().isEmpty() || ContratUtil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires");
        } else {
            try {
                Connect();
                String sql = "INSERT INTO util (reference,nom,user,mdp,telephone,adresse,type,salaire,contrat)" + "VALUES(?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, RefUtil.getText());
                pst.setString(2, NameUtil.getText());
                pst.setString(3, UserUtil.getText());
                pst.setString(4, MdpUtil.getText());
                pst.setString(5, PhoneUtil.getText());
                pst.setString(6, AdUtil.getText());
                pst.setString(7, TypeUtil.getSelectedItem().toString());
                pst.setString(8, SalaireUtil.getText());
                pst.setString(9, ContratUtil.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                JOptionPane.showMessageDialog(null, TypeUtil.getSelectedItem() + " Ajouter avec succes");
            } catch (Exception e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, " L'utilisation " + RefUtil.getText() + " " + "Est deja dans la base de donnee");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //Creons la TABLE
    private void Table() {
        String util[] = {
            "Reference",
            "Nom & Prenom",
            "utilisateur",
            "mdp",
            "tel",
            "Ad",
            "Type",
            "Salaire",
            "Contrat",
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, util);
        String sql = "select * from util";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("reference");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("user");
                vue[3] = rs.getString("mdp");
                vue[4] = rs.getString("telephone");
                vue[5] = rs.getString("adresse");
                vue[6] = rs.getString("type");
                vue[7] = rs.getString("salaire");
                vue[8] = rs.getString("contrat");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Creons la TABLE de la methode RECHERCHER
    private void Table_Recherche(String recherche) {
        String util[] = {
            "Reference",
            "Nom & Prenom",
            "utilisateur",
            "mdp",
            "tel",
            "Ad",
            "Type",
            "Salaire",
            "Contrat"
        };
        String vue[] = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, util);
        String sql = "select * from util where nom like'%" + recherche + "%'";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                vue[0] = rs.getString("reference");
                vue[1] = rs.getString("nom");
                vue[2] = rs.getString("user");
                vue[3] = rs.getString("mdp");
                vue[4] = rs.getString("telephone");
                vue[5] = rs.getString("adresse");
                vue[6] = rs.getString("type");
                vue[7] = rs.getString("salaire");
                vue[8] = rs.getString("contrat");
                model.addRow(vue);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //AJOUT de la table ACTUALISATION
    private void Actualiser() {
        RefUtil.setText("");
        NameUtil.setText("");
        UserUtil.setText("");
        MdpUtil.setText("");
        PhoneUtil.setText("");
        AdUtil.setText("");
        TypeUtil.getSelectedItem().toString();
        SalaireUtil.setText("");
        ContratUtil.setText("");
        jButton1.setEnabled(true);
    }

    //Ajout de la fonction MODIFIER
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (RefUtil.getText().isEmpty() || NameUtil.getText().isEmpty()
                || UserUtil.getText().isEmpty() || MdpUtil.getText().isEmpty()
                || PhoneUtil.getText().isEmpty() || AdUtil.getText().isEmpty()
                || TypeUtil.getSelectedItem().toString().isEmpty()
                || SalaireUtil.getText().isEmpty() || ContratUtil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aucune modification\n s'il vous plait veuillez selectionner un enregistrement");
        } else {
            try {
                Connect();
                String sql = "UPDATE util SET nom=?,user=?,mdp=?,telephone=?,adresse=?,type=?,salaire=?,contrat=? where reference=?";
                pst = con.prepareStatement(sql);
                pst.setString(9, RefUtil.getText());
                pst.setString(1, NameUtil.getText());
                pst.setString(2, UserUtil.getText());
                pst.setString(3, MdpUtil.getText());
                pst.setString(4, PhoneUtil.getText());
                pst.setString(5, AdUtil.getText());
                pst.setString(6, TypeUtil.getSelectedItem().toString());
                pst.setString(7, SalaireUtil.getText());
                pst.setString(8, ContratUtil.getText());
                pst.executeUpdate();
                con.close();
                Actualiser();
                Table();
                JOptionPane.showMessageDialog(null, " Modifier avec succes");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " ERREUR " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //AJOUT de la SUPPRIMER
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (RefUtil.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un enregistrement");
        } else {
            try {
                if (JOptionPane.showConfirmDialog(null, "Attention, voulez-vous vraiment supprimer?",
                        "Supprimer Etudiant", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    Connect();
                    String sql = "DELETE from util WHERE reference=?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, RefUtil.getText());
                    pst.executeUpdate();
                    con.close();
                    Actualiser();
                    Table();
                    JOptionPane.showMessageDialog(null, RefUtil.getText() + " Supprimer avec succes");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " ERREUR " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //La fonction de remplie champ 
    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int ligne = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RefUtil.setText(model.getValueAt(ligne, 0).toString());
        NameUtil.setText(model.getValueAt(ligne, 1).toString());
        UserUtil.setText(model.getValueAt(ligne, 2).toString());
        MdpUtil.setText(model.getValueAt(ligne, 3).toString());
        PhoneUtil.setText(model.getValueAt(ligne, 4).toString());
        AdUtil.setText(model.getValueAt(ligne, 5).toString());
        TypeUtil.setSelectedItem(model.getValueAt(ligne, 6).toString());
        if (TypeUtil.getSelectedItem().equals("Admin")){
            SalaireUtil.setEnabled(false);
            ContratUtil.setEnabled(false);
        }else if(TypeUtil.getSelectedItem().equals("User")){
            SalaireUtil.setEnabled(true);
            ContratUtil.setEnabled(true);
        }
        SalaireUtil.setText(model.getValueAt(ligne, 7).toString());
        ContratUtil.setText(model.getValueAt(ligne, 8).toString());
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    //AJOUT de la fonction RECHERCHER
    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        Table_Recherche(jTextField10.getText());
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void ContratUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratUtilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratUtilActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jTextField10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdUtil;
    private javax.swing.JTextField ContratUtil;
    private javax.swing.JTextField MdpUtil;
    private javax.swing.JTextField NameUtil;
    private javax.swing.JTextField PhoneUtil;
    private javax.swing.JTextField RefUtil;
    private javax.swing.JTextField SalaireUtil;
    private javax.swing.JComboBox<String> TypeUtil;
    private javax.swing.JTextField UserUtil;
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
    // End of variables declaration//GEN-END:variables
}
