import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator 
{
 public static void main(String args[])
 {
   JFrame frame = new JFrame("Calculator");
   JLabel label = new JLabel("");
   frame.add(label);
   
   frame.setLayout(new GridLayout(3,3));
   for(int i = 0 ; i<=9 ; i++){
    frame.add(new JButton(i));
   }
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(600, 600);
   frame.setVisible(true);
   frame.setLocationRelativeTo(null);
 }
}