

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class PremiumKullaniciEkrani extends javax.swing.JFrame {

    
    KullaniciIslemleri kullaniciIslemleri=new KullaniciIslemleri();
   
    private static String ad;
    private static int id;
    private static String bizim_ad;
    private static int bizim_id;
    
    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
      
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
     
  
    
    public PremiumKullaniciEkrani(String ad,int id,int bizim_id,String bizim_ad) {
        initComponents();
        this.ad=ad;
        this.id=id;
        this.bizim_id=bizim_id;
        this.bizim_ad=bizim_ad;
        this.setTitle("Premium Kullanici Ekrani");
        this.setBounds(0,0, 1920, 1000);
        
        model=(DefaultTableModel)pop_calmaListesi.getModel();
        model1=(DefaultTableModel)jazz_calmalistesi.getModel();
        model2=(DefaultTableModel)klasik_calmalistesi.getModel();
        
        popCalmaDoldur();
        jazzCalmaDoldur();
        klasikCalmaDoldur();
        
        ad_labeli.setText(ad);
        id_labeli.setText(String.valueOf(id));
        
        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Driver Bulunamadı");
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            connection=DriverManager.getConnection(url,Baglanti.kullanici_ad,Baglanti.parola);
           // System.out.println("Baglanma basarılı");    
                    
                    
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("baglantı basarısız");
        }
        
        KontrolTakip(id, bizim_id);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ad_labeli = new javax.swing.JLabel();
        id_labeli = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        pop_calmaListesi = new javax.swing.JTable();
        kullanıcı_adlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        klasik_calmalistesi = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jazz_calmalistesi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_tekEkle = new javax.swing.JToggleButton();
        btn_HepsiniEkle = new javax.swing.JToggleButton();
        btn_takip = new javax.swing.JToggleButton();
        btn_donus = new javax.swing.JToggleButton();
        album = new javax.swing.JLabel();
        sarkiad = new javax.swing.JLabel();
        sanatci = new javax.swing.JLabel();
        sure = new javax.swing.JLabel();
        dinlenmesayisi = new javax.swing.JLabel();
        tur = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ad_labeli.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        getContentPane().add(ad_labeli);
        ad_labeli.setBounds(193, 11, 263, 37);

        id_labeli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(id_labeli);
        id_labeli.setBounds(190, 68, 254, 17);

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

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(12, 211, 598, 402);

        kullanıcı_adlabel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        kullanıcı_adlabel.setText("Kullanıcı Ad:");
        getContentPane().add(kullanıcı_adlabel);
        kullanıcı_adlabel.setBounds(10, 11, 165, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Pop Çalma listesi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(168, 168, 223, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setText("Jazz Çalma Listesi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(803, 168, 236, 37);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setText("Klasik Çalma Listesi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1453, 168, 257, 37);

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

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(1275, 211, 600, 402);

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

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(637, 211, 600, 402);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kullanıcı Id:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(108, 68, 67, 17);

        btn_tekEkle.setText("Seçileni Çalma Listeme Ekle");
        btn_tekEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tekEkleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tekEkle);
        btn_tekEkle.setBounds(628, 731, 307, 48);

        btn_HepsiniEkle.setText("Hepsini Çalma Listeme Ekle");
        btn_HepsiniEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HepsiniEkleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_HepsiniEkle);
        btn_HepsiniEkle.setBounds(953, 731, 284, 48);

        btn_takip.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_takip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takipActionPerformed(evt);
            }
        });
        getContentPane().add(btn_takip);
        btn_takip.setBounds(1678, 34, 162, 66);

        btn_donus.setText("Sayfama Geri Dön");
        btn_donus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_donus);
        btn_donus.setBounds(1575, 886, 248, 57);

        album.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        album.setText("jLabel5");
        getContentPane().add(album);
        album.setBounds(126, 739, 5, 2);

        sarkiad.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sarkiad.setText("jLabel6");
        getContentPane().add(sarkiad);
        sarkiad.setBounds(167, 739, 5, 2);

        sanatci.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sanatci.setText("jLabel7");
        getContentPane().add(sanatci);
        sanatci.setBounds(216, 739, 5, 2);

        sure.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sure.setText("jLabel8");
        getContentPane().add(sure);
        sure.setBounds(258, 739, 5, 2);

        dinlenmesayisi.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        dinlenmesayisi.setText("jLabel9");
        getContentPane().add(dinlenmesayisi);
        dinlenmesayisi.setBounds(281, 739, 5, 2);

        tur.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        tur.setText("jLabel5");
        getContentPane().add(tur);
        tur.setBounds(314, 739, 5, 2);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/premiumkullancekrani.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1900, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_takipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takipActionPerformed

       boolean x= KontrolTakip(id, bizim_id);
       
       if(x){
                  
           takipBırakmak();
           btn_takip.setText("Takip Et");
         
       }else{
           
          takiplesme();
           
          btn_takip.setText("Takip Bırak");
            
       }
        
        

    }//GEN-LAST:event_btn_takipActionPerformed

    private void btn_tekEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tekEkleActionPerformed

       int x=sarkiSorgusu();
       String kontrol=tur.getText();
       boolean doru=Kontrol(x,bizim_id);
       if(kontrol.equals("pop")){
          
           if(!doru)
           {
           String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, bizim_id);
            preparedStatement.setInt(2,x);
            preparedStatement.setString(3, kontrol);
          
            
            preparedStatement.execute();
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
       }
       else if(kontrol.equals("jazz")){
           
           if(!doru){
               
           
          
            String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?) " ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, bizim_id);
            preparedStatement.setInt(2,x);
            preparedStatement.setString(3, kontrol);
          
            
            preparedStatement.execute();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       }
       }
       else if(kontrol.equals("klasik")){
           if(!doru){
           
            String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, bizim_id);
            preparedStatement.setInt(2,x);
            preparedStatement.setString(3, kontrol);
          
            
            preparedStatement.execute();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
       }
       else{
           System.out.println("olmadı");
           
       }
       
      KullaniciEkrani.popCalmaDoldur();
      KullaniciEkrani.jazzCalmaDoldur();
      KullaniciEkrani.klasikCalmaDoldur();
        
        

    }//GEN-LAST:event_btn_tekEkleActionPerformed

    private void btn_HepsiniEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HepsiniEkleActionPerformed

        ArrayList<Integer> sarkilarId=sarkiId();
        boolean doru;
        String kontrol=tur.getText();
        
        for (int i = 0; i < sarkilarId.size(); i++) {
            
           doru=Kontrol(sarkiId().get(i), bizim_id);
             if(kontrol.equals("pop")){
          
           if(!doru)
           {
           String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, bizim_id);
            preparedStatement.setInt(2,sarkiId().get(i));
            preparedStatement.setString(3, kontrol);
          
            
            preparedStatement.execute();
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
       }
       else if(kontrol.equals("jazz")){
           
           if(!doru){
               
           
          
            String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?) " ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, bizim_id);
            preparedStatement.setInt(2,sarkiId().get(i));
            preparedStatement.setString(3, kontrol);
          
            
            preparedStatement.execute();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       }
       }
       else if(kontrol.equals("klasik")){
           if(!doru){
           
            String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, bizim_id);
            preparedStatement.setInt(2,sarkiId().get(i));
            preparedStatement.setString(3, kontrol);
          
            
            preparedStatement.execute();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
       }
       else{
           System.out.println("olmadı");
           
       }
       
      KullaniciEkrani.popCalmaDoldur();
      KullaniciEkrani.jazzCalmaDoldur();
      KullaniciEkrani.klasikCalmaDoldur();
        
            
        }
        
      

    }//GEN-LAST:event_btn_HepsiniEkleActionPerformed

    private void pop_calmaListesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop_calmaListesiMouseClicked
      
        
        int selectedRow = pop_calmaListesi.getSelectedRow();
        
        String album=model.getValueAt(selectedRow,0).toString();
        String sarki_ad=model.getValueAt(selectedRow,1).toString();
        String sanatci=model.getValueAt(selectedRow,2).toString();
        String sure=model.getValueAt(selectedRow,3).toString();
        int dinlenme_sayisi=(int)model.getValueAt(selectedRow, 4);
        
        this.album.setText(album);
        this.sarkiad.setText(sarki_ad);
        this.sanatci.setText(sanatci);
        this.sure.setText(sure);
        this.dinlenmesayisi.setText(String.valueOf(dinlenme_sayisi));
        this.tur.setText("pop");
        this.btn_HepsiniEkle.setText("Pop'un Hepsini Çalma Listeme Ekle");
        
    }//GEN-LAST:event_pop_calmaListesiMouseClicked

    private void jazz_calmalistesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazz_calmalistesiMouseClicked
      
        int selectedRow = jazz_calmalistesi.getSelectedRow();
        
        String album=model1.getValueAt(selectedRow,0).toString();
        String sarki_ad=model1.getValueAt(selectedRow,1).toString();
        String sanatci=model1.getValueAt(selectedRow,2).toString();
        String sure=model1.getValueAt(selectedRow,3).toString();
        int dinlenme_sayisi=(int)model1.getValueAt(selectedRow, 4);
        
        this.album.setText(album);
        this.sarkiad.setText(sarki_ad);
        this.sanatci.setText(sanatci);
        this.sure.setText(sure);
        this.dinlenmesayisi.setText(String.valueOf(dinlenme_sayisi));
        this.tur.setText("jazz");
        this.btn_HepsiniEkle.setText("Jazz'ın Hepsini Çalma Listeme Ekle");
        
    }//GEN-LAST:event_jazz_calmalistesiMouseClicked

    private void klasik_calmalistesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klasik_calmalistesiMouseClicked
      
        int selectedRow = klasik_calmalistesi.getSelectedRow();
        
        String album=model2.getValueAt(selectedRow,0).toString();
        String sarki_ad=model2.getValueAt(selectedRow,1).toString();
        String sanatci=model2.getValueAt(selectedRow,2).toString();
        String sure=model2.getValueAt(selectedRow,3).toString();
        int dinlenme_sayisi=(int)model2.getValueAt(selectedRow, 4);
        
        this.album.setText(album);
        this.sarkiad.setText(sarki_ad);
        this.sanatci.setText(sanatci);
        this.sure.setText(sure);
        this.dinlenmesayisi.setText(String.valueOf(dinlenme_sayisi));
        this.tur.setText("klasik");
        this.btn_HepsiniEkle.setText("Klasik'in Hepsini Çalma Listeme Ekle");
        
    }//GEN-LAST:event_klasik_calmalistesiMouseClicked

    private void btn_donusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donusActionPerformed
     
        
        KullaniciEkrani kullaniciEkrani=new KullaniciEkrani(bizim_id,bizim_ad);
        kullaniciEkrani.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_donusActionPerformed

     public int sarkiSorgusu(){
        int abc = 0;
       
         try {
             statement=connection.createStatement();
             
             String sorgu="Select idSarki From sarki where Sarki_ad='"+ sarkiad.getText()+"' and sanatci='"+sanatci.getText()+"' and tur ='"+tur.getText()+"'"+" and album ='"+album.getText()+"' and sure='"+sure.getText()+"'";

             
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
      public ArrayList<Integer> sarkiId(){
         ArrayList<Integer> abc = new ArrayList<Integer>();
       
         try {
             statement=connection.createStatement();
             
             String sorgu="Select * From calma_listesi where calmalistesi_tur ='"+tur.getText()+"'"+" and kullanici_id="+id;

             
             ResultSet rs=statement.executeQuery(sorgu);

             while(rs.next()){
                 
                 abc.add(rs.getInt("sarki_id"));
                 
             }
             
             
             return abc;
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return null;
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
    
    public  void popCalmaDoldur(){
        
         
         
          model.setRowCount(0);
         
         ArrayList<Sarki> poplistem=new ArrayList<Sarki>();
         poplistem=kullaniciIslemleri.PopCalmaListesiniGetir(id);
        if(poplistem!=null){
            for (Sarki popliste : poplistem) {
                Object[] ekle={popliste.getAlbum(),popliste.getSarki_ad(),popliste.getSanatci(),popliste.getSure(),popliste.getDinlenme_sayisi()};
                
             model.addRow(ekle);
            }
           
        }            
    }
    
    public  void jazzCalmaDoldur(){
        
         
         
          model1.setRowCount(0);
         
         ArrayList<Sarki> jazzlistem=new ArrayList<Sarki>();
         jazzlistem=kullaniciIslemleri.JazzCalmaListesiniGetir(id);
        if(jazzlistem!=null){
            for (Sarki popliste : jazzlistem) {
                Object[] ekle={popliste.getAlbum(),popliste.getSarki_ad(),popliste.getSanatci(),popliste.getSure(),popliste.getDinlenme_sayisi()};
                
               
             model1.addRow(ekle);
            }          
        }            
    }
    
     public  void klasikCalmaDoldur(){
        
         
         
          model2.setRowCount(0);
         
         ArrayList<Sarki> klasiklistem=new ArrayList<Sarki>();
         klasiklistem=kullaniciIslemleri.KlasikCalmaListesiniGetir(id);
        if(klasiklistem!=null){
            for (Sarki popliste : klasiklistem) {
                Object[] ekle={popliste.getAlbum(),popliste.getSarki_ad(),popliste.getSanatci(),popliste.getSure(),popliste.getDinlenme_sayisi()};
                
               
             model2.addRow(ekle);
            }          
        }            
    }
     public void takiplesme(){
         
         String sorgu="Insert Into takiplesme (takipeden_id,takipedilen_id) Values (?,?)";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            preparedStatement.setInt(1,bizim_id);
            preparedStatement.setInt(2, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      public void takipBırakmak(){
         
         String sorgu="Delete from takiplesme Where takipeden_id= ? and takipedilen_id = ?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            preparedStatement.setInt(1,bizim_id);
            preparedStatement.setInt(2, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       public boolean KontrolTakip(int x,int y){
         
         String sorgu="Select * From takiplesme";
        try {
           statement=connection.createStatement();
           
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                if(rs.getInt("takipedilen_id")==x &&rs.getInt("takipeden_id")==y){
                    
                    btn_takip.setText("Takibi Bırak");
                    return true;
                    
                }
             
            }
            btn_takip.setText("Takip Et");
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PremiumKullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PremiumKullaniciEkrani(ad,id,bizim_id,bizim_ad).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_labeli;
    private javax.swing.JLabel album;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JToggleButton btn_HepsiniEkle;
    private javax.swing.JToggleButton btn_donus;
    private javax.swing.JToggleButton btn_takip;
    private javax.swing.JToggleButton btn_tekEkle;
    private javax.swing.JLabel dinlenmesayisi;
    private javax.swing.JLabel id_labeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jazz_calmalistesi;
    private javax.swing.JTable klasik_calmalistesi;
    private javax.swing.JLabel kullanıcı_adlabel;
    private javax.swing.JTable pop_calmaListesi;
    private javax.swing.JLabel sanatci;
    private javax.swing.JLabel sarkiad;
    private javax.swing.JLabel sure;
    private javax.swing.JLabel tur;
    // End of variables declaration//GEN-END:variables
}
