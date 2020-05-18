package com.donjonsDragons;

// -- Commentaire Flo -- // 
// A quoi sert cet import ? 
// -- Fin Commentaire Flo -- // 
import java.net.URL;

public class Magicien extends Personnage {

    private String philtre = "Illusion";



    // mise en place des 3 constructeurs de la classe Magicien
    public Magicien()
    {
        super();
        philtre = "Illusion";
    }
    public Magicien(String nom) {
        super(nom);
    }

    public Magicien(String nom, int niveauDeVie, int forceAttaque) {
        super(nom, niveauDeVie, forceAttaque);

    }
// méthode to String

    public String toString() {
        return super.toString() +
                ", sort =>'" + this.sort + '\'' +
                ", philtre => " + this.philtre
                ;
    }

// création des getter et setter

    public String getPhiltres() {
        return philtre;
    }
    public void setPhiltres(String philtres) {
        this.philtre = philtres;
    }


}
