package labDers3.soru3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin girin:");
        String metin= input.nextLine();
        Main  main=new Main();
        Main.innerClass1 inner=main.new innerClass1();
        inner.büyükHarf(metin);
        main.sınıf(metin);
        Anonymous isimsiz=new Anonymous(){
            @Override
            public void karakterSayisi(String metin) {
                System.out.println(metin.length());
            }
        };
        isimsiz.karakterSayisi(metin);
    }
    public void sınıf(String metin){

        class innerClass2 {
            void küçükHarf(String metin){
                System.out.println(metin.toLowerCase());
            }
        }
        innerClass2 methodIn=new innerClass2();
        methodIn.küçükHarf(metin);
    }
    class innerClass1 {
        void büyükHarf(String metin){
            System.out.println(metin.toUpperCase());
        }
     }
}
