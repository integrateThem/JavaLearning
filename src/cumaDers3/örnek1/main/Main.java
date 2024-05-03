package cumaDers3.örnek1.main;
import cumaDers3.örnek1.istisnaUyelik.UyelikException;
public class Main {
    public static void main(String[] args) {
        Main example=new Main();
        try{
            example.checkNumber("Serpil");
        } catch (UyelikException e){
            System.out.println("Hata:"+e.getMessage());
        }
    }
    public void checkNumber(String isim) throws UyelikException{
        if(isim=="Serpil"){
            throw new UyelikException("İsim Serpil olamaz");
        }
    }
}
