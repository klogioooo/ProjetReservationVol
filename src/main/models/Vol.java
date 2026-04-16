package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Vol {
    private String numeroVol;
    private Aeroport depart;
    private Aeroport arrivee;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private String etat; // Planifié, En cours, Annulé
    
    private Avion avionAffecte;
    private List<Employe> equipage; 
    private List<Reservation> listeReservations; 

    public Vol(String numeroVol, Aeroport depart, Aeroport arrivee, LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.depart = depart;
        this.arrivee = arrivee;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = "Planifié";
        this.equipage = new ArrayList<>();
        this.listeReservations = new ArrayList<>();
    }

    public void ajouterMembreEquipage(Employe employe) {
        this.equipage.add(employe);
    }

    public void ajouterReservation(Reservation reservation) {
        this.listeReservations.add(reservation);
    }

    public void setAvionAffecte(Avion avion) { this.avionAffecte = avion; }
    public void setEtat(String etat) { this.etat = etat; }
    public String getNumeroVol() { return numeroVol; }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String modeleAvion = (avionAffecte != null) ? avionAffecte.getModele() : "Non assigné";
        return "Vol " + numeroVol + " | " + depart.getCodeIATA() + " -> " + arrivee.getCodeIATA() + 
               " | Départ: " + dateHeureDepart.format(format) + " | Avion: " + modeleAvion + " | État: " + etat;
    }
}