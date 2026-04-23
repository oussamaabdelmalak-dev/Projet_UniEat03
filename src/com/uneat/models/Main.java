package com.uneat.models;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UniEat Sprint 1 ===");

        Stock s1 = new Stock("Pizza", 10, 6);
        Stock s2 = new Stock("Couscous", 5, 8);

        s1.afficherStock();
        s2.afficherStock();
    }
}
