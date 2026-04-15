package models;

public class PersonnelCabine extends Employe {
    private String qualification; // [cite: 71]

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel de Cabine"; // [cite: 93]
    }

    // Les méthodes affecterVol et obtenirVol [cite: 74, 76]
    public void affecterVol(Vol vol) { /* Logique à ajouter */ }
    public void obtenirVol() { /* Logique à ajouter */ }

    // Ajoute les getters/setters pour qualification
}