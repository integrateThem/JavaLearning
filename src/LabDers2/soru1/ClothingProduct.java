package LabDers2.soru1;
public class ClothingProduct extends Product{
    String renk,beden;
    ClothingProduct(String renk,String beden,String ad,int fiyat){
        super(ad,fiyat);
        this.renk=renk;
        this.beden=beden;
    }

    @Override
    public void displayInfo() {
        System.out.println("Beden:"+beden+" ,Renk:"+renk+" ,Ad:"+getAd()+" ,Fiyat:"+getFiyat()+"TL");
    }
}
