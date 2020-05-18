package com.donjonsDragons;

import java.util.Scanner;

public class Menu {
    private final String MSG_MENU = "Créer un personnage (p) ou quitter le jeu (q) ";
    private final String CHOIX_PERSO_MENU = "Magicien (m) ou Guerrier (g)";
    private final String QUIT_JEU = "quitter le jeu (q)";
    private final String FIN_JEU_MENU = "fin du jeu";
    private final String MODIF_PERSO_MENU = "Vous pouvez modifier votre personnage";
    private final String INFO_PERSO_MENU = "Voici les informations sur votre personnage";
    private final String GAME_START_MENU = "Démarrer une partie (d)";
    private Guerrier guerrier = new Guerrier();
    private Magicien magicien = new Magicien();
    private Jeu jeu = new Jeu();
    Scanner sc = new Scanner(System.in);


    /* Regarder mon clef "final" et comment déclarer une constante en java:
    Le mot-clé final indique qu'on assigner une valeur à la variable
    une seul fois. la convention = nommer les constantes en majuscules.
    */


    public void menuJeu() throws PersonnageHorsPlateauException {
        // affichage du menu
        String str = choixPremierMenu();
        // utilisateur ne quitte pas le jeu et veut créer un personnage
        if (str.equals("p")) {
            // méthode demandant au joueur de choisir entre guerrier ou magicien
            String str1 = choixPerso();
            while (!(str1.equals("m") || str1.equals("g"))) {
                 str1 = choixPerso();
            }
                creationPersos(str1);
                afficherDemarrerPartie();
                afficherMenuPerso();
                afficherQuitterJeu();
                String str2 = sc.nextLine();
                switch (str2) {
                    case "d":
//                    TODO: ici partie qui demarre le jeu
                        jeu.demarrerPartie();
                        break;
                        // affichage des infos sur personnages
                    case "i":
                        afficherInfo(str1);
                        break;
                    // modification sur personnages
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

    public void creationPersos(String str1) {
        switch (str1) {
            case "g":
                this.guerrier = creerGuerrier();
                break;
            default:
                this.magicien = creerMagicien();
        }
    }

    //Méthodes permettant de creer guerrier et magicien
    public Guerrier creerGuerrier() {

        String choixNomG;
        do {
            System.out.println("Rentrer le nom du guerrier");
            choixNomG = sc.nextLine();
        } while (choixNomG.isEmpty());

        Guerrier guerrier = new Guerrier(choixNomG);
        return guerrier;
    }

    public Magicien creerMagicien() {
        String choixNomM;
        do {
            System.out.println("Rentrer le nom du magicien");
            choixNomM = sc.nextLine();
        } while (choixNomM.isEmpty());
        Magicien magicien = new Magicien(choixNomM);
        return magicien;
    }


    // méthode permettant de démarrer la partie
    public void afficherDemarrerPartie() {
        System.out.println(GAME_START_MENU);
    }

    public void afficherInfo(String str1) {
        switch (str1) {
            //info magicien
            case "m":
                System.out.println(this.magicien);
                break;
            default:
                // application de la méthode magique "toString": qui retourne la représentation de l'objet en chaine de caractère
                System.out.println(this.guerrier);
                // afficher les autres informations
                afficherMenuPerso();
        }
    }

    // méthode qui affiche sous-menu: info et modif perso
    public void afficherMenuPerso() {
        String afficherInfo = "Afficher les informations du personnage choisi (i)";
        String modifPerso = "Modifier les informations du personnage choisi (m)";
        System.out.println(afficherInfo);
        System.out.println(modifPerso);
    }

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

    // méthodes permettant de modifier le nom du guerrier et celui du magicien
    public void mettreAjourGuerrier() {
        System.out.println("Rentrer un nouveau nom");
        String newNomG = sc.nextLine();
        this.guerrier.setNom(newNomG);
    }
    public void mettreAjourMagicien() {
        System.out.println("Rentrer un nouveau nom");
        String newNomM = sc.nextLine();
        this.magicien.setNom(newNomM);
    }

    // méthode permettant de quitter le jeu
    public void afficherQuitterJeu() {
        System.out.println(QUIT_JEU);
    }
}



