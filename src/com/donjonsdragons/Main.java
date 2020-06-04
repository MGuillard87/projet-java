package com.donjonsdragons;

import com.Connect;
import com.donjonsdragons.interactions.Menu;
import com.personnages.Magicien;
import com.personnages.Personnage;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
//        // utilisation de Scanner en général ou non?
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menuJeu();

//        Connect.getHeroes();
//        Connect.getHero();
//        Connect.createHero();
////        Connect.updateHero();
//        Connect.deleteHero();

    }
}
