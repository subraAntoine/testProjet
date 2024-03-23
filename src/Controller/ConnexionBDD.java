package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
    public static Connection connect(){
        Connection connection = null;
        String url = "jdbc:mysql://localhost:8889/test";
        String utilisateur = "antoine";
        String motDePasse = "1234";

        try {
            // Établir la connexion
            connection = DriverManager.getConnection(url, utilisateur, motDePasse);

            // Afficher un message si la connexion est réussie
            if (connection != null) {
                System.out.println("Connexion à la base de données réussie !");
                return connection;
            }
            return null;
            // Votre code pour interagir avec la base de données

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
