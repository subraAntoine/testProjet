package DAO.Utilisateur;

import Model.Utilisateur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAOImpl implements UserDAO {

    private Connection connection;

    public UserDAOImpl (Connection connection){
        this.connection = connection;
    }

    @Override
    public Utilisateur get(int id){
        try(Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery("SELECT * FROM students WHERE id=" + id);
            if(result.next()){
                int i = result.getInt(1);
                String name = result.getString("nom");
                String prenom = result.getString("prenom");
                System.out.println("Nom de l'utilisateur : ");
                System.out.println(name);
                return new Utilisateur(i, name, prenom);
            }
            return null;

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return null;
    }

}
