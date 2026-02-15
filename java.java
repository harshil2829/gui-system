import javax.swing.*;
import java.awt.event.*;

public class StudentResultGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Result System");
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Labels
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(30, 30, 120, 30);
        frame.add(nameLabel);

        JLabel m1Label = new JLabel("Maths:");
        m1Label.setBounds(30, 70, 120, 30);
        frame.add(m1Label);

        JLabel m2Label = new JLabel("Science:");
        m2Label.setBounds(30, 110, 120, 30);
        frame.add(m2Label);

        JLabel m3Label = new JLabel("English:");
        m3Label.setBounds(30, 150, 120, 30);
        frame.add(m3Label);

        // Text Fields
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 150, 30);
        frame.add(nameField);

        JTextField m1Field = new JTextField();
        m1Field.setBounds(150, 70, 150, 30);
        frame.add(m1Field);

        JTextField m2Field = new JTextField();
        m2Field.setBounds(150, 110, 150, 30);
        frame.add(m2Field);

        JTextField m3Field = new JTextField();
        m3Field.setBounds(150, 150, 150, 30);
        frame.add(m3Field);

        // Result Area
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(30, 250, 330, 80);
        frame.add(resultArea);

        // Button
        JButton calculateBtn = new JButton("Calculate Result");
        calculateBtn.setBounds(100, 200, 180, 30);
        frame.add(calculateBtn);

        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                int m1 = Integer.parseInt(m1Field.getText());
                int m2 = Integer.parseInt(m2Field.getText());
                int m3 = Integer.parseInt(m3Field.getText());

                int total = m1 + m2 + m3;
                double percentage = total / 3.0;

                String grade;

                if (percentage >= 90)
                    grade = "A+";
                else if (percentage >= 75)
                    grade = "A";
                else if (percentage >= 60)
                    grade = "B";
                else if (percentage >= 50)
                    grade = "C";
                else if (percentage >= 35)
                    grade = "D";
                else
                    grade = "F";

                resultArea.setText(
                        "Name: " + name +
                        "\nTotal: " + total +
                        "\nPercentage: " + percentage +
                        "\nGrade: " + grade
                );
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
