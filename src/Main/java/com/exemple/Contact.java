package com.exemple;

public class Contact {
    private String nom;
    private String telephone;

    public Contact(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }
}