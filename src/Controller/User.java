package Controller;

import DAO.Utilisateur.UserDAO;
import DAO.Utilisateur.UserDAOImpl;
import Model.Utilisateur;
import View.UserNameWindow;

import java.sql.Connection;

public class User {
    public static void getUser(int id){
        Connection connection = ConnexionBDD.connect();
        UserDAO userDAO = new UserDAOImpl(connection);
        Utilisateur user = userDAO.get(id);
        new UserNameWindow(user.getNom());
    }
}
