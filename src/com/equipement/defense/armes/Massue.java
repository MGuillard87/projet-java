package com.equipement.defense.armes;

import com.equipement.defense.armes.Arme;

public class Massue extends Arme {

    // constructeur
    public Massue() {
        super();
        this.nom = "Massue";
        this.force = 3;
    }

    public Massue(String nom, int force) {
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
