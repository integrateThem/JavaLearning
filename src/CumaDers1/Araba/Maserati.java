package CumaDers1.Araba;

public class Maserati extends Car{
    Maserati(){
        car="Maserati";
        year=2006;
        color="Gray";
    }
    @Override
    public void information() {
        System.out.println("Car:"+car+" Year:"+year+" Color:"+color);
    }
}
