
/** Deepak*/
import java.awt.*;
import java.awt.event.*;

// Programme to Check weather UserName and Password Entered from the user is same or not if not 
// print Pass in Correct by making the frame RED
// if pass is write print Welcome and make the frame Green Colour 
class MyFrame extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;

    MyFrame() {
        setLayout(null);
        tf1 = new TextField("Enter Name");
        tf1.setBounds(85, 80, 150, 20);
        add(tf1);
        tf1.addActionListener(this);
        tf2 = new TextField("Enter Pass");
        tf2.setBounds(85, 120, 150, 20);
        add(tf2);
        tf2.addActionListener(this);
        Button b = new Button("Submit");
        b.setBounds(110, 160, 80, 20);
        add(b);
        b.addActionListener(this);
        setVisible(true);
        setSize(300, 300);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String un = tf1.getText();
        String pas = tf2.getText();
        if (s.equals("Submit")) {
            if ((un.equals("Deepak")) && (pas.equals("1234"))) {
                tf3 = new TextField("WelCome");
                tf3.setBounds(85, 200, 150, 20);
                add(tf3);
                setBackground(Color.GREEN);
            } else {
                tf3 = new TextField("Invalid PassWord");
                tf3.setBounds(85, 200, 150, 20);
                add(tf3);
                setBackground(Color.red);
            }
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyFrame ob = new MyFrame();
    }
}