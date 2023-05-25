package com.example.jeu6quiprend;

public class Card {
    private int numero;
    private int valeur;

    public Card(int numero, int valeur) {
        this.numero = numero;
        this.valeur = valeur;
    }

    public int getNumero() {
        return numero;
    }

    public int getValeur() {
        return valeur;
    }

    public int comparer(Carte autreCarte) {
        if (this.valeur < autreCarte.getValeur()) {
            return -1;
        } else if (this.valeur > autreCarte.getValeur()) {
            return 1;
        } else {
            return 0;
        }
    }
}
