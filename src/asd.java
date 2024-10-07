import java.io.File;
import java.io.IOException;
public class asd {
    public static void main(String[] args) {
        // Runtime sınıfı üzerinden bellek kullanımını takip ediyoruz
        Runtime runtime = Runtime.getRuntime();

        // İşlemden önce kullanılan bellek miktarı
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("İşlem öncesi kullanılan bellek: " + usedMemoryBefore + " byte");

        // Ölçmek istediğiniz işlemi burada gerçekleştirin
        String[] array = new String[1000000]; // Örnek işlem: 1 milyon elemanlı bir array oluşturma
        for (int i = 0; i < array.length; i++) {
            array[i] = "Veri " + i;
        }

        // İşlemden sonra kullanılan bellek miktarı
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("İşlem sonrası kullanılan bellek: " + usedMemoryAfter + " byte");

        // İşlemde kullanılan toplam bellek miktarı
        long memoryUsedByProcess = usedMemoryAfter - usedMemoryBefore;
        System.out.println("İşlemin kullandığı bellek: " + memoryUsedByProcess + " byte");
    }
}