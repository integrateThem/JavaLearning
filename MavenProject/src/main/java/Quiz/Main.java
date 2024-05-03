package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.EmailSender;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Costumer> myList=new ArrayList<>();
        String ad,soyad,emailAdres = null,uyelikTuru= null;
        int islem,uyelik,fiyat,indirimliFiyat=0,sayac=0,secim=0;
        while(true) {
            System.out.println("Üye oluşturmak icin 1'e\nFiyat hesaplayıp maile göndermek için 2'ye\n" +
                    "Üye bilgisi güncellemek için 3'e\n" +
                    "Üye silmek için 4'e"+"\nÇıkmak için 5'e basiniz.");
            islem = input.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Sırasıyla adınızı,soyadınızı ve email adresinizi giriniz:");
                    ad = input.nextLine();
                    ad = input.nextLine();
                    soyad = input.nextLine();
                    emailAdres = input.nextLine();
                    System.out.println("Uyelik turu seciniz:\n1-Uyelik yok\n2-Premium\n3-Gold\n4-Silver");
                    uyelik = input.nextInt();
                    switch (uyelik) {
                        case 1:
                            uyelikTuru = "Normal";
                            break;
                        case 2:
                            uyelikTuru = "Premium";
                            break;
                        case 3:
                            uyelikTuru = "Gold";
                            break;
                        case 4:
                            uyelikTuru = "Silver";
                            break;
                        default:
                            System.out.println("Geçersiz değer girdiniz.");
                            continue;
                    }
                    myList.add(new Costumer(ad, soyad, emailAdres, uyelikTuru));
                    System.out.println("\n\n\nBilgileriniz:"+"\nAd:"+ad+"\nSoyad:"+soyad
                    +"\nEmail adresi:"+emailAdres+"\nÜyelik türü:"+uyelikTuru+"\n");
                    sayac++;
                    System.out.println(sayac+".üye girildi.");
                    System.out.println("Kayıt olunan üye sayısı:"+sayac);
                    continue;
                case 2:
                    System.out.println("Kaçıncı üye için işlem yapmak istediğinizi giriniz\nÜye sayısı:"+sayac);
                    secim=input.nextInt();
                    System.out.println("Aldığınız ürünün fiyatını giriniz");
                    fiyat = input.nextInt();
                    Discount indirim = new Discount(fiyat);
                    if (myList.get(secim-1).getUyelikTuru() == "Normal")
                        indirimliFiyat = indirim.Normal();
                    else if (myList.get(secim-1).getUyelikTuru() == "Premium")
                        indirimliFiyat = indirim.Premium();
                    else if (myList.get(secim-1).getUyelikTuru() == "Gold")
                        indirimliFiyat = indirim.Gold();
                    else if (myList.get(secim-1).getUyelikTuru() == "Silver")
                        indirimliFiyat = indirim.Silver();
                    EmailSender.sendPlainTextEmail("ahmederfaruk@gmail.com",
                            myList.get(secim-1).getEmailAdres(),
                            "Ürün fiyatı",
                            "Aldığınız ürünün fiyatı:" + indirimliFiyat,
                            true);
                    continue;
                case 3:
                    System.out.println("Kaçıncı üyenin bilgilerini güncelleştirmek istiyorsunuz\nÜye Sayısı:"+sayac);
                    secim=input.nextInt();
                    System.out.println("Bilgilerinizin güncellenmiş halini giriniz");
                    ad = input.nextLine();
                    ad = input.nextLine();
                    soyad = input.nextLine();
                    emailAdres = input.nextLine();
                    System.out.println("Uyelik turu seciniz:\n1-Uyelik yok\n2-Premium\n3-Gold\n4-Silver");
                    uyelik = input.nextInt();
                    switch (uyelik) {
                        case 1:
                            uyelikTuru = "Normal";
                            break;
                        case 2:
                            uyelikTuru = "Premium";
                            break;
                        case 3:
                            uyelikTuru = "Gold";
                            break;
                        case 4:
                            uyelikTuru = "Silver";
                            break;
                        default:
                            System.out.println("Geçersiz değer girdiniz,üyelik türü değiştirilmiyor.");
                    }
                    myList.get(secim).bilgiGuncelle(ad, soyad, emailAdres, uyelikTuru);
                    System.out.println("\n\n\nYeni bilgileriniz:"+"\nAd:"+myList.get(secim-1).getAd()+"\nSoyad:"+myList.get(secim-1).getSoyad()
                            +"\nEmail adresi:"+ myList.get(secim-1).getEmailAdres()+"\nÜyelik türü:"+myList.get(secim-1).getUyelikTuru()+"\n");
                    continue;
                case 4:
                    System.out.println("Kacıncı üyeyi silmek istediğinizi giriniz\nÜye sayısı:"+sayac);
                    secim=input.nextInt();
                    myList.remove(secim-1);
                    sayac--;
                    System.out.println("Diğer üyelerin sırası 1 düştü.");
                    continue;
                case 5:
                    System.out.println("MENÜDEN ÇIKILIYOR...");
                    break;
                default:
                    System.out.println("Geçersiz değer girdiniz tekrar giriniz.");
                    continue;
            }
            break;
        }
    }
}
