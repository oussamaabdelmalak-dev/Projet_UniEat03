package com.uneat.models;

public class Stock {
    private String nomRepas;
    private int quantite;
    private double prix;

    // constructeur
    public Stock(String nomRepas, int quantite, double prix) {
        this.nomRepas = nomRepas;
        this.quantite = quantite;
        this.prix = prix;
    }

    // getters
    public String getNomRepas() {
        return nomRepas;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    // affichage
    public void afficherStock() {
        System.out.println("Repas: " + nomRepas);
        System.out.println("Quantité: " + quantite);
        System.out.println("Prix: " + prix + " DT");
        System.out.println("----------------------");
    }
}