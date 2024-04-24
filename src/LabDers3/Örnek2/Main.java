package LabDers3.Örnek2;

public class Main implements ElektronikAksamlar,MotorAksamları{
    public static void main(String[] args) {
        Main main = new Main();
        main.motorAç();
        main.motorKapa();
        main.radyoAç();
        main.radyoKapa();
        main.sesAç();
        main.sesKapa();
        main.silecekAç();
        main.silecekKapa();
    }

    @Override
    public void motorAç() {
        System.out.println("Motor açıldı.");
    }

    @Override
    public void motorKapa() {
        System.out.println("Motor kapandı.");
    }

    @Override
    public void radyoAç() {
        System.out.println("Radyo açıldı.");
    }

    @Override
    public void radyoKapa() {
        System.out.println("Radyo kapandı.");
    }

    @Override
    public void sesAç() {
        System.out.println("Ses açıldı.");
    }

    @Override
    public void sesKapa() {
        System.out.println("Ses kapandı.");
    }

    @Override
    public void silecekAç() {

    }

    @Override
    public void silecekKapa() {

    }
}
