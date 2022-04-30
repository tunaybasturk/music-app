
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class TakipEdilenler{
    private int takipedilen_id;
    private String ad;
    private  String tur;

    public TakipEdilenler(int takipedilen_id) {
        this.takipedilen_id = takipedilen_id;
    }

    
    
    public TakipEdilenler(String ad, String tur) {
        this.ad = ad;
        this.tur = tur;
    }

    
    public int getTakipedilen_id() {
        return takipedilen_id;
    }

    public void setTakipedilen_id(int takipedilen_id) {
        this.takipedilen_id = takipedilen_id;
    }
    
    

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
    
}
public class KullaniciEkrani extends javax.swing.JFrame {

    static  KullaniciIslemleri kullaniciIslemleri=new KullaniciIslemleri();
    
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    public static ArrayList<TakipEdilenler> takıpedilenler;
    
    public static int id;
    public static  String ad;
    public   int selectedRow;
    
     static DefaultTableModel model;
     static DefaultTableModel model1;
     static DefaultTableModel model2;
     DefaultTableModel model3;
     DefaultTableModel model4;
     DefaultTableModel model5; 

     
    
    public JTable getJazz_calmalistesi() {
        
        return jazz_calmalistesi;
    } 

    public void setJazz_calmalistesi(JTable jazz_calmalistesi) {
        this.jazz_calmalistesi = jazz_calmalistesi;
    }

    public JTable getKlasik_calmalistesi() {
        return klasik_calmalistesi;
    }

    public void setKlasik_calmalistesi(JTable klasik_calmalistesi) {
        this.klasik_calmalistesi = klasik_calmalistesi;
    }

    

    public KullaniciEkrani(int x, String y) {
         initComponents();
        this.setBounds(0, 0, 1930, 1090);
        this.setTitle("Kullanici Ekrani");
        
        
        this.id=x;
        this.ad=y;
        
        
       
        model=(DefaultTableModel)pop_calmaListesi.getModel();
        model1=(DefaultTableModel)jazz_calmalistesi.getModel();
        model2=(DefaultTableModel)klasik_calmalistesi.getModel();
        model3=(DefaultTableModel)sarki_tablo.getModel();
        model4=(DefaultTableModel)kullanicilar_tablo.getModel();
        model5=(DefaultTableModel)takipedilenler_tablo.getModel();
        
        
        
        popCalmaDoldur();
        jazzCalmaDoldur();
        klasikCalmaDoldur();
        sarkilarDoldur();
        kullanicilariDoldur();
       
       
        
        ad_labeli.setText(y);
        String id=Integer.toString(x);
        id_labeli.setText(id);
           
        
         String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Driver Bulunamadı");
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            connection=DriverManager.getConnection(url,Baglanti.kullanici_ad,Baglanti.parola);
         
            } catch (SQLException ex) {
                ex.printStackTrace();
              
        }
        
