
package model;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;  




public class Statistique extends javax.swing.JInternalFrame {
    
      //Les variables de connection
    Connection con = null;
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;
    
    
    public void Connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:stock.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Statistique() {
        
        initComponents();
        //Stq();
        
        setBackground(new Color(0, 0, 0, 0));
        
        card1.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"PRODUITS","5"));
        card2.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"FOURNISSEURS","2"));
        card3.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"CLIENTS","5"));
        card4.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"ADMIN","3"));
        card5.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"USER","2"));
        card6.setData(new model_card(new ImageIcon(getClass().getResource("/icone/005-user.png")),"USER","2"));

       
    }
    
    
    /*
     //Affichage de la somme total des eleves du systeme
    public void Stq(){
        try{
            Connect();
            pst = con.prepareStatement("select count(nom) from achat");
            rs = pst.executeQuery();
            //Pour afficher les informations
            while(rs.next()){
                PanelBorder co = new PanelBorder();
                int calcul = rs.getInt("count(nom)");
                txtClt.setText(String.valueOf(calcul)); 
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    */
     

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pane1 = new javax.swing.JLayeredPane();
        card6 = new icone.PanelBorder();
        card5 = new icone.PanelBorder();
        card4 = new icone.PanelBorder();
        pane3 = new javax.swing.JLayeredPane();
        card1 = new icone.PanelBorder();
        card2 = new icone.PanelBorder();
        card3 = new icone.PanelBorder();

        setPreferredSize(new java.awt.Dimension(1265, 500));

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 36)); // NOI18N
        jLabel2.setText("Statistique");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));
        jLabel2.setLocation(new java.awt.Point(0, 4));

        card6.setColor1(new java.awt.Color(236, 161, 161));
        card6.setColor2(new java.awt.Color(0, 51, 0));

        card5.setColor1(new java.awt.Color(153, 153, 255));
        card5.setColor2(new java.awt.Color(230, 93, 93));

        card4.setColor1(new java.awt.Color(200, 200, 244));
        card4.setColor2(new java.awt.Color(123, 123, 70));

        pane1.setLayer(card6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane1.setLayer(card5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane1.setLayer(card4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addGroup(pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(card6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(card4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));

        pane3.setLayer(card1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane3.setLayer(card2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane3.setLayer(card3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane3Layout = new javax.swing.GroupLayout(pane3);
        pane3.setLayout(pane3Layout);
        pane3Layout.setHorizontalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        pane3Layout.setVerticalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        sp.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private icone.PanelBorder card1;
    private icone.PanelBorder card2;
    private icone.PanelBorder card3;
    private icone.PanelBorder card4;
    private icone.PanelBorder card5;
    private icone.PanelBorder card6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane pane1;
    private javax.swing.JLayeredPane pane3;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}


/*
public class PanelBorder extends javax.swing.JPanel {

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
    
    public PanelBorder() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void setData(model_card data){
        IDIcon.setIcon(data.getIcon());
        IDTitle.setText(data.getTitle());
        IDValue.setText(data.getValue());
    }
    

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
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        IDIcon = new javax.swing.JLabel();
        IDTitle = new javax.swing.JLabel();
        IDValue = new javax.swing.JLabel();

        IDIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/004-businessman.png"))); // NOI18N

        IDTitle.setBackground(new java.awt.Color(255, 255, 255));
        IDTitle.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        IDTitle.setForeground(new java.awt.Color(255, 255, 255));
        IDTitle.setText("Produits");

        IDValue.setBackground(new java.awt.Color(255, 255, 255));
        IDValue.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        IDValue.setForeground(new java.awt.Color(255, 255, 255));
        IDValue.setText("Produits");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(IDIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(IDTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(IDValue)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDIcon)
                    .addComponent(IDTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(IDValue)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JLabel IDIcon;
    private javax.swing.JLabel IDTitle;
    private javax.swing.JLabel IDValue;
    // End of variables declaration                   

   
  
}

*/