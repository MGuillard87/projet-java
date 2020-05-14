package com.donjonsDragons;

public class Personnage {
    // Stocke le nom du guerrier
    // éviter un attribut avec valeur NULL
    protected String nom;

    // créer constructor

    // Création des Getter
    public String getNom() {
        return this.nom;
    }

    // Création des setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Personnage:" + this.nom;
    }
}
