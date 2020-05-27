package com.equipement.defense.armes;

import com.equipement.defense.armes.Arme;
import com.personnages.Guerrier;
import com.personnages.Magicien;
import com.personnages.Personnage;

/**
 * class Massue
 */
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


}

