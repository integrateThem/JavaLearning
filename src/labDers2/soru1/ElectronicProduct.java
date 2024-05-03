package labDers2.soru1;

public class ElectronicProduct extends Product {
    String marka;
    ElectronicProduct(String marka,String ad,int fiyat) {
        super(ad,fiyat);
        this.marka = marka;
    }

    @Override
    public void displayInfo() {
        System.out.println("Marka:"+marka+" ,Ad:"+getAd()+" ,Fiyat:"+getFiyat()+"TL");
    }
}
