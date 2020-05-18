package com.donjonsDragons;

import java.util.Scanner;

public class Main {

    // -- Commentaire Flo -- // 
    // L'exception PersonnageHorsPlateauException ne devrait pas être gérée ici. 
    // Elle doit être gérée dans un try catch. Probablement ailleurs. Un main avec une exception c'est bizarre  
    // -- Fin Commentaire Flo -- // 
    
    public static void main(String[] args) throws PersonnageHorsPlateauException {
        // utilisation de Scanner en général ou non?
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menuJeu();


    }
}
