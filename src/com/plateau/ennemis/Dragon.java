package com.plateau.ennemis;

import com.personnages.Personnage;

public class Dragon extends Ennemi{
    // constructeurs

    public Dragon() {
        super();
        this.nom = "Dragon";
        this.niveauDeVie = 15;
        this.forceAttaque = 4;
    }

    public Dragon(String nom, int niveauDeVie, int forceAttaque) {
    }

}

