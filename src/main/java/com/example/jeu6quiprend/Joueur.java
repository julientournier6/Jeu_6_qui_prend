package com.example.jeu6quiprend;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private int points;
    private ArrayList<Carte> cartesEnMain;

    public Joueur(String nom) {
        this.nom = nom;
        this.points = 0;
        this.cartesEnMain = new ArrayList<Carte>();
    }

    public String getNom() {
        return nom;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Carte> getCartesEnMain() {
        return cartesEnMain;
    }

    public void ajouterCarte(Carte carte) {
        cartesEnMain.add(carte);
    }

    public void retirerCarte(Carte carte) {
        cartesEnMain.remove(carte);
    }

    public Carte jouerCarte(int index) {
        Carte carteAJouer = cartesEnMain.get(index);
        cartesEnMain.remove(index);
        return carteAJouer;
    }

    public void ajouterPoints(int points) {
        this.points += points;
    }

    //TODO implémenter les règles spécifiques de jeux
}
