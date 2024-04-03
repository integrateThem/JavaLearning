package LabDers2.soru2;

public class Mudur extends Personel{
    private String departman;
    Mudur(String isim,int yas,String departman){
        super(isim,yas);
        this.departman=departman;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("İsim:"+getIsim()+" ,Yas:"+getYas()+" ,Departman:"+departman);
    }
    public void bilgiGoster(String mesaj){
        System.out.println("İsim:"+getIsim()+" ,Yas:"+getYas()+" ,Departman:"+departman);
        System.out.println(mesaj);
    }
}
