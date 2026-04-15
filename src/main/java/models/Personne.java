package models;

public abstract class Personne {
    protected String identifiant;
    protected String nom;
    protected String adresse;
    protected String contact;

    public Personne(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    // La méthode exacte demandée dans le diagramme
    public void obtenirInfos() {
        System.out.println("Personne [ID=" + identifiant + ", Nom=" + nom + ", Adresse=" + adresse + ", Contact=" + contact + "]");
    }

    // Générer ici les Getters et Setters pour ces 4 attributs...
    public String getNom() { return nom; }
    // etc.
}