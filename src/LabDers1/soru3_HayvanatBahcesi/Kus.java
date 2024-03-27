package LabDers1.soru3_HayvanatBahcesi;

public class Kus extends Hayvan {
    int kanatAcikligi;
    public Kus(String isim,int kanatAcikligi){
        this.isim=isim;
        this.ses="cikcik";
        this.kanatAcikligi=kanatAcikligi;
    }
    public void kusOzellik(){
        System.out.println("Kusun ismi:"+isim+" Kusun sesi:"+ses+" Kusun kanat acikligi:"+kanatAcikligi+"cm");
    }
}
