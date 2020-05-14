package com.donjonsDragons;

import java.util.Scanner;

public class Menu {
    private String MSG_MENU = "Créer un personnage (p) ou quitter le jeu (q) ";
    private String CHOIX_PERSO_MENU = "Vous prenez un Magicien (m) ou un Guerrier (g)";
    private String QUIT_MENU = "quitter le jeu (q)";
    private String FIN_JEU_MENU = "fin du jeu";
    private String MODIF_PERSO_MENU = "Vous pouvez modifier votre personnage";
    private String INFO_PERSO_MENU = "Voici les informations sur votre personnage";

    // Regarder mon clef "final" et comment déclarer une constante en java

    public void menuJeu() {
        // affichage du menu
        System.out.println(MSG_MENU);
        Scanner sc = new Scanner(System.in);
        Guerrier guerrier = new Guerrier();
        Magicien magicien = new Magicien();


        // utilisateur ne quitte pas le jeu et veut créer un personnage
        String str = sc.nextLine();
        // choix entre magicien
        if (str.equals("p")) {
            // méthode à appliquer pour cette partie d'affichage: à chaque println avec réponse !!
            System.out.println(CHOIX_PERSO_MENU);
            String str1 = sc.nextLine();
            // chaine de caractère à éviter avec les switch: les cases se font avec les constantes - à voir plus tard
            switch (str1) {
                case "g":
                    guerrier = creerGuerrier(sc);
                    break;
                default:
                    magicien = creerMagicien(sc);
            }
            System.out.println(QUIT_MENU);
            String str2 = sc.nextLine();

            switch (str2) {
                case "i":
                    System.out.println(INFO_PERSO_MENU);
                    switch (str1) {
                        case "m":
                            System.out.println(magicien.getNom());

                            break;
                        default:
                            System.out.println(guerrier.getNom());
                            guerrier.affichInfoGuerrier();


                            // afficher les autres informations
                            guerrier.afficherMenuGuerrier();
                    }
                    break;
                case "m":
                    System.out.println(MODIF_PERSO_MENU);
                    break;
                default:
                    System.out.println(FIN_JEU_MENU);
            }

        } else {
            System.out.println(FIN_JEU_MENU);

        }
    }


    public Guerrier creerGuerrier (Scanner sc) {
        System.out.println("Rentrer le nom du guerrier");
        String choixNomG = sc.nextLine();
        Guerrier guerrier = new Guerrier(choixNomG);
        guerrier.afficherMenuGuerrier();
        return guerrier;
    }


    public Magicien creerMagicien (Scanner sc) {
        System.out.println("Rentrer le nom du magicien");
        String choixNomM = sc.nextLine();
        Magicien magicien = new Magicien(choixNomM);
        magicien.afficherMenuMagicien();
        return magicien;
    }
}



