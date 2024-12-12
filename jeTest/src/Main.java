import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JComboBox<String> roleComboBox;
    private JButton openInterfaceButton;
    private String selectedRole;

    public Main() {
        // Configuration de la fenêtre principale
        this.setTitle("Interface Principale");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setLayout(null);

        // Création de la ComboBox
        String[] roles = {"ADMIN", "USER"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setBounds(50, 30, 200, 30);
        this.add(roleComboBox);

        // Bouton pour ouvrir l'autre interface
        openInterfaceButton = new JButton("Ouvrir Interface");
        openInterfaceButton.setBounds(50, 70, 200, 30);
        this.add(openInterfaceButton);

        // Action Listener pour ouvrir l'autre fenêtre
        openInterfaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedRole = (String) roleComboBox.getSelectedItem(); // Récupère la valeur sélectionnée
                SecondInterface secondInterface = new SecondInterface(selectedRole);
                secondInterface.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Main mainInterface = new Main();
        mainInterface.setVisible(true);
    }
}
