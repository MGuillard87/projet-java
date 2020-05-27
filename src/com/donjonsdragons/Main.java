package com.donjonsdragons;

import com.donjonsdragons.interactions.Menu;
import com.personnages.Magicien;
import com.personnages.Personnage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        // utilisation de Scanner en général ou non?
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menuJeu();



        Magicien m = new Magicien();
        Personnage m1 = new Magicien();

    if (m instanceof Magicien) {
        System.out.println("je suis rentré dans if magacien");
        System.out.println("je suis un  " + m.getClass());
    }
        if (m instanceof Personnage) {
            System.out.println("je suis rentré dans if personnage");
            System.out.println("je suis un  " + m.getClass());
        }


    }
}
