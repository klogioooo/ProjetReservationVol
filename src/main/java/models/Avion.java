package models;

public class Avion {
    private String immatriculation;
    private String modele; 
    private int capacite;
    private boolean estDisponible; 

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.estDisponible = true; 
    }

    public boolean verifierDisponibilite() {
        return estDisponible;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.estDisponible = disponibilite;
    }

    public String getImmatriculation() { return immatriculation; }
    public String getModele() { return modele; }
    public int getCapacite() { return capacite; }
}