package LabDers1.soru2_kahve;

public class KontrolPaneli {
    int suMiktari=150;
    Boolean temizlik=false;
    public void temizleme(){
        if(temizlik!=true) {
            temizlik = true;
            System.out.println("Makine temizlendi");
        }
        else{
            System.out.println("Makine zaten temiz");
        }
    }
    public void espressoYap() {
        if (temizlik == true) {
            if (suMiktari >= 50) {
                System.out.println("Espresso yapildi");
                suMiktari-=50;
                temizlik = false;
            }
            else {
                System.out.println("Su miktari yetersiz olduğu icin espresso yapilamadi");
            }
        }
        else{
            System.out.println("Makine temiz olmadigi icin espresso yapilamadi");
        }
    }
    public void amerikanoYap() {
        if (temizlik == true) {
            if (suMiktari >= 100) {
                System.out.println("Amerikano yapildi");
                suMiktari-=100;
                temizlik = false;
            }
            else {
                System.out.println("Su miktari yetersiz olduğu icin amerikano yapilamadi");
            }
        }
        else{
            System.out.println("Makine temiz olmadigi icin amerikano yapilamadi");
        }
    }
    public void latteYap() {
        if (temizlik == true) {
            if (suMiktari >= 70) {
                System.out.println("Latte yapildi");
                suMiktari-=70;
                temizlik = false;
            }
            else {
                System.out.println("Su miktari yetersiz olduğu icin latte yapilamadi");
            }
        }
        else{
            System.out.println("Makine temiz olmadigi icin latte yapilamadi");
        }
    }
}
