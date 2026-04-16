package main;

import models.*;
import services.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ServicesVols serviceLogistique = new ServicesVols();
        ServicesReservations serviceResa = new ServicesReservations();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("========== SYSTÈME DE GESTION AÉRIENNE ==========\n");

        System.out.println(">>> Étape 1 : Création du personnel navigant");
        Pilote p1 = new Pilote("E001", "Thomas Pesquet", "Toulouse", "thomas@esa.fr", "STAFF-01", "01/01/2015", "ATPL-A320", 4500);
        PersonnelCabine h1 = new PersonnelCabine("E002", "Sophie Martin", "Paris", "sophie@air.fr", "STAFF-02", "12/03/2020", "CSS-Luxe");
        System.out.println("Équipage prêt.\n");




        System.out.println(">>> Étape 2 : Préparation logistique");
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "CDG");
        Aeroport jfk = new Aeroport("John F. Kennedy", "New York", "JFK");
        
        Avion airbus = new Avion("F-GZCP", "Airbus A320", 150);
        System.out.println("Avion prêt : " + airbus.getModele() + " (" + airbus.getImmatriculation() + ")\n");





        System.out.println(">>> Étape 3 : Planification du vol AF001");
        LocalDateTime depart = LocalDateTime.parse("18/04/2026 10:00", format);
        LocalDateTime arrivee = LocalDateTime.parse("18/04/2026 18:30", format);

        Vol volAF001 = new Vol("AF001", cdg, jfk, depart, arrivee);
        
        serviceLogistique.planifierVol(volAF001);
        serviceLogistique.affecterAvionAVol(volAF001, airbus);
        serviceLogistique.affecterEquipage(volAF001, p1);
        serviceLogistique.affecterEquipage(volAF001, h1);
        System.out.println();






        System.out.println(">>> Étape 4 : Réservation passager");
        Passager client = new Passager("P99", "Marie Curie", "Paris", "marie@curie.fr", "PASSPORT-FR-01");

        Reservation resaMarie = new Reservation("RES-777", depart, "En attente");
        serviceResa.creeReservation(client, resaMarie);
        volAF001.ajouterReservation(resaMarie);
        serviceResa.validerReservation(resaMarie);
        System.out.println();




        
        System.out.println(">>> Étape 5 : État final du système");
        serviceLogistique.afficherPlanning();
        client.obtenirReservations();
        
        System.out.println("\n================ FIN DU TEST ================");
    }
}