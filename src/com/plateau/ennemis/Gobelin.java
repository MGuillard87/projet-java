package com.plateau.ennemis;

public class Gobelin extends Ennemi {
    // constructeurs

    public Gobelin() {
        super();
        this.nom = "Gobelin";
        this.niveauDeVie = 15;
        this.forceAttaque = 4;
    }

    public Gobelin(String nom, int niveauDeVie, int forceAttaque) {
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
