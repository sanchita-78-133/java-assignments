import javax.swing.*;
import java.awt.*;
// import java.awt.event.*; for implements ActionListener
class SIMP_NAME 
{
 public static void main(String args[])
 {
    JFrame frame = new JFrame("ESTEEM-BUILDER");
    JLabel label = new JLabel("Please enter your good/bad name ;) ");
    JTextField tf = new JTextField(20);
    JLabel name_p = new JLabel(" ");
    JButton b = new JButton("CLICK ON ME FOR SUBMISSION"); 
    b.addActionListener(e->
                       {
                       String name = tf.getText();
                       if(!name.isEmpty())  name_p.setText("Hey, " + name + "!");
                        b.setText("Submitted!");
                       });
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLayout(new FlowLayout());
  frame.add(label); frame.add(tf); frame.add(name_p); frame.add(b);
  frame.setSize(500, 500);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 }
}