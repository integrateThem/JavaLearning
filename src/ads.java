import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutionException;

public class ads {
    public static void main(String[] args) {
        // Ana çerçeve oluşturma
        JFrame frame = new JFrame("Progress Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Progress bar oluşturma
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        frame.add(progressBar, BorderLayout.CENTER);

        // Start butonu
        JButton startButton = new JButton("Start Task");
        frame.add(startButton, BorderLayout.SOUTH);

        // Butona tıklama olayını dinleme
        startButton.addActionListener(e -> {
            Task task = new Task(progressBar);
            task.execute();
        });

        // Çerçeveyi görünür yapma
        frame.setVisible(true);
    }
}

// SwingWorker sınıfı
class Task extends SwingWorker<Void, Integer> {
    private final JProgressBar progressBar;

    public Task(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    protected Void doInBackground() throws Exception {
        int progress = 0;
        while (progress < 100) {
            Thread.sleep(50); // İşlem süresini simüle etmek için bekleme
            progress += 1;
            publish(progress); // Ara değerleri yayımlama
            setProgress(progress); // Progress bar'ı güncelleme
        }
        return null;
    }

    @Override
    protected void process(java.util.List<Integer> chunks) {
        // Ara değerleri işleme
        int latestProgress = chunks.get(chunks.size() - 1);
        progressBar.setValue(latestProgress);
    }

    @Override
    protected void done() {
        // İşlem tamamlandığında yapılacaklar
        try {
            get(); // İşlemin son durumunu alır
            JOptionPane.showMessageDialog(progressBar.getParent(), "Task Completed!");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}