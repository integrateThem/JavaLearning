package Quiz;

public class Discount {
    int fiyat;
    Discount(int fiyat){
        this.fiyat=fiyat;
    }
    public int Normal(){
       return this.fiyat-this.fiyat*10/100;
    }
    public int Premium(){
        return ((this.fiyat-this.fiyat*10/100)-(this.fiyat-this.fiyat*10/100)*20/100);
    }
    public int Gold(){
        return ((this.fiyat-this.fiyat*10/100)-(this.fiyat-this.fiyat*10/100)*15/100);
    }
    public int Silver(){
        return ((this.fiyat-this.fiyat*10/100)-(this.fiyat-this.fiyat*10/100)*10/100);
    }
}
