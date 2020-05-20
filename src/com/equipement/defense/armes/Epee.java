package com.equipement.defense.armes;

import com.equipement.defense.armes.Arme;

public class Epee extends Arme {
    // constructeur

    public Epee() {
        super();
        this.nom = "Epee";
        this.force = 5;
    }

    public Epee(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    // méthode toString
    public String toString() {
        return " arme: " + this.nom +
                ", force de l'arme: " + this.force
                ;
    }
}
