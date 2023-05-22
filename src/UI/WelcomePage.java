package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    // Constructor
    public WelcomePage() {
        setTitle("Welcome Page");
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a label with welcome text
        JLabel welcomeLabel = new JLabel("Welcome to Curry Bank");
        JButton nextPageButton = new JButton("Next Page");
        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginPage();
            }
        });
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the label and button to the panel
        panel.add(welcomeLabel, BorderLayout.CENTER);
        panel.add(nextPageButton, BorderLayout.SOUTH);

        // Add the panel to the frame
        add(panel);
    }

    private void showLoginPage() {
        // Hide the current welcome page
        setVisible(false);

        // Create a new instance of the login page
        LoginPage loginPage = new LoginPage();

        // Dispose the current welcome page
        dispose();

        // Show the login page
        loginPage.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WelcomePage());
    }
}
