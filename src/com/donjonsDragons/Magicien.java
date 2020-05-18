package com.donjonsDragons;

import java.net.URL;

public class Magicien extends Personnage {

    protected int niveauDeVie = 3;
    protected int forceAttaque = 8;
    private String philtres = "Illusion";
    private String sort = "Temps";


    // mise en place des 3 constructeurs de la classe Magicien
    public Magicien()
    {
    }
    public Magicien(String nom) {
        super.nom = nom;
    }

    public Magicien(String nom, int niveauDeVie, int forceAttaque) {
        super.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;

    }

    // méthode "magique" toString
    public String toString() {
        return  "Magicien " + super.nom +  ": " +
                "niveauDeVie => " + niveauDeVie +
                ", forceAttaque => " + forceAttaque +
                ", philtres =>'" + philtres + '\'' +
                ", sort =>'" + sort + '\''
                ;
    }

    // création des getter et setter

    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public String getPhiltres() {
        return philtres;
    }
    public void setPhiltres(String philtres) {
        this.philtres = philtres;
    }

    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
}
