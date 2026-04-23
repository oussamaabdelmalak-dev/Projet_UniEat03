package com.uneat.models;

public class Stock {

    private String nom;
    private int quantite;
    private double prix;

    public Stock(String nom, int quantite, double prix) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    public void diminuerStock(int qte) {
        if (qte <= quantite) {
            quantite -= qte;
        } else {
            System.out.println("❌ Stock insuffisant pour " + nom);
        }
    }

    public void verifierStock() {
        if (quantite <= 2) {
            System.out.println("⚠️ Stock faible pour " + nom);
        }
    }

    public void afficher() {
        System.out.println(nom + " | Stock: " + quantite + " | Prix: " + prix + " DT");
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }
}