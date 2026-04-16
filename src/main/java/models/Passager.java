package models;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations; 

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

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

}