import javax.swing.*;
import java.awt.*;
class THE_LAYOUTS
{
 public static void main(String args[])
 {
    JFrame frame = new JFrame("FRAME");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("LABEL");
    JButton b1 = new JButton("Button 1!");
    JButton b2 = new JButton("Button 2!");
    JButton b3 = new JButton("Button 3!");
    frame.add(label);
    frame.add(b1);
    frame.add(b2);
    frame.add(b3); 
    //frame.pack();
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout());

 }
}