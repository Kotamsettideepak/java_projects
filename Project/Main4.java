import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class MyFrame extends JFrame {
    Button b1, b2, b3, b4, b5;
    Label l;
    Panel p;

    void setFrame() {
        setVisible(true);
        setSize(1500, 800);
        setLayout(null);
        setTitle("SURVEY");
        b1 = new Button("Your Info");
        b2 = new Button("Education");
        b3 = new Button("Your Health");
        b4 = new Button("Deatails");
        b5 = new Button("Log in");
        p = new Panel();
        p.setBackground(Color.BLUE);
        b1.setBounds(10, 380, 80, 20);
        b2.setBounds(10, 420, 80, 20);
        b3.setBounds(10, 460, 80, 20);
        b4.setBounds(10, 500, 80, 20);
        b5.setBounds(1400, 25, 80, 20);
        p.setBounds(100, 50, 1380, 710);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(p);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
}

public class Main4 {
    public static void main(String[] args) {
        MyFrame ob = new MyFrame();
        ob.setFrame();
    }
}