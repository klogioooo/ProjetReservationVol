package models;

public class PersonnelCabine extends Employe {
    private String qualification; 

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel de Cabine"; 
    }

    public void affecterVol(Vol vol) { /* Logique à ajouter */ }
    public void obtenirVol() { /* Logique à ajouter */ }

}