package UI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           // to init the GUI
            
            WelcomePage welcomePage = new WelcomePage();
            mainui.welcomepage();
                
        });
    }
}
