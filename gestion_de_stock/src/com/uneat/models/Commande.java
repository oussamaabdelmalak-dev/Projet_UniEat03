package com.uneat.models;

public class Commande {

    private double revenus = 0;

    public void passerCommande(Stock stock, int qte) {

        if (qte <= 0) {
            System.out.println("❌ Quantité invalide");
            return;
        }

        if (qte > stock.getQuantite()) {
            System.out.println("❌ Pas assez de stock !");
            return;
        }

        stock.diminuerStock(qte);

        double total = qte * stock.getPrix();
        revenus += total;

        System.out.println("✅ Commande: " + qte + " " + stock.getNom());
        System.out.println("💰 Total: " + total + " DT");
    }

    public double getRevenus() {
        return revenus;
    }
}