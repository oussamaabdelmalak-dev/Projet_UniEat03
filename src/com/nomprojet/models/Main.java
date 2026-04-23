package com.nomprojet.models;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== DEMO COMMANDE ===");

        // Création étudiant
        Etudiant e = new Etudiant("Yassine", 20);

        // Produits
        Produit p1 = new Produit("Pizza", 8);
        Produit p2 = new Produit("Sandwich", 5);

        // Panier
        Panier panier = new Panier();
        panier.ajouterProduit(p1, 2);
        panier.ajouterProduit(p2, 1);

        panier.afficherPanier();

        // Création commande
        Commande cmd = new Commande(1);

        for (LigneCommande lc : panier.getLignes()) {
            cmd.ajouterLigne(lc);
        }

        cmd.afficher();

        // Validation
        e.afficher();
        cmd.validerCommande(e);
        e.afficher();
    }
}