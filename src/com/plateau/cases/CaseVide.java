package com.plateau.cases;

import com.donjonsdragons.interactions.Case;

public class CaseVide extends Case {
    private String message = "Case vide";

    // constructeur

    // méthode toString
    public String toString() {
       return this.message;
    }

    // méthodes abstraites du parent Case



    // getter et setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
