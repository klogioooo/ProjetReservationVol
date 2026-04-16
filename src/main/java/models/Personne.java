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

    public void obtenirInfos() {
        System.out.println("Personne [ID=" + identifiant + ", Nom=" + nom + ", Adresse=" + adresse + ", Contact=" + contact + "]");
    }

    public String getNom() { return nom; }
}