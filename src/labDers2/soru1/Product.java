package labDers2.soru1;

public class Product {
    private String ad;
    private int fiyat;

    public int getFiyat() {
        return fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    Product(String ad,int fiyat){
        this.ad=ad;
        this.fiyat=fiyat;
    }
    public void displayInfo(){
        System.out.println("Ad:"+ad+" Fiyat:"+fiyat);
    }
    public static void main(String[] args) {
        ElectronicProduct e1=new ElectronicProduct("Apple","Tablet",78000);
        ElectronicProduct e2=new ElectronicProduct("Samsung","Telefon",23000);
        ClothingProduct c1=new ClothingProduct("Kırmızı","XL","Etek",750);
        ClothingProduct c2=new ClothingProduct("Yeşil","S","Ceket",2300);
        FoodProduct f1=new FoodProduct("Tatlı","17.04.2024","Supangle",100);
        FoodProduct f2=new FoodProduct("Çorba","06.04.2024","Ezogelin",54);
        e1.displayInfo();
        e2.displayInfo();
        c1.displayInfo();
        c2.displayInfo();
        f1.displayInfo();
        f2.displayInfo();
    }
}
