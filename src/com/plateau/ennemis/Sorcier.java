package com.plateau.ennemis;

public class Sorcier extends Ennemi {
    // constructeurs

    public Sorcier() {
        super();
        this.nom = "Sorcier";
        this.niveauDeVie = 15;
        this.forceAttaque = 4;
    }

    public Sorcier(String nom, int niveauDeVie, int forceAttaque) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    // méthode toString
    public String toString() {
        return " ennemi: " + this.nom +
                ", niveau de vie l'ennemi: " + this.niveauDeVie +
                ", force de l'ennemi: " + this.forceAttaque
                ;
    }
}
