package labDers4.soru4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        File dosya=new File("C:\\Users\\Ahmed Faruk Er\\Desktop\\cv.txt");
        try{
            dosya.createNewFile();
        }
        catch (IOException e){
            System.out.println("Dosya oluşturulamadı.");
        }
        System.out.println("İsminizi giriniz:");
        String isim=input.nextLine();
        try {
            FileWriter yazici = new FileWriter("C:\\Users\\Ahmed Faruk Er\\Desktop\\cv.txt");
            yazici.write(isim);
            yazici.close();
            System.out.println("Bilgileriniz başarıyla dosyaya aktarildi.");
        }
        catch (IOException e){
            System.out.println("Bir hatayla karşılaşıldı.");
        }
    }
}
