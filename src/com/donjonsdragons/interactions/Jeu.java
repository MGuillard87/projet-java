package com.donjonsdragons.interactions;

import com.equipement.defense.armes.Arme;
import com.donjonsdragons.exceptions.PersonnageHorsPlateauException;
import com.equipement.defense.armes.Epee;
import com.equipement.defense.armes.Massue;
import com.equipement.defense.sorts.BouleDeFeu;
import com.equipement.defense.sorts.Eclair;
import com.equipement.protection.potions.GrandePotion;
import com.equipement.protection.potions.PotionStandard;
import com.plateau.bonus.CaisseSurprise;
import com.plateau.cases.Case;
import com.plateau.cases.CaseVide;
import com.plateau.ennemis.Dragon;
import com.plateau.ennemis.Ennemi;
import com.plateau.ennemis.Gobelin;
import com.plateau.ennemis.Sorcier;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Jeu {

    private int positionJoueur = 1;
    private final String MSG_MENU_JEU = "Recommencer une nouvelle partie (p) ou quitter le jeu (q) ";
    private ArrayList PLATEAU;
    private Case cases;
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
        genererPlateau();
        String str = "p";
        while (str.equals("p")) {
            System.out.println("Départ: case 1 ");
            System.out.println(this.PLATEAU.get(0));
            this.positionJoueur = 1;
            while (this.positionJoueur != 64) {
                try {
                    this.positionJoueur = jouerUnTour(this.positionJoueur);

                } catch (PersonnageHorsPlateauException e) {
                    System.out.println(e.getMessage());
                } finally {
                    int maxDeCases = 64;
                    if (this.positionJoueur > maxDeCases) {
                        this.positionJoueur = maxDeCases;
                        System.out.println("Case n° " + this.positionJoueur);
                    }
                }
            }
            System.out.println("Arrivée: bravo ! ");
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
            this.positionJoueur = positionStartCase + scoreDe;

            if (this.positionJoueur > maxDeCases) {
                throw new PersonnageHorsPlateauException();
            }

            System.out.println();
            System.out.println("Case n° " + this.positionJoueur);
            System.out.println(this.PLATEAU.get(this.positionJoueur - 1));
            return this.positionJoueur;
    }

    public void genererPlateau() {
        this.PLATEAU = new ArrayList();
        this.PLATEAU.add(new Eclair());
        this.PLATEAU.add(new Massue());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new Eclair());
        this.PLATEAU.add(new Massue());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new PotionStandard());
        this.PLATEAU.add(new Eclair());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Massue());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new PotionStandard());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Eclair());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new Epee());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new Massue());
        this.PLATEAU.add(new Eclair());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Epee());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new GrandePotion());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Gobelin());
        this.PLATEAU.add(new PotionStandard());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new PotionStandard());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Massue());
        this.PLATEAU.add(new PotionStandard());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new GrandePotion());
        this.PLATEAU.add(new Epee());
        this.PLATEAU.add(new PotionStandard());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new Dragon());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Sorcier());
        this.PLATEAU.add(new BouleDeFeu());
        this.PLATEAU.add(new BouleDeFeu());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Dragon());
        this.PLATEAU.add(new Epee());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Dragon());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new Dragon());
        this.PLATEAU.add(new CaseVide());
        this.PLATEAU.add(new CaseVide());

//        for(int i = 0; i <  this.PLATEAU.size(); i++) {
//            int numCase = this.positionJoueur + i;
//            System.out.println("case n° " + numCase + " = " +  this.PLATEAU.get(i));
//        }
    }



// getters et setters
    public int getPositionCase() {
        return positionJoueur;
    }

    public void setPositionCase(int positionCase) {
        this.positionJoueur = positionCase;
    }




}
