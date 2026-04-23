package com.uneat.models;

public class Main {

    public static void main(String[] args) {

        // Création stock
        Stock pizza = new Stock("Pizza", 3, 6.0);
        Stock couscous = new Stock("Couscous", 5, 8.0);

        // Commande
        Commande cmd = new Commande();

        // ===== STOCK INITIAL =====
        System.out.println("=== STOCK INITIAL ===");
        pizza.afficher();
        couscous.afficher();

        // ===== COMMANDE =====
        System.out.println("\n=== COMMANDE ===");
        cmd.passerCommande(pizza, 2);

        // ===== DASHBOARD =====
        System.out.println("\n=== ADMIN DASHBOARD ===");
        System.out.println("Revenus: " + cmd.getRevenus() + " DT");

        pizza.afficher();
        couscous.afficher();

        // ===== ALERT =====
        System.out.println("\n=== VERIFICATION STOCK ===");
        pizza.verifierStock();
        couscous.verifierStock();
    }
}