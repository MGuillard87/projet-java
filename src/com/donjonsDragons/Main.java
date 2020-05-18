package com.donjonsDragons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PersonnageHorsPlateauException {
        // utilisation de Scanner en général ou non?
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menuJeu();


    }
}
