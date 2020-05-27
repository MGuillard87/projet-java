package com.equipement.protection.potions;

import com.personnages.Personnage;

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



}
