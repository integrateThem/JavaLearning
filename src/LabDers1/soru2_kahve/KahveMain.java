package LabDers1.soru2_kahve;

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
