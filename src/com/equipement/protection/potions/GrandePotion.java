package com.equipement.protection.potions;

public class GrandePotion extends Philtre {
    // constructeurs

    public GrandePotion() {
        super();
        this.potion = "Grande potion";
        this.force = 5;
    }

    public GrandePotion(String potion, int force) {
        this.potion = potion;
        this.force = force;
    }

    // méthode toString
    public String toString() {
        return " potion: " + this.potion +
                ", force de la potion: " + this.force
                ;
    }
}
