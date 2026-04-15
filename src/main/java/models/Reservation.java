package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String numeroReservation; // Identifiant unique
    private LocalDateTime dateReservation; // Date et heure exactes
    private String statut; // "En attente", "Confirmée", "Annulée"

    // Constructeur strict et sécurisé
    public Reservation(String numeroReservation, LocalDateTime dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    // --- Méthodes Métier ---

    public void confirmerReservation() {
        this.statut = "Confirmée";
    }

    public void annulerReservation() {
        this.statut = "Annulée";
    }

    public void modifierReservation(LocalDateTime nouvelleDate) {
        this.dateReservation = nouvelleDate;
    }

    // --- Getters ---

    public String getNumeroReservation() { return numeroReservation; }
    public LocalDateTime getDateReservation() { return dateReservation; }
    public String getStatut() { return statut; }

    // --- Affichage ---

    @Override
    public String toString() {
        DateTimeFormatter formatAffichage = DateTimeFormatter.ofPattern("dd/MM/yyyy 'à' HH:mm");
        return "Réservation [Numéro=" + numeroReservation +
                ", Départ=" + dateReservation.format(formatAffichage) +
                ", Statut=" + statut + "]";
    }
}