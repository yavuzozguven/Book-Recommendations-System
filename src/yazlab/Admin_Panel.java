package yazlab;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class Admin_Panel extends javax.swing.JFrame {

    
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DOMAIN_NAME = "localhost";
        static final String DB_NAME = "book-crossing";
        static final String DB_URL = "jdbc:mysql://localhost:3306/book-crossing";
        
        static final String USER = "root";
        static final String PASS = "";
        
      
   
    public Admin_Panel() {
        initComponents();
        for (int i = 1; i < 1000; i++) {
            sayfa_sayisi.addItem(""+i);
        }
        yukle();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uye_tablo = new javax.swing.JTable();
        uye_sil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JLabel();
        konum = new javax.swing.JLabel();
        yas = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        sifre = new javax.swing.JLabel();
        bildirim = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        kitap_adi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        isbn_no = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        yazar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        yayinlayan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yil = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kitap_gorseli = new javax.swing.JLabel();
        sayfa_sayisi = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kitap_tablo = new javax.swing.JTable();
        kitap_sil = new javax.swing.JButton();
        bildirim1 = new javax.swing.JLabel();
        kayit_ekle = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uye_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        uye_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uye_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uye_tablo);

        uye_sil.setText("Sil");
        uye_sil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uye_silMouseClicked(evt);
            }
        });

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Şifre:");

        jLabel3.setText("Konum:");

        jLabel4.setText("Yaş:");

        jLabel5.setText("User ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(konum, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(kullanici_adi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(user_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 576, Short.MAX_VALUE)
                                .addComponent(uye_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bildirim, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(sifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(konum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(uye_sil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bildirim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Üye Yönetimi", jPanel1);

        jLabel9.setText("Kitap Adı:");

        jLabel10.setText("ISBN:");

        jLabel11.setText("Yazar:");

        jLabel12.setText("Yayınlayan:");

        jLabel6.setText("Yıl:");

        jLabel13.setText("Kitap Görseli:");

        sayfa_sayisi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayfa_sayisiİtemStateChanged(evt);
            }
        });

        jLabel7.setText("Sayfa:");

        kitap_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        kitap_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitap_tabloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(kitap_tablo);

        kitap_sil.setText("Sil");
        kitap_sil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitap_silMouseClicked(evt);
            }
        });

        kayit_ekle.setText("Kayıt Ekle");
        kayit_ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kayit_ekleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bildirim1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addComponent(kayit_ekle)
                .addGap(18, 18, 18)
                .addComponent(kitap_sil)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sayfa_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kitap_gorseli, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(299, 299, 299))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isbn_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yayinlayan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kitap_adi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kitap_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kayit_ekle))
                    .addComponent(bildirim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(isbn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yazar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(yayinlayan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kitap_gorseli, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sayfa_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Kitap Yönetimi", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uye_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uye_tabloMouseClicked
      int satirsayisi = uye_tablo.getSelectedRow();
        
      
        TableModel model = uye_tablo.getModel();
        kullanici_adi.setText(model.getValueAt(satirsayisi,0).toString());
        sifre.setText(model.getValueAt(satirsayisi,1).toString());
        konum.setText(model.getValueAt(satirsayisi,2).toString());
        yas.setText(model.getValueAt(satirsayisi,3).toString());
        user_id.setText(model.getValueAt(satirsayisi,4).toString());
      
      
      
      
    }//GEN-LAST:event_uye_tabloMouseClicked

    private void uye_silMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uye_silMouseClicked
      Connection cnn = null;
      Statement stm = null;
      PreparedStatement psmt = null;
      int sayi=Integer.parseInt(user_id.getText());
      if(sayi>=278858){
      String sql = "DELETE FROM tablo_uyelik WHERE UyelikID = '"+sayi+"'";
      String sql1 = "DELETE FROM bx_book_ratings WHERE `bx_book_ratings`.`User-ID` = '"+sayi+"'";
      String sql2 = "DELETE FROM bx_books WHERE `bx_users`.`User-ID` = '"+sayi+"'";
          try {  
              Class.forName("com.mysql.jdbc.Driver");
              cnn = DriverManager.getConnection(DB_URL, USER, PASS);
              psmt = cnn.prepareStatement(sql);
              int result = psmt.executeUpdate();
              
              psmt = cnn.prepareStatement(sql1);
              int result1 = psmt.executeUpdate();
              
              psmt = cnn.prepareStatement(sql2);
              int result2 = psmt.executeUpdate();
              bildirim.setText("Üye başarıyla silindi.");
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      else if(sayi<278858){
      String sql = "DELETE FROM bx_users WHERE `bx_users`.`User-ID` = '"+sayi+"'";
      String sql1 = "DELETE FROM bx_book_ratings WHERE `bx_book_ratings`.`User-ID` = '"+sayi+"'";
      try {  
              Class.forName("com.mysql.jdbc.Driver");
              cnn = DriverManager.getConnection(DB_URL, USER, PASS);
              psmt = cnn.prepareStatement(sql);
              int result = psmt.executeUpdate();
              psmt = cnn.prepareStatement(sql1);
              int result1 = psmt.executeUpdate();
              bildirim.setText("Üye başarıyla silindi.");
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
          }
      
      }
      yukle();
      
      
      
    }//GEN-LAST:event_uye_silMouseClicked

    private void sayfa_sayisiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayfa_sayisiİtemStateChanged
        int sayial = sayfa_sayisi.getSelectedIndex();
        sayial=sayial*10;
        Connection cnn = null;
        Statement stm = null;
        PreparedStatement psmt = null;
        kitap_tablo.setModel(new DefaultTableModel (null,new String[]{"Book Title","ISBN","Author","Publisher","Year"}));
        DefaultTableModel model = (DefaultTableModel) kitap_tablo.getModel();

        String sql = "SELECT * FROM bx_books,bx_book_ratings WHERE bx_books.ISBN=bx_book_ratings.ISBN LIMIT "+sayial+",10";
        ArrayList dizi_title = new ArrayList();
        ArrayList ISBN = new ArrayList();
        ArrayList publisher = new ArrayList();
        ArrayList publishing_year = new ArrayList();
        ArrayList author = new ArrayList();
        Object[] satir = new Object[6];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                author.add(rs.getString("Book-Author"));
                publishing_year.add(rs.getString("Year-Of-Publication"));
                publisher.add(rs.getString("Publisher"));
                ISBN.add(rs.getString("ISBN"));
                dizi_title.add(rs.getString("Book-Title"));
            }
            for (int i = 0; i < dizi_title.size(); i++) {
                satir[0] = dizi_title.get(i);
                satir[1]=ISBN.get(i);
                satir[2]=author.get(i);
                satir[3]=publisher.get(i);
                satir[4]=publishing_year.get(i);
                model.addRow(satir);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sayfa_sayisiİtemStateChanged

    private void kitap_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitap_tabloMouseClicked
        int satirsayisi = kitap_tablo.getSelectedRow();
        Connection cnn = null;
        Statement stm = null;
        PreparedStatement psmt = null;

        TableModel model = kitap_tablo.getModel();
        kitap_adi.setText(model.getValueAt(satirsayisi,0).toString());
        isbn_no.setText(model.getValueAt(satirsayisi,1).toString());
        yazar.setText(model.getValueAt(satirsayisi,2).toString());
        yayinlayan.setText(model.getValueAt(satirsayisi,3).toString());
        yil.setText(model.getValueAt(satirsayisi,4).toString());

        String sql = "SELECT * FROM bx_books WHERE ISBN='"+isbn_no.getText()+"'";
        String path="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                path = rs.getString("Image-URL-S");
            }
            URL url = new URL(path);
            Image image = ImageIO.read(url);
            kitap_gorseli.setIcon(new ImageIcon(image));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MalformedURLException ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (IOException ex) { 
                Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            

    }//GEN-LAST:event_kitap_tabloMouseClicked

    private void kitap_silMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitap_silMouseClicked
    Connection cnn = null;
    Statement stm = null;
    PreparedStatement psmt = null;    
    
    String sql = "DELETE FROM bx_books WHERE `bx_books`.`ISBN` = '"+isbn_no.getText()+"'";
    String sql1 = "DELETE FROM bx_book_ratings WHERE `bx_book_ratings`.`ISBN` = '"+isbn_no.getText()+"'";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnn = DriverManager.getConnection(DB_URL, USER, PASS);
                psmt = cnn.prepareStatement(sql);
                int result = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql1);
                int result1 = psmt.executeUpdate();
                bildirim1.setText("Kitap başarıyla silindi.");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_kitap_silMouseClicked

    private void kayit_ekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayit_ekleMouseClicked
     Kitap_Ekle ke = new Kitap_Ekle();
     ke.setVisible(true);
        
        
    }//GEN-LAST:event_kayit_ekleMouseClicked

   
    
    public void yukle(){
      Connection cnn = null;
      Statement stm = null;
      PreparedStatement psmt = null;
      
      String sql = "SELECT * FROM tablo_uyelik,bx_users ORDER BY `bx_users`.`User-ID` DESC";
      
      ArrayList user_id_al = new ArrayList();
      ArrayList sifre_al = new ArrayList();
      ArrayList konum_al = new ArrayList();
      ArrayList yas_al = new ArrayList();
      ArrayList user_id = new ArrayList();
      
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnn = DriverManager.getConnection(DB_URL, USER, PASS);
                stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next()){
                    if(rs.getInt("User-ID")>278858){
                        user_id_al.add(rs.getString("kullanciadi"));
                        sifre_al.add(rs.getString("sifre"));
                        konum_al.add(rs.getString("Location"));
                        yas_al.add(rs.getString("Age"));
                        user_id.add(rs.getString("User-ID"));
                    }
                    else{
                        user_id_al.add("null");
                        sifre_al.add("null");
                        konum_al.add(rs.getString("Location"));
                        if(rs.getString("Age")==null){
                            yas_al.add("null");
                        }
                        else{
                        yas_al.add(rs.getString("Age"));
                        }
                        user_id.add(rs.getString("User-ID"));
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            uye_tablo.setModel(new DefaultTableModel (null,new String[]{"Kullanıcı Adı","Şifre","Konum","Yaş","Kullanıcı ID"}));
            DefaultTableModel model = (DefaultTableModel) uye_tablo.getModel();
            
            Object[] satir = new Object[5];
            for (int i = 0; i < sifre_al.size(); i++) {
            satir[0]=user_id_al.get(i);
            satir[1]=sifre_al.get(i);
            satir[2]=konum_al.get(i);
            satir[3]=yas_al.get(i);
            satir[4]=user_id.get(i);
            model.addRow(satir);
        }
  
    }
    
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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bildirim;
    private javax.swing.JLabel bildirim1;
    private javax.swing.JLabel isbn_no;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kayit_ekle;
    private javax.swing.JLabel kitap_adi;
    private javax.swing.JLabel kitap_gorseli;
    private javax.swing.JButton kitap_sil;
    private javax.swing.JTable kitap_tablo;
    private javax.swing.JLabel konum;
    private javax.swing.JLabel kullanici_adi;
    private javax.swing.JComboBox<String> sayfa_sayisi;
    private javax.swing.JLabel sifre;
    private javax.swing.JLabel user_id;
    private javax.swing.JButton uye_sil;
    private javax.swing.JTable uye_tablo;
    private javax.swing.JLabel yas;
    private javax.swing.JLabel yayinlayan;
    private javax.swing.JLabel yazar;
    private javax.swing.JLabel yil;
    // End of variables declaration//GEN-END:variables
}
