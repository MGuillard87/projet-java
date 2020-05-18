package com.donjonsDragons;

public class Sort {
    // attributs
    private String nom = "bouleDeFeu";
    private int force = 5;

// constructeur

    public Sort(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

// méthodes

    // Getter
    public int getForce() {
        return force;
    }

    public String getNom() {
        return nom;
    }

    // setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setForce(int force) {
        this.force = force;
    }

}
