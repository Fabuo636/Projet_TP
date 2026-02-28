import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choix;

        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // vider le buffer

            switch (choix) {
                case 1:
                    ajouterContact();
                    break;
                case 2:
                    afficherContacts();
                    break;
                case 3:
                    rechercherContact();
                    break;
                case 4:
                    supprimerContact();
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 5);
    }

    public static void afficherMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Ajouter un contact");
        System.out.println("2. Afficher les contacts");
        System.out.println("3. Rechercher un contact");
        System.out.println("4. Supprimer un contact");
        System.out.println("5. Quitter");
        System.out.print("Choix : ");
    }

    public static void ajouterContact() {
        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Téléphone : ");
        String telephone = scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

        contacts.add(new Contact(nom, telephone, email));
        System.out.println("Contact ajouté !");
    }

    public static void afficherContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Aucun contact.");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public static void rechercherContact() {
        System.out.print("Entrez le nom à rechercher : ");
        String nomRecherche = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Contact trouvé : " + c);
                return;
            }
        }

        System.out.println("Contact non trouvé.");
    }

    public static void supprimerContact() {
        System.out.print("Nom du contact à supprimer : ");
        String nomSuppression = scanner.nextLine();

        contacts.removeIf(c -> c.getNom().equalsIgnoreCase(nomSuppression));
        System.out.println("Contact supprimé si existant.");
    }
}