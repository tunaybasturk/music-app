
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


public class Admin_sarki_islemleri extends javax.swing.JFrame {

      DefaultTableModel model;
     BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
    
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    
   
    public Admin_sarki_islemleri() {
        initComponents();
        this.setBounds(100, 100, 1340, 860);
        this.setTitle("Admin sarki islemleri");
       
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
       SarkiGoster();
    }
    
     public void  dinamikAra(String ara){
        
     TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
   
    Sarkilar_tablo.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(ara));
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tarih = new javax.swing.JTextField();
        arama_cubuğu = new javax.swing.JTextField();
        sanatci = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        album_alani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tur_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_ekle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_sil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Id_sarki = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sarkilar_tablo = new javax.swing.JTable();
        ad_sarkiad = new javax.swing.JTextField();
        btn_geridon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sure_alani = new javax.swing.JTextField();
        dinlenmesayisi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(tarih);
        tarih.setBounds(187, 194, 348, 30);

        arama_cubuğu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuğuKeyReleased(evt);
            }
        });
        getContentPane().add(arama_cubuğu);
        arama_cubuğu.setBounds(187, 75, 864, 30);
        getContentPane().add(sanatci);
        sanatci.setBounds(187, 240, 348, 30);

        jLabel1.setText("Arama Çubuğu :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 78, 110, 14);
        getContentPane().add(album_alani);
        album_alani.setBounds(187, 281, 348, 30);

        jLabel2.setText("idSarki :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 116, 100, 14);
        getContentPane().add(tur_alani);
        tur_alani.setBounds(187, 322, 350, 30);

        jLabel3.setText("Sarki_ad :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 156, 100, 14);

        btn_ekle.setText("Şarkı Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle);
        btn_ekle.setBounds(605, 113, 240, 23);

        jLabel4.setText("tarih :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 197, 100, 14);

        btn_sil.setText("Şarkı Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil);
        btn_sil.setBounds(605, 152, 240, 23);

        jLabel5.setText("sanatci :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 243, 100, 14);

        btn_guncelle.setText("Şarkı Guncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guncelle);
        btn_guncelle.setBounds(605, 193, 240, 23);

        jLabel6.setText("album :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 284, 100, 14);
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(97, 446, 457, 25);

        jLabel7.setText("tur :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 335, 100, 14);

        Id_sarki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_sarkiActionPerformed(evt);
            }
        });
        getContentPane().add(Id_sarki);
        Id_sarki.setBounds(187, 113, 348, 30);

        Sarkilar_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idSarki", "Sarki_ad", "tarih", "sanatci", "album", "tur", "sure", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            Sarkilar_tablo.getColumnModel().getColumn(1).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(2).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(3).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(4).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(5).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(6).setResizable(false);
            Sarkilar_tablo.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 480, 1190, 316);
        getContentPane().add(ad_sarkiad);
        ad_sarkiad.setBounds(187, 153, 348, 30);

        btn_geridon.setText("Admin Panele Geri Dön");
        btn_geridon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geridonActionPerformed(evt);
            }
        });
        getContentPane().add(btn_geridon);
        btn_geridon.setBounds(605, 331, 240, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("ŞARKI İŞLEMLERİ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(408, 13, 370, 44);
        getContentPane().add(sure_alani);
        sure_alani.setBounds(187, 362, 350, 30);

        dinlenmesayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinlenmesayisiActionPerformed(evt);
            }
        });
        getContentPane().add(dinlenmesayisi);
        dinlenmesayisi.setBounds(187, 405, 350, 30);

        jLabel9.setText("sure :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 370, 110, 14);

        jLabel10.setText("dinlenme_sayisi :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 420, 110, 14);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/adminsarkiislemleri.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1330, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuğuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuğuKeyReleased

        String ara=arama_cubuğu.getText();

        dinamikAra(ara);

    }//GEN-LAST:event_arama_cubuğuKeyReleased

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed

        mesaj_yazisi.setText("");

        //int id=Integer.parseInt(Id_alani.getText());
      
         String  Sarki_ad=ad_sarkiad.getText();
         String  tarih=this.tarih.getText();
         String  sanatci=this.sanatci.getText();
         String  album=album_alani.getText();
         String  tur=tur_alani.getText();
         String  sure=sure_alani.getText();
         int dinlenmeSayisi=Integer.parseInt(dinlenmesayisi.getText());
         boolean doru=Kontrol(Sarki_ad, tarih, sanatci, album, tur);
         boolean doru2=Kontrol2(Sarki_ad,album);
         boolean doru3=Kontrol3(tur,album);
         
        if(!doru){
            if(!doru2)
            {
                if(doru3){
                baglantiIslemleri.sarkiEkle(Sarki_ad,tarih,sanatci,album,tur,sure,dinlenmeSayisi);
                baglantiIslemleri.albumeSarkiEkle(Sarki_ad,tarih,sanatci,album,tur);
                mesaj_yazisi.setText("Yeni sarki başarıyla eklendi");

                }else{
                    
                     mesaj_yazisi.setText("Eklemek istediğiniz sarkının turu ıle Albumun turu uyuşmamaktadır.");

                }
                          
            }
            else {
             mesaj_yazisi.setText("Bir sarki birden fazla albumde yer alamaz");

            }
            
        }else
         
        {
           mesaj_yazisi.setText("Bu sarki sarkı tablosunda mevcut");

        }
           
        SarkiGoster();
     
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed

        mesaj_yazisi.setText("");

        int selectedRow=Sarkilar_tablo.getSelectedRow();

        if(selectedRow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sarki tablosu bos");

            }else{
                mesaj_yazisi.setText("Lutfen sılınecek bir sarkiyi secın");
            }
        }else{

         int id=(int)model.getValueAt(selectedRow,0);
         String  Sarki_ad=model.getValueAt(selectedRow,1).toString();
         String  tarih=model.getValueAt(selectedRow,2).toString();
         String  sanatci=model.getValueAt(selectedRow,3).toString();
         String  album=model.getValueAt(selectedRow,4).toString();
         String  tur=model.getValueAt(selectedRow,5).toString();

            
            
            baglantiIslemleri.sarkiSil(id);
            baglantiIslemleri.albumdenSarkiSil(album,sanatci,Sarki_ad,tarih,tur);
        
            SarkiGoster();
            mesaj_yazisi.setText("sarki başarıyla silindi");

        }

    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

         String  Sarki_ad=ad_sarkiad.getText();
         String  tarih=this.tarih.getText();
         String  sanatci=this.sanatci.getText();
         String  album=album_alani.getText();
         String  tur=tur_alani.getText();
         String  sure=sure_alani.getText();
         int dinlenmeSayisi=Integer.parseInt(dinlenmesayisi.getText());

        int selectedrow=Sarkilar_tablo.getSelectedRow();

        if(selectedrow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sarki tablosu boş");
            }else{
                mesaj_yazisi.setText("lutfen guncellenecek sarkiyi secınız");
            }
        }else{

            int id=(int)model.getValueAt(selectedrow, 0);

            baglantiIslemleri.sarkiGuncelle(id,Sarki_ad,tarih,sanatci,album,tur,sure,dinlenmeSayisi);
            baglantiIslemleri.albumdenSarkiGuncelle(album,sanatci,Sarki_ad,tarih,tur);

            SarkiGoster();

            mesaj_yazisi.setText("sarki basarıyla Guncellendi....");

        }

    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void Sarkilar_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sarkilar_tabloMouseClicked

        int selectedRow=Sarkilar_tablo.getSelectedRow();

        Id_sarki.setText(model.getValueAt(selectedRow,0).toString());
        ad_sarkiad.setText(model.getValueAt(selectedRow,1).toString());
        tarih.setText(model.getValueAt(selectedRow,2).toString());
        sanatci.setText(model.getValueAt(selectedRow,3).toString());
        album_alani.setText(model.getValueAt(selectedRow,4).toString());
        tur_alani.setText(model.getValueAt(selectedRow,5).toString());
        sure_alani.setText(model.getValueAt(selectedRow, 6).toString());
        dinlenmesayisi.setText(model.getValueAt(selectedRow, 7).toString());

    }//GEN-LAST:event_Sarkilar_tabloMouseClicked

    private void btn_geridonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geridonActionPerformed
      
        this.setVisible(false);
        AdminEkrani adminEkrani=new AdminEkrani(this, true);
        adminEkrani.setVisible(true);
        
    }//GEN-LAST:event_btn_geridonActionPerformed

    private void Id_sarkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_sarkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_sarkiActionPerformed

    private void dinlenmesayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinlenmesayisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dinlenmesayisiActionPerformed

    public boolean Kontrol(String sarkiad, String tarih,String sanatciad,String album,String tur){
        
         String sorgu="Select Sarki_ad,tarih,sanatci,album,tur from sarki ";
     
         try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("Sarki_ad").equals(sarkiad) && rs.getString("tarih").equals(tarih) && rs.getString("sanatci").equals(sanatciad) && rs.getString("album").equals(album) && rs.getString("tur").equals(tur)){
                     
                     return true;
                     
                 }
               
             }
                      
             return false;
                        
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
    }
     public boolean Kontrol2(String sarkiad,String album){
        
         String sorgu="Select * from sarki Where Sarki_ad='"+sarkiad+"'";
     
         try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("Sarki_ad").equals(sarkiad) && !(rs.getString("album").equals(album))){
                     
                     return true;
                     
                 }
               
             }
                      
             return false;
                        
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
    }
     public boolean Kontrol3(String tur,String album){
        
         String sorgu="Select * from album Where album_adi='"+album+"'";
     
         try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("album_adi").equals(album) && rs.getString("album_tur").equals(tur)){
                     
                     return true;
                     
                 }
               
             }
                      
             return false;
                        
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
    }
    
    
     public void SarkiGoster(){
         model.setRowCount(0);
         
         ArrayList<Sarkilar> sarkilar=new ArrayList<Sarkilar>();
         sarkilar=baglantiIslemleri.sarkilariGetir();
        if(sarkilar!=null){
            for (Sarkilar sarki : sarkilar) {
                Object[] ekle={sarki.getIdSarki(),sarki.getSarki_ad(),sarki.getTarih(),sarki.getSanatci(),sarki.getAlbum(),sarki.getTur(),sarki.getSure(),sarki.getDinlenmeSayisi()};
          
             model.addRow(ekle);
            }
            
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
            java.util.logging.Logger.getLogger(Admin_sarki_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_sarki_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_sarki_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_sarki_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_sarki_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_sarki;
    private javax.swing.JTable Sarkilar_tablo;
    private javax.swing.JTextField ad_sarkiad;
    private javax.swing.JTextField album_alani;
    private javax.swing.JTextField arama_cubuğu;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_geridon;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JTextField dinlenmesayisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sanatci;
    private javax.swing.JTextField sure_alani;
    private javax.swing.JTextField tarih;
    private javax.swing.JTextField tur_alani;
    // End of variables declaration//GEN-END:variables
}
