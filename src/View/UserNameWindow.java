package View;
import javax.swing.*;

public class UserNameWindow extends JFrame {
    public UserNameWindow(String userName) {
        super("Nom de l'utilisateur");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Nom de l'utilisateur : " + userName);
        panel.add(label);
        add(panel);

        setVisible(true);
    }
}
