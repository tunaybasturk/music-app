
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class KullaniciGiris extends javax.swing.JFrame {

    KullaniciIslemleri kullaniciIslemleri=new KullaniciIslemleri();
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    
    
    public KullaniciGiris() {
        initComponents();
        this.setTitle("Kullanici Giris");
        this.setBounds(100, 50, 1405, 840);
        
           String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Driver Bulunamadı");
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            connection=DriverManager.getConnection(url,Baglanti.kullanici_ad,Baglanti.parola);
          //  System.out.println("Baglanma basarılı");    
                    
                    
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("baglantı basarısız");
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_kayitOl = new javax.swing.JButton();
        btn_girisYap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        giris_kullaniciad = new javax.swing.JTextField();
        giris_sifre = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        normaluye = new javax.swing.JRadioButton();
        premiumuye = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kayit_kullaniciAd = new javax.swing.JTextField();
        kayit_sifre = new javax.swing.JPasswordField();
        kayit_ulke = new javax.swing.JTextField();
        kayit_email = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        mesaj_yazisi2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        giris_email = new javax.swing.JTextField();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        btn_kayitOl.setText("Kayıt Ol");
        btn_kayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitOlActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kayitOl);
        btn_kayitOl.setBounds(700, 146, 215, 40);

        btn_girisYap.setText("Giris Yap");
        btn_girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisYapActionPerformed(evt);
            }
        });
        getContentPane().add(btn_girisYap);
        btn_girisYap.setBounds(700, 476, 215, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ya da bir hesabın var mı?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 392, 478, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kullanıcı ad:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(138, 444, 95, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Şifre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(192, 526, 41, 22);
        getContentPane().add(giris_kullaniciad);
        giris_kullaniciad.setBounds(251, 438, 418, 30);

        giris_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_sifreActionPerformed(evt);
            }
        });
        getContentPane().add(giris_sifre);
        giris_sifre.setBounds(250, 530, 418, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Kullanıcı ad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(166, 75, 95, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Şifre:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 152, 41, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(213, 117, 48, 22);

        buttonGroup1.add(normaluye);
        normaluye.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        normaluye.setForeground(new java.awt.Color(0, 0, 204));
        normaluye.setText("Normal");
        getContentPane().add(normaluye);
        normaluye.setBounds(310, 200, 146, 33);

        buttonGroup1.add(premiumuye);
        premiumuye.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        premiumuye.setForeground(new java.awt.Color(255, 255, 0));
        premiumuye.setText("Premium");
        getContentPane().add(premiumuye);
        premiumuye.setBounds(490, 200, 181, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Abonelik tür:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 198, 101, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Kullanıcı Ulke:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(151, 247, 110, 22);

        kayit_kullaniciAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_kullaniciAdActionPerformed(evt);
            }
        });
        getContentPane().add(kayit_kullaniciAd);
        kayit_kullaniciAd.setBounds(279, 79, 403, 30);
        getContentPane().add(kayit_sifre);
        kayit_sifre.setBounds(279, 156, 403, 30);
        getContentPane().add(kayit_ulke);
        kayit_ulke.setBounds(279, 243, 403, 30);
        getContentPane().add(kayit_email);
        kayit_email.setBounds(279, 121, 403, 30);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(151, 317, 634, 31);

        mesaj_yazisi2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mesaj_yazisi2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(mesaj_yazisi2);
        mesaj_yazisi2.setBounds(136, 580, 614, 34);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(185, 484, 48, 18);
        getContentPane().add(giris_email);
        giris_email.setBounds(250, 480, 418, 30);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/kullanicigiris.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1390, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    
    private void btn_kayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitOlActionPerformed
        mesaj_yazisi.setText("");
        mesaj_yazisi2.setText("");
        
        String ad=kayit_kullaniciAd.getText();
        String email=kayit_email.getText();
        char[] x=kayit_sifre.getPassword();
        String sifre=new String(x);
        String tur;
        String odendi_mi;
        
        if(!Kontrol(email))
        {
        
        if(normaluye.isSelected()){
            tur="normal";
          
            
        }else {
           tur=null;
           
        }
       
        if (premiumuye.isSelected()) {
            tur="premium";
            odendi_mi="evet";
        
            
        }else{
             tur="normal";
             odendi_mi="hayır";
             

        }
         String ulkead=kayit_ulke.getText();
         
         
         
        kullaniciIslemleri.kullaniciHesapOlustur(ad, email, sifre, tur, ulkead,odendi_mi);
        mesaj_yazisi.setText("Başarıyla kayıt oldunuz! Artık giriş yapabilirsiniz");
        
        }
        else 
        mesaj_yazisi.setText("Bu email kullanılmaktadır.Lütfen başka bir email giriniz");
        
    }//GEN-LAST:event_btn_kayitOlActionPerformed

    private void btn_girisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisYapActionPerformed
        mesaj_yazisi.setText("");
        mesaj_yazisi2.setText("");
        String kullaniciad=giris_kullaniciad.getText();
        char[] c =giris_sifre.getPassword();
        String parola=new String(c);
        String email=giris_email.getText();
        
        boolean dogruMu=kullaniciIslemleri.dogruMu(kullaniciad,parola,email);
        int x=kullaniciIslemleri.idGetir(kullaniciad, parola,email);
        
        OnerilenSarkilar.ad=kullaniciad;
        OnerilenSarkilar.id=x;
        
       
        if(dogruMu){
       
        OnerilenSarkilar onerilenSarkilar=new OnerilenSarkilar();
        KullaniciEkrani kullaniciEkrani=new KullaniciEkrani(x,kullaniciad);
        this.setVisible(false);      
        kullaniciEkrani.setVisible(true);
        onerilenSarkilar.setVisible(true);
       
        }else{
            mesaj_yazisi2.setText("Kullanıcı adı veya parolanızı yanlış girdiniz tekrar deneyiniz");
        }
        
        
        
        
    }//GEN-LAST:event_btn_girisYapActionPerformed

    private void giris_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giris_sifreActionPerformed

    private void kayit_kullaniciAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_kullaniciAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_kullaniciAdActionPerformed

    
    public boolean Kontrol(String email){
        
         String sorgu="Select Distinct email from kullanici ";
     
         try {
            preparedStatement=connection.prepareStatement(sorgu);
             
            ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("email").equals(String.valueOf(email))){
                     
                     return true;
                     
                 }
               
             }
                      
             return false;
                        
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return false;
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
            java.util.logging.Logger.getLogger(KullaniciGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_girisYap;
    private javax.swing.JButton btn_kayitOl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField giris_email;
    private javax.swing.JTextField giris_kullaniciad;
    private javax.swing.JPasswordField giris_sifre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kayit_email;
    private javax.swing.JTextField kayit_kullaniciAd;
    private javax.swing.JPasswordField kayit_sifre;
    private javax.swing.JTextField kayit_ulke;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel mesaj_yazisi2;
    private javax.swing.JRadioButton normaluye;
    private javax.swing.JRadioButton premiumuye;
    // End of variables declaration//GEN-END:variables
}
