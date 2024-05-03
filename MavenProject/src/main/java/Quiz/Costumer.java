package Quiz;

public class Costumer {
    private String ad,soyad,emailAdres,uyelikTuru;
    Costumer(String ad,String soyad ,String emailAdres, String uyelikTuru){
        this.ad=ad;
        this.soyad=soyad;
        this.emailAdres=emailAdres;
        this.uyelikTuru=uyelikTuru;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public String getUyelikTuru() {
        return uyelikTuru;
    }

    public void setUyelikTuru(String uyelikTuru) {
        this.uyelikTuru = uyelikTuru;
    }
    public void bilgiGuncelle(String ad,String soyad ,String emailAdres, String uyelikTuru){
        this.ad=ad;
        this.soyad=soyad;
        this.emailAdres=emailAdres;
        this.uyelikTuru=uyelikTuru;
    }
}
