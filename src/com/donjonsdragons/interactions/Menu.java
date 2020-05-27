package com.donjonsdragons.interactions;

import com.personnages.Guerrier;
import com.personnages.Magicien;
import com.personnages.Personnage;

import java.util.Scanner;

/**
 * class Menu qui gère toute l'interaction du menu avec l'utilisateur
 */
public class Menu {
    private final String MSG_MENU = "Créer un personnage (p) ou quitter le jeu (q) ";
    private final String CHOIX_PERSO_MENU = "Magicien (m) ou Guerrier (g)";
    private final String QUIT_JEU = "quitter le jeu (q)";
    private final String FIN_JEU_MENU = "fin du jeu";
    private final String MODIF_PERSO_MENU = "Vous pouvez modifier votre personnage";
    private final String INFO_PERSO_MENU = "Voici les informations sur votre personnage";
    private final String GAME_START_MENU = "Démarrer une partie (d)";
    /**
     * @see # attribut Personnage personnage
     */
    private Personnage personnage;
    /**
     * @see # attribut Jeu jeu
     */
    private Jeu jeu = new Jeu();
    /**
     *  @see # attribut Scanner sc
     */
    Scanner sc = new Scanner(System.in);

     /* Le mot-clé final indique qu'on assigner une valeur à la variable
         une seul fois. la convention = nommer les constantes en majuscules.*/
// constructeur
     public Menu() {}

    // méthodes
    public void menuJeu() {

         //affichage du menu

        String str = choixPremierMenu();
        //utilisateur ne quitte pas le jeu et veut créer un personnage
        if (str.equals("p")) {

            // méthode demandant au joueur de choisir entre guerrier ou magicien
            String str1 = choixPerso();
            while (!(str1.equals("m") || str1.equals("g"))) {
                 str1 = choixPerso();
            }
                creerPersonnage(str1);
                afficherDemarrerPartie();
                afficherMenuPerso();
                afficherQuitterJeu();
                String str2 = sc.nextLine();
                switch (str2) {
                    case "d":
//                    TODO: ici partie qui demarre le jeu
                        jeu.demarrerPartie(this.personnage);
                        break;
                    //affichage des infos sur personnages

                    case "i":
                        afficherInfo(str1);
                        break;
                    //modification sur personnages
                    case "m":
                        modifierPersonnages(str1);
                        break;
                    default:
                        System.out.println(FIN_JEU_MENU);
                }

        } else {
            System.out.println(FIN_JEU_MENU);
        }
    }


    public String choixPremierMenu() {
        System.out.println(MSG_MENU);
        String str = sc.nextLine();
        return str;
    }

    public String choixPerso() {
        System.out.println(CHOIX_PERSO_MENU);
        String str1 = sc.nextLine();
        return str1;
    }

    public void creerPersonnage(String str1) {
        String choixNom;
        do {
            System.out.println("Rentrer le nom du personnage");
            choixNom = sc.nextLine();
        } while (choixNom.isEmpty());
        switch (str1) {
            case "g":
                this.personnage = new Guerrier(choixNom);
                break;
            default:
                this.personnage = new Magicien(choixNom);
        }
    }

    /**
     * méthode permettant de démarrer la partie
     */
    public void afficherDemarrerPartie() {
        System.out.println(GAME_START_MENU);
    }

    public void afficherInfo(String str1) {
        /**
         * info magicien ou guerrier
         */
                System.out.println(this.personnage);
                afficherMenuPerso();
    }

    /**
     * @see # méthode afficherMenuPerso
     * méthode qui affiche sous-menu: info et modif perso
     */
    public void afficherMenuPerso() {
        String afficherInfo = "Afficher les informations du personnage choisi (i)";
        String modifPerso = "Modifier les informations du personnage choisi (m)";
        System.out.println(afficherInfo);
        System.out.println(modifPerso);
    }

    /**
     * @see # méthode modifierPersonnages
     * @param str1
     */
    public void modifierPersonnages(String str1) {
        System.out.println(MODIF_PERSO_MENU);
        switch (str1) {
            case "m":
                mettreAjourMagicien();
                break;
            default:
                mettreAjourGuerrier();
        }
    }

    /**
     * @see # méthode mettreAjourGuerrier
     * @see # méthode mettreAjourMagicien
     * méthodes permettant de modifier le nom du guerrier et celui du magicien
     */
    public void mettreAjourGuerrier() {
        System.out.println("Rentrer un nouveau nom");
        String newNomG = sc.nextLine();
        this.personnage.setNom(newNomG);
    }
    public void mettreAjourMagicien() {
        System.out.println("Rentrer un nouveau nom");
        String newNomM = sc.nextLine();
        this.personnage.setNom(newNomM);
    }

    /**
     * @see # méthode afficherQuitterJeu
     * méthode permettant de quitter le jeu
     */
    public void afficherQuitterJeu() {
        System.out.println(QUIT_JEU);
    }
}



