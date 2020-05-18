package com.donjonsDragons;


// Création de la classe Guerrier
public class Guerrier extends Personnage {

// mise en place des attribut avec leur portée:private

    private String bouclier = "Broquel";



    // mise en place des 3 constructeurs de la classe Guerrier: permet d'initialiser l'objet guerrier
    public Guerrier() {
        super();
        bouclier = "Broquel";

    }

    public Guerrier(String nom) {
       super(nom);
    }

    public Guerrier(String nom,int niveauDeVie, int forceAttaque) {
        super(nom, niveauDeVie, forceAttaque);
        }

// méthode toString

    public String toString() {
        return super.toString() +
                ", arme =>'" + super.arme + '\'' +
                ", bouclier => " + this.bouclier
                ;
    }


// Mise en place des getters et setters

    public String getBouclier() {
        return bouclier;
    }
    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }


}
