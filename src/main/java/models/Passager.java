package models;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations; // Matérialise la relation "1 à *" avec Reservation

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    // Méthodes définies dans le diagramme
    public void reserverVol(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public void annulerReservation(Reservation reservation) {
        this.reservations.remove(reservation);
    }

    public void obtenirReservations() {
        for (Reservation res : reservations) {
            System.out.println(res);
        }
    }

    // Getters et Setters pour passeport...
}