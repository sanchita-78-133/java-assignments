import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class REG_FORM 
{
 public static void main(String args[])
 {
  JFrame frame = new JFrame("REGISTRAION FORM");
  frame.setLayout(new FlowLayout());
  JLabel label = new JLabel("LOGIN"); frame.add(label);
  JTextField f_login = new JTextField(20); frame.add(f_login);
  JLabel l_pass = new JLabel("Password : "); frame.add(l_pass);
  JPasswordField f_pass = new JPasswordField(20); frame.add(f_pass);
  JButton b_ok = new JButton("OK"); frame.add(b_ok);
  JButton b_re =  new JButton("RESET"); frame.add(b_re); 
  JLabel hidden = new JLabel(""); frame.add(hidden);
   b_ok.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent e){
     String login = f_login.getText();
     String pass = f_pass.getText();
     hidden.setText(login + " logged in and password registered!");
    }
  });
  b_re.addActionListener(new ActionListener(){
  @Override
  public void actionPerformed(ActionEvent e){
  f_login.setText("");
  f_pass.setText("");
  hidden.setText("");
  }
  });
  frame.setSize(600, 500);
  frame.setLocationRelativeTo(null);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
 }
}