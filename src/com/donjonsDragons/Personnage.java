package com.donjonsDragons;

public abstract class Personnage {

    // Stocke le nom du guerrier et magicien (enfants de cette classe)
    // éviter un attribut avec valeur NULL !!
    protected String nom = "Charlie";

    // Placer les autres attributs que magicien et guerrier ont en commun ?

//     créer constructor

    public Personnage() {

    }

    public Personnage(String nom) {
        this.nom = nom;
    }


    // Création des Getter (à faire pour les autres attributs)
    public String getNom() {
        return this.nom;
    }

    // Création des setter
    public void setNom(String nom) {
        this.nom = nom;
    }

}