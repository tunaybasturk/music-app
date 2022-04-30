
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


class Sarkilar{
    
    
    private int idSarki;
    private String  Sarki_ad;
    private String  tarih;
    private String  sanatci;
    private String  album;
    private String  tur;
    private String  sure;
    private int dinlenmeSayisi;

    public Sarkilar(int idSarki, String Sarki_ad, String tarih, String sanatci, String album, String tur, String sure, int dinlenmeSayisi) {
        this.idSarki = idSarki;
        this.Sarki_ad = Sarki_ad;
        this.tarih = tarih;
        this.sanatci = sanatci;
        this.album = album;
        this.tur = tur;
        this.sure = sure;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public int getIdSarki() {
        return idSarki;
    }

    public void setIdSarki(int idSarki) {
        this.idSarki = idSarki;
    }

    public String getSarki_ad() {
        return Sarki_ad;
    }

    public void setSarki_ad(String Sarki_ad) {
        this.Sarki_ad = Sarki_ad;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
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

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }
    
}

class CalmaListesi{
    private int id;
    private int kullanici_id;
    private int sarkiid;
    private String sarkiad;
    private String calmalistesi_tur;

     public CalmaListesi(int id, int kullanici_id, int sarkiid, String calmalistesi_tur) {
        this.id = id;
        this.sarkiid = sarkiid;
        this.kullanici_id = kullanici_id;
        this.calmalistesi_tur = calmalistesi_tur;
    }

    
    public CalmaListesi(int id, int sarkiid, String sarkiad, String calmalistesi_tur) {
        this.id = id;
        this.sarkiid = sarkiid;
        this.sarkiad = sarkiad;
        this.calmalistesi_tur = calmalistesi_tur;
    }

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSarkiid() {
        return sarkiid;
    }

    public void setSarkiid(int sarkiid) {
        this.sarkiid = sarkiid;
    }

    public String getSarkiad() {
        return sarkiad;
    }

    public void setSarkiad(String sarkiad) {
        this.sarkiad = sarkiad;
    }

   

    public String getCalmalistesi_tur() {
        return calmalistesi_tur;
    }

    public void setCalmalistesi_tur(String calmalistesi_tur) {
        this.calmalistesi_tur = calmalistesi_tur;
    }
                     
}

class Sanatci{
    
    private int sanatci_id;
    private String sanatci_ad;
    private String sanatci_ulke;

    public Sanatci(int sanatci_id, String sanatci_ad, String sanatci_ulke) {
        this.sanatci_id = sanatci_id;
        this.sanatci_ad = sanatci_ad;
        this.sanatci_ulke = sanatci_ulke;
    }

    public int getSanatci_id() {
        return sanatci_id;
    }

    public void setSanatci_id(int sanatci_id) {
        this.sanatci_id = sanatci_id;
    }

    public String getSanatci_ad() {
        return sanatci_ad;
    }

    public void setSanatci_ad(String sanatci_ad) {
        this.sanatci_ad = sanatci_ad;
    }

    public String getSanatci_ulke() {
        return sanatci_ulke;
    }

    public void setSanatci_ulke(String sanatci_ulke) {
        this.sanatci_ulke = sanatci_ulke;
    }
 
}

class Album{
    private int idalbum;
    private String album_adi;
    private String album_sanatci;
    private String album_sarki;
    private String album_tarih;
    private String album_tur;

    public Album(int idalbum, String album_adi, String album_sanatci, String album_sarki, String album_tarih, String album_tur) {
        this.idalbum = idalbum;
        this.album_adi = album_adi;
        this.album_sanatci = album_sanatci;
        this.album_sarki = album_sarki;
        this.album_tarih = album_tarih;
        this.album_tur = album_tur;
    }

    public int getIdalbum() {
        return idalbum;
    }

    public void setIdalbum(int idalbum) {
        this.idalbum = idalbum;
    }

    public String getAlbum_adi() {
        return album_adi;
    }

