
// Taking two paths and displaying the content using Threads
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class myFrame implements ActionListener {
    JFrame jf = new JFrame();
    TextField tf1, tf2;
    TextArea ta;
    Button b;
    Label l1, l2;
    String sMIX, stf1;

    void frame() {
        jf.setSize(1100, 500);
        jf.setVisible(true);
        jf.setLayout(null);
        l1 = new Label("Enter 1st File");
        l2 = new Label("Enter 2nd File");
        tf1 = new TextField();
        tf2 = new TextField();
        b = new Button("Mix");
        ta = new TextArea();
        l1.setBounds(10, 20, 80, 20);
        tf1.setBounds(100, 20, 350, 20);
        l2.setBounds(470, 20, 80, 20);
        tf2.setBounds(570, 20, 350, 20);
        b.setBounds(950, 20, 80, 20);
        ta.setBounds(10, 50, 1050, 400);
        jf.add(l1);
        jf.add(tf1);
        jf.add(l2);
        jf.add(tf2);
        jf.add(b);
        jf.add(ta);
        tf1.addActionListener(this);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String button = s;
        String path01 = tf1.getText();
        String path02 = tf2.getText();
        class Running extends Thread {
            String file_path, temp;

            void get_file_path(String path1) {
                temp = path1;
                char arr1[] = temp.toCharArray();
                char arr[] = new char[arr1.length - 2];
                for (int i = 1; i < arr1.length - 1; i++) {
                    arr[i - 1] = arr1[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == (char) 92) {
                        arr[i] = '/';
                    }
                }
                file_path = new String(arr);
            }

            public void run() {
                FileReader fr;
                BufferedReader br;
                String content;
                try {
                    fr = new FileReader(file_path);
                    br = new BufferedReader(fr);
                    content = br.readLine();
                    while (content != null) {
                        ta.append(content + "\n");
                        content = br.readLine();
                    }
                } catch (Exception ex) {
                    System.out.println("File Not Found");
                }
            }
        }
        Running ob1 = new Running();
        Running ob2 = new Running();
        ob1.get_file_path(path01);
        ob2.get_file_path(path02);
        ob1.start();
        ob2.start();
    }
}

public class Main3 {
    public static void main(String[] args) {
        myFrame ob = new myFrame();
        ob.frame();
    }
}