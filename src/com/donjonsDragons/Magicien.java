package com.donjonsDragons;

import java.net.URL;

public class Magicien extends Personnage {

    // Stocke le nom du Magicien
    private String nom;
    // Stocke le niveau de vie du Magicien
    private int niveauDeVie = 3;
    // Stocke la force d'attaque du Magicien
    private int forceAttaque = 8;
    private String philtres;
    private String sort;


    // mise en place des 3 constructeurs de la classe Magicien
    public Magicien()
    {
    }
    public Magicien(String nom) {
        this.nom = nom;
    }

    public Magicien(String nom, int niveauDeVie, int forceAttaque) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;

    }

    public void afficherMenuMagicien() {
        String afficherInfo = "Afficher les informations sur le Magicien (i)";
        String modifPerso = "Modifier les informations du Magicien (m)";
        System.out.println(afficherInfo);
        System.out.println(modifPerso);
    }
    // création des getter
    public String getNom() {
        return nom;
    }

    // Création des setter
    public void setNom(String nom) {
        this.nom = nom;
    }
}
