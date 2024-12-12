/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.awt.BorderLayout;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author RAZAFIMAHATRATRA
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Création de la fenêtre
        JFrame frame = new JFrame("Calculatrice Longue");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création des composants
        JTextField inputField = new JTextField();
        JButton calculateButton = new JButton("Calculer");
        JLabel resultLabel = new JLabel("Résultat : ");

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(inputField, BorderLayout.NORTH);
        frame.add(calculateButton, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        // Action du bouton
        calculateButton.addActionListener(e -> {
            String expression = inputField.getText();
            try {
                // Utilisation du ScriptEngine pour évaluer l'expression
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("JavaScript");
                Object result = engine.eval(expression);
                resultLabel.setText("Résultat : " + result);
            } catch (Exception ex) {
                resultLabel.setText("Erreur : Expression invalide");
            }
        });

        // Afficher la fenêtre
        frame.setVisible(true);
    }
    
}
