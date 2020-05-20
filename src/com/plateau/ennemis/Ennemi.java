package com.plateau.ennemis;

import com.plateau.cases.Case;

public class Ennemi extends Case {

    // Attributs
    protected String nom = "Cruella";
    protected int niveauDeVie = 5;
    protected int forceAttaque = 5;

    // constructeurs
    public Ennemi() {

    }

    public Ennemi(String nom, int niveauDeVie, int forceAttaque) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    // méthodes

    // getter
    public String getNom() {
        return nom;
    }
    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    public int getForceAttaque() {
        return forceAttaque;
    }

// setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

}
