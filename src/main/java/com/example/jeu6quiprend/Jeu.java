package com.example.jeu6quiprend;

import java.util.ArrayList;
import java.util.Collections;

public class Jeu {
    private ArrayList<Carte> cartes;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Carte> tasDeCartes;

    public Jeu(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
        this.cartes = new ArrayList<Carte>();
        this.tasDeCartes = new ArrayList<Carte>();

        // Initialisation du jeu de cartes
        for (int i = 1; i <= 104; i++) {
            int valeur = i % 10 == 0 ? 10 : i % 10;
            this.cartes.add(new Carte(i, valeur));
        }
        Collections.shuffle(this.cartes);

        // Distribution des cartes aux joueurs
        for (Joueur joueur : this.joueurs) {
            for (int i = 0; i < 10; i++) {
                joueur.ajouterCarte(this.cartes.remove(0));
            }
        }

        // Initialisation du tas de cartes
        for (int i = 0; i < 4; i++) {
            this.tasDeCartes.add(this.cartes.remove(0));
        }
    }

    public ArrayList<Carte> getTasDeCartes() {
        return tasDeCartes;
    }

    public void ajouterCarteAuTas(Carte carte) {
        tasDeCartes.add(carte);
    }

    public void retirerCarteDuTas(Carte carte) {
        tasDeCartes.remove(carte);
    }

    public void jouerTour() {
        // TODO: implémenter le tour de jeu
    }

    public void afficherScores() {
        for (Joueur joueur : joueurs) {
            System.out.println(joueur.getNom() + " : " + joueur.getPoints() + " points");
        }
    }
}
