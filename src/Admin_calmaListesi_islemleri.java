
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class Admin_calmaListesi_islemleri extends javax.swing.JFrame {

      DefaultTableModel model;
      DefaultTableModel model1;
      DefaultTableModel model2;
     BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
  
     private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
     
     private  int kullaniciid;

    public int getKullanici_id() {
        return kullaniciid;
    }

    public void setKullanici_id(int kullaniciid) {
        this.kullaniciid = kullaniciid;
    }
     
    
    public Admin_calmaListesi_islemleri() {
        initComponents();
        this.setBounds(100,100, 1700, 880);
        this.setTitle("Admin calmaListesi islemleri");
        
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
        
        
        
         model=(DefaultTableModel)Sarkilar_tablo.getModel();
         model1=(DefaultTableModel)kullanicid_tablo.getModel();   
         model2=(DefaultTableModel)sarkilarintablosu.getModel();   
       KullanicilariGoster();
       SarkilariGoster();
    }
    
     public void  dinamikAra(String ara){
        
     TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
   
    Sarkilar_tablo.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(ara));
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calmaListesi_tur = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ekle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_sil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sarkilar_tablo = new javax.swing.JTable();
        kullanici_id = new javax.swing.JTextField();
        btn_geridon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sarki_id = new javax.swing.JTextField();
        arama_cubuğu = new javax.swing.JTextField();
        idalani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kullanicid_tablo = new javax.swing.JTable();
        btn_calmaListesi = new javax.swing.JToggleButton();
        sarki_ad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sarkilarintablosu = new javax.swing.JTable();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(calmaListesi_tur);
        calmaListesi_tur.setBounds(500, 310, 348, 30);

        jLabel1.setText("Arama Çubuğu :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 80, 120, 14);

        jLabel3.setText("Kullanıcı id:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 280, 110, 14);

        btn_ekle.setText("Şarkı Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle);
        btn_ekle.setBounds(909, 202, 240, 30);

        jLabel4.setText("sarki id:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 200, 110, 14);

        btn_sil.setText("Şarkı Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil);
        btn_sil.setBounds(909, 244, 240, 30);

        jLabel5.setText("calma listesi tur:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 320, 110, 14);

        btn_guncelle.setText("Şarkı Guncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guncelle);
        btn_guncelle.setBounds(909, 285, 240, 30);

        Sarkilar_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Sarki_id", "Sarki_ad", "calma_listesitur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Sarkilar_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sarkilar_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Sarkilar_tablo);
        if (Sarkilar_tablo.getColumnModel().getColumnCount() > 0) {
            Sarkilar_tablo.getColumnModel().getColumn(0).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(0).setPreferredWidth(1);
            Sarkilar_tablo.getColumnModel().getColumn(1).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(1).setPreferredWidth(1);
            Sarkilar_tablo.getColumnModel().getColumn(2).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(2).setPreferredWidth(110);
            Sarkilar_tablo.getColumnModel().getColumn(3).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 480, 1140, 270);
        getContentPane().add(kullanici_id);
        kullanici_id.setBounds(500, 270, 348, 30);

        btn_geridon.setText("Admin Panele Geri Dön");
        btn_geridon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geridonActionPerformed(evt);
            }
        });
        getContentPane().add(btn_geridon);
        btn_geridon.setBounds(909, 335, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("ÇALMA LİSTESİ İŞLEMLERİ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(462, 25, 431, 44);
        getContentPane().add(sarki_id);
        sarki_id.setBounds(500, 190, 348, 30);

        arama_cubuğu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cubuğuActionPerformed(evt);
            }
        });
        arama_cubuğu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuğuKeyReleased(evt);
            }
        });
        getContentPane().add(arama_cubuğu);
        arama_cubuğu.setBounds(312, 80, 864, 30);

        idalani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idalaniActionPerformed(evt);
            }
        });
        getContentPane().add(idalani);
        idalani.setBounds(500, 150, 348, 30);

        jLabel6.setText("Id:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 160, 60, 14);
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(451, 376, 585, 30);

        kullanicid_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kullanici_id", "kullanici_ad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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
        kullanicid_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanicid_tabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(kullanicid_tablo);
        if (kullanicid_tablo.getColumnModel().getColumnCount() > 0) {
            kullanicid_tablo.getColumnModel().getColumn(0).setResizable(false);
            kullanicid_tablo.getColumnModel().getColumn(0).setPreferredWidth(10);
            kullanicid_tablo.getColumnModel().getColumn(1).setResizable(false);
            kullanicid_tablo.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 140, 320, 282);

        btn_calmaListesi.setText("Seçilen Kişinin Çalma Listesini Görüntüle");
        btn_calmaListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calmaListesiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calmaListesi);
        btn_calmaListesi.setBounds(909, 154, 240, 30);
        getContentPane().add(sarki_ad);
        sarki_ad.setBounds(500, 230, 348, 30);

        jLabel7.setText("sarki ad:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 240, 110, 14);

        sarkilarintablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idSarki", "Sarki_ad", "sanatci", "album"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sarkilarintablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sarkilarintablosuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(sarkilarintablosu);
        if (sarkilarintablosu.getColumnModel().getColumnCount() > 0) {
            sarkilarintablosu.getColumnModel().getColumn(0).setResizable(false);
            sarkilarintablosu.getColumnModel().getColumn(1).setResizable(false);
            sarkilarintablosu.getColumnModel().getColumn(2).setResizable(false);
            sarkilarintablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1194, 80, 460, 670);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/admincalmalistesiislemleri.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1680, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed

        mesaj_yazisi.setText("");

        
        int sarki_id=Integer.parseInt(this.sarki_id.getText());
        String sarki_ad=this.sarki_ad.getText();
        int kullanici_id=Integer.parseInt(this.kullanici_id.getText());      
        String calmalistesi_tur=calmaListesi_tur.getText();
        
 
         boolean doru=Kontrol(sarki_id,kullanici_id);
          
            if(!doru){
        
        baglantiIslemleri.CalmaListesinesarkiEkle(kullanici_id,sarki_id,calmalistesi_tur);
         mesaj_yazisi.setText("Yeni sarki başarıyla eklendi");
       }           
        else
        {
            System.out.println("boyle bir şey olamaz");
             mesaj_yazisi.setText("Bu şarkı zaten eklenmiş");
        }
      
      
        CalmalistesiGoster(this.kullaniciid);
       
 
       
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed

        mesaj_yazisi.setText("");

        int selectedRow=Sarkilar_tablo.getSelectedRow();
        int sarki_id=Integer.parseInt(this.sarki_id.getText());

        if(selectedRow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("calma listesi bos");

            }else{
                mesaj_yazisi.setText("Lutfen sılınecek bir sarkiyi secın");
            }
        }else{

           
            baglantiIslemleri.CalmaListesindensarkiSil(this.kullaniciid,sarki_id);

            CalmalistesiGoster(this.kullaniciid);
            mesaj_yazisi.setText("sarki başarıyla calma listesinden silindi");

        }
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        
        
        
        int id=Integer.parseInt(idalani.getText());
        int kullanici_id=Integer.parseInt(this.kullanici_id.getText());
        int sarki_id=Integer.parseInt(this.sarki_id.getText());
        String sarki_ad=this.sarki_ad.getText();
        String calmalistesi_tur=calmaListesi_tur.getText();

        int selectedrow=Sarkilar_tablo.getSelectedRow();

        if(selectedrow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sarki tablosu boş");
            }else{
                mesaj_yazisi.setText("lutfen guncellenecek sarkiyi secınız");
            }
        }else{

         
            baglantiIslemleri.CalmaListesindesarkiGuncelle(sarki_id,sarki_ad,calmalistesi_tur);
            baglantiIslemleri.CalmaListesindeTurGuncelle(sarki_id, sarki_ad, calmalistesi_tur);

            CalmalistesiGoster(this.kullaniciid);

            mesaj_yazisi.setText("sarki basarıyla Guncellendi....");

        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void Sarkilar_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sarkilar_tabloMouseClicked

        int selectedRow=Sarkilar_tablo.getSelectedRow();

        idalani.setText(model.getValueAt(selectedRow,0).toString());
        sarki_id.setText(model.getValueAt(selectedRow,1).toString());
        sarki_ad.setText(model.getValueAt(selectedRow,2).toString());
        calmaListesi_tur.setText(model.getValueAt(selectedRow,3).toString());
       
    }//GEN-LAST:event_Sarkilar_tabloMouseClicked

    private void btn_geridonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geridonActionPerformed

        this.setVisible(false);
        AdminEkrani adminEkrani=new AdminEkrani(this, true);
        adminEkrani.setVisible(true);

    }//GEN-LAST:event_btn_geridonActionPerformed

    private void arama_cubuğuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuğuKeyReleased

        String ara=arama_cubuğu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuğuKeyReleased

    private void idalaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idalaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idalaniActionPerformed

    private void btn_calmaListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calmaListesiActionPerformed
       
         kullaniciid=Integer.parseInt(kullanici_id.getText());
         CalmalistesiGoster(kullaniciid);
        
    }//GEN-LAST:event_btn_calmaListesiActionPerformed

    private void kullanicid_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanicid_tabloMouseClicked
    
         int selectedRow=kullanicid_tablo.getSelectedRow();
         kullanici_id.setText(model1.getValueAt(selectedRow,0).toString());
         
        
    }//GEN-LAST:event_kullanicid_tabloMouseClicked

    private void arama_cubuğuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cubuğuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_cubuğuActionPerformed

    private void sarkilarintablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sarkilarintablosuMouseClicked
       
        int selectedRow=sarkilarintablosu.getSelectedRow();

        sarki_id.setText(model2.getValueAt(selectedRow,0).toString());
        sarki_ad.setText(model2.getValueAt(selectedRow,1).toString());
                
        calmaListesi_tur.setText(turdonen(Integer.parseInt(sarki_id.getText())));
       
    }//GEN-LAST:event_sarkilarintablosuMouseClicked

     public void CalmalistesiGoster(int kullanici_id){
         model.setRowCount(0);
         
         ArrayList<CalmaListesi> liste=new ArrayList<CalmaListesi>();
         liste=baglantiIslemleri.calmaListesiGetir(kullanici_id);
        if(liste!=null){
            for (CalmaListesi sarki : liste) {
                Object[] ekle={sarki.getId(),sarki.getSarkiid(),sarki.getSarkiad(),sarki.getCalmalistesi_tur()};
          
             model.addRow(ekle);
            }
            
        }
        
     }
       public void KullanicilariGoster(){
         model1.setRowCount(0);
         
         ArrayList<Kullanicilar> kullanicilar=new ArrayList<Kullanicilar>();
         kullanicilar=baglantiIslemleri.KullanicilariGetir();
        if(kullanicilar!=null){
            for (Kullanicilar liste : kullanicilar) {
                Object[] ekle={liste.getId(),liste.getKullaniciad()};
          
             model1.addRow(ekle);
            }
            
        }
        
     }
        public void SarkilariGoster(){
         model2.setRowCount(0);
         
         ArrayList<Sarkilar> sarkilar=new ArrayList<Sarkilar>();
         sarkilar=baglantiIslemleri.sarkilariGetir();
        if(sarkilar!=null){
            for (Sarkilar liste : sarkilar) {
                Object[] ekle={liste.getIdSarki(),liste.getSarki_ad(),liste.getSanatci(),liste.getAlbum()};
          
             model2.addRow(ekle);
            }
            
        }
        
     }
        public String turdonen(int sarki_id){
             
          return baglantiIslemleri.turGetir(sarki_id);
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
            java.util.logging.Logger.getLogger(Admin_calmaListesi_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_calmaListesi_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_calmaListesi_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_calmaListesi_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_calmaListesi_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Sarkilar_tablo;
    private javax.swing.JTextField arama_cubuğu;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JToggleButton btn_calmaListesi;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_geridon;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JTextField calmaListesi_tur;
    private javax.swing.JTextField idalani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kullanici_id;
    private javax.swing.JTable kullanicid_tablo;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sarki_ad;
    private javax.swing.JTextField sarki_id;
    private javax.swing.JTable sarkilarintablosu;
    // End of variables declaration//GEN-END:variables
}
