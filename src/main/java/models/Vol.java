package models;

public class Vol {
    private String numeroVol;
    private String depart;
    private String arrivee;
    private String dateDepart;
    private String heureDepart;
    private int capacite;

    public Vol(String numeroVol, String depart, String arrivee, String dateDepart, String heureDepart, int capacite) {
        this.numeroVol = numeroVol;
        this.depart = depart;
        this.arrivee = arrivee;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.capacite = capacite;
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "numeroVol='" + numeroVol + '\'' +
                ", depart='" + depart + '\'' +
                ", arrivee='" + arrivee + '\'' +
                ", dateDepart='" + dateDepart + '\'' +
                ", heureDepart='" + heureDepart + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}
