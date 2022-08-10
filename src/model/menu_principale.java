package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class menu_principale extends javax.swing.JFrame {

    public menu_principale() {
        initComponents();

        //On appel ici aussi la methode Dateheure()
        Dateheure();
    }

    String nom, administrateur;

    public menu_principale(String text1, String text2) {
        //nous allons appeler les variables
        initComponents();
        Dateheure();
        this.administrateur = text2;
        txttype.setText(text2);
        this.nom = text1;
        txtnomutil.setText(text1);
    }

    //Nous allons creer la methode privee date et heure
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
                        txtdate.setText(jour + "/" + mois + "/" + annee);

                        //la partie date
                        int heure = cal.get(Calendar.HOUR_OF_DAY);
                        int minute = cal.get(Calendar.MINUTE);
                        int seconde = cal.get(Calendar.SECOND);
                        //Affichage
                        txtheure.setText(heure + ":" + minute + ":" + seconde);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //activer
        tr.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtheure = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        txttype = new javax.swing.JLabel();
        txtnomutil = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/005-user.png"))); // NOI18N
        jButton1.setText("UTILISATEURS");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMinimumSize(new java.awt.Dimension(180, 90));
        jButton1.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/006-man.png"))); // NOI18N
        jButton2.setText("CLIENTS/FOURNISSEURS");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/001-categories.png"))); // NOI18N
        jButton3.setText("CATEGORIES");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/003-payment-method.png"))); // NOI18N
        jButton4.setText("ACHATS");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/004-personal.png"))); // NOI18N
        jButton7.setText("VENTES");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/005-analytics.png"))); // NOI18N
        jButton5.setText("STATISTIQUES");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/006-settings.png"))); // NOI18N
        jButton6.setText("PARAMETRES");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/gnome_application_exit.png"))); // NOI18N
        jButton8.setText("LOGOUT");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPreferredSize(new java.awt.Dimension(180, 90));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        txtheure.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        txtheure.setForeground(new java.awt.Color(255, 255, 255));
        txtheure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtheure.setText("Heure");

        txtdate.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        txtdate.setForeground(new java.awt.Color(255, 255, 255));
        txtdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdate.setText("Date");

        txttype.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        txttype.setForeground(new java.awt.Color(255, 255, 255));
        txttype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttype.setText("type");

        txtnomutil.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        txtnomutil.setForeground(new java.awt.Color(255, 255, 255));
        txtnomutil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnomutil.setText("nom utilisateur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtheure, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(txtnomutil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtheure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttype, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(txtnomutil, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1265, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1271, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Le BUTTON UTILISATEUR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (administrateur.equals("Admin")) {
            jDesktopPane1.removeAll();
            Utilisateurs util = new Utilisateurs();
            jDesktopPane1.add(util);
            util.setVisible(true);
        } else {
            jButton1.setEnabled(false);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    //Le BUTTON CLIENTS/FOURNISSEURS
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDesktopPane1.removeAll();
        Clients CltFrs = new Clients();
        jDesktopPane1.add(CltFrs);
        CltFrs.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    //BUTOOM CATEGORIES
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (administrateur.equals("Admin")) {
            jDesktopPane1.removeAll();
            Categories cat = new Categories();
            jDesktopPane1.add(cat);
            cat.setVisible(true);
        } else {
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    //BUTOOM ACHAT
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (administrateur.equals("Admin")) {
            jDesktopPane1.removeAll();
            Achat ach = new Achat();
            jDesktopPane1.add(ach);
            ach.setVisible(true);
        } else {
            jButton4.setEnabled(false);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    //BUTOOM STATISTIQUE
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (administrateur.equals("Admin")) {
            jDesktopPane1.removeAll();
            Statistique sta = new Statistique();
            jDesktopPane1.add(sta);
            sta.setVisible(true);
        } else {
            jButton5.setEnabled(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //BUTOOM PARAMETRE
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (administrateur.equals("Admin")) {
            jDesktopPane1.removeAll();
            Parametre par = new Parametre();
            jDesktopPane1.add(par);
            par.setVisible(true);
            
           
        
           // PaysParam.setEnabled(false);
        } else {
            //PaysParam.setEnabled(true);
            jButton6.setEnabled(false);
        }


    }//GEN-LAST:event_jButton6ActionPerformed

//BUTOOM VENTE
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDesktopPane1.removeAll();
        ventes vte = new ventes();
        jDesktopPane1.add(vte);
        vte.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        new Connecter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(menu_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txtheure;
    private javax.swing.JLabel txtnomutil;
    private javax.swing.JLabel txttype;
    // End of variables declaration//GEN-END:variables
}
