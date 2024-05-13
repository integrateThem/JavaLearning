package cumaDers4.örnek5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesiEkranı {
    static int sayi1,sayi2;
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
        JTextField sonuc=new JTextField();
        pane.add(topla);
        pane.add(cıkar);
        pane.add(carp);
        pane.add(bol);
        pane.add(sayiBir);
        pane.add(sayiIki);
        pane.add(sonuc);
        sayiBir.setBounds(30,30,200,50);
        sayiIki.setBounds(30,90,200,50);
        topla.setBounds(250,30,50,50);
        cıkar.setBounds(250,90,50,50);
        carp.setBounds(250,150,50,50);
        bol.setBounds(250,210,50,50);
        sonuc.setBounds(30,150,200,50);
        sayiBir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1=Integer.parseInt(sayiBir.getText());
            }
        });
        sayiIki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sayi2=Integer.parseInt(sayiIki.getText());
            }
        });
        topla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sonucIslem=sayi1+sayi2;
                String islemSonucu=Integer.toString(sonucIslem);
                sonuc.setText(islemSonucu);
            }
        });
        cıkar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sonucIslem=sayi1-sayi2;
                String islemSonucu=Integer.toString(sonucIslem);
                sonuc.setText(islemSonucu);
            }
        });
        bol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sonucIslem=sayi1/sayi2;
                String islemSonucu=Integer.toString(sonucIslem);
                sonuc.setText(islemSonucu);
            }
        });
        carp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sonucIslem=sayi1*sayi2;
                String islemSonucu=Integer.toString(sonucIslem);
                sonuc.setText(islemSonucu);
            }
        });
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
