package com.donjonsdragons.interactions;

import com.personnages.Guerrier;
import com.personnages.Magicien;
import com.personnages.Personnage;
import com.plateau.cases.CaseVide;

import java.util.ArrayList;

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

    public void interaction(Personnage personnage, ArrayList<Case> plateau, int positionJoueur) {

    }

    // méthodes abstraites à créer
//    public abstract void ajouterVie();
//    public abstract void ajouterForce();
//
//    public abstract void combattre();


    // getter et setter
}
