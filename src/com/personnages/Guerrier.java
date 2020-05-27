package com.personnages;


// Création de la classe Guerrier
public class Guerrier extends Personnage {

// mise en place des attribut avec leur portée:private

    private String bouclier = "Broquel";
    private String arme = "Epée";

    // mise en place des 3 constructeurs de la classe Guerrier: permet d'initialiser l'objet guerrier
    public Guerrier() {
        super();
        this.bouclier = "Broquel";
        this.arme = "Epée";

    }

    public Guerrier(String nom) {
       super(nom);
       super.niveauDeVie = 5;
       super.forceAttaque = 5;
       super.attaqueMax = 10;
       super.vieMax = 10;
    }

    public Guerrier(String nom,int niveauDeVie, int forceAttaque) {
        super(nom, niveauDeVie, forceAttaque);
        }

// méthodes
    // méthode toString
    public String toString() {
        return super.toString() +
                " votre bouclier => " + this.bouclier + "\n" +
                " votre arme => " + this.arme
                ;
    }


// Mise en place des getters et setters

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
