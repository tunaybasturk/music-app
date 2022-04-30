
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AdminEkrani extends javax.swing.JDialog {

    
     BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
    
 
    public AdminEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Admin Ekrani");
        this.setBounds(100, 100, 1020, 720);

    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sarkiIslem = new javax.swing.JButton();
        btn_calmaIslem = new javax.swing.JButton();
        btn_SanatciIslem = new javax.swing.JButton();
        btn_AlbumIslem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_kullaniciislmeleri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_sarkiIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_sarkiIslem.setText("Şarkı İşlemleri");
        btn_sarkiIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sarkiIslemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sarkiIslem);
        btn_sarkiIslem.setBounds(350, 200, 240, 40);

        btn_calmaIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_calmaIslem.setText("Çalma Listesi İşlemleri");
        btn_calmaIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calmaIslemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calmaIslem);
        btn_calmaIslem.setBounds(350, 250, 240, 40);

        btn_SanatciIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_SanatciIslem.setText("Sanatçı İşlemleri");
        btn_SanatciIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SanatciIslemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SanatciIslem);
        btn_SanatciIslem.setBounds(350, 300, 240, 40);

        btn_AlbumIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_AlbumIslem.setText("Albüm İşlemleri");
        btn_AlbumIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlbumIslemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AlbumIslem);
        btn_AlbumIslem.setBounds(350, 350, 240, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("ADMİN PANELİ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 30, 399, 73);

        btn_kullaniciislmeleri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_kullaniciislmeleri.setText("Kullanıcı İşlemleri");
        btn_kullaniciislmeleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciislmeleriActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kullaniciislmeleri);
        btn_kullaniciislmeleri.setBounds(350, 150, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/adminekrani.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sarkiIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sarkiIslemActionPerformed
       
                       
        Admin_sarki_islemleri admin_sarki_islemleri=new Admin_sarki_islemleri();
        
        
        this.setVisible(false);
        admin_sarki_islemleri.setVisible(true);
    }//GEN-LAST:event_btn_sarkiIslemActionPerformed

    private void btn_SanatciIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SanatciIslemActionPerformed
     
        Admin_sanatci_islemleri admin_sanatci_islemleri=new Admin_sanatci_islemleri();
        
        
        this.setVisible(false);
        admin_sanatci_islemleri.setVisible(true);
    }//GEN-LAST:event_btn_SanatciIslemActionPerformed

    private void btn_AlbumIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlbumIslemActionPerformed
     
        
        Admin_album_islemleri admin_album_islemleri=new Admin_album_islemleri();
        

        
         this.setVisible(false);
         admin_album_islemleri.setVisible(true);
    }//GEN-LAST:event_btn_AlbumIslemActionPerformed

    private void btn_calmaIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calmaIslemActionPerformed
      
        Admin_calmaListesi_islemleri admin_calmaListesi_islemleri=new Admin_calmaListesi_islemleri();
        
       
         this.setVisible(false);
         admin_calmaListesi_islemleri.setVisible(true);
    }//GEN-LAST:event_btn_calmaIslemActionPerformed

    private void btn_kullaniciislmeleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciislmeleriActionPerformed
      
        
        Admin_kullanici_islemleri admin_kullanici_islemleri=new Admin_kullanici_islemleri();
  
          this.setVisible(false);
         admin_kullanici_islemleri.setVisible(true);
        
    }//GEN-LAST:event_btn_kullaniciislmeleriActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminEkrani dialog = new AdminEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AlbumIslem;
    private javax.swing.JButton btn_SanatciIslem;
    private javax.swing.JButton btn_calmaIslem;
    private javax.swing.JButton btn_kullaniciislmeleri;
    private javax.swing.JButton btn_sarkiIslem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
