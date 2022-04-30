
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


public class OnerilenSarkilar extends javax.swing.JFrame {

     DefaultTableModel model;
     DefaultTableModel model1;
     DefaultTableModel model2;
     DefaultTableModel model3;
     DefaultTableModel model4;
     KullaniciIslemleri kullaniciIslemleri=new KullaniciIslemleri();
     KullaniciEkrani kullaniciEkrani=new KullaniciEkrani(id,ad);
             
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
             
     public static String ad;
     public static int id;
    
   
    public OnerilenSarkilar() {
        initComponents();
        this.setTitle("Onerilen Sarkilar");
        this.setBounds(100, 20, 1450, 1020);
        
        model=(DefaultTableModel)top10_poptable.getModel();
        model1=(DefaultTableModel)top10_jazztable.getModel();
        model2=(DefaultTableModel)top10_classictable.getModel();
        model3=(DefaultTableModel)top10_mostlisten_table.getModel();
        model4=(DefaultTableModel)top10_ulkelertable.getModel();
        top10POPGoster();
        top10JAZZGoster();
        top10KLASİKGoster();
        top10EnCokDinlenenGoster();     
        
       
           String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Driver Bulunamadı");
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            connection=DriverManager.getConnection(url,Baglanti.kullanici_ad,Baglanti.parola);
         //   System.out.println("Baglanma basarılı");    
                    
                    
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("baglantı basarısız");
        }
        
        
         ArrayList<String> x=UlkeEkle();
        comboboxEkle(x);
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        top10_poptable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        top10_classictable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        top10_jazztable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        top10_ulkelertable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        top10_mostlisten_table = new javax.swing.JTable();
        btn_sarkiekle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Sanatci_adalani = new javax.swing.JLabel();
        Tur_adalani = new javax.swing.JLabel();
        Sarki_adalani = new javax.swing.JLabel();
        cb_ulkeler = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btn_muzık = new javax.swing.JToggleButton();
        arkaplan = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        top10_poptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki_ad", "sanatci", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        top10_poptable.setRowHeight(40);
        top10_poptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10_poptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(top10_poptable);
        if (top10_poptable.getColumnModel().getColumnCount() > 0) {
            top10_poptable.getColumnModel().getColumn(0).setResizable(false);
            top10_poptable.getColumnModel().getColumn(1).setResizable(false);
            top10_poptable.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 46, 452, 402);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("TOP 10 POP MÜZİKLER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(37, 11, 248, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TOP 10 JAZZ MÜZİKLER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(493, 11, 255, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("TOP 10 KLASİK MÜZİKLER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(978, 11, 281, 29);

        top10_classictable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki_ad", "sanatci", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        top10_classictable.setRowHeight(40);
        top10_classictable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10_classictableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(top10_classictable);
        if (top10_classictable.getColumnModel().getColumnCount() > 0) {
            top10_classictable.getColumnModel().getColumn(0).setResizable(false);
            top10_classictable.getColumnModel().getColumn(1).setResizable(false);
            top10_classictable.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(942, 46, 452, 402);

        top10_jazztable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki_ad", "sanatci", "dinlenme_sayisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        top10_jazztable.setRowHeight(40);
        top10_jazztable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10_jazztableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(top10_jazztable);
        if (top10_jazztable.getColumnModel().getColumnCount() > 0) {
            top10_jazztable.getColumnModel().getColumn(0).setResizable(false);
            top10_jazztable.getColumnModel().getColumn(1).setResizable(false);
            top10_jazztable.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(480, 46, 452, 402);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("TOP 10 EN ÇOK DİNLENEN MÜZİKLER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(37, 491, 406, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("TOP 10 ÜLKELERE GÖRE MÜZİKLER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(602, 491, 382, 29);

        top10_ulkelertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki_ad", "sanatci", "dinlenme_sayisi", "tur", "Ulke_adı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        top10_ulkelertable.setRowHeight(40);
        top10_ulkelertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10_ulkelertableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(top10_ulkelertable);
        if (top10_ulkelertable.getColumnModel().getColumnCount() > 0) {
            top10_ulkelertable.getColumnModel().getColumn(0).setResizable(false);
            top10_ulkelertable.getColumnModel().getColumn(1).setResizable(false);
            top10_ulkelertable.getColumnModel().getColumn(2).setResizable(false);
            top10_ulkelertable.getColumnModel().getColumn(3).setResizable(false);
            top10_ulkelertable.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(518, 526, 559, 402);

        top10_mostlisten_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki_ad", "sanatci", "dinlenme_sayisi", "tur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        top10_mostlisten_table.setRowHeight(40);
        top10_mostlisten_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10_mostlisten_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(top10_mostlisten_table);
        if (top10_mostlisten_table.getColumnModel().getColumnCount() > 0) {
            top10_mostlisten_table.getColumnModel().getColumn(0).setResizable(false);
            top10_mostlisten_table.getColumnModel().getColumn(1).setResizable(false);
            top10_mostlisten_table.getColumnModel().getColumn(2).setResizable(false);
            top10_mostlisten_table.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 526, 502, 402);

        btn_sarkiekle.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_sarkiekle.setText("Şarkıyı listeme ekle");
        btn_sarkiekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sarkiekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sarkiekle);
        btn_sarkiekle.setBounds(1135, 895, 250, 58);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("SANATÇI :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1097, 643, 79, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("ŞARKI İSMİ:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1095, 713, 89, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("TÜR:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1095, 791, 37, 20);

        Sanatci_adalani.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        Sanatci_adalani.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(Sanatci_adalani);
        Sanatci_adalani.setBounds(1097, 663, 321, 32);

        Tur_adalani.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        Tur_adalani.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(Tur_adalani);
        Tur_adalani.setBounds(1095, 829, 323, 33);

        Sarki_adalani.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Sarki_adalani.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(Sarki_adalani);
        Sarki_adalani.setBounds(1095, 744, 323, 36);

        cb_ulkeler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ulkelerActionPerformed(evt);
            }
        });
        getContentPane().add(cb_ulkeler);
        cb_ulkeler.setBounds(1195, 528, 199, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Ulke Seçiniz:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1090, 530, 100, 20);

        btn_muzık.setText("Ulkeye gore Muzık göster");
        btn_muzık.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_muzıkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_muzık);
        btn_muzık.setBounds(1150, 584, 193, 30);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/onerilansarkilar.jpg"))); // NOI18N
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1430, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void top10_poptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10_poptableMouseClicked
     
         int selectedRow=top10_poptable.getSelectedRow();
       
        Sanatci_adalani.setText(model.getValueAt(selectedRow,1).toString());
        Sarki_adalani.setText(model.getValueAt(selectedRow,0).toString());
        Tur_adalani.setText("pop");
               
    }//GEN-LAST:event_top10_poptableMouseClicked

    private void top10_jazztableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10_jazztableMouseClicked
    
        int selectedRow=top10_jazztable.getSelectedRow();
       
        Sanatci_adalani.setText(model1.getValueAt(selectedRow,1).toString());
        Sarki_adalani.setText(model1.getValueAt(selectedRow,0).toString());
        Tur_adalani.setText("jazz");
       
        
    }//GEN-LAST:event_top10_jazztableMouseClicked

