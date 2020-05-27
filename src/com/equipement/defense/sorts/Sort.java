package com.equipement.defense.sorts;

import com.donjonsdragons.interactions.Case;
import com.personnages.Magicien;
import com.personnages.Personnage;

public class Sort extends Case {
    // attributs
    protected String nom = "Boule de feu";
    protected int force = 7;

// constructeur

    public Sort() {
    }

    public Sort(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }



// méthodes

    public void interaction(Personnage personnage) {
        if (personnage instanceof Magicien) {
            int nouvelleForce = personnage.getForceAttaque() + this.force;
            if (nouvelleForce <= personnage.getAttaqueMax()) {
                personnage.setForceAttaque(nouvelleForce);
            } else {
                System.out.println("votre niveau d'attaque est au maximun: " + personnage.getAttaqueMax());
            }
        }
    }

    // méthode toString
    public String toString() {
        return "Sort: " + this.nom +
                ", force du sort: " + this.force
                ;
    }

    // Getter
    public int getForce() {
        return force;
    }

    public String getNom() {
        return nom;
    }

    // setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setForce(int force) {
        this.force = force;
    }

}
