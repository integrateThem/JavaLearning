package cumaDers1.araba;
public class Koenigsegg extends Car {
    Koenigsegg(){
        car="Konigsegg";
        year=2015;
        color="Blue";
    }
    @Override
    public void information() {
        System.out.println("Car:"+car+" Year:"+year+" Color:"+color);
    }
}
