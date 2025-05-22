package swingOperation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingJbutton extends JFrame {

    JLabel messageLabel;

    public SwingJbutton() {
        setTitle("Clock Button Example");
        setSize(500, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Message label
        messageLabel = new JLabel(" ");
        messageLabel.setBounds(100, 20, 300, 30);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(messageLabel);

        // Use absolute paths for now
        ImageIcon digitalIcon = new ImageIcon("C:\\Users\\DIYA RAI\\OneDrive\\Pictures\\Screenshots\\digital clock.png");
        JButton digitalButton = new JButton(digitalIcon);
        digitalButton.setBounds(100, 70, 100, 100);
        digitalButton.setToolTipText("Digital Clock");

        ImageIcon hourglassIcon = new ImageIcon("C:\\Users\\DIYA RAI\\OneDrive\\Pictures\\Screenshots\\hourglass.png");
        JButton hourglassButton = new JButton(hourglassIcon);
        hourglassButton.setBounds(280, 70, 100, 100);
        hourglassButton.setToolTipText("Hour Glass");

        // Action listeners
        digitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        add(digitalButton);
        add(hourglassButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingJbutton();
    }
}
