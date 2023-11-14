import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tempCodeRunnerFile {
    private JFrame frame;
    private JPanel panel;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public tempCodeRunnerFile() {
        // Create the JFrame
        frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create the JPanel
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Create username label and field
        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        // Create password label and field
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        // Create login button
        loginButton = new JButton("Login");

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                // Here, you can implement your login logic
                // Compare username and password with stored credentials or authenticate with a
                // server
                // For simplicity, let's just show a message for now
                JOptionPane.showMessageDialog(frame, "Logged in as: " + username);
            }
        });

        // Add components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Placeholder for spacing
        panel.add(loginButton);

        // Add the panel to the frame
        frame.add(panel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new tempCodeRunnerFile();
            }
        });
    }
}
