package com.equipement.defense.sorts;

import com.personnages.Magicien;
import com.personnages.Personnage;

public class Eclair extends Sort {

    // Constructeur
    public Eclair() {
        super();
        this.nom = "Eclair";
        this.force = 2;
    }

    public Eclair(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

}
