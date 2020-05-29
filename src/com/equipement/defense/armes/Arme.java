package com.equipement.defense.armes;

import com.donjonsdragons.interactions.Case;
import com.personnages.Guerrier;
import com.personnages.Personnage;

public class Arme extends Case {
// attributs
    protected String nom = "Massue";
    protected int force = 3;

// constructeur
    public Arme() {

    }

    public Arme(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    // méthode toString
    public String toString() {
        return " arme: " + this.nom +
                ", force de l'arme: " + this.force
                ;
    }

    // methodes

    public void interaction(Personnage personnage) {
        if (personnage instanceof Guerrier) {
            int nouvelleForce = personnage.getForceAttaque() + this.force;
            if (nouvelleForce <= personnage.getAttaqueMax()) {
                personnage.setForceAttaque(nouvelleForce);
            } else {
                System.out.println("votre niveau d'attaque est au maximun: " + personnage.getAttaqueMax());
            }
        }
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
