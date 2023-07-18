
/** Deepak*/
// To see the content in the text file path which is entered..!!
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class MyFrame extends JFrame implements ActionListener {
    Label l1, l2;
    TextField tf;
    Button b;
    TextArea ta;

    MyFrame() {
        setVisible(true);
        setSize(880, 500);
        setLayout(null);
        l1 = new Label("Enter File Name");
        l1.setBounds(20, 10, 90, 30);
        tf = new TextField();
        tf.setBounds(120, 15, 600, 20);
        b = new Button("View");
        b.setBounds(750, 15, 80, 20);
        tf.addActionListener(this);
        b.addActionListener(this);
        ta = new TextArea();
        ta.setBounds(30, 60, 770, 400);
        add(ta);
        add(l1);
        add(b);
        add(tf);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String pa = tf.getText();
        if (s == "View") {
            char arr1[] = pa.toCharArray();
            char arr[] = new char[arr1.length - 2];
            for (int i = 1; i < arr1.length - 1; i++) {
                arr[i - 1] = arr1[i];
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '/') {
                    arr[i] = (char) 92;
                }
            }
            String path = new String(arr);
            try {
                String s2 = " ";
                FileReader fr = new FileReader(path);
                BufferedReader bf = new BufferedReader(fr);
                String line = bf.readLine();
                while (line != null) {
                    s2 = s2 + line + "\n";
                    line = bf.readLine();
                }
                ta.setText(s2);
            } catch (Exception e1) {
                System.out.println(e1);
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        MyFrame ob = new MyFrame();
    }
}