    private void top10_classictableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10_classictableMouseClicked
      
         int selectedRow=top10_classictable.getSelectedRow();
       
        Sanatci_adalani.setText(model2.getValueAt(selectedRow,1).toString());
        Sarki_adalani.setText(model2.getValueAt(selectedRow,0).toString());
        Tur_adalani.setText("klasik");
        
        
    }//GEN-LAST:event_top10_classictableMouseClicked

    private void top10_mostlisten_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10_mostlisten_tableMouseClicked
       
        int selectedRow=top10_mostlisten_table.getSelectedRow();
       
        Sanatci_adalani.setText(model3.getValueAt(selectedRow,1).toString());
        Sarki_adalani.setText(model3.getValueAt(selectedRow,0).toString());
        Tur_adalani.setText(model3.getValueAt(selectedRow,3).toString());
       
        
    }//GEN-LAST:event_top10_mostlisten_tableMouseClicked

    private void top10_ulkelertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10_ulkelertableMouseClicked
      
         int selectedRow=top10_ulkelertable.getSelectedRow();
       
        Sanatci_adalani.setText(model4.getValueAt(selectedRow,1).toString());
        Sarki_adalani.setText(model4.getValueAt(selectedRow,0).toString());
        Tur_adalani.setText(model4.getValueAt(selectedRow,3).toString());
        
    }//GEN-LAST:event_top10_ulkelertableMouseClicked

    private void btn_sarkiekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sarkiekleActionPerformed
       
        
       int x=sarkiSorgusu();
       String kontrol=Tur_adalani.getText();
       boolean doru=Kontrol(x,id);
       if(kontrol.equals("pop")){
          
           if(!doru)
           {
           String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)" ;
           
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
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
            
            preparedStatement.setInt(1, id);
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
            
            preparedStatement.setInt(1, id);
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
      
        
    }//GEN-LAST:event_btn_sarkiekleActionPerformed

    private void cb_ulkelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ulkelerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ulkelerActionPerformed

    private void btn_muzıkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_muzıkActionPerformed
    
       String ulke=cb_ulkeler.getSelectedItem().toString();
        
       top10UlkelereGoreGoster(ulke);
       
       
       
        
    }//GEN-LAST:event_btn_muzıkActionPerformed

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
      
    
   public int sarkiSorgusu(){
        int abc = 0;
       
         try {
             statement=connection.createStatement();
             
             String sorgu="Select idSarki From sarki where Sarki_ad='"+ Sarki_adalani.getText()+"' and sanatci='"+Sanatci_adalani.getText()+"' and tur='"+Tur_adalani.getText()+"'";

             
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
    
    
    public void top10POPGoster(){
               
         model.setRowCount(0);
         
             
         ArrayList<Top10> liste=new ArrayList<Top10>();
         liste=kullaniciIslemleri.top10Pop();
        if(liste!=null){
            for (Top10 pop : liste) {
                Object[] ekle={pop.getSarkiad(),pop.getSanatci(),pop.getDinlenme()};
          
             model.addRow(ekle);
            }
            
        }
        
    }    
    
     public void top10JAZZGoster(){
        
           model1.setRowCount(0);
         
             
         ArrayList<Top10> liste=new ArrayList<Top10>();
         liste=kullaniciIslemleri.top10Jazz();
        if(liste!=null){
            for (Top10 jazz : liste) {
                Object[] ekle={jazz.getSarkiad(),jazz.getSanatci(),jazz.getDinlenme()};
          
             model1.addRow(ekle);
            }
            
        }
        
         
    }   
     public void top10KLASİKGoster(){
         
          model2.setRowCount(0);
         
             
         ArrayList<Top10> liste=new ArrayList<Top10>();
         liste=kullaniciIslemleri.top10Klasik();
        if(liste!=null){
            for (Top10 klasik : liste) {
                Object[] ekle={klasik.getSarkiad(),klasik.getSanatci(),klasik.getDinlenme()};
          
             model2.addRow(ekle);
            }
            
        }
        
    }    
     
     public void top10EnCokDinlenenGoster(){
         
         
          model3.setRowCount(0);
         
             
         ArrayList<Top10> liste=new ArrayList<Top10>();
         liste=kullaniciIslemleri.top10Dinlenme();
        if(liste!=null){
            for (Top10 dinlenme : liste) {
                Object[] ekle={dinlenme.getSarkiad(),dinlenme.getSanatci(),dinlenme.getDinlenme(),dinlenme.getTur()};
          
             model3.addRow(ekle);
            }
            
        }
         
        
    }    
      public void top10UlkelereGoreGoster(String x){
          
            model4.setRowCount(0);
         
             
         ArrayList<Top10> liste=new ArrayList<Top10>();
         liste=kullaniciIslemleri.top10UlkelereGoreGoster(x);
        if(liste!=null){
            for (Top10 dinlenmeullke : liste) {
                Object[] ekle={dinlenmeullke.getSarkiad(),dinlenmeullke.getSanatci(),dinlenmeullke.getDinlenme(),dinlenmeullke.getTur(),dinlenmeullke.getUlke_adi()};
          
             model4.addRow(ekle);
            }
            
        }
         
        
    }    
      public ArrayList<String> UlkeEkle(){
          
          String sorgu="Select Distinct sanatci_ulke From sanatci";
          ArrayList<String> Ulkerler=new ArrayList<String>();
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             
             ResultSet rs=preparedStatement.executeQuery();
             
             while(rs.next()){
                 
                 Ulkerler.add(rs.getString("sanatci_ulke"));
                 
             }
             return Ulkerler;
             
         } catch (SQLException ex) {
             Logger.getLogger(OnerilenSarkilar.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
          
          
      }
      public void comboboxEkle(ArrayList<String> x){
          
          for (int i = 0; i < x.size(); i++) {
             
              cb_ulkeler.addItem(x.get(i));
              
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
            java.util.logging.Logger.getLogger(OnerilenSarkilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnerilenSarkilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnerilenSarkilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnerilenSarkilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnerilenSarkilar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sanatci_adalani;
    private javax.swing.JLabel Sarki_adalani;
    private javax.swing.JLabel Tur_adalani;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JToggleButton btn_muzık;
    private javax.swing.JButton btn_sarkiekle;
    private javax.swing.JComboBox<String> cb_ulkeler;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable top10_classictable;
    private javax.swing.JTable top10_jazztable;
    private javax.swing.JTable top10_mostlisten_table;
    private javax.swing.JTable top10_poptable;
    private javax.swing.JTable top10_ulkelertable;
    // End of variables declaration//GEN-END:variables
}
