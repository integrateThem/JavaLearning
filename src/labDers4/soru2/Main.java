package labDers4.soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Özel karakter dışında bir deger girin");
        String deger2=input.next();
        char deger=deger2.charAt(0);
        if(((deger>=0)&&(deger<=47))||((deger>=58)&&(deger<=64))||((deger>=91)&&(deger<=96))||((deger>=123)&&(deger<=127)))
            throw new Exception("Özel karakter girildi");
        System.out.println("test");;
    }
}
