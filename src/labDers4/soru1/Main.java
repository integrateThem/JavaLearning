package labDers4.soru1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2;
        String sayi3;
        System.out.println("bir sayi giriniz");
        try{
            sayi1=input.nextInt();
        }
        catch (Exception e){
            System.out.println("Sayı dışında bir karakter girildi.");
            System.out.println(e.toString());
        }
        System.out.println("2. bir sayı giriniz.");
        sayi3=input.nextLine();
        sayi3=input.nextLine();
        try{
            sayi2=Integer.parseInt(sayi3);
        }
        catch(Exception e){
            System.out.println("Sayı dışında bir karakter girildi");
            System.out.println(e.toString());
        }
    }
}
