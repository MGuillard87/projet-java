package com.equipement.defense.sorts;

public class Eclair extends Sort {

    // Constructeur
    public Eclair() {
        super();
        this.nom = "Eclair";
        this.force = 2;
    }

    public Eclair(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    // méthode toString
    public String toString() {
        return " Sort: " + this.nom +
                ", force du sort: " + this.force
                ;
    }



}
