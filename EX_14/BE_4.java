import javax.swing.*;
import java.awt.*;

public class BE_4 {
    // Define components as class fields so they are accessible everywhere
    private JFrame f;
    private JLabel l;
    private JButton b1;
    private JButton b2;

    public BE_4() {
        // 1. Initialize the Frame
        f = new JFrame("BUTTONS");
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Initialize Components
        l = new JLabel("This is a label");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");

        // 3. Add components to the frame
        f.add(l);
        f.add(b1);
        f.add(b2);

        // 4. Make it visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        // Use Thread-safe initialization for Swing
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BE_4();
            }
        });
    }
}