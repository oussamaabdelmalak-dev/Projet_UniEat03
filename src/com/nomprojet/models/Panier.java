package com.nomprojet.models;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<LigneCommande> lignes;

    public Panier() {
        lignes = new ArrayList<>();
    }

    public void ajouterProduit(Produit p, int qte) {
        lignes.add(new LigneCommande(p, qte));
        System.out.println("Produit ajouté au panier");
    }

    public List<LigneCommande> getLignes() {
        return lignes;
    }

    public void afficherPanier() {
        System.out.println("=== Panier ===");
        for (LigneCommande lc : lignes) {
            lc.afficher();
        }
    }
}