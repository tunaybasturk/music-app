
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



public class Admin_sanatci_islemleri extends javax.swing.JFrame {

    
     DefaultTableModel model;
     BaglantiIslemleri baglantiIslemleri=new BaglantiIslemleri();
     
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;

    
    public Admin_sanatci_islemleri() {
        initComponents();
        this.setBounds(100, 100, 1350, 770);
        this.setTitle("Admin sanatci islemleri");
        
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

        
        
        model=(DefaultTableModel)Sanatcilar_tablo.getModel();
        SanatciGoster();
    }
    
    public void  dinamikAra(String ara){
        
     TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
   
    Sanatcilar_tablo.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(ara));
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ekle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_sil = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        Id_sanatci = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sanatcilar_tablo = new javax.swing.JTable();
        ad_sanatciad = new javax.swing.JTextField();
        btn_geridon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sanatciulke = new javax.swing.JTextField();
        arama_cubuğu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_ekle.setText("Sanatçı  Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle);
        btn_ekle.setBounds(605, 144, 240, 23);

        jLabel4.setText("Sanatçı_ulke:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 230, 100, 14);

        btn_sil.setText("Sanatçı  Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil);
        btn_sil.setBounds(605, 178, 240, 23);

        btn_guncelle.setText("Sanatçı  Guncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guncelle);
        btn_guncelle.setBounds(605, 219, 240, 23);
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(91, 281, 457, 25);
        getContentPane().add(Id_sanatci);
        Id_sanatci.setBounds(187, 139, 348, 30);

        Sanatcilar_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sanatçı id", "sanatci_ad", "sanatci_ulke"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Sanatcilar_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sanatcilar_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Sanatcilar_tablo);
        if (Sanatcilar_tablo.getColumnModel().getColumnCount() > 0) {
            Sanatcilar_tablo.getColumnModel().getColumn(0).setResizable(false);
            Sanatcilar_tablo.getColumnModel().getColumn(1).setResizable(false);
            Sanatcilar_tablo.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 380, 1165, 316);
        getContentPane().add(ad_sanatciad);
        ad_sanatciad.setBounds(187, 179, 348, 30);

        btn_geridon.setText("Admin Panele Geri Dön");
        btn_geridon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geridonActionPerformed(evt);
            }
        });
        getContentPane().add(btn_geridon);
        btn_geridon.setBounds(605, 281, 240, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("SANATÇI İŞLEMLERİ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(415, 24, 327, 44);
        getContentPane().add(sanatciulke);
        sanatciulke.setBounds(187, 220, 348, 30);

        arama_cubuğu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuğuKeyReleased(evt);
            }
        });
        getContentPane().add(arama_cubuğu);
        arama_cubuğu.setBounds(187, 101, 864, 30);

        jLabel1.setText("Arama Çubuğu :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 110, 100, 14);

        jLabel2.setText("Sanatçı Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 150, 100, 14);

        jLabel3.setText("Sanatçı_ad :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 190, 100, 14);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/adminsanatciislemleri.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1330, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed

        mesaj_yazisi.setText("");

        //int id=Integer.parseInt(Id_alani.getText());

        int  sanatci_id=Integer.parseInt(this.Id_sanatci.getText());
        String  sanatci_ad=this.ad_sanatciad.getText();
        String  ulke=this.sanatciulke.getText();
        boolean doru=Kontrol(sanatci_ad);
        if(!doru){
            
            baglantiIslemleri.sanatciEkle(sanatci_ad,ulke);
            
             mesaj_yazisi.setText("Yeni sanatci başarıyla eklendi");
        }

        mesaj_yazisi.setText("boyle sanatci isminden veri tabanında var");

        SanatciGoster();
     
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed

        mesaj_yazisi.setText("");

        int selectedRow=Sanatcilar_tablo.getSelectedRow();

        if(selectedRow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sanatci tablosu bos");

            }else{
                mesaj_yazisi.setText("Lutfen sılınecek bir sanatci secın");
            }
        }else{

            int id=(int)model.getValueAt(selectedRow,0);
            String sanatci_ad=model.getValueAt(selectedRow, 1).toString();
            String sanatci_ulke=model.getValueAt(selectedRow, 2).toString();
            baglantiIslemleri.SanatciSil(sanatci_ad,sanatci_ulke);
            baglantiIslemleri.sarkiTablosundanSanatciSil(sanatci_ad);
            baglantiIslemleri.albumTablosundanSanatciSil(sanatci_ad);

            SanatciGoster();
            mesaj_yazisi.setText("sanatci başarıyla silindi");

        }
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        int  sanatci_id=Integer.parseInt(this.Id_sanatci.getText());
        String  sanatci_ad=this.ad_sanatciad.getText();
        String  ulke=this.sanatciulke.getText();
       

        int selectedrow=Sanatcilar_tablo.getSelectedRow();

        if(selectedrow==-1)
        {
            if(model.getRowCount()==0){
                mesaj_yazisi.setText("sanatci tablosu boş");
            }else{
                mesaj_yazisi.setText("lutfen guncellenecek sanatci secınız");
            }
        }else{

          

            baglantiIslemleri.SanatciGuncelle(sanatci_id,sanatci_ad,ulke);
            baglantiIslemleri.albumTablosundasanatciGuncelle(model.getValueAt(selectedrow, 1).toString(), sanatci_ad);
            baglantiIslemleri.sarkiTablosundasanatciGuncelle(model.getValueAt(selectedrow, 1).toString(), sanatci_ad);
            

            SanatciGoster();

            mesaj_yazisi.setText("sanatci basarıyla Guncellendi....");

        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void Sanatcilar_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sanatcilar_tabloMouseClicked

        int selectedRow=Sanatcilar_tablo.getSelectedRow();

        Id_sanatci.setText(model.getValueAt(selectedRow,0).toString());
        ad_sanatciad.setText(model.getValueAt(selectedRow,1).toString());
        sanatciulke.setText(model.getValueAt(selectedRow,2).toString());
       
    }//GEN-LAST:event_Sanatcilar_tabloMouseClicked

    private void btn_geridonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geridonActionPerformed

        this.setVisible(false);
        AdminEkrani adminEkrani=new AdminEkrani(this, true);
        adminEkrani.setVisible(true);

    }//GEN-LAST:event_btn_geridonActionPerformed

    private void arama_cubuğuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuğuKeyReleased

        String ara=arama_cubuğu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuğuKeyReleased

    public void SanatciGoster(){
         model.setRowCount(0);
         
         ArrayList<Sanatci> sanatci=new ArrayList<Sanatci>();
         sanatci=baglantiIslemleri.SanatciGetir();
        if(sanatci!=null){
            for (Sanatci liste : sanatci) {
                Object[] ekle={liste.getSanatci_id(),liste.getSanatci_ad(),liste.getSanatci_ulke()};
          
             model.addRow(ekle);
            }
            
        }
        
     }
    public boolean Kontrol(String ad){
        
        String sorgu="Select * From sanatci";
        
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             
             ResultSet rs=preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("sanatci_ad").equals(ad)){
                     
                     
                     return true;
                 }
                 
                 
             }
             return false;
         } catch (SQLException ex) {
             Logger.getLogger(Admin_sanatci_islemleri.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Admin_sanatci_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_sanatci_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_sanatci_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_sanatci_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_sanatci_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_sanatci;
    private javax.swing.JTable Sanatcilar_tablo;
    private javax.swing.JTextField ad_sanatciad;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sanatciulke;
    // End of variables declaration//GEN-END:variables
}
