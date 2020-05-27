package com.donjonsdragons.interactions;

import com.personnages.Guerrier;
import com.personnages.Magicien;
import com.personnages.Personnage;

public abstract class Case {

    // Attributs
    // Constructeurs
    // Méthode toString

    // méthode interaction
    public void interaction(Personnage personnage) {
        if (personnage instanceof Magicien) {
            System.out.println("Vous êtes un magicien, voici:" + "\n" + personnage.toString());
        }

        if (personnage instanceof Guerrier) {
            System.out.println("Vous êtes un guerrier, voici:" + "\n" + personnage.toString());
        }

    }

    // méthodes abstraites à créer
//    public abstract void ajouterVie();
//    public abstract void ajouterForce();
//
//    public abstract void combattre();


    // getter et setter
}
