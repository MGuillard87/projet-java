package com.equipement.protection.potions;

import com.personnages.Personnage;

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





}
