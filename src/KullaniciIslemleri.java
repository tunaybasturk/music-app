
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

 class Top10{
     
     
     private String sarkiad;
     private String Sanatci;
     private int dinlenme;
     private String tur;
     private String ulke_adi;

    public Top10(String sarkiad, String Sanatci, int dinlenme) {
        this.sarkiad = sarkiad;
        this.Sanatci = Sanatci;
        this.dinlenme = dinlenme;
    }
    public Top10(String sarkiad, String Sanatci, int dinlenme,String tur) {
        this.sarkiad = sarkiad;
        this.Sanatci = Sanatci;
        this.dinlenme = dinlenme;
        this.tur=tur;
    }

    public Top10(String sarkiad, String Sanatci, int dinlenme, String tur, String ulke_adi) {
        this.sarkiad = sarkiad;
        this.Sanatci = Sanatci;
        this.dinlenme = dinlenme;
        this.tur = tur;
        this.ulke_adi = ulke_adi;
    }

    public String getUlke_adi() {
        return ulke_adi;
    }

    public void setUlke_adi(String ulke_adi) {
        this.ulke_adi = ulke_adi;
    }
    

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    
    
    public String getSarkiad() {
        return sarkiad;
    }

    public void setSarkiad(String sarkiad) {
        this.sarkiad = sarkiad;
    }

    public String getSanatci() {
        return Sanatci;
    }

    public void setSanatci(String Sanatci) {
        this.Sanatci = Sanatci;
    }

    public int getDinlenme() {
        return dinlenme;
    }

    public void setDinlenme(int dinlenme) {
        this.dinlenme = dinlenme;
    }
   
     
 }

 class CalmaListesiEkleme{
     
     private String album;
     private String sarkiad;
     private String sanatciad;
     private String sure;
     private int dinlenme_sayisi;

    public CalmaListesiEkleme(String album, String sarkiad, String sanatciad, String sure, int dinlenme_sayisi) {
        this.album = album;
        this.sarkiad = sarkiad;
        this.sanatciad = sanatciad;
        this.sure = sure;
        this.dinlenme_sayisi = dinlenme_sayisi;
    }

     
     
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSarkiad() {
        return sarkiad;
    }

    public void setSarkiad(String sarkiad) {
        this.sarkiad = sarkiad;
    }

    public String getSanatciad() {
        return sanatciad;
    }

    public void setSanatciad(String sanatciad) {
        this.sanatciad = sanatciad;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public int getDinlenme_sayisi() {
        return dinlenme_sayisi;
    }

    public void setDinlenme_sayisi(int dinlenme_sayisi) {
        this.dinlenme_sayisi = dinlenme_sayisi;
    }
         
     
 }
class Sarki{
    
    private String Sarki_ad;
    private Object tarih;
    private String sanatci;
    private String album;
    private String tur;
    private String sure;
    private int dinlenme_sayisi;

    public Sarki(String Sarki_ad, String sanatci, String album, String sure, int dinlenme_sayisi) {
        this.Sarki_ad = Sarki_ad;
        this.sanatci = sanatci;
        this.album = album;
        this.sure = sure;
        this.dinlenme_sayisi = dinlenme_sayisi;
    }

   
    
    public Sarki(String Sarki_ad,Object tarih, String sanatci, String album, String tur, String sure, int dinlenme_sayisi) {
        this.Sarki_ad = Sarki_ad;
        this.tarih=tarih;
        this.sanatci = sanatci;
        this.album = album;
        this.tur = tur;
        this.sure = sure;
        this.dinlenme_sayisi = dinlenme_sayisi;
    }

    public String getSarki_ad() {
        return Sarki_ad;
    }

    public void setSarki_ad(String Sarki_ad) {
        this.Sarki_ad = Sarki_ad;
    }

    public Object getTarih() {
        return tarih;
    }

    public void setTarih(Object tarih) {
        this.tarih = tarih;
    }

    

    public String getSanatci() {
        return sanatci;
    }

    public void setSanatci(String sanatci) {
        this.sanatci = sanatci;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public int getDinlenme_sayisi() {
        return dinlenme_sayisi;
    }

    public void setDinlenme_sayisi(int dinlenme_sayisi) {
        this.dinlenme_sayisi = dinlenme_sayisi;
    }
 
     
}

public class KullaniciIslemleri {
     private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    
     public KullaniciIslemleri() {
        
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
      
    }
      public void kullaniciHesapOlustur(String ad, String email,String sifre,String abonelik_tur,String ulke,String odeme_bilgisi){
        
        String sorgu="Insert Into kullanici (kullanici_ad,email,sifre,abonelik_tur,kullanici_ulke,odendi_mi) Values(?,?,?,?,?,?)";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, sifre);
            preparedStatement.setString(4, abonelik_tur);
            preparedStatement.setString(5, ulke);
            preparedStatement.setString(6, odeme_bilgisi);
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
      public boolean dogruMu(String kullanici_ad,String parola,String email){
          
          String sorgu="Select * From kullanici";
          
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             
             ResultSet rs=  preparedStatement.executeQuery();
             while(rs.next()){
                 
                 if(rs.getString("kullanici_ad").equals(kullanici_ad) && rs.getString("sifre").equals(parola) &&rs.getString("email").equals(email)){
                     
                     return true;
                     
                 }
                
                 
             }
             return false;
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
          
      }
      public int idGetir(String kullanici_ad,String parola,String email){
          String sorgu=" Select * From kullanici ";
           
         try {
             preparedStatement=connection.prepareStatement(sorgu);
            
             ResultSet rs= preparedStatement.executeQuery();
           
            while(rs.next()){
                 
                 if(rs.getString("kullanici_ad").equals(kullanici_ad) && rs.getString("sifre").equals(parola) &&rs.getString("email").equals(email)){
                     
                     return rs.getInt("idKullanici");
                     
                 }
                
                 
             }
            return -1;

         
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
         }
          
      }
      public ArrayList<Top10>  top10Pop(){
        
                ArrayList<Top10> liste=new ArrayList<Top10>();
         try {
             
             statement=connection.createStatement();
             String sorgu="Select Sarki_ad,sanatci,dinlenme_sayisi From sarki where tur= 'pop' Order By dinlenme_sayisi desc ";
             
             ResultSet rs= statement.executeQuery(sorgu);
             int sayac=0;
             
              while(rs.next()){
                 
               String sarkiad = rs.getString("Sarki_ad");
               String sanatci = rs.getString("sanatci");
               int dinlenme=rs.getInt("dinlenme_sayisi");
               liste.add(new Top10(sarkiad, sanatci, dinlenme));
                
                
               sayac++;
               
               if(sayac==10)
               {
                   break;
               }
             }
              return  liste;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         
      }
       public ArrayList<Top10>  top10Jazz(){
        
                ArrayList<Top10> liste=new ArrayList<Top10>();
         try {
             
             statement=connection.createStatement();
             String sorgu="Select Sarki_ad,sanatci,dinlenme_sayisi From sarki where tur= 'jazz' Order By dinlenme_sayisi desc ";
             
             ResultSet rs= statement.executeQuery(sorgu);
             int sayac=0;
             
              while(rs.next()){
                 
               String sarkiad = rs.getString("Sarki_ad");
               String sanatci = rs.getString("sanatci");
               int dinlenme=rs.getInt("dinlenme_sayisi");
               liste.add(new Top10(sarkiad, sanatci, dinlenme));
                
                 
               sayac++;
               
               if(sayac==10)
               {
                   break;
               }
             }
              return  liste;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         
      }
       
        public ArrayList<Top10>  top10Klasik(){
        
                ArrayList<Top10> liste=new ArrayList<Top10>();
         try {
             
             statement=connection.createStatement();
             String sorgu="Select Sarki_ad,sanatci,dinlenme_sayisi From sarki where tur= 'klasik' Order By dinlenme_sayisi desc ";
             
             ResultSet rs= statement.executeQuery(sorgu);
             int sayac=0;
             
              while(rs.next()){
                 
               String sarkiad = rs.getString("Sarki_ad");
               String sanatci = rs.getString("sanatci");
               int dinlenme=rs.getInt("dinlenme_sayisi");
               liste.add(new Top10(sarkiad, sanatci, dinlenme));
                
                 
               sayac++;
               
               if(sayac==10)
               {
                   break;
               }
             }
              return  liste;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         
      }
         public ArrayList<Top10>  top10Dinlenme(){
        
                ArrayList<Top10> liste=new ArrayList<Top10>();
         try {
             
             statement=connection.createStatement();
             String sorgu="Select Sarki_ad,sanatci,dinlenme_sayisi,tur From sarki Order By dinlenme_sayisi desc ";
             
             ResultSet rs= statement.executeQuery(sorgu);
             int sayac=0;
             
              while(rs.next()){
                 
               String sarkiad = rs.getString("Sarki_ad");
               String sanatci = rs.getString("sanatci");
               int dinlenme=rs.getInt("dinlenme_sayisi");
               String tur=rs.getString("tur");
               liste.add(new Top10(sarkiad, sanatci, dinlenme,tur));
                
                 
               sayac++;
               
               if(sayac==10)
               {
                   break;
               }
             }
              return  liste;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         
      }
             public ArrayList<Top10>  top10UlkelereGoreGoster(String x){
        
                ArrayList<Top10> liste=new ArrayList<Top10>();
         try {
             
             statement=connection.createStatement();
             String sorgu="Select sarki.Sarki_ad,sanatci.sanatci_ad,sarki.dinlenme_sayisi,sarki.tur,sanatci.sanatci_ulke From sarki,sanatci where sanatci.sanatci_ulke='"+x+"' And sarki.sanatci=sanatci.sanatci_ad Order By sarki.dinlenme_sayisi desc";
             
             ResultSet rs= statement.executeQuery(sorgu);
             int sayac=0;
             
              while(rs.next()){
                 
               String sarkiad = rs.getString("Sarki_ad");
               String sanatci = rs.getString("sanatci_ad");
               int dinlenme=rs.getInt("dinlenme_sayisi");
               String tur=rs.getString("tur");
               String ulke_adi=rs.getString("sanatci_ulke");
               liste.add(new Top10(sarkiad, sanatci, dinlenme,tur,ulke_adi));
                
                 
               sayac++;
               
               if(sayac==10)
               {
                   break;
               }
             }
              return  liste;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         
      }
             
             public ArrayList<CalmaListesiEkleme> OnerilenleriCalmaListesineEkle(String sarkiad,String sanatciad,String turad){
                                  
         try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki where Sarki_ad ="+"'"+sarkiad+"' and sanatci="+"'"+sanatciad+" and tur="+"'"+turad+"'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<CalmaListesiEkleme> arrayList=new ArrayList<CalmaListesiEkleme>();
               
               int sayac=0;
               while(rs.next()){
                   
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");
                   String  sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new CalmaListesiEkleme(album, sarkiiad, sanatci, sure, dinlenme));
                   sayac++;
                   if(sayac==1){
                       break;
                   }
                  
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
               

                 
                 
          }
             public ArrayList<Sarki> ButunSarkilariEkle(){
                  
                 
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                   
                   String sarkiiad=rs.getString("Sarki_ad");
                   Object tarih=rs.getString("tarih");
                   String sanatci=rs.getString("sanatci");              
                   String album=rs.getString("album");
                   String tur=rs.getString("tur");
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad,tarih, sanatci,album, tur, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }
              public ArrayList<Sarki> CalmaListesinePopEkle(int id){
                  
                
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki,calma_listesi where sarki.idSarki =calma_listesi.sarki_id and  calma_listesi.kullanici_id = "+id+" and tur='pop'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                   
                
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");                                
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad, sanatci, album, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }
              
               public ArrayList<Sarki> CalmaListesinejazzEkle(int id){
                  
                 
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki,calma_listesi where sarki.idSarki =calma_listesi.sarki_id and  calma_listesi.kullanici_id = "+id+" and tur='jazz'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                   
                  
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");                                
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad, sanatci, album, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }
               
                public ArrayList<Sarki> CalmaListesineklasikEkle(int id){
                  
                 
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki,calma_listesi where sarki.idSarki =calma_listesi.sarki_id and  calma_listesi.kullanici_id = "+id+" and tur='klasik'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                  
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");                                
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad, sanatci, album, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }

    public ArrayList<Kullanicilar> ButunKullanicilariEkle(int x){
                  
                 
                 try {
              statement=connection.createStatement();
             
               String sorgu="Select * From kullanici where idKullanici != "+x+" ";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Kullanicilar> arrayList=new ArrayList<Kullanicilar>();

               while(rs.next()){
                   
                   String kullaniciad=rs.getString("kullanici_ad");
                   String tur =rs.getString("abonelik_tur");                 
                   arrayList.add(new Kullanicilar(kullaniciad,tur));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }
      public ArrayList<Sarki> PopCalmaListesiniGetir(int id){
                  
                
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki,calma_listesi where sarki.idSarki =calma_listesi.sarki_id and  calma_listesi.kullanici_id = "+id+" and tur='pop'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                   
                
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");                                
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad, sanatci, album, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }
       public ArrayList<Sarki> JazzCalmaListesiniGetir(int id){
                  
                
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki,calma_listesi where sarki.idSarki =calma_listesi.sarki_id and  calma_listesi.kullanici_id = "+id+" and tur='jazz'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                   
                
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");                                
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad, sanatci, album, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }
        public ArrayList<Sarki> KlasikCalmaListesiniGetir(int id){
                  
                
                 try {
             statement=connection.createStatement();
             
               String sorgu="Select * From sarki,calma_listesi where sarki.idSarki =calma_listesi.sarki_id and  calma_listesi.kullanici_id = "+id+" and tur='klasik'";
               
               ResultSet rs=statement.executeQuery(sorgu);
               
               ArrayList<Sarki> arrayList=new ArrayList<Sarki>();

               while(rs.next()){
                   
                
                   String album=rs.getString("album");
                   String sarkiiad=rs.getString("Sarki_ad");
                   String sanatci=rs.getString("sanatci");                                
                   String sure=rs.getString("sure");
                   int dinlenme=rs.getInt("dinlenme_sayisi");
                   arrayList.add(new Sarki(sarkiiad, sanatci, album, sure, dinlenme));
                
               }
               return arrayList;
               
             
         } catch (SQLException ex) {
             Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
                 
             }
        
          
     public  ArrayList<TakipEdilenler> takipedlienGetir(ArrayList<TakipEdilenler> y){
         
         
         String sorgu="Select * From kullanici Where idKullanici= ?";
         ArrayList<TakipEdilenler> liste=new ArrayList<TakipEdilenler>();
        for(int i=0;i<y.size();i++)
        {
         try {
           
            preparedStatement=connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, y.get(i).getTakipedilen_id());
            
            
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                
                String ad=rs.getString("kullanici_ad");
                String tur=rs.getString("abonelik_tur");
                liste.add(new TakipEdilenler(ad, tur));
                
                
            }
            
        } 
        
         catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
        }
         return liste;
       
     }
     
    
 
}