    public void setAlbum_adi(String album_adi) {
        this.album_adi = album_adi;
    }

    public String getAlbum_sanatci() {
        return album_sanatci;
    }

    public void setAlbum_sanatci(String album_sanatci) {
        this.album_sanatci = album_sanatci;
    }

    public String getAlbum_sarki() {
        return album_sarki;
    }

    public void setAlbum_sarki(String album_sarki) {
        this.album_sarki = album_sarki;
    }

    public String getAlbum_tarih() {
        return album_tarih;
    }

    public void setAlbum_tarih(String album_tarih) {
        this.album_tarih = album_tarih;
    }

    public String getAlbum_tur() {
        return album_tur;
    }

    public void setAlbum_tur(String album_tur) {
        this.album_tur = album_tur;
    }
    
}


public class BaglantiIslemleri {
    
    private  Connection connection=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    

    public BaglantiIslemleri() {
        
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
                System.out.println("baglantı basarısız");
        }
        
       
    }
    public void kullaniciEkle(String ad, String email,String sifre,String abonelik_tur,String ulke,String odendi_mi){
        
        String sorgu="Insert Into kullanici (kullanici_ad,email,sifre,abonelik_tur,kullanici_ulke,odendi_mi) Values(?,?,?,?,?,?)";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, sifre);
            preparedStatement.setString(4, abonelik_tur);
            preparedStatement.setString(5, ulke);
            preparedStatement.setString(6, odendi_mi);
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    public void kullaniciSil(int id) {
        
        String sorgu="Delete From kullanici Where idKullanici=?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
       
    }


    public boolean adminKontrol(String ad,String parola) {
   
        
        if(Baglanti.admin_ad.equals(ad) && Baglanti.admin_parola.equals(parola)){
            return true;
            
        }else{
            return false;
        }
    }
    
