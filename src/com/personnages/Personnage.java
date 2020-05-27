package com.personnages;

public abstract class Personnage {


    // Stocke le nom du guerrier et magicien (enfants de cette classe)
    // éviter un attribut avec valeur NULL !!
    // mettre les attributs en private
    protected String nom = "Charlie";
    protected int niveauDeVie = 5;
    protected int forceAttaque = 5;
    protected int vieMax = 10;
    protected int attaqueMax = 10;


//     Constructeur

    public Personnage() {

    }

    public Personnage(String nom) {
        this.nom = nom;
    }


    public Personnage(String nom, int niveauDeVie, int forceAttaque) {
    }

    // méthode toString pour retourner une représentation en String des objets (magicien et guerrier)
    public String toString() {
        return  " votre nom => " + this.nom + "\n" +
                " votre niveau de vie => " + this.niveauDeVie + "\n" +
                " votre force d'attaque => " + this.forceAttaque + "\n"
                ;
    }


    // Création des Getter
    public String getNom() {
        return this.nom;
    }
    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    public int getForceAttaque() {
        return forceAttaque;
    }
    public int getVieMax() {
        return vieMax;
    }
    public int getAttaqueMax() {
        return attaqueMax;
    }


    // Création des setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public void setAttaqueMax(int attaqueMax) {
        this.attaqueMax = attaqueMax;
    }


}



