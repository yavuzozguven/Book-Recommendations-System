package yazlab;

import java.awt.Image;
import java.io.File;
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
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class kitaplari_goster extends javax.swing.JFrame {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DOMAIN_NAME = "localhost";
        static final String DB_NAME = "book-crossing";
        static final String DB_URL = "jdbc:mysql://localhost:3306/book-crossing";
        
        static final String USER = "root";
        static final String PASS = "";
        
        ArrayList<String> path1 = new ArrayList<>();
        int sayfa;
        String sonuye1;
    
    
    public kitaplari_goster() {
        initComponents();
        for (int i = 1; i <= 1000; i++) {
            sayfa_sayisi3.addItem(""+i);
        }
        for (int i = 1; i <= 1000; i++) {
            sayfa_sayisi1.addItem(""+i);
        }
        for (int i = 1; i <= 1000; i++) {
            sayfa_sayisi2.addItem(""+i);
        }
        for (int i = 0; i < 10; i++) {
            sayfa_sayisi4.addItem(""+i);
        }
        for (int i = 1; i < 3; i++) {
            sayfa_sayisi5.addItem(""+i);
        }
        sayfa_sayisi2.setVisible(false);
        sayfa_sayisi3.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jframe = new javax.swing.JTabbedPane();
        tumkitaplar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        isbn_no1 = new javax.swing.JLabel();
        kitap_adi1 = new javax.swing.JLabel();
        sayfa_sayisi1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        yil1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kitap_oylamasi = new javax.swing.JLabel();
        yayinlayan1 = new javax.swing.JLabel();
        yazar1 = new javax.swing.JLabel();
        kitap_gorsel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        oku = new javax.swing.JButton();
        oylanankitap = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablo2 = new javax.swing.JTable();
        isbn_no3 = new javax.swing.JLabel();
        kitap_adi3 = new javax.swing.JLabel();
        sayfa_sayisi3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yil3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        kitap_oylamasi2 = new javax.swing.JLabel();
        yayinlayan3 = new javax.swing.JLabel();
        yazar3 = new javax.swing.JLabel();
        kitap_gorsel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        oku1 = new javax.swing.JButton();
        eniyi10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablo1 = new javax.swing.JTable();
        isbn_no2 = new javax.swing.JLabel();
        kitap_adi2 = new javax.swing.JLabel();
        sayfa_sayisi2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yil2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kitap_oylamasi1 = new javax.swing.JLabel();
        yayinlayan2 = new javax.swing.JLabel();
        yazar2 = new javax.swing.JLabel();
        kitap_gorsel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        oku2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablo3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        sayfa_sayisi4 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        kitap_gorsel3 = new javax.swing.JLabel();
        oku3 = new javax.swing.JButton();
        isbn_no4 = new javax.swing.JLabel();
        kitap_adi4 = new javax.swing.JLabel();
        yazar4 = new javax.swing.JLabel();
        yayinlayan4 = new javax.swing.JLabel();
        yil4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bildirim_eklenen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablo4 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        kitap_gorsel4 = new javax.swing.JLabel();
        sayfa_sayisi5 = new javax.swing.JComboBox<>();
        kitap_adi5 = new javax.swing.JLabel();
        isbn_no5 = new javax.swing.JLabel();
        yazar5 = new javax.swing.JLabel();
        yayinlayan5 = new javax.swing.JLabel();
        yil5 = new javax.swing.JLabel();
        oku4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablo);

        sayfa_sayisi1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayfa_sayisi1İtemStateChanged(evt);
            }
        });

        jLabel6.setText("Yıl:");

        jLabel1.setText("Kitap Adı:");

        jLabel3.setText("ISBN:");

        jLabel4.setText("Yazar:");

        jLabel7.setText("Sayfa:");

        jLabel5.setText("Yayınlayan:");

        jLabel10.setText("Kitap Görseli:");

        oku.setText("Oku");
        oku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tumkitaplarLayout = new javax.swing.GroupLayout(tumkitaplar);
        tumkitaplar.setLayout(tumkitaplarLayout);
        tumkitaplarLayout.setHorizontalGroup(
            tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tumkitaplarLayout.createSequentialGroup()
                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tumkitaplarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tumkitaplarLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sayfa_sayisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tumkitaplarLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tumkitaplarLayout.createSequentialGroup()
                                .addComponent(kitap_gorsel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oku))
                            .addGroup(tumkitaplarLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(kitap_oylamasi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(tumkitaplarLayout.createSequentialGroup()
                        .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(yazar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isbn_no1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yayinlayan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kitap_adi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yil1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        tumkitaplarLayout.setVerticalGroup(
            tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tumkitaplarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oku)
                    .addGroup(tumkitaplarLayout.createSequentialGroup()
                        .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tumkitaplarLayout.createSequentialGroup()
                                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kitap_adi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(isbn_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yazar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tumkitaplarLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(yayinlayan1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yil1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(kitap_oylamasi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_gorsel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tumkitaplarLayout.createSequentialGroup()
                                .addGroup(tumkitaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayfa_sayisi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jframe.addTab("Tüm kitaplar", tumkitaplar);

        tablo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablo2);

        sayfa_sayisi3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayfa_sayisi3İtemStateChanged(evt);
            }
        });

        jLabel14.setText("Yıl:");

        jLabel2.setText("Kitap Adı:");

        jLabel17.setText("ISBN:");

        jLabel18.setText("Yazar:");

        jLabel20.setText("Yayınlayan:");

        jLabel21.setText("Kitap Görseli:");

        oku1.setText("Oku");
        oku1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oku1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout oylanankitapLayout = new javax.swing.GroupLayout(oylanankitap);
        oylanankitap.setLayout(oylanankitapLayout);
        oylanankitapLayout.setHorizontalGroup(
            oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oylanankitapLayout.createSequentialGroup()
                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oylanankitapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(oylanankitapLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(sayfa_sayisi3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oylanankitapLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(oylanankitapLayout.createSequentialGroup()
                                .addComponent(kitap_gorsel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oku1))
                            .addGroup(oylanankitapLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(kitap_oylamasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(oylanankitapLayout.createSequentialGroup()
                        .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(yazar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isbn_no3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yayinlayan3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kitap_adi3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yil3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        oylanankitapLayout.setVerticalGroup(
            oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oylanankitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oku1)
                    .addGroup(oylanankitapLayout.createSequentialGroup()
                        .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(oylanankitapLayout.createSequentialGroup()
                                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kitap_adi3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(isbn_no3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yazar3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(oylanankitapLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(yayinlayan3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yil3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(kitap_oylamasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(oylanankitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_gorsel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(oylanankitapLayout.createSequentialGroup()
                                .addComponent(sayfa_sayisi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jframe.addTab("En çok oylanan kitaplar", oylanankitap);

        tablo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablo1);

        sayfa_sayisi2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayfa_sayisi2İtemStateChanged(evt);
            }
        });

        jLabel8.setText("Yıl:");

        jLabel9.setText("Kitap Adı:");

        jLabel12.setText("ISBN:");

        jLabel13.setText("Yazar:");

        jLabel15.setText("Yayınlayan:");

        jLabel16.setText("Kitap Görseli:");

        oku2.setText("Oku");
        oku2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oku2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eniyi10Layout = new javax.swing.GroupLayout(eniyi10);
        eniyi10.setLayout(eniyi10Layout);
        eniyi10Layout.setHorizontalGroup(
            eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eniyi10Layout.createSequentialGroup()
                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eniyi10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eniyi10Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(sayfa_sayisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eniyi10Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(eniyi10Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(kitap_oylamasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(eniyi10Layout.createSequentialGroup()
                                .addComponent(kitap_gorsel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oku2))))
                    .addGroup(eniyi10Layout.createSequentialGroup()
                        .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(yazar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isbn_no2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yayinlayan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kitap_adi2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yil2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        eniyi10Layout.setVerticalGroup(
            eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eniyi10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oku2)
                    .addGroup(eniyi10Layout.createSequentialGroup()
                        .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(eniyi10Layout.createSequentialGroup()
                                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kitap_adi2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(isbn_no2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yazar2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(eniyi10Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(yayinlayan2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yil2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(kitap_oylamasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(eniyi10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_gorsel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(eniyi10Layout.createSequentialGroup()
                                .addComponent(sayfa_sayisi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jframe.addTab("En iyi 10 kitap", eniyi10);

        tablo3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablo3);

        jLabel11.setText("Kitap Adı:");

        jLabel19.setText("ISBN:");

        jLabel22.setText("Yazar:");

        jLabel23.setText("Yayınlayan:");

        jLabel24.setText("Yıl:");

        sayfa_sayisi4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayfa_sayisi4İtemStateChanged(evt);
            }
        });

        jLabel25.setText("Kitap Görseli:");

        oku3.setText("Oku");
        oku3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oku3MouseClicked(evt);
            }
        });

        jLabel26.setText("Sayfa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sayfa_sayisi4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bildirim_eklenen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(621, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kitap_gorsel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oku3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yazar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isbn_no4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yayinlayan4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kitap_adi4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(yil4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(72, 72, 72)))
                    .addGap(5, 5, 5)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sayfa_sayisi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(bildirim_eklenen, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(oku3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kitap_adi4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(isbn_no4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yazar4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(yayinlayan4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yil4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kitap_gorsel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jframe.addTab("Yeni Eklenen Kitaplar", jPanel1);

        tablo4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo4MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablo4);

        jLabel27.setText("Kitap Adı:");

        jLabel28.setText("ISBN:");

        jLabel29.setText("Yazar:");

        jLabel30.setText("Yayınlayan:");

        jLabel31.setText("Yıl:");

        jLabel32.setText("Kitap Görseli:");

        sayfa_sayisi5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sayfa_sayisi5İtemStateChanged(evt);
            }
        });

        oku4.setText("Oku");
        oku4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oku4MouseClicked(evt);
            }
        });

        jLabel33.setText("Sayfa Sayısı:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(787, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(sayfa_sayisi5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kitap_gorsel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oku4))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yazar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isbn_no5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yayinlayan5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kitap_adi5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(yil5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(oku4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kitap_adi5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(isbn_no5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yazar5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(yayinlayan5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yil5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kitap_gorsel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(sayfa_sayisi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jframe.addTab("Sizin için önerilenler", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jframe)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jframe, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
       int satirsayisi = tablo.getSelectedRow();
       Connection cnn = null;
       Statement stm = null;
       PreparedStatement psmt = null;
       
       
        TableModel model = tablo.getModel();
        kitap_adi1.setText(model.getValueAt(satirsayisi,0).toString());
        isbn_no1.setText(model.getValueAt(satirsayisi,1).toString());
        yazar1.setText(model.getValueAt(satirsayisi,2).toString());
        yayinlayan1.setText(model.getValueAt(satirsayisi,3).toString());
        yil1.setText(model.getValueAt(satirsayisi,4).toString());
          
       
       String sql = "SELECT * FROM bx_books WHERE ISBN='"+isbn_no1.getText()+"'";
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
            kitap_gorsel.setIcon(new ImageIcon(image));
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MalformedURLException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            }
       
               
       
       
       
       
       
    }//GEN-LAST:event_tabloMouseClicked

    private void sayfa_sayisi1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayfa_sayisi1İtemStateChanged
        int sayial = sayfa_sayisi1.getSelectedIndex();
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

    }//GEN-LAST:event_sayfa_sayisi1İtemStateChanged

    private void tablo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo1MouseClicked
      int satirsayisi = tablo1.getSelectedRow();
       Connection cnn = null;
       Statement stm = null;
       PreparedStatement psmt = null;
       
       
        TableModel model = tablo1.getModel();
        kitap_adi2.setText(model.getValueAt(satirsayisi,0).toString());
        isbn_no2.setText(model.getValueAt(satirsayisi,1).toString());
        yazar2.setText(model.getValueAt(satirsayisi,2).toString());
        yayinlayan2.setText(model.getValueAt(satirsayisi,3).toString());
        yil2.setText(model.getValueAt(satirsayisi,4).toString());
        
       
       String sql = "SELECT * FROM bx_books WHERE ISBN='"+isbn_no2.getText()+"'";
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
            kitap_gorsel1.setIcon(new ImageIcon(image));
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MalformedURLException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tablo1MouseClicked

    private void sayfa_sayisi2İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayfa_sayisi2İtemStateChanged
        int sayial = sayfa_sayisi2.getSelectedIndex();
        sayial=sayial*10;
        Connection cnn = null;
        Statement stm = null;
        PreparedStatement psmt = null;
        tablo1.setModel(new DefaultTableModel (null,new String[]{"Book Title","ISBN","Author","Publisher","Year"}));
        DefaultTableModel model = (DefaultTableModel) tablo1.getModel();

        String sql1 = "SELECT ISBN FROM bx_book_ratings GROUP BY ISBN ORDER BY AVG(BookRating) DESC LIMIT 40";
        ArrayList dizi_title = new ArrayList();
        ArrayList ISBN1 = new ArrayList();
        ArrayList ISBN = new ArrayList();
        ArrayList publisher = new ArrayList();
        ArrayList publishing_year = new ArrayList();
        ArrayList author = new ArrayList();
        Object[] satir = new Object[6];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            while(rs.next()){
                ISBN1.add(rs.getString("ISBN"));
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        int sayac = 0;
        int kontrol = 0;
        for (int i = 0; i < ISBN1.size(); i++) {
        String sql2 = "SELECT * FROM bx_books WHERE ISBN = '"+ISBN1.get(i)+"'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            while(rs.next()){
                ISBN.add(rs.getString("ISBN"));
                author.add(rs.getString("Book-Author"));
                publishing_year.add(rs.getString("Year-Of-Publication"));
                publisher.add(rs.getString("Publisher"));
                dizi_title.add(rs.getString("Book-Title"));
                sayac++;
                if(sayac == 10){
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol == 1){
                break;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        for (int i = 0; i < dizi_title.size(); i++) {
                satir[0] = dizi_title.get(i);
                satir[1]=ISBN.get(i);
                satir[2]=author.get(i);
                satir[3]=publisher.get(i);
                satir[4]=publishing_year.get(i);
                model.addRow(satir);
            }
        
        
        
        
        

    }//GEN-LAST:event_sayfa_sayisi2İtemStateChanged

    private void tablo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo2MouseClicked
       int satirsayisi = tablo2.getSelectedRow();
       Connection cnn = null;
       Statement stm = null;
       PreparedStatement psmt = null;
       
       
        TableModel model = tablo2.getModel();
        kitap_adi3.setText(model.getValueAt(satirsayisi,0).toString());
        isbn_no3.setText(model.getValueAt(satirsayisi,1).toString());
        yazar3.setText(model.getValueAt(satirsayisi,2).toString());
        yayinlayan3.setText(model.getValueAt(satirsayisi,3).toString());
        yil3.setText(model.getValueAt(satirsayisi,4).toString());
        
       
       String sql = "SELECT * FROM bx_books WHERE ISBN='"+isbn_no3.getText()+"'";
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
            kitap_gorsel2.setIcon(new ImageIcon(image));
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MalformedURLException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tablo2MouseClicked

    private void sayfa_sayisi3İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayfa_sayisi3İtemStateChanged
        int sayial = sayfa_sayisi3.getSelectedIndex();
        sayial=sayial*10;
        Connection cnn = null;
        Statement stm = null;
        PreparedStatement psmt = null;
        tablo2.setModel(new DefaultTableModel (null,new String[]{"Book Title","ISBN","Author","Publisher","Year"}));
        DefaultTableModel model = (DefaultTableModel) tablo2.getModel();

        String sql1 = "SELECT * FROM bx_book_ratings GROUP BY ISBN ORDER BY COUNT(ISBN) DESC LIMIT 40";
        ArrayList dizi_title = new ArrayList();
        ArrayList ISBN1 = new ArrayList();
        ArrayList ISBN = new ArrayList();
        ArrayList publisher = new ArrayList();
        ArrayList publishing_year = new ArrayList();
        ArrayList author = new ArrayList();
        Object[] satir = new Object[6];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            while(rs.next()){
                ISBN1.add(rs.getString("ISBN"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int sayac = 0;
        int kontrol = 0;
        for (int i = 0; i < ISBN1.size(); i++) {
        String sql2 = "SELECT * FROM bx_books WHERE ISBN = '"+ISBN1.get(i)+"'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            while(rs.next()){
                ISBN.add(rs.getString("ISBN"));
                author.add(rs.getString("Book-Author"));
                publishing_year.add(rs.getString("Year-Of-Publication"));
                publisher.add(rs.getString("Publisher"));
                dizi_title.add(rs.getString("Book-Title"));
                sayac++;
                if(sayac == 10){
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol == 1){
                break;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        for (int i = 0; i < dizi_title.size(); i++) {
                satir[0] = dizi_title.get(i);
                satir[1]=ISBN.get(i);
                satir[2]=author.get(i);
                satir[3]=publisher.get(i);
                satir[4]=publishing_year.get(i);
                model.addRow(satir);
            }
        
    }//GEN-LAST:event_sayfa_sayisi3İtemStateChanged

    private void tablo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo3MouseClicked
        int satirsayisi = tablo3.getSelectedRow();
       Connection cnn = null;
       Statement stm = null;
       PreparedStatement psmt = null;
       
       
        TableModel model = tablo3.getModel();
        kitap_adi4.setText(model.getValueAt(satirsayisi,0).toString());
        isbn_no4.setText(model.getValueAt(satirsayisi,1).toString());
        yazar4.setText(model.getValueAt(satirsayisi,2).toString());
        yayinlayan4.setText(model.getValueAt(satirsayisi,3).toString());
        yil4.setText(model.getValueAt(satirsayisi,4).toString());
        
       
       String sql = "SELECT * FROM bx_books WHERE ISBN='"+isbn_no4.getText()+"'";
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
            kitap_gorsel3.setIcon(new ImageIcon(image));
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MalformedURLException ex) {
            bildirim_eklenen.setText("Görsel yüklenemedi.");
            } catch (IOException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tablo3MouseClicked

    private void sayfa_sayisi4İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayfa_sayisi4İtemStateChanged
       int satir_sayisi = sayfa_sayisi4.getSelectedIndex();
       
        satir_sayisi=satir_sayisi*10;
        Connection cnn = null;
        Statement stm = null;
        PreparedStatement psmt = null;
        ArrayList yonetici_isbn = new ArrayList();
        ArrayList dizi_title = new ArrayList();
        ArrayList publisher = new ArrayList();
        ArrayList publishing_year = new ArrayList();
        ArrayList author = new ArrayList();
        tablo3.setModel(new DefaultTableModel (null,new String[]{"Book Title","ISBN","Author","Publisher","Year"}));
        DefaultTableModel model = (DefaultTableModel) tablo3.getModel();
        
        String sql1 = "SELECT * FROM bx_book_ratings WHERE `User-ID` = 0";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            while(rs.next()){
                yonetici_isbn.add(rs.getString("ISBN"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < yonetici_isbn.size(); i++) {
            String sql2 = "SELECT * FROM bx_books WHERE ISBN ='"+yonetici_isbn.get(i)+"'";
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            while(rs.next()){
                author.add(rs.getString("Book-Author"));
                publishing_year.add(rs.getString("Year-Of-Publication"));
                publisher.add(rs.getString("Publisher"));
                dizi_title.add(rs.getString("Book-Title"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        Object[] satir = new Object[5];
        for (int i = 0; i < dizi_title.size(); i++) {
                satir[0] = dizi_title.get(i);
                satir[1]=yonetici_isbn.get(i);
                satir[2]=author.get(i);
                satir[3]=publisher.get(i);
                satir[4]=publishing_year.get(i);
                model.addRow(satir);
            }
        
       
    }//GEN-LAST:event_sayfa_sayisi4İtemStateChanged

    private void tablo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo4MouseClicked
       int satirsayisi = tablo4.getSelectedRow();
       Connection cnn = null;
       Statement stm = null;
       PreparedStatement psmt = null;
       
       
        TableModel model = tablo4.getModel();
        kitap_adi5.setText(model.getValueAt(satirsayisi,0).toString());
        isbn_no5.setText(model.getValueAt(satirsayisi,1).toString());
        yazar5.setText(model.getValueAt(satirsayisi,2).toString());
        yayinlayan5.setText(model.getValueAt(satirsayisi,3).toString());
        yil5.setText(model.getValueAt(satirsayisi,4).toString());
        
       
       String sql = "SELECT * FROM bx_books WHERE ISBN='"+isbn_no5.getText()+"'";
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
            kitap_gorsel4.setIcon(new ImageIcon(image));
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MalformedURLException ex) {
           
            } catch (IOException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tablo4MouseClicked

    public void suankiuye(String suankiuye){
    sonuye1 = suankiuye;
}
    
    private void sayfa_sayisi5İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sayfa_sayisi5İtemStateChanged
        Connection cnn = null;
        Statement stm = null;
        PreparedStatement psmt = null;

        ArrayList isbn = new ArrayList();
        ArrayList rating = new ArrayList();

        HashSet<String> user_id = new HashSet<String>();
        ArrayList rating2 = new ArrayList();

        double loginin_psi = 0;
        double sonuc = 0;
        int toplam = 0;

        double sonuc2 = 0;
        int toplam2 = 0;

        String sql = "SELECT * FROM bx_book_ratings WHERE `User-ID` ='"+sonuye1+"'";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                isbn.add(rs.getString("ISBN"));
                rating.add(rs.getString("BookRating"));
            }
            for (int i = 0; i < rating.size(); i++) {
                toplam += Double.parseDouble("" + rating.get(i));
                
            }
            sonuc = (toplam * 1.0) / rating.size();
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < rating.size(); i++) {
            double rating_sayz=0;
            rating_sayz = Double.parseDouble(""+rating.get(i))-sonuc;
            
            loginin_psi += Math.pow(rating_sayz, 2);
            
        }
        
        loginin_psi = Math.sqrt(loginin_psi);
        
        

        String sql1 = "SELECT * FROM bx_book_ratings";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            while (rs.next()) {
                user_id.add(rs.getString("User-ID"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList kesisim = new ArrayList();
        ArrayList user = new ArrayList();
        double userin_psi = 0;
        ArrayList userid_son = new ArrayList();
        ArrayList son = new ArrayList();
        
        try {
                Class.forName("com.mysql.jdbc.Driver");
                cnn = DriverManager.getConnection(DB_URL, USER, PASS);
                stm = cnn.createStatement();
        

        for (int id=1;id<250;id++) {
            
            
            String sql2 = "SELECT * FROM bx_book_ratings WHERE `User-ID` ='"+id+"'";
            
                ResultSet rs = stm.executeQuery(sql2);
                while (rs.next()) {
                    user.add(rs.getString("BookRating"));
                    userid_son.add(rs.getString("User-ID"));
                }
                for (int i = 0; i < user.size(); i++) {
                    toplam2 += Double.parseDouble("" + user.get(i));
                }
                
                sonuc2 = (toplam2 * 1.0) / user.size();
                
                for (int i = 0; i < user.size(); i++) {
                    userin_psi += Math.pow(Double.parseDouble("" + user.get(i)) - sonuc2, 2);
                }
                userin_psi = Math.sqrt(userin_psi);
               

            
            for (int i = 0; i < isbn.size(); i++) {
                String sql3 = "SELECT * FROM bx_book_ratings WHERE ISBN ='" + isbn.get(i) + "' AND `User-ID` ='"+id+"'";
                
                    ResultSet rs1 = stm.executeQuery(sql3);
                    while (rs1.next()) {
                        kesisim.add((Double.parseDouble("" + rating.get(i)) - sonuc) * (rs1.getDouble("BookRating") - sonuc2));
                        
                    }

                

            }
            double xde = 0;
            for (int i = 0; i < kesisim.size(); i++) {
                xde += Double.parseDouble(""+kesisim.get(i));
            }
            
            son.add(xde / userin_psi * loginin_psi);
            user.clear();
            kesisim.clear();
            userin_psi=0;
            sonuc2=0;
            toplam2=0;
            
            
            
        }} catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(kitaplari_goster.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        double tmp = 0;
        int hangi_index = 0;
        for (int i = 0; i < son.size(); i++) {
            if(tmp<Double.parseDouble(""+son.get(i))){
                tmp = Double.parseDouble(""+son.get(i));
                hangi_index = i;
            }
        }
        
        
        
        ArrayList ekle_isbn = new ArrayList();
        ArrayList author = new ArrayList();
        ArrayList publishing_year = new ArrayList();
        ArrayList publisher = new ArrayList();
        ArrayList dizi_title = new ArrayList();
        
        tablo4.setModel(new DefaultTableModel (null,new String[]{"Book Title","ISBN","Author","Publisher","Year"}));
        DefaultTableModel model = (DefaultTableModel) tablo4.getModel();
        
        String sql4 = "SELECT * FROM bx_book_ratings WHERE `User-ID` ='"+userid_son.get(hangi_index)+"'";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql4);
            while(rs.next()){
                ekle_isbn.add(rs.getString("ISBN"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < ekle_isbn.size(); i++) {
            String sql2 = "SELECT * FROM bx_books WHERE ISBN ='"+ekle_isbn.get(i)+"'";
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            while(rs.next()){
                author.add(rs.getString("Book-Author"));
                publishing_year.add(rs.getString("Year-Of-Publication"));
                publisher.add(rs.getString("Publisher"));
                dizi_title.add(rs.getString("Book-Title"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Kitap_Oylama.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        Object[] satir = new Object[5];
        for (int i = 0; i < dizi_title.size(); i++) {
                satir[0] = dizi_title.get(i);
                satir[1]=ekle_isbn.get(i);
                satir[2]=author.get(i);
                satir[3]=publisher.get(i);
                satir[4]=publishing_year.get(i);
                model.addRow(satir);
            }
        
        
        
        
    }//GEN-LAST:event_sayfa_sayisi5İtemStateChanged

    private void okuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okuMouseClicked
      pdfac();
    }//GEN-LAST:event_okuMouseClicked

    private void oku1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oku1MouseClicked
pdfac();      
    }//GEN-LAST:event_oku1MouseClicked

    private void oku2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oku2MouseClicked
pdfac();        
    }//GEN-LAST:event_oku2MouseClicked

    private void oku3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oku3MouseClicked
       pdfac();
    }//GEN-LAST:event_oku3MouseClicked

    private void oku4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oku4MouseClicked
       pdfac();
    }//GEN-LAST:event_oku4MouseClicked

    public void pdfac() {
        String dosya;
            dosya = "C:\\Users\\Yavuz\\Desktop\\Lisa Kleypas - Yalnızlar Adası.pdf";

        try {
            if ((new File(dosya)).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + dosya);
                p.waitFor();
            } else {
                System.out.println("Dosya bulunamadı.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(kitaplari_goster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitaplari_goster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitaplari_goster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitaplari_goster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitaplari_goster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bildirim_eklenen;
    private javax.swing.JPanel eniyi10;
    private javax.swing.JLabel isbn_no1;
    private javax.swing.JLabel isbn_no2;
    private javax.swing.JLabel isbn_no3;
    private javax.swing.JLabel isbn_no4;
    private javax.swing.JLabel isbn_no5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jframe;
    private javax.swing.JLabel kitap_adi1;
    private javax.swing.JLabel kitap_adi2;
    private javax.swing.JLabel kitap_adi3;
    private javax.swing.JLabel kitap_adi4;
    private javax.swing.JLabel kitap_adi5;
    private javax.swing.JLabel kitap_gorsel;
    private javax.swing.JLabel kitap_gorsel1;
    private javax.swing.JLabel kitap_gorsel2;
    private javax.swing.JLabel kitap_gorsel3;
    private javax.swing.JLabel kitap_gorsel4;
    private javax.swing.JLabel kitap_oylamasi;
    private javax.swing.JLabel kitap_oylamasi1;
    private javax.swing.JLabel kitap_oylamasi2;
    private javax.swing.JButton oku;
    private javax.swing.JButton oku1;
    private javax.swing.JButton oku2;
    private javax.swing.JButton oku3;
    private javax.swing.JButton oku4;
    private javax.swing.JPanel oylanankitap;
    private javax.swing.JComboBox<String> sayfa_sayisi1;
    private javax.swing.JComboBox<String> sayfa_sayisi2;
    private javax.swing.JComboBox<String> sayfa_sayisi3;
    private javax.swing.JComboBox<String> sayfa_sayisi4;
    private javax.swing.JComboBox<String> sayfa_sayisi5;
    private javax.swing.JTable tablo;
    private javax.swing.JTable tablo1;
    private javax.swing.JTable tablo2;
    private javax.swing.JTable tablo3;
    private javax.swing.JTable tablo4;
    private javax.swing.JPanel tumkitaplar;
    private javax.swing.JLabel yayinlayan1;
    private javax.swing.JLabel yayinlayan2;
    private javax.swing.JLabel yayinlayan3;
    private javax.swing.JLabel yayinlayan4;
    private javax.swing.JLabel yayinlayan5;
    private javax.swing.JLabel yazar1;
    private javax.swing.JLabel yazar2;
    private javax.swing.JLabel yazar3;
    private javax.swing.JLabel yazar4;
    private javax.swing.JLabel yazar5;
    private javax.swing.JLabel yil1;
    private javax.swing.JLabel yil2;
    private javax.swing.JLabel yil3;
    private javax.swing.JLabel yil4;
    private javax.swing.JLabel yil5;
    // End of variables declaration//GEN-END:variables
}
