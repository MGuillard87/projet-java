package com.equipement.protection.potions;

public class PotionStandard extends Philtre {
    // constructeurs

    public PotionStandard() {
        super();
        this.potion = "potion de vie standard";
        this.force = 2;
    }

    public PotionStandard(String potion, int force) {
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
