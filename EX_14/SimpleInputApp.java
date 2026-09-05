import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInputApp {
    public static void main(String[] args) {
        // 1. Create the window (the Frame)
        JFrame frame = new JFrame("Greeting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 2. Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JLabel resultLabel = new JLabel(" "); // This will show the output later

        // 3. Add the ActionListener (The Logic)
        // This code runs when the button is clicked
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                if (!name.isEmpty()) {
                    resultLabel.setText("Hello, " + name + "!");
                }
            }
        });

        // 4. Arrange components using a Layout
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);
 
        // 5. The Magic Commands
        frame.setSize(500, 500);         // Sizes the window perfectly to fit the components
        frame.setLocationRelativeTo(null); // Centers the window on your screen
        frame.setVisible(true); // Makes it pop up
    }
}