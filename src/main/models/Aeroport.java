package models;

public class Aeroport {
    private String nom;
    private String ville;
    private String codeIATA; // Ex: CDG

    public Aeroport(String nom, String ville, String codeIATA) {
        this.nom = nom;
        this.ville = ville;
        this.codeIATA = codeIATA;
    }

    public String getCodeIATA() { return codeIATA; }
    public String getVille() { return ville; }
    
    @Override
    public String toString() {
        return ville + " (" + codeIATA + ")";
    }
}