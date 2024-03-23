package Model;

public class Utilisateur {
    private String nom;
    private int idUtilisateur;
    private String prenom;

    public Utilisateur(int id, String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.idUtilisateur = id;
    }

    public String getNom(){
        return this.nom;
    }
}
