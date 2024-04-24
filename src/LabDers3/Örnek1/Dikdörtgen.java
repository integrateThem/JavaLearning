package LabDers3.Örnek1;

public class Dikdörtgen extends Şekil{
    int kenar1,kenar2;
    Dikdörtgen(int kenar1 ,int kenar2){
        this.kenar1=kenar1;
        this.kenar2=kenar2;
    }
    @Override
    int alanHesaplama() {
        int alan = kenar1*kenar2;
        return alan;
    }

    @Override
    int cevreHesaplama() {
        int cevre=2*kenar1+2*kenar2;
        return cevre;
    }
}
