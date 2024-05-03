package labDers1.soru1.Mahalle;

public class Ev {
    protected String evSahibi="Er ailesi";
    private int kasadakiPara=250000;
    public int odaSayisi=4;
    protected int kapiNo=17;
    private String anahtar="anahtar";

    private void kasa(){
        System.out.println(kasadakiPara);
    }
    public void zilCal(){
        System.out.println("Zil calindi.");
    }
    protected  void postKutusu(){

    }
    protected void kapiyaTikla(){
        System.out.println("Kapiya Tiklandi");
    }

    public static void main(String[] args) {
        Ev faruk =new Ev();
        faruk.kasa();
        faruk.zilCal();
        faruk.postKutusu();
    }
}
