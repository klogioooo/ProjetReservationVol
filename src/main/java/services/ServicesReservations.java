package services; // Ou com.isep.airline.services

import models.Passager;
import models.Reservation;
import java.time.LocalDateTime;

public class ServicesReservations {

    public void creeReservation(Passager passager, Reservation reservation) {
        passager.reserverVol(reservation);
        System.out.println("[SERVICE] Réservation " + reservation.getNumeroReservation() + " ajoutée au dossier de " + passager.getNom() + ".");
    }

    // --- READ (Chercher / Consulter) ---
    // Correspond à l'exigence d'obtenir la liste d'informations sur une réservation [cite: 98]
    public void consulterReservationsPassager(Passager passager) {
        System.out.println("[SERVICE] --- Dossier de " + passager.getNom() + " ---");
        passager.obtenirReservations();
    }

    // --- UPDATE (Modifier) ---
    public void modifierDateReservation(Reservation reservation, LocalDateTime nouvelleDate) {
        reservation.modifierReservation(nouvelleDate);
        System.out.println("[SERVICE] La date du vol " + reservation.getNumeroReservation() + " a été repoussée avec succès.");
    }

    public void validerReservation(Reservation reservation) {
        reservation.confirmerReservation();
        System.out.println("[SERVICE] Statut mis à jour : Confirmée pour " + reservation.getNumeroReservation() + ".");
    }

    // --- DELETE (Supprimer / Annuler) ---
    // Correspond à l'exigence d'annuler une réservation [cite: 97]
    public void traiterAnnulation(Passager passager, Reservation reservation) {
        reservation.annulerReservation(); // On passe le statut en "Annulée"
        passager.annulerReservation(reservation); // On la retire de la liste active
        System.out.println("[SERVICE] La réservation " + reservation.getNumeroReservation() + " a été définitivement annulée.");
    }
}