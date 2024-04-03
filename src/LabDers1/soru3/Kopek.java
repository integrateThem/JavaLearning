package LabDers1.soru3;

public class Kopek extends Hayvan{
    String tuyRengi;
    public Kopek(String isim,String tuyRengi){
        this.isim=isim;
        this.ses="havhav";
        this.tuyRengi=tuyRengi;
    }
    public void kopekOzellik(){
        System.out.println("Kopegin ismi:"+isim+" ,Kopegin sesi:"+ses+" ,Kopegin tuy rengi:"+tuyRengi);
    }
}
