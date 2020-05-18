package com.donjonsDragons;


// Création de la classe Guerrier
public class Guerrier extends Personnage {

// mise en place des attribut avec leur portée:private
    protected int niveauDeVie = 5;
    protected int forceAttaque = 5;
    private String bouclier = "Broquel";
    private String arme = "Epée";


    // mise en place des 3 constructeurs de la classe Guerrier: permet d'initialiser l'objet guerrier
    public Guerrier() {
        
    }

    public Guerrier(String nom) {
        super.nom = nom;
    }

    public Guerrier(String nom,int niveauDeVie, int forceAttaque) {
        super.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
        }
// méthodes:

    // méthode toString mis en place
    public String toString() {
        return "Guerrier " + super.nom +  ": " +
                "niveauDeVie => " + niveauDeVie +
                ", forceAttaque => " + forceAttaque +
                ", bouclier =>'" + bouclier + '\'' +
                ", arme =>'" + arme + '\''
                ;
    }


    // Mise en place des getters et setters

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

    public String getBouclier() {
        return bouclier;
    }
    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public String getArme() {
        return arme;
    }
    public void setArme(String arme) {
        this.arme = arme;
    }


}
