package com.equipement.defense.sorts;

public class BouleDeFeu extends Sort {

    // Constructeur
    public BouleDeFeu() {
        super();
        this.nom = "Boule de feu";
        this.force = 7;
    }

    public BouleDeFeu(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    // méthode toString
    public String toString() {
        return " Sort: " + this.nom +
                ", force du sort: " + this.force
                ;
    }


    //Méthodes


}
