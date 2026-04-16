package services;
import models.Avion;
import models.Employe;
import models.Vol;
import java.util.ArrayList;
import java.util.List;

public class ServicesVols {
    
    private List<Vol> planningVols;

    public ServicesVols() {
        this.planningVols = new ArrayList<>();
    }

    public void planifierVol(Vol vol) {
        planningVols.add(vol);
        System.out.println("[VOLS] Le vol " + vol.getNumeroVol() + " a été ajouté au planning.");
    }

    public void affecterAvionAVol(Vol vol, Avion avion) {
        if (avion.verifierDisponibilite()) {
            vol.setAvionAffecte(avion);
            avion.setDisponibilite(false); 
            System.out.println("[VOLS] L'avion " + avion.getImmatriculation() + " a été assigné au vol " + vol.getNumeroVol());
        } else {
            System.out.println("[VOLS] ERREUR : L'avion " + avion.getImmatriculation() + " n'est pas disponible !");
        }
    }

    public void affecterEquipage(Vol vol, Employe employe) {
        vol.ajouterMembreEquipage(employe);
        System.out.println("[VOLS] " + employe.getNom() + " (" + employe.obtenirRole() + ") assigné(e) au vol " + vol.getNumeroVol());
    }

    public void afficherPlanning() {
        System.out.println("\n=== TABLEAU DES DÉPARTS ===");
        for (Vol v : planningVols) {
            System.out.println(v);
        }
        System.out.println("===========================\n");
    }

    public void annulerVol(Vol vol) {
        vol.setEtat("Annulé");
        System.out.println("[VOLS] ALERTE : Le vol " + vol.getNumeroVol() + " a été annulé.");
    }
}