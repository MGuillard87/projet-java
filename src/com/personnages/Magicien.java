package com.personnages;

import java.sql.SQLOutput;

public class Magicien extends Personnage {

    private String philtre = "potion";
    private String sort = "Eclair";

    // mise en place des 3 constructeurs de la classe Magicien
    public Magicien()
    {
        super();
        this.philtre = "Broquel";
        this.sort = "Epée";
    }
    public Magicien(String nom) {
        super(nom);
        super.niveauDeVie = 3;
        super.forceAttaque = 8;
        super.attaqueMax = 15;
        super.vieMax = 6;
        }

    public Magicien(String nom, int niveauDeVie, int forceAttaque) {
        super(nom, niveauDeVie, forceAttaque);

    }
//méthodes
    // méthode to String
    public String toString() {
        return super.toString() +
                " votre philtre => " + this.philtre + "\n" +
                " votre sort => " + this.sort
                ;
    }

    // création des getter et setter

    public String getPhiltres() {
        return philtre;
    }
    public void setPhiltres(String philtres) {
        this.philtre = philtres;
    }

    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }

}
