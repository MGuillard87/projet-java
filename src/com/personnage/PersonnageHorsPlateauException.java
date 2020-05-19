package com.personnage;

public class PersonnageHorsPlateauException extends Exception {

    public PersonnageHorsPlateauException() {
        super("La case n'existe pas");
    }
}
