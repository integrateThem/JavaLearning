package cumaDers4.örnek1;

import javax.swing.*;

public class SwingHelloWorld {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        JButton button1=new JButton("Tıklayınız.");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
