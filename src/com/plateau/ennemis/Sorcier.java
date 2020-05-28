package com.plateau.ennemis;

import com.personnages.Personnage;

public class Sorcier extends Ennemi {
    // constructeurs

    public Sorcier() {
        super();
        this.nom = "Sorcier";
        this.niveauDeVie = 9;
        this.forceAttaque = 2;
    }

    public Sorcier(String nom, int niveauDeVie, int forceAttaque) {
    }


}