         takipedlienDoldur();
        
        
    } 
    
    
    public void sarkilarDoldur(){
        
          model3.setRowCount(0);
         
         ArrayList<Sarki> listem=new ArrayList<Sarki>();
         listem=kullaniciIslemleri.ButunSarkilariEkle();
        if(listem!=null){
            for (Sarki liste : listem) {
                Object[] ekle={liste.getSarki_ad(),liste.getTarih(),liste.getSanatci(),liste.getAlbum(),liste.getTur(),liste.getSure(),liste.getDinlenme_sayisi()};
          
             model3.addRow(ekle);
            }
            
        }
     
        
    }
    
     public void kullanicilariDoldur(){
        
          model4.setRowCount(0);
         
         ArrayList<Kullanicilar> kullanicilar=new ArrayList<Kullanicilar>();
         kullanicilar=kullaniciIslemleri.ButunKullanicilariEkle(id);
        if(kullanicilar!=null){
            for (Kullanicilar liste : kullanicilar) {
                Object[] ekle={liste.getKullaniciad(),liste.getAboneliktur()};
          
             model4.addRow(ekle);
            }
            
        }
     
        
    }
    
     
     public static void popCalmaDoldur(){
        
         
         
          model.setRowCount(0);
         
         ArrayList<Sarki> poplistem=new ArrayList<Sarki>();
         poplistem=kullaniciIslemleri.CalmaListesinePopEkle(OnerilenSarkilar.id);
        if(poplistem!=null){
            for (Sarki popliste : poplistem) {
                Object[] ekle={popliste.getAlbum(),popliste.getSarki_ad(),popliste.getSanatci(),popliste.getSure(),popliste.getDinlenme_sayisi()};
                
             model.addRow(ekle);
            }
           
        }            
    }
     
      
     
      public static void jazzCalmaDoldur(){
        
         
         
          model1.setRowCount(0);
         
         ArrayList<Sarki> jazzlistem=new ArrayList<Sarki>();
         jazzlistem=kullaniciIslemleri.CalmaListesinejazzEkle(OnerilenSarkilar.id);
        if(jazzlistem!=null){
            for (Sarki popliste : jazzlistem) {
                Object[] ekle={popliste.getAlbum(),popliste.getSarki_ad(),popliste.getSanatci(),popliste.getSure(),popliste.getDinlenme_sayisi()};
                
               
             model1.addRow(ekle);
            }          
        }            
    }
       public static void klasikCalmaDoldur(){
        
         
         
          model2.setRowCount(0);
         
         ArrayList<Sarki> klasiklistem=new ArrayList<Sarki>();
         klasiklistem=kullaniciIslemleri.CalmaListesineklasikEkle(OnerilenSarkilar.id);
        if(klasiklistem!=null){
            for (Sarki popliste : klasiklistem) {
                Object[] ekle={popliste.getAlbum(),popliste.getSarki_ad(),popliste.getSanatci(),popliste.getSure(),popliste.getDinlenme_sayisi()};
                
               
             model2.addRow(ekle);
            }          
        }            
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanıcı_adlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        klasik_calmalistesi = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jazz_calmalistesi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ad_labeli = new javax.swing.JLabel();
        id_labeli = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sarki_tablo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        kullanicilar_tablo = new javax.swing.JTable();
        btn_sarkiekle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        pop_calmaListesi = new javax.swing.JTable();
        sarkiadalani = new javax.swing.JLabel();
        sanatciadalani = new javax.swing.JLabel();
        turadalani = new javax.swing.JLabel();
        takip_kullaniciad = new javax.swing.JLabel();
        uyeliik_tur = new javax.swing.JLabel();
        btn_sayfayagit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_sarkiDinle = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        takipedilenler_tablo = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        dinlenmeadi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dinlenmesayisi = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1910, 1020));
        getContentPane().setLayout(null);

        kullanıcı_adlabel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        kullanıcı_adlabel.setText("Kullanıcı Ad:");
        getContentPane().add(kullanıcı_adlabel);
        kullanıcı_adlabel.setBounds(10, 0, 165, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Pop Çalma listem");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(114, 180, 228, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setText("Jazz Çalma Listem");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(674, 177, 241, 37);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setText("Klasik Çalma Listem");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1224, 180, 262, 37);

        klasik_calmalistesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "album", "Sarki_ad", "sanatci", "sure", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        klasik_calmalistesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klasik_calmalistesiMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(klasik_calmalistesi);
        if (klasik_calmalistesi.getColumnModel().getColumnCount() > 0) {
            klasik_calmalistesi.getColumnModel().getColumn(0).setResizable(false);
            klasik_calmalistesi.getColumnModel().getColumn(1).setResizable(false);
            klasik_calmalistesi.getColumnModel().getColumn(2).setResizable(false);
            klasik_calmalistesi.getColumnModel().getColumn(3).setResizable(false);
            klasik_calmalistesi.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(1084, 223, 529, 402);

        jazz_calmalistesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "album", "Sarki_ad", "sanatci", "sure", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jazz_calmalistesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jazz_calmalistesiMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jazz_calmalistesi);
        if (jazz_calmalistesi.getColumnModel().getColumnCount() > 0) {
            jazz_calmalistesi.getColumnModel().getColumn(0).setResizable(false);
            jazz_calmalistesi.getColumnModel().getColumn(1).setResizable(false);
            jazz_calmalistesi.getColumnModel().getColumn(2).setResizable(false);
            jazz_calmalistesi.getColumnModel().getColumn(3).setResizable(false);
            jazz_calmalistesi.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(550, 223, 528, 402);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kullanıcı Id:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(108, 55, 67, 17);

        ad_labeli.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        getContentPane().add(ad_labeli);
        ad_labeli.setBounds(193, 0, 263, 37);

        id_labeli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(id_labeli);
        id_labeli.setBounds(190, 55, 254, 17);

        sarki_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki_ad", "tarih", "sanatci", "album", "tur", "sure", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sarki_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sarki_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sarki_tablo);
        if (sarki_tablo.getColumnModel().getColumnCount() > 0) {
            sarki_tablo.getColumnModel().getColumn(0).setResizable(false);
            sarki_tablo.getColumnModel().getColumn(1).setResizable(false);
            sarki_tablo.getColumnModel().getColumn(2).setResizable(false);
            sarki_tablo.getColumnModel().getColumn(3).setResizable(false);
            sarki_tablo.getColumnModel().getColumn(4).setResizable(false);
            sarki_tablo.getColumnModel().getColumn(5).setResizable(false);
            sarki_tablo.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(14, 695, 1599, 291);

        kullanicilar_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Ad", "Uyelik"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanicilar_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanicilar_tabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(kullanicilar_tablo);
        if (kullanicilar_tablo.getColumnModel().getColumnCount() > 0) {
            kullanicilar_tablo.getColumnModel().getColumn(0).setResizable(false);
            kullanicilar_tablo.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1631, 57, 273, 526);

        btn_sarkiekle.setText("ŞARKI EKLE");
        btn_sarkiekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sarkiekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sarkiekle);
        btn_sarkiekle.setBounds(605, 992, 339, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("BÜTÜN ŞARKILAR :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(16, 649, 171, 31);

        pop_calmaListesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "album", "Sarki_ad", "sanatci", "sure", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pop_calmaListesi.setOpaque(false);
        pop_calmaListesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pop_calmaListesiMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(pop_calmaListesi);
        if (pop_calmaListesi.getColumnModel().getColumnCount() > 0) {
            pop_calmaListesi.getColumnModel().getColumn(0).setResizable(false);
            pop_calmaListesi.getColumnModel().getColumn(1).setResizable(false);
            pop_calmaListesi.getColumnModel().getColumn(2).setResizable(false);
            pop_calmaListesi.getColumnModel().getColumn(3).setResizable(false);
            pop_calmaListesi.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(16, 223, 528, 402);

        sarkiadalani.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sarkiadalani.setOpaque(true);
        getContentPane().add(sarkiadalani);
        sarkiadalani.setBounds(1904, 1035, 0, 0);

        sanatciadalani.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sanatciadalani.setOpaque(true);
        getContentPane().add(sanatciadalani);
        sanatciadalani.setBounds(0, 0, 0, 0);

        turadalani.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        turadalani.setOpaque(true);
        getContentPane().add(turadalani);
        turadalani.setBounds(0, 0, 0, 0);

        takip_kullaniciad.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        takip_kullaniciad.setText("111");
        getContentPane().add(takip_kullaniciad);
        takip_kullaniciad.setBounds(1674, 11, 3, 2);

        uyeliik_tur.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        getContentPane().add(uyeliik_tur);
        uyeliik_tur.setBounds(0, 0, 0, 0);

        btn_sayfayagit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sayfayagit.setText("Sayfasına Git");
        btn_sayfayagit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sayfayagitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sayfayagit);
        btn_sayfayagit.setBounds(1657, 601, 229, 42);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("DİĞER KULLANICILAR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1639, 19, 250, 27);

        btn_sarkiDinle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sarkiDinle.setText("SEÇİLEN ŞARKIYI DİNLE");
        btn_sarkiDinle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sarkiDinleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sarkiDinle);
        btn_sarkiDinle.setBounds(611, 636, 344, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("TAKİP EDİLEN KULLANICILAR");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1631, 661, 273, 22);

        takipedilenler_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Ad", "Uyelik"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        takipedilenler_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takipedilenler_tabloMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(takipedilenler_tablo);
        if (takipedilenler_tablo.getColumnModel().getColumnCount() > 0) {
            takipedilenler_tablo.getColumnModel().getColumn(0).setResizable(false);
            takipedilenler_tablo.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(1631, 695, 273, 324);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/calmapng.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(907, 11, 358, 155);

        dinlenmeadi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(dinlenmeadi);
        dinlenmeadi.setBounds(466, 11, 280, 61);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("DİNLENME SAYISI:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1271, 23, 241, 22);

        dinlenmesayisi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(dinlenmesayisi);
        dinlenmesayisi.setBounds(1271, 57, 299, 40);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/kullaniciekrani.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1930, 1070);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sarki_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sarki_tabloMouseClicked
        
        selectedRow=sarki_tablo.getSelectedRow();
        sarkiadalani.setText(model3.getValueAt(selectedRow, 0).toString());
        sanatciadalani.setText(model3.getValueAt(selectedRow, 2).toString());
        turadalani.setText(model3.getValueAt(selectedRow, 4).toString());
        dinlenmeadi.setText(model3.getValueAt(selectedRow, 0).toString());
        dinlenmesayisi.setText(model3.getValueAt(selectedRow, 6).toString());

        
   
    }//GEN-LAST:event_sarki_tabloMouseClicked

    private void btn_sarkiekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sarkiekleActionPerformed
      
        String sarki_ad=sarkiadalani.getText();
        String sanatci_ad=sanatciadalani.getText();
        String tur_ad=turadalani.getText();
        
        //int id=Integer.parseInt(Id_alani.getText());
        String tur=model3.getValueAt(selectedRow, 4).toString();
        int sarki_id=sarkiSorgusu(sarki_ad,sanatci_ad,tur_ad);
        boolean doru=Kontrol(sarki_id,id);
        if(tur.equals("pop")){
            
            if(!doru){
                
               String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2,sarki_id);
            preparedStatement.setString(3, "pop");
          
            
            preparedStatement.execute();
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
             
           
            }           
        }
        else if(tur.equals("jazz")){
            if(!doru){
                
                  String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2,sarki_id);
            preparedStatement.setString(3, "jazz");
          
            
            preparedStatement.execute();
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
            }                   
            
           
        }
        else if(tur.equals("klasik"))
        {
            if(!doru){
                
                
                  String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2,sarki_id);
            preparedStatement.setString(3, "klasik");
          
            
            preparedStatement.execute();
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
              
                
            }       
            
            
        }else
        {
            System.out.println("boyle bir şey olamaz");
        }
       
      KullaniciEkrani.popCalmaDoldur();
      KullaniciEkrani.jazzCalmaDoldur();
      KullaniciEkrani.klasikCalmaDoldur();
        
       
    }//GEN-LAST:event_btn_sarkiekleActionPerformed

    private void kullanicilar_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanicilar_tabloMouseClicked
     
        int selectedRow=kullanicilar_tablo.getSelectedRow();
        
        takip_kullaniciad.setText(model4.getValueAt(selectedRow, 0).toString());
        uyeliik_tur.setText(model4.getValueAt(selectedRow, 1).toString());
        dinlenmesayisi.setText(model3.getValueAt(selectedRow, 4).toString());

        
    }//GEN-LAST:event_kullanicilar_tabloMouseClicked

    private void btn_sayfayagitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sayfayagitActionPerformed
      
        
      
        String kulllanici= takip_kullaniciad.getText();
        String tip=uyeliik_tur.getText();
      
        if(tip.equals("normal")){
            System.out.println("nothing");
        }
        else {
       
        PremiumKullaniciEkrani premiumKullaniciEkrani=new PremiumKullaniciEkrani(kulllanici,idSorgusu(kulllanici, tip),id,ad);
        premiumKullaniciEkrani.setVisible(true);
        this.setVisible(false);
        OnerilenSarkilar onerilenSarkilar=new OnerilenSarkilar();
        onerilenSarkilar.setVisible(false);
            
        }
        
       
      
    }//GEN-LAST:event_btn_sayfayagitActionPerformed

    private void btn_sarkiDinleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sarkiDinleActionPerformed
        String dinlenme_sayi=dinlenmeadi.getText();
        String sarki_ad=sarkiadalani.getText();
        String sanatci_ad=sanatciadalani.getText();
        String tur_ad=turadalani.getText();
      
       dinlenmeadi.setText(dinlenmeadi.getText());
        dinlenmeSayisiArtır(sarkiSorgusu(sarki_ad, sanatci_ad, tur_ad));
      
        dinlenmesayisi.setText(String.valueOf(dinlenmeGetir(sarki_ad, sanatci_ad, tur_ad)));
        
        
         popCalmaDoldur();
        jazzCalmaDoldur();
        klasikCalmaDoldur();



    }//GEN-LAST:event_btn_sarkiDinleActionPerformed

    private void takipedilenler_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takipedilenler_tabloMouseClicked
       
         int selectedRow=takipedilenler_tablo.getSelectedRow();
        
        takip_kullaniciad.setText(model5.getValueAt(selectedRow, 0).toString());
        uyeliik_tur.setText(model5.getValueAt(selectedRow, 1).toString());
        

        
    }//GEN-LAST:event_takipedilenler_tabloMouseClicked

    private void pop_calmaListesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop_calmaListesiMouseClicked
        int selectedRow=pop_calmaListesi.getSelectedRow();
        
        dinlenmeadi.setText(model.getValueAt(selectedRow, 1).toString());
        dinlenmesayisi.setText(model.getValueAt(selectedRow, 4).toString());
        sarkiadalani.setText(model.getValueAt(selectedRow, 1).toString());
        sanatciadalani.setText(model.getValueAt(selectedRow, 2).toString());
        turadalani.setText("pop");
        
    }//GEN-LAST:event_pop_calmaListesiMouseClicked

    private void jazz_calmalistesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazz_calmalistesiMouseClicked
        int selectedRow=jazz_calmalistesi.getSelectedRow();
        
        dinlenmeadi.setText(model1.getValueAt(selectedRow, 1).toString());
        dinlenmesayisi.setText(model1.getValueAt(selectedRow, 4).toString());
        sarkiadalani.setText(model1.getValueAt(selectedRow, 1).toString());
        sanatciadalani.setText(model1.getValueAt(selectedRow, 2).toString());
        turadalani.setText("jazz");
      
    }//GEN-LAST:event_jazz_calmalistesiMouseClicked

    private void klasik_calmalistesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klasik_calmalistesiMouseClicked
        int selectedRow=klasik_calmalistesi.getSelectedRow();
        
        dinlenmeadi.setText(model2.getValueAt(selectedRow, 1).toString());
        dinlenmesayisi.setText(model2.getValueAt(selectedRow, 4).toString());
        sarkiadalani.setText(model2.getValueAt(selectedRow, 1).toString());
        sanatciadalani.setText(model2.getValueAt(selectedRow, 2).toString());
        turadalani.setText("klasik");
      
    }//GEN-LAST:event_klasik_calmalistesiMouseClicked

    public void dinlenmeSayisiArtır(int x){
        
        String sorgu="Update sarki set dinlenme_sayisi=dinlenme_sayisi+1 where idSarki= ?";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, x);
            
             preparedStatement.executeUpdate();
         
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public int dinlenmeGetir(String sarki,String sanatci,String tur){
        
        
       int abc = 0;
        
       
         try {
             statement=connection.createStatement();
             
             String sorgu="Select dinlenme_sayisi From sarki where Sarki_ad='"+ sarki+"' and sanatci='"+sanatci+"' and tur='"+tur+"'";

             
             ResultSet rs=statement.executeQuery(sorgu);

             while(rs.next()){
                 
                 abc=rs.getInt("dinlenme_sayisi");
                 
             }
             
             return abc;
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
         }
        
    }
    
    
    
    public  int idSorgusu(String ad,String tur){
        
          int id =0;
       
         try {
             statement=connection.createStatement();
             
             String sorgu="Select idKullanici From kullanici where kullanici_ad='"+ad+"' and abonelik_tur='"+tur+"'";

             
             ResultSet rs=statement.executeQuery(sorgu);

             while(rs.next()){
                 
                 id=rs.getInt("idKullanici");
                 
             }
             
             return id;
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
         }
       
    }
    
     public int sarkiSorgusu(String sarki,String sanatci,String tur){
        int abc = 0;
        
       
         try {
             statement=connection.createStatement();
             
             String sorgu="Select idSarki From sarki where Sarki_ad='"+ sarki+"' and sanatci='"+sanatci+"' and tur='"+tur+"'";

             
             ResultSet rs=statement.executeQuery(sorgu);

             while(rs.next()){
                 
                 abc=rs.getInt("idSarki");
                 
             }
             
             return abc;
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
         }
    
   }
    
     public boolean Kontrol(int x,int kullanici_id){
        
        String sorgu="Select Distinct sarki_id,kullanici_id from calma_listesi ";
     
         try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("sarki_id").equals(String.valueOf(x)) && rs.getString("kullanici_id").equals(String.valueOf(kullanici_id))){
                     
                     return true;
                     
                 }
               
             }
                      
             return false;
                        
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
              
    }
     public  ArrayList<TakipEdilenler> takipedilenId(){
  
         int takipedilen_id=0;
       // String sorgu="Select * From takiplesme Where takipeden_id= ? ";
         ArrayList<TakipEdilenler> liste=new ArrayList<TakipEdilenler>();
         String sorgu="Select * From takiplesme Where takipeden_id = "+KullaniciEkrani.id+" ";

        try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
            
            while(rs.next()){
                takipedilen_id=rs.getInt("takipedilen_id");
                 liste.add(new TakipEdilenler(takipedilen_id));
                
                
            }
           takıpedilenler=liste;
            return liste;
            
        } catch (SQLException ex) {
            System.out.println("hatalıı");
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
         
      
         
     }
    
   
     public void takipedlienDoldur(){
               
         model5.setRowCount(0);
         
             
         ArrayList<TakipEdilenler> liste=new ArrayList<TakipEdilenler>();
         liste=kullaniciIslemleri.takipedlienGetir(takipedilenId());
        
        if(liste!=null){
            for (TakipEdilenler takipci : liste) {
                Object[] ekle={takipci.getAd(),takipci.getTur()};
               
          
             model5.addRow(ekle);
            }
            
        }
        
    } 
  
    
    
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
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new KullaniciEkrani(id,ad).setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_labeli;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JToggleButton btn_sarkiDinle;
    private javax.swing.JButton btn_sarkiekle;
    private javax.swing.JButton btn_sayfayagit;
    private javax.swing.JLabel dinlenmeadi;
    private javax.swing.JLabel dinlenmesayisi;
    private javax.swing.JLabel id_labeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jazz_calmalistesi;
    private javax.swing.JTable klasik_calmalistesi;
    private javax.swing.JTable kullanicilar_tablo;
    private javax.swing.JLabel kullanıcı_adlabel;
    private javax.swing.JTable pop_calmaListesi;
    private javax.swing.JLabel sanatciadalani;
    private javax.swing.JTable sarki_tablo;
    private javax.swing.JLabel sarkiadalani;
    private javax.swing.JLabel takip_kullaniciad;
    private javax.swing.JTable takipedilenler_tablo;
    private javax.swing.JLabel turadalani;
    private javax.swing.JLabel uyeliik_tur;
    // End of variables declaration//GEN-END:variables
}
