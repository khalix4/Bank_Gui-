import javax.swing.*;
import java.awt.*;


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
        JButton nextpageButton = new JButton("next page");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the label to the panel
        panel.add(welcomeLabel, BorderLayout.CENTER);

        // Add the panel to the frame
        add(panel);
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WelcomePage());
    }
}

