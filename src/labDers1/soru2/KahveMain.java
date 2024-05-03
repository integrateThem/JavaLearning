package labDers1.soru2;

public class KahveMain {
    public static void main(String[] args) {
        KontrolPaneli kahve=new KontrolPaneli();
        kahve.espressoYap();
        kahve.temizleme();
        kahve.amerikanoYap();
        kahve.temizleme();
        kahve.latteYap();
        kahve.temizleme();

    }
}
