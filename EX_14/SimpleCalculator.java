import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));

        JTextField screen = new JTextField("0");
        screen.setFont(new Font("Arial", Font.BOLD, 24));
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false); 
        frame.add(screen, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); 
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        final double[] firstNum = {0};
        final String[] operator = {""};
        final boolean[] isNewEntry = {true};

        for (String text : buttons) {
            JButton b = new JButton(text);
            b.setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(b);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();

                    if ("0123456789".contains(cmd)) {
                        if (isNewEntry[0] || screen.getText().equals("0")) {
                            screen.setText(cmd);
                            isNewEntry[0] = false;
                        } else {
                            screen.setText(screen.getText() + cmd);
                        }
                    } else if (cmd.equals("C")) {
                        screen.setText("0");
                        firstNum[0] = 0;
                        isNewEntry[0] = true;
                    } else if (cmd.equals("=")) {
                        double secondNum = Double.parseDouble(screen.getText());
                        double result = calculate(firstNum[0], secondNum, operator[0]);
                        screen.setText(String.valueOf(result));
                        isNewEntry[0] = true;
                    } else { 
                        firstNum[0] = Double.parseDouble(screen.getText());
                        operator[0] = cmd;
                        isNewEntry[0] = true;
                    }
                }
            });
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private static double calculate(double n1, double n2, String op) {
        switch (op) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": return n2 != 0 ? n1 / n2 : 0;
            default: return n2;
        }
    }
}