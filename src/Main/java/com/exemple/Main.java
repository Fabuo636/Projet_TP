package com.exemple;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Paul", "699999999");
        System.out.println("Nom : " + contact.getNom());
        System.out.println("Téléphone : " + contact.getTelephone());
    }
}