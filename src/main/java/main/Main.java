package main; // Ou com.isep.airline.main

import models.Passager;
import models.Reservation;
import services.ServicesReservations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DÉMARRAGE DU SYSTÈME DE RÉSERVATION ===\n");

        // 1. Initialisation de notre Service (le "Moteur")
        ServicesReservations serviceResa = new ServicesReservations();

        // 2. Création d'un Passager
        Passager marie = new Passager("P-001", "Marie Curie", "Paris", "marie@email.com", "FR-98765");

        System.out.println("--- 1. Infos Passager ---");
        marie.obtenirInfos();
        System.out.println();

        // 3. Préparation du formateur de date (une seule fois pour tout le fichier)
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // 4. Traduction du texte en vrais objets LocalDateTime
        LocalDateTime dateVol1 = LocalDateTime.parse("15/05/2026 08:30", format);
        LocalDateTime dateVol2 = LocalDateTime.parse("20/06/2026 17:45", format);

        // 5. Création des Réservations en leur donnant directement les bonnes dates
        Reservation res1 = new Reservation("RES-10A", dateVol1, "En attente");
        Reservation res2 = new Reservation("RES-99Z", dateVol2, "En attente");

        // 6. Utilisation du Service pour les actions métier
        System.out.println("--- 2. Traitement des demandes ---");
        serviceResa.creeReservation(marie, res1);
        serviceResa.creeReservation(marie, res2);

        serviceResa.validerReservation(res1);

        System.out.println("\n--- 3. Bilan des réservations ---");
        marie.obtenirReservations();

        System.out.println("\n--- 4. Annulation d'un vol ---");
        serviceResa.traiterAnnulation(marie, res2);

        System.out.println("\n--- 5. Bilan Final ---");
        marie.obtenirReservations();
    }
}