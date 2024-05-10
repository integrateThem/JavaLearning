package cumaDers4.örnek4;

import javax.swing.*;
import java.awt.*;

public class NullLayoutt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");
        Container pane = frame.getContentPane();
        frame.setLayout(null);
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
        name.setBounds(10,10,40,40);
        email.setBounds(10,200,40,40);
        nameField.setBounds(40,10,80,80);
        emailField.setBounds(40,200,80,80);
        button1.setBounds(20,500,80,80);
        button2.setBounds(80,500,80,80);
        frame.setSize(1600,1600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
