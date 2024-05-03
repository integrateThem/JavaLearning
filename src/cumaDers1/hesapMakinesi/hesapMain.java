package cumaDers1.hesapMakinesi;

public class hesapMain {
    public static void main(String[] args) {
        HesapMakinesi hsp1=new HesapMakinesi();
        System.out.println("2 int toplamı:"+hsp1.hesapla(5,8));
        System.out.println("3 int toplamı:"+hsp1.hesapla(8,12,6));
        System.out.println("2 float toplamı:"+hsp1.hesapla(7.45f,3.5f));
        System.out.println("4 float toplamı:"+hsp1.hesapla(5.6f,2.5f,7.9f,14.5f));
    }
}
