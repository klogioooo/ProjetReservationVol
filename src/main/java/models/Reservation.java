package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String numeroReservation; 
    private LocalDateTime dateReservation; 
    private String statut; // "En attente", "Confirmée", "Annulée"

    public Reservation(String numeroReservation, LocalDateTime dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }


    public void confirmerReservation() {
        this.statut = "Confirmée";
    }

    public void annulerReservation() {
        this.statut = "Annulée";
    }

    public void modifierReservation(LocalDateTime nouvelleDate) {
        this.dateReservation = nouvelleDate;
    }


    public String getNumeroReservation() { return numeroReservation; }
    public LocalDateTime getDateReservation() { return dateReservation; }
    public String getStatut() { return statut; }


    @Override
    public String toString() {
        DateTimeFormatter formatAffichage = DateTimeFormatter.ofPattern("dd/MM/yyyy 'à' HH:mm");
        return "Réservation [Numéro=" + numeroReservation +
                ", Départ=" + dateReservation.format(formatAffichage) +
                ", Statut=" + statut + "]";
    }
}