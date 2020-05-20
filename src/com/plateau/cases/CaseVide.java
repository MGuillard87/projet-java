package com.plateau.cases;

import com.plateau.cases.Case;

public class CaseVide extends Case {
    String message = " Case vide";

    // constructeur

    // méthode toString
    public String toString() {
       return this.message;
    }

    // getter et setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
