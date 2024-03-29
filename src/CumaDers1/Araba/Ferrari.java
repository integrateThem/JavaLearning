package CumaDers1.Araba;

public class Ferrari extends Car {
    Ferrari(){
        car="Ferrari";
        year=1987;
        color="Red";
    }

    @Override
    public void information() {
        System.out.println("Car:"+car+" Year:"+year+" Color:"+color);
    }
}
