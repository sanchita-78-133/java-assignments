import javax.swing.*;
import java.awt.*;
class COLOR_TRIAL{
 public static void main(String agrs[]){
   JFrame frame = new JFrame("FRAME FOR COLORING; I AM HIGH ON CAFFEINE AND I dont want to study anymore!");
   frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
   frame.setVisible(true); 
   JLabel label = new JLabel("LABEL!!!!");
   frame.setSize(500, 500);
   frame.add(label);  
   frame.getContentPane().setBackground(Color.YELLOW); frame.getContentPane().setForeground(Color.BLUE);
   label.setOpaque(true);
   label.setForeground(Color.BLUE); label.setBackground(Color.YELLOW); 

 }
}