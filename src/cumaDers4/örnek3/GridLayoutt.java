package cumaDers4.örnek3;

import javax.swing.*;
import java.awt.*;

public class GridLayoutt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");
        Container pane = frame.getContentPane();
        frame.setLayout(new GridLayout(3,2));
        JButton button1 = new JButton("Kaydet");
        JButton button2 = new JButton("Sil");
        JLabel name = new JLabel("İsim");
        JLabel email = new JLabel("Email");
        JTextField nameField=new JTextField();
        JTextField emailField=new JTextField();
        pane.add(name);
        pane.add(nameField);
        pane.add(email);
        pane.add(emailField);
        pane.add(button1);
        pane.add(button2);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
