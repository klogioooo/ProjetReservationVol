package services; 

import models.Passager;
import models.Reservation;
import java.time.LocalDateTime;

public class ServicesReservations {

    public void creeReservation(Passager passager, Reservation reservation) {
        passager.reserverVol(reservation);
        System.out.println("[SERVICE] Réservation " + reservation.getNumeroReservation() + " ajoutée au dossier de " + passager.getNom() + ".");
    }

    
    public void consulterReservationsPassager(Passager passager) {
        System.out.println("[SERVICE] --- Dossier de " + passager.getNom() + " ---");
        passager.obtenirReservations();
    }

   
    public void modifierDateReservation(Reservation reservation, LocalDateTime nouvelleDate) {
        reservation.modifierReservation(nouvelleDate);
        System.out.println("[SERVICE] La date du vol " + reservation.getNumeroReservation() + " a été repoussée avec succès.");
    }

    public void validerReservation(Reservation reservation) {
        reservation.confirmerReservation();
        System.out.println("[SERVICE] Statut mis à jour : Confirmée pour " + reservation.getNumeroReservation() + ".");
    }

    
    public void traiterAnnulation(Passager passager, Reservation reservation) {
        reservation.annulerReservation(); // statut ="Annulée"
        passager.annulerReservation(reservation); 
        System.out.println("[SERVICE] La réservation " + reservation.getNumeroReservation() + " a été définitivement annulée.");
    }
}