package cumaDers2.örnek2;

public interface API {
    default void show(){
        System.out.println("Default API");
    }
    void show2();
}
