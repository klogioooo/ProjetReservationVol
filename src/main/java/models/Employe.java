package models;

public abstract class Employe extends Personne {
    protected String numeroEmploye;
    protected String dateEmbauche;

    public Employe(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact); // Appel au constructeur de Personne
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    // Méthode abstraite définie dans le diagramme
    public abstract String obtenirRole();

    // Getters et Setters...
}