package labDers2.soru2;

public class Isci extends Personel{
    private int saatlikUcret;
    Isci(String isim,int yas,int saatlikUcret){
        super(isim,yas);
        this.saatlikUcret=saatlikUcret;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("İsim:"+getIsim()+" ,Yas:"+getYas()+" ,Saatlik ucret:"+saatlikUcret);
    }
    public void bilgiGoster(String mesaj){
        System.out.println("İsim:"+getIsim()+" ,Yas:"+getYas()+" ,Saatlik ucret:"+saatlikUcret);
        System.out.println(mesaj);
    }
}