    public void kullaniciGuncelle(int id, String ad, String email, String sifre, String abonelik_tur, String ulke) {

        String sorgu="Update kullanici set kullanici_ad= ?,email= ?,sifre= ?,abonelik_tur= ?,kullanici_ulke= ? Where idKullanici= ? ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, sifre);
            preparedStatement.setString(4, abonelik_tur);
            preparedStatement.setString(5, ulke);
            preparedStatement.setInt(6, id);
            
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void calmalistesiKullaniciSil(int id){
        
         String sorgu="Delete From calma_listesi Where kullanici_id=?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    public ArrayList<Kullanicilar> kullanicilariGetir(){
        
         ArrayList<Kullanicilar> cikti = new ArrayList<Kullanicilar>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From kullanici";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
                int id = rs.getInt("idKullanici");
                String ad = rs.getString("kullanici_ad");
                String email = rs.getString("email");
                String sifre  = rs.getString("sifre");
                String abonelik_tur = rs.getString("abonelik_tur");
                String kullanici_ulke = rs.getString("kullanici_ulke");
                String odendimi=rs.getString("odendi_mi");
                
                cikti.add(new Kullanicilar(id, ad, email, sifre, abonelik_tur,kullanici_ulke,odendimi));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    public ArrayList<Sarkilar> sarkilariGetir(){
        
         ArrayList<Sarkilar> cikti = new ArrayList<Sarkilar>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From sarki";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
                int idSarki = rs.getInt("idSarki");
                String Sarki_ad = rs.getString("Sarki_ad");
                String tarih = rs.getString("tarih");
                String sanatci  = rs.getString("sanatci");
                String album = rs.getString("album");
                String tur = rs.getString("tur");
                String sure=rs.getString("sure");
                int dinlenme_sayisi=rs.getInt("dinlenme_sayisi");
                
                cikti.add(new Sarkilar(idSarki, Sarki_ad, tarih, sanatci, album,tur,sure,dinlenme_sayisi));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
     public void sarkiEkle(String sarkiad, String tarih,String sanatciad,String album,String tur,String sure,int dinlenme_sayisi){
        
        String sorgu="Insert Into sarki (Sarki_ad,tarih,sanatci,album,tur,sure,dinlenme_sayisi) Values(?,?,?,?,?,?,?)";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
          
            preparedStatement.setString(1, sarkiad);
            preparedStatement.setString(2, tarih);
            preparedStatement.setString(3, sanatciad);
            preparedStatement.setString(4, album);
            preparedStatement.setString(5, tur);
            preparedStatement.setString(6, sure);
            preparedStatement.setInt(7, dinlenme_sayisi);
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
      public void sarkiEkle1(String sarkiad,String tur){
        
        String sorgu="Insert Into sarki (Sarki_ad,tur) Values(?,?)";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
          
            preparedStatement.setString(1, sarkiad);         
            preparedStatement.setString(2, tur);
          
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
      public void sarkiSil(int sarkiId) {
        
        String sorgu="Delete From sarki Where idSarki=?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, sarkiId);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
       
    }
      public void sarkiGuncelle(int sarkid,String sarkiad, String tarih,String sanatciad,String album,String tur,String sure,int dinlenme_sayisi) {

        String sorgu="Update sarki set Sarki_ad= ?,tarih= ?,sanatci= ?,album= ?,tur= ?,sure= ?,dinlenme_sayisi= ? Where idSarki= ? ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
           
            preparedStatement.setString(1, sarkiad);
            preparedStatement.setString(2, tarih);
            preparedStatement.setString(3, sanatciad);
            preparedStatement.setString(4, album);
            preparedStatement.setString(5, tur);
            preparedStatement.setString(6, sure);
            preparedStatement.setInt(7, dinlenme_sayisi);
            preparedStatement.setInt(8, sarkid);
            
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

        public ArrayList<CalmaListesi> calmaListesiGetir(){
        
         ArrayList<CalmaListesi> cikti = new ArrayList<CalmaListesi>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From sarki,calma_listesi ";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
               
                int id=rs.getInt("Id");
                int kullanici_id=rs.getInt("kullanici_id");
                int sarki_id=rs.getInt("sarki_id");
                String calmalistesi_tur=rs.getString("calmalistesi_tur");
                 
                cikti.add(new CalmaListesi(id, kullanici_id, sarki_id, calmalistesi_tur));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
        public ArrayList<CalmaListesi> calmaListesiGetir(int kullanici_id){
        
         ArrayList<CalmaListesi> cikti = new ArrayList<CalmaListesi>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From sarki,calma_listesi Where kullanici_id= "+kullanici_id+" and sarki.idSarki=calma_listesi.sarki_id";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
               
                int id=rs.getInt("Id");
                int sarki_id=rs.getInt("sarki_id");
                String sarki_ad=rs.getString("Sarki_ad");
                String calmalistesi_tur=rs.getString("calmalistesi_tur");
                 
                cikti.add(new CalmaListesi(id, sarki_id, sarki_ad, calmalistesi_tur));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
         public void CalmaListesinesarkiEkle(int kullanici_id, int sarki_id,String calmalistesi_tur){
        
        String sorgu="Insert Into calma_listesi (kullanici_id,sarki_id,calmalistesi_tur) Values(?,?,?)  ";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
          
            preparedStatement.setInt(1, kullanici_id);
            preparedStatement.setInt(2, sarki_id);
            preparedStatement.setString(3, calmalistesi_tur);
           
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
          public void CalmaListesindensarkiSil(int kullanici_id,int sarkiId) {
        
        String sorgu="Delete From calma_listesi Where sarki_id=? and kullanici_id=?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, sarkiId);
            preparedStatement.setInt(2, kullanici_id);

            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
       
    }
          public void CalmaListesindesarkiGuncelle(int sarkid,String sarkiad,String tur) {

        String sorgu="Update sarki set Sarki_ad= ?,tur= ? Where idSarki= ? ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
           
            preparedStatement.setString(1, sarkiad);
            preparedStatement.setString(2, tur); 
            preparedStatement.setInt(3, sarkid);
            
            
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
           public void CalmaListesindeTurGuncelle(int sarkid,String sarkiad,String tur) {

        String sorgu="Update calma_listesi set calmalistesi_tur= ? Where sarki_id= ? ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
          
            preparedStatement.setString(1, tur); 
            preparedStatement.setInt(2, sarkid);
            
            
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
           public ArrayList<Kullanicilar> KullanicilariGetir(){
        
         ArrayList<Kullanicilar> cikti = new ArrayList<Kullanicilar>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From kullanici";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
               
                int id=rs.getInt("idKullanici");
                String ad=rs.getString("kullanici_ad");
                
                 
                cikti.add(new Kullanicilar(id,ad));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
           public String turGetir(int sarki_id) {
               
             try {
            statement=connection.createStatement();
             String sorgu="Select tur From sarki Where idSarki="+sarki_id;
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
               
                String tur=rs.getString("tur");
              
                return tur;
            }
            return null;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
        }
           public ArrayList<Sanatci> SanatciGetir(){
        
         ArrayList<Sanatci> cikti = new ArrayList<Sanatci>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From sanatci";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
                int sanatci_id=rs.getInt("idSanatci");
                String sanatci_ad=rs.getString("sanatci_ad");
                String sanatci_ulke=rs.getString("sanatci_ulke");
                
                cikti.add(new Sanatci(sanatci_id, sanatci_ad, sanatci_ulke));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
           public ArrayList<Album> albumleriGetir(){
        
         ArrayList<Album> cikti = new ArrayList<Album>();
         
        try {
            statement=connection.createStatement();
             String sorgu="Select * From album";
             
            ResultSet rs=statement.executeQuery(sorgu);
            
             
             while(rs.next()) {
                int sanatci_id=rs.getInt("idalbum");
                String album_adi=rs.getString("album_adi");
                String album_sanatci=rs.getString("album_sanatci");
                String album_sarki=rs.getString("album_sarki");
                String album_tarih=rs.getString("album_tarih");
                String album_tur=rs.getString("album_tur");
                
                cikti.add(new Album(sanatci_id, album_adi, album_sanatci,album_sarki,album_tarih,album_tur));             
                
            }
            return cikti;
             
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
         
            public void albumeSarkiEkle(String sarkiad, String tarih,String sanatciad,String album,String tur){
        
        String sorgu="Insert Into album (album_adi,album_sanatci,album_sarki,album_tarih,album_tur) Values(?,?,?,?,?) ";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
          
            preparedStatement.setString(1, album);
            preparedStatement.setString(2, sanatciad);
            preparedStatement.setString(3, sarkiad);
            preparedStatement.setString(4, tarih);
            preparedStatement.setString(5, tur);
            
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    public void albumdenSarkiSil(String album, String sanatci, String Sarki_ad, String tarih, String tur) {
       
         String sorgu="Delete From album Where album_adi=? and album_sanatci=? and album_sarki=? and album_tarih=? and album_tur=?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, album);
            preparedStatement.setString(2, sanatci);
            preparedStatement.setString(3, Sarki_ad);
            preparedStatement.setString(4, tarih);
            preparedStatement.setString(5, tur);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }

    public void albumdenSarkiGuncelle(String album, String sanatci, String Sarki_ad, String tarih, String tur) {
        
         String sorgu="Update album set album_adi= ?,album_sanatci=?,album_sarki=? Where album_sanatci=? and album_sarki=? and album_tarih=? and album_tur=? ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
           
            preparedStatement.setString(1, album);
            preparedStatement.setString(2, sanatci);
            preparedStatement.setString(3, Sarki_ad);
            preparedStatement.setString(4, sanatci);
            preparedStatement.setString(5, Sarki_ad);
            preparedStatement.setString(6, tarih);
            preparedStatement.setString(7, tur);
            
            
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public  void sanatciEkle(String sanatci_ad, String ulke) {
       
         String sorgu="Insert Into sanatci (sanatci_ad,sanatci_ulke) Values(?,?) ";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
          
            preparedStatement.setString(1, sanatci_ad);
            preparedStatement.setString(2, ulke);
          
            
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void SanatciSil(String sanatci_ad, String ulke) {
       
         String sorgu="Delete From sanatci Where sanatci_ad=? and sanatci_ulke=? ";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, sanatci_ad);
            preparedStatement.setString(2, ulke);
                      
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    public void sarkiTablosundanSanatciSil(String sanatci_ad) {
       
         String sorgu="Delete From sarki Where sanatci= ? ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, sanatci_ad);
            
                      
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    public void albumTablosundanSanatciSil(String sanatci_ad) {
       
         String sorgu="Delete From album Where album_sanatci =?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, sanatci_ad);
            
                      
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
     public void SanatciGuncelle(int sanatci_id,String sanatci_ad, String ulke) {
        
         String sorgu="Update sanatci set sanatci_ad= ?,sanatci_ulke=? Where idSanatci=?";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
                     
            preparedStatement.setString(1, sanatci_ad);
            preparedStatement.setString(2, ulke);
            preparedStatement.setInt(3, sanatci_id);
                       
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void albumTablosundasanatciGuncelle(String sanatci_ad,String yeni_ad) {
       
         String sorgu="Update album set album_sanatci= ? Where album_sanatci= ?";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
                     
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, sanatci_ad);
            
                       
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void sarkiTablosundasanatciGuncelle(String sanatci_ad,String yeni_ad) {
       
         String sorgu="Update sarki set sanatci= ?Where sanatci= ?";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
                     
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, sanatci_ad);
          
                       
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public  void albumEkle(String album_ad,String album_sanatci,String album_sarki,String album_tarih,String album_tur) {
       
         String sorgu="Insert Into album (album_adi,album_sanatci,album_sarki,album_tarih,album_tur) Values(?,?,?,?,?) ";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
          
            preparedStatement.setString(1, album_ad);
            preparedStatement.setString(2, album_sanatci);
            preparedStatement.setString(3, album_sarki);
            preparedStatement.setString(4, album_tarih);
            preparedStatement.setString(5, album_tur);
          
            
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void albumSil(String ad) {

        String sorgu="Delete From album Where album_adi IN(select A.album_adi From(Select album_adi)  A Where A.album_adi=?)";
        
        try {
            
            preparedStatement=connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            
                      
           preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void sarkidanAlbumuSil(int album_id) {
      
        
         String sorgu="Delete From sarki Where album IN (select album_adi From album Where idalbum=?) ";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
         
            preparedStatement.setInt(1, album_id);           
                      
           preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void albumGuncelle(int id, String album_ad, String album_sanatci, String album_sarki, String album_tarih, String album_tur) {

       String sorgu="Update album set album_adi= ?,album_sanatci=?,album_sarki=?,album_tarih=?,album_tur=? Where idalbum=?";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
                     
            preparedStatement.setString(1, album_ad);
            preparedStatement.setString(2, album_sanatci);
            preparedStatement.setString(3, album_sarki);
            preparedStatement.setString(4, album_tarih);
            preparedStatement.setString(5, album_tur);               
            preparedStatement.setInt(6, id);
                       
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

    public void sarkiAlbumGuncelle(String album_ad,String album_sanatci,String album_sarki,String eskialbum,String album_sanatcieski,String eskisarki) {
      
         String sorgu="Update sarki set album= ?,sanatci=?,Sarki_ad=? Where album=? and Sarki_ad=? and sanatci=?";
         
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            
           
            preparedStatement.setString(1, album_ad);
            preparedStatement.setString(2, album_sanatci);
            preparedStatement.setString(3, album_sarki);
            preparedStatement.setString(4, eskialbum);
            preparedStatement.setString(5, eskisarki);
            preparedStatement.setString(6, album_sanatcieski);
          
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BaglantiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
 
           
 }

  