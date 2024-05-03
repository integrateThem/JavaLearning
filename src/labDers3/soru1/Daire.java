package labDers3.soru1;

public class Daire extends Şekil {
    int yaricap,pi=3;
    Daire(int yaricap){
        this.yaricap=yaricap;
    }

    @Override
    int alanHesaplama() {
        int alan=pi*yaricap*yaricap;
        return alan;
    }

    @Override
    int cevreHesaplama() {
        int cevre=2*pi*yaricap;
        return cevre;
    }
}
