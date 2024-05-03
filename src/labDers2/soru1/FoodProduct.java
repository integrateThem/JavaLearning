package labDers2.soru1;

public class FoodProduct extends Product{
    String cesit,SKT;
    FoodProduct(String cesit,String SKT,String ad,int fiyat){
        super(ad,fiyat);
        this.cesit=cesit;
        this.SKT=SKT;
    }

    @Override
    public void displayInfo() {
        System.out.println("Cesit:"+cesit+" ,Son Kullanma Tarihi:"+SKT+" ,Ad:"+getAd()+" ,Fiyat:"+getFiyat()+"TL");
    }
}
