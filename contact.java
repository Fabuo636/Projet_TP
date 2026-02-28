public class Contact {
    private String nom;
    private String telephone;
    private String email;

    public Contact(String nom, String telephone, String email) {
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return "Nom: " + nom + 
               ", Téléphone: " + telephone + 
               ", Email: " + email;
    }
}
//Pour plus d'informations sur la classe Contact, voir le fichier contact.java