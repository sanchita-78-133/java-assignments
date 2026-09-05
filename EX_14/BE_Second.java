import javax.swing.*;
import java.util.concurrent.*;
class BE_Second
{
 public static void main(String args[]) throws InterruptedException
 {
   JFrame frame = new JFrame("Hello There!!");
   JLabel label = new JLabel("This is a label");
   frame.add(label);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(500, 500);
   frame.setVisible(true);
   TimeUnit.SECONDS.sleep(1);
   label.setText("This is a different label lol!");
 }
}