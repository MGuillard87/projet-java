package com.equipement.defense.sorts;

import com.plateau.cases.Case;

public class Sort extends Case {
    // attributs
    protected String nom = "Boule de feu";
    protected int force = 7;

// constructeur

    public Sort() {
    }

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
