package LabDers2.soru2;

public class Personel {
    private String isim;
    private int yas;
    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    Personel(){
    }
    Personel(String isim,int yas){
        this.isim=isim;
        this.yas=yas;
    }

    public void bilgiGoster(){
        System.out.println("İsim:"+isim+" ,Yas"+yas);
    }

    public static void main(String[] args) {
        Mudur m1=new Mudur("Mehmet",42,"IT");
        Isci i1=new Isci("Semih",23,300);
        Mudur m2=new Mudur("Ömer",47,"Finans");
        Isci i2=new Isci("Salih",36,320);
        m1.bilgiGoster();
        System.out.println("----------------------------");
        m2.bilgiGoster("Yakında terfi alacak.");
        System.out.println("----------------------------");
        i1.bilgiGoster();
        System.out.println("----------------------------");
        i2.bilgiGoster("Yakında müdürlüğe yükseltilecek.");
    }
}
