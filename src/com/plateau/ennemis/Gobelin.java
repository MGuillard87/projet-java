package com.plateau.ennemis;

import com.personnages.Guerrier;
import com.personnages.Personnage;

public class Gobelin extends Ennemi {
    // constructeurs

    public Gobelin() {
        super();
        this.nom = "Gobelin";
        this.niveauDeVie = 6;
        this.forceAttaque = 1;
    }

    public Gobelin(String nom, int niveauDeVie, int forceAttaque) {
    }

}
