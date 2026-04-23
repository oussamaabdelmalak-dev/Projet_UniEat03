package com.nomprojet.models;

public class Etudiant {
    private String nom;
    private double solde;

    public Etudiant(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public boolean peutPayer(double montant) {
        return solde >= montant;
    }

    public void debiter(double montant) {
        solde -= montant;
    }

    public void afficher() {
        System.out.println(nom + " | Solde : " + solde + " DT");
    }
}