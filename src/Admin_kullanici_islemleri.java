
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


public class Admin_kullanici_islemleri extends javax.swing.JFrame {

    DefaultTableModel model;
     BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
    
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
     
    
    public Admin_kullanici_islemleri() {
        initComponents();
        this.setBounds(100, 100, 1480, 860);
        this.setTitle("Admin kullanici islemleri");
        
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
        
        
        
         model=(DefaultTableModel)Kullanicilar_tablo.getModel();
         kullaniciGoster();
    }
    
    public void  dinamikAra(String ara){
        
     TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
   
    Kullanicilar_tablo.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(ara));
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Id_alani = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Kullanicilar_tablo = new javax.swing.JTable();
        ad_alani = new javax.swing.JTextField();
        email_alani = new javax.swing.JTextField();
        arama_cubuğu = new javax.swing.JTextField();
        sifre_alani = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tur_alani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ulke_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_ekle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_geridon = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        odendi_mi = new javax.swing.JTextField();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_sil.setText("Kullanıcı Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil);
        btn_sil.setBounds(739, 223, 240, 23);

        jLabel5.setText("Kullanıcı sifre:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 290, 80, 14);

        btn_guncelle.setText("Kullanıcı Guncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guncelle);
        btn_guncelle.setBounds(739, 264, 240, 23);

        jLabel6.setText("Kullanıcı tür:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 330, 90, 14);
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(238, 441, 457, 40);

        jLabel7.setText("Kullanıcı ülke:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 370, 90, 20);

        Id_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_alaniActionPerformed(evt);
            }
        });
        getContentPane().add(Id_alani);
        Id_alani.setBounds(318, 159, 348, 30);

        Kullanicilar_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idKullanici", "kullanici_ad", "email", "sifre", "abonelik_tur", "kullanici_ulke", "odendi_mi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Kullanicilar_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kullanicilar_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Kullanicilar_tablo);
        if (Kullanicilar_tablo.getColumnModel().getColumnCount() > 0) {
            Kullanicilar_tablo.getColumnModel().getColumn(0).setResizable(false);
            Kullanicilar_tablo.getColumnModel().getColumn(1).setResizable(false);
            Kullanicilar_tablo.getColumnModel().getColumn(2).setResizable(false);
            Kullanicilar_tablo.getColumnModel().getColumn(3).setResizable(false);
            Kullanicilar_tablo.getColumnModel().getColumn(4).setResizable(false);
            Kullanicilar_tablo.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(246, 486, 945, 316);
        getContentPane().add(ad_alani);
        ad_alani.setBounds(318, 198, 348, 30);
        getContentPane().add(email_alani);
        email_alani.setBounds(318, 236, 348, 30);

        arama_cubuğu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuğuKeyReleased(evt);
            }
        });
        getContentPane().add(arama_cubuğu);
        arama_cubuğu.setBounds(321, 112, 864, 30);
        getContentPane().add(sifre_alani);
        sifre_alani.setBounds(318, 286, 348, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel8.setText("KULLANICI İŞLEMLERİ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 10, 597, 73);

        jLabel1.setText("Arama Çubuğu :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 115, 100, 14);
        getContentPane().add(tur_alani);
        tur_alani.setBounds(318, 321, 348, 30);

        jLabel2.setText("Kullanıcı Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 160, 70, 14);
        getContentPane().add(ulke_alani);
        ulke_alani.setBounds(318, 362, 350, 30);

        jLabel3.setText("Kullanıcı Ad:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 201, 80, 14);

        btn_ekle.setText("Kullanıcı Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle);
        btn_ekle.setBounds(739, 184, 240, 23);

        jLabel4.setText("Kullanıcı email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 239, 90, 14);

        btn_geridon.setText("Admin Panele Geri Dön");
        btn_geridon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geridonActionPerformed(evt);
            }
        });
        getContentPane().add(btn_geridon);
        btn_geridon.setBounds(736, 369, 240, 23);

        jLabel9.setText("Odendi_mi:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 410, 70, 14);
        getContentPane().add(odendi_mi);
        odendi_mi.setBounds(318, 403, 350, 30);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/adminkullaniciislemleri.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1460, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed

        mesaj_yazisi.setText("");

        int selectedRow=Kullanicilar_tablo.getSelectedRow();

        if(selectedRow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("kullanici tablosu bos");

            }else{
                mesaj_yazisi.setText("Lutfen sılınecek bir kullanici secın");
            }
        }else{

            int id=(int)model.getValueAt(selectedRow,0);
            baglantiIslemleri.kullaniciSil(id);
            baglantiIslemleri.calmalistesiKullaniciSil(id);

            kullaniciGoster();
            mesaj_yazisi.setText("kullanici başarıyla silindi");

        }
        kullaniciGoster();

    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        String ad=ad_alani.getText();
        String email=email_alani.getText();
        String sifre=sifre_alani.getText();
        String abonelik_tur=tur_alani.getText();
        String ulke=ulke_alani.getText();

        int selectedrow=Kullanicilar_tablo.getSelectedRow();

        if(selectedrow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("kullanici tablosu boş");
            }else{
                mesaj_yazisi.setText("lutfen guncellenecek kullanıcıyı secınız");
            }
        }else{

            int id=(int)model.getValueAt(selectedrow, 0);

            baglantiIslemleri.kullaniciGuncelle(id,ad,email,sifre,abonelik_tur,ulke);

            kullaniciGoster();

            mesaj_yazisi.setText("kullanici basarıyla Guncellendi....");

        }
        kullaniciGoster();

    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void Kullanicilar_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kullanicilar_tabloMouseClicked

        int selectedRow=Kullanicilar_tablo.getSelectedRow();

        Id_alani.setText(model.getValueAt(selectedRow,0).toString());
        ad_alani.setText(model.getValueAt(selectedRow,1).toString());
        email_alani.setText(model.getValueAt(selectedRow,2).toString());
        sifre_alani.setText(model.getValueAt(selectedRow,3).toString());
        tur_alani.setText(model.getValueAt(selectedRow,4).toString());
        ulke_alani.setText(model.getValueAt(selectedRow,5).toString());
        odendi_mi.setText(model.getValueAt(selectedRow,6).toString());

    }//GEN-LAST:event_Kullanicilar_tabloMouseClicked

    private void arama_cubuğuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuğuKeyReleased

        String ara=arama_cubuğu.getText();

        dinamikAra(ara);

    }//GEN-LAST:event_arama_cubuğuKeyReleased

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed

        mesaj_yazisi.setText("");

        int id=Integer.parseInt(Id_alani.getText());
        String ad=ad_alani.getText();
        String email=email_alani.getText();
        String sifre=sifre_alani.getText();
        String abonelik_tur=tur_alani.getText();
        String ulke=ulke_alani.getText();
        String odendi_mi=this.odendi_mi.getText();
        boolean dorumu=Kontrol(id, email);
        if(!dorumu){
            
             baglantiIslemleri.kullaniciEkle(ad,email,sifre,abonelik_tur,ulke,odendi_mi);
              mesaj_yazisi.setText("Yeni kullanici başarıyla eklendi");
        }else{
            
         mesaj_yazisi.setText("Böyle birisi eklenemez");
        }

        kullaniciGoster();

       

    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_geridonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geridonActionPerformed

        this.setVisible(false);
        AdminEkrani adminEkrani=new AdminEkrani(this, true);
        adminEkrani.setVisible(true);
    }//GEN-LAST:event_btn_geridonActionPerformed

    private void Id_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_alaniActionPerformed

     public boolean Kontrol(int x,String email){
        
        String sorgu="Select Distinct email,idKullanici from kullanici ";
     
         try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("idKullanici").equals(String.valueOf(x)) && rs.getString("email").equals(String.valueOf(email))){
                     
                     return true;
                     
                 }
               
             }
                      
             return false;
                        
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
              
    }
    
    
    public void kullaniciGoster(){
         model.setRowCount(0);
         
         ArrayList<Kullanicilar> kullanicilar=new ArrayList<Kullanicilar>();
         kullanicilar=baglantiIslemleri.kullanicilariGetir();
        if(kullanicilar!=null){
            for (Kullanicilar kullanici : kullanicilar) {
                Object[] ekle={kullanici.getId(),kullanici.getKullaniciad(),kullanici.getEmail(),kullanici.getSifre(),kullanici.getAboneliktur(),kullanici.getKullaniciulke(),kullanici.getOdendi_mi()};
          
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
            java.util.logging.Logger.getLogger(Admin_kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_kullanici_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_alani;
    private javax.swing.JTable Kullanicilar_tablo;
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubuğu;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_geridon;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JTextField email_alani;
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
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField odendi_mi;
    private javax.swing.JTextField sifre_alani;
    private javax.swing.JTextField tur_alani;
    private javax.swing.JTextField ulke_alani;
    // End of variables declaration//GEN-END:variables
}
