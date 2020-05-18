package com.donjonsDragons;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

    private int positionCase = 1;
    private final String MSG_MENU_JEU = "Recommencer une nouvelle partie (p) ou quitter le jeu (q) ";
    Scanner sc = new Scanner(System.in);
// constructeurs

// méthode permettant au joueur de recommencer une partie ou de quitter le jeu
    public String menuRecommencerQuitter() {
        System.out.println(MSG_MENU_JEU);
        String str = sc.nextLine();
        return str;
    }
//méthode pour démarrer la partie
    public void demarrerPartie() throws PersonnageHorsPlateauException {
        String str = "p";
        while (str.equals("p")) {
            System.out.println(" Départ: case 1 ");
            this.positionCase = 1;
            while (this.positionCase != 64) {
                this.positionCase = avancer(this.positionCase);
            }
            System.out.println(" Arrivée: bravo ! ");
            str = menuRecommencerQuitter();
        }
        System.out.println("Au revoir!");


    }

// Création de la fonction 'lancer': avec un paramètre 'positionCase', qui indique la position du joueur
    public int getRandomNumberInRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((6 - 1) + 1) + 1;
}

    public int lancer() {
        int de = this.getRandomNumberInRange(1, 6);
        System.out.println(" Lancer du dé vaut "+ de);
        int scoreDe=de;
        return scoreDe;
    }

// Création de la fonction 'avancer': avec un paramètre 'positionCase', qui indique la position du joueur
    public int avancer(int positionStartCase)
        throws PersonnageHorsPlateauException {
            int maxDeCases = 64;
            if (this.positionCase > maxDeCases) {
                throw new PersonnageHorsPlateauException();
            } else {
                int scoreDe = lancer();
                this.positionCase = positionStartCase + scoreDe;

                System.out.println();
                System.out.println(" Case n° " + this.positionCase);
                return this.positionCase;
            }
        }



// getters et setters
    public int getPositionCase() {
        return positionCase;
    }

    public void setPositionCase(int positionCase) {
        this.positionCase = positionCase;
    }




}
