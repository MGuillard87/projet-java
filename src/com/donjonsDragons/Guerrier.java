package com.donjonsDragons;


// Création de la classe Guerrier
public class Guerrier extends Personnage {

    // Stocke le niveau de vie du guerrier
    private int niveauDeVie = 5;
    // Stocke la force d'attaque du guerrier
    private int forceAttaque = 5;
    private String bouclier = "Broquel";
    private String arme = "Epée";


    // mise en place des 3 constructeurs de la classe Guerrier
    public Guerrier() {
    }

    public Guerrier(String nom) {
        super.nom = nom;
    }

    public Guerrier(String nom,int niveauDeVie, int forceAttaque) {
     this.nom = nom;
     this.niveauDeVie = niveauDeVie;
     this.forceAttaque = forceAttaque;
    }

    // méthode qui pourrait etre gérer par classe perso ou menu
    public void afficherMenuGuerrier() {
     String afficherInfo = "Afficher les informations sur le Guerrier (i)";
     String modifPerso = "Modifier les informations du Guerrier (m)";
     System.out.println(afficherInfo);
     System.out.println(modifPerso);
    }



    // méthode toString à mettre en place
    public void affichInfoGuerrier() {
     System.out.println("Le niveau de vie du guerrier est de : " + this.niveauDeVie + "points");
     System.out.println("La force d'attaque du guerrier est de : " + this.forceAttaque + "points");

    }

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
