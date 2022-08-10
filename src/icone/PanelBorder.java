
package icone;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.model_card;

public class PanelBorder extends javax.swing.JPanel {
    /*
      
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
    
*/    

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
        //Stq();
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
                //PanelBorder co = new PanelBorder();
                int calcul = rs.getInt("count(nom)");
                IDValue.setText(String.valueOf(calcul)); 
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
*/

    public void setData(model_card data){
        IDIcon.setIcon(data.getIcon());
        IDTitle.setText(data.getTitle());
        IDValue.setText(data.getValue());
        //IDValue.setText(String.valueOf(calcul));
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IDIcon1 = new javax.swing.JLabel();
        IDTitle1 = new javax.swing.JLabel();
        IDValue1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IDIcon2 = new javax.swing.JLabel();
        IDTitle2 = new javax.swing.JLabel();
        IDValue2 = new javax.swing.JLabel();
        IDIcon = new javax.swing.JLabel();
        IDTitle = new javax.swing.JLabel();
        IDValue = new javax.swing.JLabel();

        IDIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/004-businessman.png"))); // NOI18N

        IDTitle1.setBackground(new java.awt.Color(255, 255, 255));
        IDTitle1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        IDTitle1.setForeground(new java.awt.Color(255, 255, 255));
        IDTitle1.setText("Produits");

        IDValue1.setBackground(new java.awt.Color(255, 255, 255));
        IDValue1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        IDValue1.setForeground(new java.awt.Color(255, 255, 255));
        IDValue1.setText("Produits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(IDIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(IDTitle1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(IDValue1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDIcon1)
                    .addComponent(IDTitle1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(IDValue1)
                .addGap(24, 24, 24))
        );

        IDIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/004-businessman.png"))); // NOI18N

        IDTitle2.setBackground(new java.awt.Color(255, 255, 255));
        IDTitle2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        IDTitle2.setForeground(new java.awt.Color(255, 255, 255));
        IDTitle2.setText("Produits");

        IDValue2.setBackground(new java.awt.Color(255, 255, 255));
        IDValue2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        IDValue2.setForeground(new java.awt.Color(255, 255, 255));
        IDValue2.setText("Produits");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(IDIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(IDTitle2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(IDValue2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDIcon2)
                    .addComponent(IDTitle2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(IDValue2)
                .addGap(24, 24, 24))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDIcon;
    private javax.swing.JLabel IDIcon1;
    private javax.swing.JLabel IDIcon2;
    private javax.swing.JLabel IDTitle;
    private javax.swing.JLabel IDTitle1;
    private javax.swing.JLabel IDTitle2;
    private javax.swing.JLabel IDValue;
    private javax.swing.JLabel IDValue1;
    private javax.swing.JLabel IDValue2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

   
  
}
