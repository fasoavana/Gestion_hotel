import javax.swing.*;

public class SecondInterface extends Main {
    public SecondInterface(String role) {
        // Configuration de la fenêtre
        this.setTitle("Seconde Interface");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(300, 150);
        this.setLayout(null);

        // Label pour afficher le rôle sélectionné
        JLabel roleLabel = new JLabel("Rôle sélectionné : " + role);
        roleLabel.setBounds(50, 50, 200, 30);
        this.add(roleLabel);
    }
}
