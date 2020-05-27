package com.equipement.protection.potions;

import com.donjonsdragons.interactions.Case;
import com.personnages.Personnage;

public class Philtre extends Case {

    //Attributs
    protected String potion = "Potion de vie";
    protected int force = 2;

    //Constructeur
    public Philtre() {
    }

    public Philtre(String potion, int force) {
        this.potion = potion;
        this.force = force;
    }

    // méthode toString
    public String toString() {
        return " potion: " + this.potion +
                ", force de la potion: " + this.force
                ;
    }

    // methodes
    public void interaction(Personnage personnage) {
        int nouvelleVie = personnage.getNiveauDeVie() + this.force;
        if(nouvelleVie <= personnage.getVieMax()) {
            personnage.setNiveauDeVie(nouvelleVie);
        } else {
            System.out.println("votre niveau de vie est au maximun: " + personnage.getAttaqueMax());
        }
    }


    // getters et setters
    public String getPotion() {
        return potion;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }


}
