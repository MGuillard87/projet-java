package com.donjonsdragons;

import com.personnage.PersonnageHorsPlateauException;

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
        String str = this.sc.nextLine();
        return str;
    }
//méthode pour démarrer la partie
    
    // -- Commentaire Flo -- // 
    // Là il y a un truc un peu étrange -> tu fais un try cacth pour attrapper ton exception
    // Et pourtant tu mets un throws dans ta définition de méthode -> c'est l'un ou l'autre mais pas les 2.  
    // -- Fin Commentaire Flo -- // 
    
    public void demarrerPartie() {
        String str = "p";
        while (str.equals("p")) {
            System.out.println(" Départ: case 1 ");
            this.positionCase = 1;
            while (this.positionCase != 64) {
                try {
                    this.positionCase = jouerUnTour(this.positionCase);

                } catch (PersonnageHorsPlateauException e) {
                    System.out.println(e.getMessage());
                } finally {
                    int maxDeCases = 64;
                    if (this.positionCase > maxDeCases) {
                        int reculer = this.positionCase - maxDeCases;
                        this.positionCase = maxDeCases;
                    }
                }
            }
            System.out.println(" Arrivée: bravo ! ");
            str = menuRecommencerQuitter();
        }
        System.out.println("Au revoir!");
    }
    
// Methode permettant d'obtenir le résultat du Dé au hasard
    public int lancerLeDe() {
        Random r = new Random();
        int de = r.nextInt((6 - 1) + 1);
        System.out.println(" Lancer du dé vaut " + de);
        int scoreDe = de;
        return scoreDe;

    }

// Création de la fonction 'avancer': avec un paramètre 'positionCase', qui indique la position du joueur
    public int jouerUnTour(int positionStartCase) throws PersonnageHorsPlateauException {
        int maxDeCases = 64;
            int scoreDe = lancerLeDe();
            this.positionCase = positionStartCase + scoreDe;

            if (this.positionCase > maxDeCases) {
                throw new PersonnageHorsPlateauException();
            }

            System.out.println();
            System.out.println(" Case n° " + this.positionCase);
            return this.positionCase;
    }

// getters et setters
    public int getPositionCase() {
        return positionCase;
    }

    public void setPositionCase(int positionCase) {
        this.positionCase = positionCase;
    }




}
