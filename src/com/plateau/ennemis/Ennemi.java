package com.plateau.ennemis;

import com.donjonsdragons.interactions.Case;
import com.personnages.Personnage;
import com.plateau.cases.CaseVide;

import java.util.ArrayList;


public class Ennemi extends Case {

    // Attributs
    protected String nom = "Cruella";
    protected int niveauDeVie = 15;
    protected int forceAttaque = 4;

    // constructeurs
    public Ennemi() {

    }

    public Ennemi(String nom, int niveauDeVie, int forceAttaque) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    // méthode toString
    public String toString() {
        return "ennemi: " + this.nom +
                ", niveau de vie l'ennemi: " + this.niveauDeVie +
                ", force de l'ennemi: " + this.forceAttaque
                ;
    }

    // méthodes

    public void interaction(Personnage personnage, ArrayList plateau, int positionJoueur) {
        int vieEnnemi = this.niveauDeVie - personnage.getForceAttaque();
        setNiveauDeVie(vieEnnemi);
        if (vieEnnemi <= 0) {
            plateau.set(positionJoueur, new CaseVide());
            System.out.println("L'ennemi est mort");
        } else {
            int nouvelleVie = personnage.getNiveauDeVie() - this.forceAttaque;
            personnage.setNiveauDeVie(nouvelleVie);
            System.out.println("L'ennemi s'est enfui");
        }
    }

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
