package LabDers3.Örnek1;

public class Kare extends Şekil {
    int kenar;
    Kare(int kenar){
        this.kenar=kenar;
    }

    @Override
    int alanHesaplama() {
        int alan = kenar*kenar;
        return alan;
    }

    @Override
    int cevreHesaplama() {
        int cevre=4*kenar;
        return cevre;
    }
}
