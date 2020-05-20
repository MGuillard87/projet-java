package com.plateau.ennemis;

public class Dragon extends Ennemi{
    // constructeurs

    public Dragon() {
        super();
        this.nom = "Dragon";
        this.niveauDeVie = 15;
        this.forceAttaque = 4;
    }

    public Dragon(String nom, int niveauDeVie, int forceAttaque) {
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

