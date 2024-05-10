package cumaDers4.örnek2;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutt {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Box Layout");
        Container pane=frame.getContentPane();
        frame.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
        JButton button1=new JButton("Buton 1");
        JButton button2=new JButton("Buton 2");
        JButton button3=new JButton("Buton 3");
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
