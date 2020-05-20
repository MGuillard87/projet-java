package com.equipement.defense.armes;

import com.plateau.cases.Case;

public class Arme extends Case {
// attributs
    protected String nom = "Massue";
    protected int force = 3;

// constructeur
    public Arme() {

    }

    public Arme(String nom, int force) {
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
