
public class Kullanicilar {
    private int id;
    private String kullaniciad;
    private String email;
    private String sifre;
    private String aboneliktur;
    private String kullaniciulke;
    private String odendi_mi;

    public Kullanicilar(int id,String kullaniciad) {
        this.id = id;
        this.kullaniciad=kullaniciad;
    }

    
    
    public Kullanicilar(String kullaniciad, String aboneliktur) {
        this.kullaniciad = kullaniciad;
        this.aboneliktur = aboneliktur;
    }

 
    public Kullanicilar(int id, String kullaniciad, String email, String sifre, String aboneliktur, String kullaniciulke) {
        this.id = id;
        this.kullaniciad = kullaniciad;
        this.email = email;
        this.sifre = sifre;
        this.aboneliktur = aboneliktur;
        this.kullaniciulke = kullaniciulke;
    }

    public Kullanicilar(int id, String kullaniciad, String email, String sifre, String aboneliktur, String kullaniciulke, String odendi_mi) {
        this.id = id;
        this.kullaniciad = kullaniciad;
        this.email = email;
        this.sifre = sifre;
        this.aboneliktur = aboneliktur;
        this.kullaniciulke = kullaniciulke;
        this.odendi_mi = odendi_mi;
    }

    public String getOdendi_mi() {
        return odendi_mi;
    }

    public void setOdendi_mi(String odendi_mi) {
        this.odendi_mi = odendi_mi;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciad() {
        return kullaniciad;
    }

    public void setKullaniciad(String kullaniciad) {
        this.kullaniciad = kullaniciad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAboneliktur() {
        return aboneliktur;
    }

    public void setAboneliktur(String aboneliktur) {
        this.aboneliktur = aboneliktur;
    }

    public String getKullaniciulke() {
        return kullaniciulke;
    }

    public void setKullaniciulke(String kullaniciulke) {
        this.kullaniciulke = kullaniciulke;
    }
    
   
}
