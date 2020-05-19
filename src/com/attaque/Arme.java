package com.attaque;

public class Arme {
// attributs
    private String nom = "Lance";
    private int force = 5;

// constructeur
    public Arme(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

// méthodes

// Getter
    public int getForce() {
        return force;
    }

// -- Commentaire Flo -- // 
// Indente ton code correctement. 
// -- Fin Commentaire Flo -- // 

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
