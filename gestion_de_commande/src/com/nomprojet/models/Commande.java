package com.nomprojet.models;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private List<LigneCommande> lignes;

    public Commande(int id) {
        this.id = id;
        this.lignes = new ArrayList<>();
    }

    public void ajouterLigne(LigneCommande lc) {
        lignes.add(lc);
    }

    public double calculerTotal() {
        double total = 0;
        for (LigneCommande lc : lignes) {
            total += lc.getSousTotal();
        }
        return total;
    }

    public boolean validerCommande(Etudiant e) {
        double total = calculerTotal();

        if (e.peutPayer(total)) {
            e.debiter(total);
            System.out.println("✅ Commande validée !");
            return true;
        } else {
            System.out.println("❌ Solde insuffisant !");
            return false;
        }
    }

    public void afficher() {
        System.out.println("=== Commande #" + id + " ===");
        for (LigneCommande lc : lignes) {
            lc.afficher();
        }
        System.out.println("Total : " + calculerTotal() + " DT");
    }
}