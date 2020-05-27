package com.donjonsdragons.interactions;

import com.donjonsdragons.exceptions.PersonnageHorsPlateauException;
import com.equipement.defense.armes.Epee;
import com.equipement.defense.armes.Massue;
import com.equipement.defense.sorts.BouleDeFeu;
import com.equipement.defense.sorts.Eclair;
import com.equipement.protection.potions.GrandePotion;
import com.equipement.protection.potions.Philtre;
import com.equipement.protection.potions.PotionStandard;
import com.personnages.Personnage;
import com.plateau.cases.CaseVide;
import com.plateau.ennemis.Dragon;
import com.plateau.ennemis.Gobelin;
import com.plateau.ennemis.Sorcier;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * class jeu qui gère le plateau (case, joueur, position du joueur, dé)
 */
public class Jeu {

    private int positionJoueur = 1;
    private final String MSG_MENU_JEU = "Recommencer une nouvelle partie (p) ou quitter le jeu (q) ";
    private ArrayList<Case>  PLATEAU;
    Scanner sc = new Scanner(System.in);
    private Philtre GrandePotion;
// constructeurs

// méthode permettant au joueur de recommencer une partie ou de quitter le jeu

    /**
     * @see # méthode permettant le choix de l'utilisateur
     * @return le choix de l'utilisateur: quitter ou rejouer
     */
    public String menuRecommencerQuitter() {
        System.out.println(MSG_MENU_JEU);
        String str = this.sc.nextLine();
        return str;
    }
//méthode pour démarrer la partie

    /**
     * @see # méthode permettant de démarrer la partie
     * @param personnage
     */
        public void demarrerPartie(Personnage personnage) {
        genererPlateau();
        String str = "p";
        while (str.equals("p")) {
            System.out.println("Départ Case n°1: " + this.PLATEAU.get(0));
            this.positionJoueur = 1;
            Case caseEnCours = this.PLATEAU.get(0);
            caseEnCours.interaction(personnage);
            while (this.positionJoueur != 64) {
                try {
                    jouerUnTour();
                    caseEnCours = this.PLATEAU.get(this.positionJoueur - 1);
                    caseEnCours.interaction(personnage);
// TODO: mettre en place une méthode qui vérifie le niveau de vie du personnage: si 0, jeu perdu sinon continuer
                    if (personnage.getNiveauDeVie() <= 0) {
                        System.out.println("\n" + "Vous avez perdu... :(");
                        str = menuRecommencerQuitter();
                    }
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
            System.out.println("Vous avez gagné, bravo ! ");
            str = menuRecommencerQuitter();
        }
        System.out.println("Au revoir!");
    }
    
// Methode permettant d'obtenir le résultat du Dé au hasard

    /**
     * @see # méthode permettant de lancer le dé et d'obtenir le résultat du Dé au hasard
     * @return le jeté de dé au hasard de 1 à 6
     */
    public int lancerLeDe() {
        Random r = new Random();
        int de = r.nextInt((6) + 1);
        System.out.println(" Lancer du dé vaut " + de);
        int scoreDe = de;
        return scoreDe;
    }

// Création de la fonction 'avancer': avec un paramètre 'positionCase', qui indique la position du joueur

    /**
     *  @see # méthode permettant de jouer un tour (lancer dé, se déplacer sur le plateau
     * @throws PersonnageHorsPlateauException capture l'exception dans le cadre ou le joueur sort du plateau
     */
    public void jouerUnTour() throws PersonnageHorsPlateauException {
        int maxDeCases = 64;
            int scoreDe = lancerLeDe();
            this.positionJoueur = this.positionJoueur + scoreDe;

            if (this.positionJoueur > maxDeCases) {
                throw new PersonnageHorsPlateauException();
            }

            System.out.println();
            System.out.println("Case n° " + this.positionJoueur);
            System.out.println(this.PLATEAU.get(this.positionJoueur - 1));
    }

    /**
     *  @see # méthode permettant de générer le plateau de jeu
     */
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

        Collections.shuffle(PLATEAU);
    }




// getters et setters
    public int getPositionCase() {
        return positionJoueur;
    }

    public void setPositionCase(int positionCase) {
        this.positionJoueur = positionCase;
    }

    public ArrayList getPLATEAU() {
        return PLATEAU;
    }

    public void setPLATEAU(ArrayList PLATEAU) {
        this.PLATEAU = PLATEAU;
    }



}
