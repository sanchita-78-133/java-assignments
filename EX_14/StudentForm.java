import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome to Classroom");
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(8, 2, 10, 10));
        frame.setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel(" Name:");
        JTextField f_name = new JTextField();

        JLabel genderLabel = new JLabel(" Gender:");
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);

        JLabel interestLabel = new JLabel(" Interest:");
        JPanel interestPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JCheckBox music = new JCheckBox("Music");
        JCheckBox swimming = new JCheckBox("Swimming");
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox coding = new JCheckBox("Coding");
        interestPanel.add(music);
        interestPanel.add(swimming);
        interestPanel.add(reading);
        interestPanel.add(coding);

        JLabel placeLabel = new JLabel(" Favourite Place:");
        String[] places = {"Bangladesh", "USA", "UK", "Canada", "Japan"};
        JComboBox placeDrop = new JComboBox(places);

        JLabel detailsLabel = new JLabel(" Details:");
        JTextArea details = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(details);

        JButton submit = new JButton("Submit");
        JButton exit = new JButton("Exit");

        frame.add(nameLabel);
        frame.add(f_name);
        frame.add(genderLabel);
        frame.add(genderPanel);
        frame.add(interestLabel);
        frame.add(interestPanel);
        frame.add(placeLabel);
        frame.add(placeDrop);
        frame.add(detailsLabel);
        frame.add(scrollPane);
        frame.add(submit);
        frame.add(exit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gender = "";
                if (male.isSelected()) {
                    gender = "Male";
                } else if (female.isSelected()) {
                    gender = "Female";
                } else if (other.isSelected()) {
                    gender = "Other";
                } else {
                    gender = "Not Specified";
                }

                String hobby = "";
                if (music.isSelected()) hobby += "Music ";
                if (swimming.isSelected()) hobby += "Swimming ";
                if (reading.isSelected()) hobby += "Reading ";
                if (coding.isSelected()) hobby += "Coding ";

                String message = "Name: " + f_name.getText() + "\n" +
                               "Gender: " + gender + "\n" +
                               "Hobbies: " + hobby;
                
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}