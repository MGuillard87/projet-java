package com.equipement.protection.potions;

import com.plateau.cases.Case;

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

    //méthode toString

    //méthodes

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
