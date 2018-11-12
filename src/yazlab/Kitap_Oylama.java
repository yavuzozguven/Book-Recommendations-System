package yazlab;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Kitap_Oylama extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DOMAIN_NAME = "localhost";
    static final String DB_NAME = "book-crossing";
    static final String DB_URL = "jdbc:mysql://localhost:3306/book-crossing";
        
    static final String USER = "root";
    static final String PASS = "";
    int sayac=0;
    int sayac2=0;
    String sonuye="";

    
    private WindowAdapter windowAdapter = null;
    
    public Kitap_Oylama() {
        initComponents();
        tamam.setVisible(false);
        ilerleme.setVisible(false);
        for (int i = 1; i <= 1000; i++) {
            sayi.addItem(""+i);
        }
        cikis();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        ilerleme = new javax.swing.JProgressBar();
        sayi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yayinlayan = new javax.swing.JLabel();
        yazar = new javax.swing.JLabel();
        isbn_no = new javax.swing.JLabel();
        kitap_adi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yil = new javax.swing.JLabel();
        oyla = new javax.swing.JButton();
        tamam = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        puan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sorun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Book Rating", "ISBN", "Raiting"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.setColumnSelectionAllowed(true);
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);
        tablo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        sayi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayiİtemStateChanged(evt);
            }
        });

        jLabel1.setText("Kitap Adı:");

        jLabel3.setText("ISBN:");

        jLabel4.setText("Yazar:");

        jLabel5.setText("Yayınlayan:");

        jLabel6.setText("Yıl:");

        oyla.setText("Oyla");
        oyla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oylaActionPerformed(evt);
            }
        });

        tamam.setText("Tamam");
        tamam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamActionPerformed(evt);
            }
        });

        jLabel7.setText("Sayfa:");

        jLabel8.setText("Puan:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yazar, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(isbn_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yayinlayan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kitap_adi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(ilerleme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sorun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tamam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(oyla))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(puan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(isbn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yazar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(yayinlayan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(sorun, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(ilerleme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oyla)
                                    .addComponent(tamam)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sayiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayiİtemStateChanged
      int sayial = sayi.getSelectedIndex();
      sayial=sayial*10;
      Connection cnn = null;
      Statement stm = null;
      PreparedStatement psmt = null;
      tablo.setModel(new DefaultTableModel (null,new String[]{"Book Title","ISBN","Author","Publisher","Year"}));
      DefaultTableModel model = (DefaultTableModel) tablo.getModel();
      
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
                
      
      
    }//GEN-LAST:event_sayiİtemStateChanged

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int satir_sayisi = tablo.getSelectedRow();
        TableModel model = tablo.getModel();
        kitap_adi.setText(model.getValueAt(satir_sayisi,0).toString());
        isbn_no.setText(model.getValueAt(satir_sayisi,1).toString());
        yazar.setText(model.getValueAt(satir_sayisi,2).toString());
        yayinlayan.setText(model.getValueAt(satir_sayisi,3).toString());
        yil.setText(model.getValueAt(satir_sayisi,4).toString());
        sayac2 = 1;
    }//GEN-LAST:event_tabloMouseClicked

    private void oylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oylaActionPerformed
      Connection cnn = null;
      Statement stm = null;
      PreparedStatement psmt = null;
      
      String sql = "SELECT * FROM tablo_uyelik ORDER BY tablo_uyelik.UyelikID DESC LIMIT 1";
      
      if(sayac2==1){
      
           
          try { 
              Class.forName("com.mysql.jdbc.Driver");
              cnn = DriverManager.getConnection(DB_URL, USER, PASS);
              stm = cnn.createStatement();
              ResultSet rs = stm.executeQuery(sql);
              while(rs.next()){
                  sonuye = rs.getString("UyelikID");
              }
              String sql1 = "INSERT INTO `bx_book_ratings`(`User-ID`,`BookRating`, `ISBN` ) VALUES "
              + "('"+sonuye+"','"+puan.getText()+"','"+isbn_no.getText()+"')";
              psmt = cnn.prepareStatement(sql1);
              int oyla = psmt.executeUpdate();
              sayac++;
              sorun.setText("");
          } catch (SQLException | ClassNotFoundException ex) {
              sorun.setText("Oyladığınız kitabı tekrar oylayamazsınız");
          }
          
      ilerleme.setVisible(true);
      ilerleme.setValue(sayac*10);
      if(sayac==10){
          tamam.setVisible(true);
      }
      sayac2=0;
      }
    }//GEN-LAST:event_oylaActionPerformed

    private void tamamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamActionPerformed
      kitaplari_goster kg = new kitaplari_goster();
      kg.suankiuye(sonuye);
      kg.setVisible(true);
    }//GEN-LAST:event_tamamActionPerformed

    
    
private void cikis() {

    this.windowAdapter = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            int kontrol = JOptionPane.showConfirmDialog(Kitap_Oylama.this, "Çıkarsanız üyeliğiniz silinecektir.", "Kapat?", JOptionPane.YES_NO_OPTION);
            if ( kontrol == 0 ) {
                Connection cnn = null;
                Statement stm = null;
                PreparedStatement psmt = null;
                
                
                String sql = "DELETE FROM bx_book_ratings WHERE `bx_book_ratings`.`User-ID` = '"+sonuye+"'";
                String sql1 ="DELETE FROM tablo_uyelik WHERE UyelikID = '"+sonuye+"'";
                String sql2 ="DELETE FROM bx_users WHERE `bx_users`.`User-ID` = '"+sonuye+"'";
                
                try {
                    Class.forName("com.mysql.jdbc.Driver");  
                    cnn = DriverManager.getConnection(DB_URL, USER, PASS);
                    psmt = cnn.prepareStatement(sql);
                    int result = psmt.executeUpdate();
                    psmt = cnn.prepareStatement(sql1);
                    int result2 = psmt.executeUpdate();
                    psmt = cnn.prepareStatement(sql2);
                    int result3 = psmt.executeUpdate();
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                Kitap_Oylama.this.dispose();
            }
        }

        // WINDOW_CLOSED event handler
        @Override
        public void windowClosed(WindowEvent e) {
            super.windowClosed(e);
            // Close application if you want to with System.exit(0)
            // but don't forget to dispose of all resources 
            // like child frames, threads, ...
            // System.exit(0);
        }
    };

    // when you press "X" the WINDOW_CLOSING event is called but that is it
    // nothing else happens
    this.setDefaultCloseOperation(Kitap_Oylama.DO_NOTHING_ON_CLOSE);
    // don't forget this
    this.addWindowListener(this.windowAdapter);
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
            java.util.logging.Logger.getLogger(Kitap_Oylama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kitap_Oylama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kitap_Oylama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kitap_Oylama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kitap_Oylama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ilerleme;
    private javax.swing.JLabel isbn_no;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kitap_adi;
    private javax.swing.JButton oyla;
    private javax.swing.JTextField puan;
    private javax.swing.JComboBox<String> sayi;
    private javax.swing.JLabel sorun;
    private javax.swing.JTable tablo;
    private javax.swing.JButton tamam;
    private javax.swing.JLabel yayinlayan;
    private javax.swing.JLabel yazar;
    private javax.swing.JLabel yil;
    // End of variables declaration//GEN-END:variables
}
