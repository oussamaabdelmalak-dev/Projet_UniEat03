package com.nomprojet.models;

public class LigneCommande {
    private Produit produit;
    private int quantite;

    public LigneCommande(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

    public double getSousTotal() {
        return produit.getPrix() * quantite;
    }

    public void afficher() {
        System.out.println(produit.getNom() + " x" + quantite +
                " = " + getSousTotal() + " DT");
    }
}