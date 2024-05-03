package labDers3.soru1;

public class Main {
    public static void main(String[] args) {
        Kare kare=new Kare(7);
        Dikdörtgen dikdörtgen=new Dikdörtgen(3,8);
        Daire daire=new Daire(9);
        System.out.println("Karenin alani:"+kare.alanHesaplama()+"\nKarenin cevresi:"+kare.cevreHesaplama());
        System.out.println("Diktörgenin alani:"+dikdörtgen.alanHesaplama()+"\nDikdörtgenin cevresi:"+dikdörtgen.cevreHesaplama());
        System.out.println("Dairenin alani:"+daire.alanHesaplama()+"\nDairenin cevresi:"+daire.cevreHesaplama());
    }
}
