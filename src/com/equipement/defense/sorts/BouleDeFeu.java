package com.equipement.defense.sorts;

import com.personnages.Magicien;
import com.personnages.Personnage;

public class BouleDeFeu extends Sort {

    // Constructeur
    public BouleDeFeu() {
        super();
        this.nom = "Boule de feu";
        this.force = 7;
    }

    public BouleDeFeu(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    //Méthodes

}
