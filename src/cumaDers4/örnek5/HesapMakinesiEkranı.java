package cumaDers4.örnek5;

import javax.swing.*;
import java.awt.*;

public class HesapMakinesiEkranı {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Hesap Makinesi");
        Container pane=frame.getContentPane();
        frame.setLayout(null);
        JButton topla=new JButton("+");
        JButton cıkar=new JButton("-");
        JButton carp=new JButton("x");
        JButton bol=new JButton("/");
        JTextField sayiBir=new JTextField();
        JTextField sayiIki=new JTextField();
        pane.add(topla);
        pane.add(cıkar);
        pane.add(carp);
        pane.add(bol);

    }
}
