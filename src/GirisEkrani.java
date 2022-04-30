
public class GirisEkrani extends javax.swing.JFrame {

    
    public GirisEkrani() {
        initComponents();
        this.setTitle("Giris Ekrani");
        this.setBounds(100, 100, 1020, 720);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_admin = new javax.swing.JButton();
        btn_kullanici = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mesaj_yazisi = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_admin.setText("Admin");
        btn_admin.setFocusPainted(false);
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });
        getContentPane().add(btn_admin);
        btn_admin.setBounds(570, 490, 240, 38);

        btn_kullanici.setText("Kullanıcı");
        btn_kullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kullanici);
        btn_kullanici.setBounds(130, 490, 220, 38);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Lutfen kim oldugunuzu seciniz");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 19, 520, 40);
        getContentPane().add(Mesaj_yazisi);
        Mesaj_yazisi.setBounds(37, 98, 280, 12);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/girisekrani.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
       
        AdminGiris adminGiris=new AdminGiris();   
        setVisible(false);
        adminGiris.setVisible(true);
       
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_kullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciActionPerformed
        
       KullaniciGiris kullaniciGiris=new KullaniciGiris();
       this.setVisible(false);
       kullaniciGiris.setVisible(true);
    
    }//GEN-LAST:event_btn_kullaniciActionPerformed

    
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mesaj_yazisi;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_kullanici;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
