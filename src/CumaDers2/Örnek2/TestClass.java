package CumaDers2.Örnek2;

public class TestClass implements Interface1,Interface2{
    @Override
    public void display() {
        System.out.println("Display from Interface");
    }

    @Override
    public void print() {
        System.out.println("Print from Interface");
    }

    @Override
    public void show() {
        Interface1.super.show();
    }
    @Override
    public void show2() {
        System.out.println("show2 from API");
    }
}
