package View;
import Controller.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserSearchWindow extends JFrame {
    private JTextField idField;
    private JButton searchButton;

    public UserSearchWindow() {
        super("Recherche d'utilisateur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        idField = new JTextField();
        idField.setBorder(BorderFactory.createTitledBorder("ID de l'utilisateur"));
        mainPanel.add(idField);

        searchButton = new JButton("Rechercher");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Insérer ici le code pour gérer la recherche de l'utilisateur
                int userId = Integer.parseInt(idField.getText());
                User.getUser(userId);

            }
        });
        mainPanel.add(searchButton);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserSearchWindow();
            }
        });
    }
}
