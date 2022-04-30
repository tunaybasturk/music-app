
public class AdminGiris extends javax.swing.JFrame {

    BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
    
    
    public AdminGiris() {
        initComponents();
        this.setTitle("Admin Giris");
        this.setBounds(200, 100, 870, 570);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_adalani = new javax.swing.JTextField();
        admin_password = new javax.swing.JPasswordField();
        mesaj_yazisi = new javax.swing.JLabel();
        btn_kontrol = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Kullanıcı ad:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 160, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Parola:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 210, 100, 30);

        admin_adalani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_adalaniActionPerformed(evt);
            }
        });
        getContentPane().add(admin_adalani);
        admin_adalani.setBounds(440, 160, 222, 30);
        getContentPane().add(admin_password);
        admin_password.setBounds(440, 210, 222, 30);
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(47, 118, 310, 28);

        btn_kontrol.setText("Kontrol");
        btn_kontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kontrolActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kontrol);
        btn_kontrol.setBounds(390, 340, 180, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/admingiris.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 850, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kontrolActionPerformed
      
        mesaj_yazisi.setText("");
        String adminad=admin_adalani.getText();
        char[] parola1=admin_password.getPassword();
        String parola=new String(parola1);
        
       boolean admin= baglantiIslemleri.adminKontrol(adminad,parola);
       if(admin){
           AdminEkrani adminEkrani=new AdminEkrani(this, true);
            setVisible(false);
            adminEkrani.setVisible(true);
           
           
       }else{
          mesaj_yazisi.setText("Giris basarisiz... lutfen tekrar deneyiniz");
          
        }
        
        
    }//GEN-LAST:event_btn_kontrolActionPerformed

    private void admin_adalaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_adalaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_adalaniActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdminGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admin_adalani;
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JButton btn_kontrol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mesaj_yazisi;
    // End of variables declaration//GEN-END:variables
}
