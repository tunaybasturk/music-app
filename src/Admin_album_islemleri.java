
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


public class Admin_album_islemleri extends javax.swing.JFrame {

    
    DefaultTableModel model;
    BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
    
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;

    
    public Admin_album_islemleri() {
        initComponents();
        this.setBounds(100, 100, 1330, 860);
        this.setTitle("Admin album islemleri");
        
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
        
        
        model=(DefaultTableModel)album_tablo.getModel();
        albumGoster();
    }

     public void  dinamikAra(String ara){
        
     TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
   
    album_tablo.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(ara));
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ekle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_sil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Id_album = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        album_tablo = new javax.swing.JTable();
        ad_album = new javax.swing.JTextField();
        btn_geridon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        album_sanatci = new javax.swing.JTextField();
        arama_cubuğu = new javax.swing.JTextField();
        album_sarki = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        album_tarih = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        album_tur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_ekle.setText("Albüm Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle);
        btn_ekle.setBounds(605, 111, 240, 30);

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("album_sanatci:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 195, 110, 14);

        btn_sil.setText("Albüm Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil);
        btn_sil.setBounds(605, 150, 240, 30);

        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("album_sarki:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 241, 110, 14);

        btn_guncelle.setText("Albüm Guncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guncelle);
        btn_guncelle.setBounds(605, 191, 240, 30);

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("album_tarih:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 282, 100, 14);
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(100, 374, 457, 40);

        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("album_tur:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 333, 100, 14);
        getContentPane().add(Id_album);
        Id_album.setBounds(190, 111, 348, 30);

        album_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idalbum", "album_adi", "album_sanatci", "album_sarki", "album_tarih", "album_tur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        album_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                album_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(album_tablo);
        if (album_tablo.getColumnModel().getColumnCount() > 0) {
            album_tablo.getColumnModel().getColumn(0).setResizable(false);
            album_tablo.getColumnModel().getColumn(1).setResizable(false);
            album_tablo.getColumnModel().getColumn(2).setResizable(false);
            album_tablo.getColumnModel().getColumn(3).setResizable(false);
            album_tablo.getColumnModel().getColumn(4).setResizable(false);
            album_tablo.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(91, 432, 1165, 316);
        getContentPane().add(ad_album);
        ad_album.setBounds(190, 151, 348, 30);

        btn_geridon.setText("Admin Panele Geri Dön");
        btn_geridon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geridonActionPerformed(evt);
            }
        });
        getContentPane().add(btn_geridon);
        btn_geridon.setBounds(605, 322, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("ALBUM İŞLEMLERİ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 10, 296, 44);
        getContentPane().add(album_sanatci);
        album_sanatci.setBounds(190, 192, 348, 30);

        arama_cubuğu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuğuKeyReleased(evt);
            }
        });
        getContentPane().add(arama_cubuğu);
        arama_cubuğu.setBounds(187, 73, 864, 30);

        album_sarki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                album_sarkiActionPerformed(evt);
            }
        });
        getContentPane().add(album_sarki);
        album_sarki.setBounds(190, 230, 348, 30);

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Arama Çubuğu :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 80, 120, 14);
        getContentPane().add(album_tarih);
        album_tarih.setBounds(190, 269, 348, 30);

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Album Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 100, 14);
        getContentPane().add(album_tur);
        album_tur.setBounds(190, 320, 350, 30);

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("album_adi:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 154, 110, 14);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/adminalbumislemleri.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1310, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed

        mesaj_yazisi.setText("");

        int id=Integer.parseInt(this.Id_album.getText());
        String  album_ad=ad_album.getText();
        String  album_sanatci=this.album_sanatci.getText();
        String  album_sarki=this.album_sarki.getText();
        String  album_tarih=this.album_tarih.getText();
        String  album_tur=this.album_tur.getText();
        
        boolean doru=Kontrol(album_ad);
        
        if(!doru){
             baglantiIslemleri.albumEkle(album_ad,album_sanatci,album_sarki,album_tarih,album_tur);
            
             mesaj_yazisi.setText("Yeni album başarıyla eklendi");
        }

        albumGoster();
        mesaj_yazisi.setText("Boyle bir album zaten var");
        
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed

        mesaj_yazisi.setText("");

        int selectedRow=album_tablo.getSelectedRow();

        if(selectedRow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sarki tablosu bos");

            }else{
                mesaj_yazisi.setText("Lutfen sılınecek bir sarkiyi secın");
            }
        }else{

            int id=Integer.parseInt(Id_album.getText());
            String album_adi=ad_album.getText();
            baglantiIslemleri.sarkidanAlbumuSil(id);
            baglantiIslemleri.albumSil(album_adi);
           

            albumGoster();
            mesaj_yazisi.setText("sarki başarıyla silindi");

        }
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        int id=Integer.parseInt(this.Id_album.getText());
        String  album_ad=ad_album.getText();
        String  album_sanatci=this.album_sanatci.getText();
        String  album_sarki=this.album_sarki.getText();
        String  album_tarih=this.album_tarih.getText();
        String  album_tur=this.album_tur.getText();
       

        int selectedrow=album_tablo.getSelectedRow();

        String eskialbum=model.getValueAt(selectedrow, 1).toString();
        String eski_sanatci=model.getValueAt(selectedrow, 2).toString();
        String eskisarkiad=model.getValueAt(selectedrow,3).toString();
        if(selectedrow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sarki tablosu boş");
            }else{
                mesaj_yazisi.setText("lutfen guncellenecek sarkiyi secınız");
            }
        }else{


           baglantiIslemleri.albumGuncelle(id,album_ad,album_sanatci,album_sarki,album_tarih,album_tur);
           baglantiIslemleri.sarkiAlbumGuncelle(album_ad,album_sanatci,album_sarki,eskialbum,eski_sanatci,eskisarkiad);

            albumGoster();

            mesaj_yazisi.setText("sarki basarıyla Guncellendi....");

        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void album_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_album_tabloMouseClicked

        int selectedRow=album_tablo.getSelectedRow();

        Id_album.setText(model.getValueAt(selectedRow,0).toString());
        ad_album.setText(model.getValueAt(selectedRow,1).toString());
        album_sanatci.setText(model.getValueAt(selectedRow,2).toString());
        album_sarki.setText(model.getValueAt(selectedRow,3).toString());
        album_tarih.setText(model.getValueAt(selectedRow,4).toString());
        album_tur.setText(model.getValueAt(selectedRow,5).toString());
       
    }//GEN-LAST:event_album_tabloMouseClicked

    private void btn_geridonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geridonActionPerformed

        this.setVisible(false);
        AdminEkrani adminEkrani=new AdminEkrani(this, true);
        adminEkrani.setVisible(true);

    }//GEN-LAST:event_btn_geridonActionPerformed

    private void arama_cubuğuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuğuKeyReleased

        String ara=arama_cubuğu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuğuKeyReleased

    private void album_sarkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_album_sarkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_album_sarkiActionPerformed

     public boolean Kontrol(String ad){
        
        String sorgu="Select * From album";
        
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             
             ResultSet rs=preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("album_adi").equals(ad)){
                     
                     
                     return true;
                 }
                 
                 
             }
             return false;
         } catch (SQLException ex) {
             Logger.getLogger(Admin_sanatci_islemleri.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }       
        
    }
    
    
    
    public void albumGoster(){
         model.setRowCount(0);
         
         ArrayList<Album> albumler=new ArrayList<Album>();
         albumler=baglantiIslemleri.albumleriGetir();
        if(albumler!=null){
            for (Album album : albumler) {
                Object[] ekle={album.getIdalbum(),album.getAlbum_adi(),album.getAlbum_sanatci(),album.getAlbum_sarki(),album.getAlbum_tarih(),album.getAlbum_tur()};
          
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
            java.util.logging.Logger.getLogger(Admin_album_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_album_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_album_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_album_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_album_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_album;
    private javax.swing.JTextField ad_album;
    private javax.swing.JTextField album_sanatci;
    private javax.swing.JTextField album_sarki;
    private javax.swing.JTable album_tablo;
    private javax.swing.JTextField album_tarih;
    private javax.swing.JTextField album_tur;
    private javax.swing.JTextField arama_cubuğu;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_geridon;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    // End of variables declaration//GEN-END:variables
}
