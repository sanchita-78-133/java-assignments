import javax.swing.*;
import java.awt.*;

class BE_Third_2 {
    // LEVEL 1: Class Variables (Accessible by everything below)
    private JFrame f;
    private JLabel l;
    private JButton b1;
    private JButton b2;

    // LEVEL 2: The Constructor (This sets everything up)
    public BE_Third() {
        f = new JFrame("BUTTONS");
        l = new JLabel("This is a label");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");

        f.setLayout(new FlowLayout());
        f.add(l);
        f.add(b1);
        f.add(b2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    // LEVEL 3: The Main Method (The entry point)
    public static void main(String args[]) {
        // Just call the constructor
        new BE_Third();
    }
}