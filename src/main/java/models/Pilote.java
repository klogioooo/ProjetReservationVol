package models;

public class Pilote extends Employe {
    private String licence; // [cite: 70]
    private int heuresDeVol; // [cite: 72]

    public Pilote(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public String obtenirRole() {
        return "Pilote"; // [cite: 93]
    }

    // Les méthodes affecterVol et obtenirVol seront développées avec la logique métier [cite: 73, 75]
    public void affecterVol(Vol vol) { /* Logique à ajouter */ }
    public void obtenirVol() { /* Logique à ajouter */ }

    // Ajoute les getters/setters pour licence et heuresDeVol
}