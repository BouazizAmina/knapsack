package com.company;

public class Element {
    private int indice;
    private  int valeur;
    private  int poids;

    public Element(int indice, int valeur, int poids) {
        this.indice = indice;
        this.valeur = valeur;
        this.poids = poids;
    }

    public int getPoids() {
        return this.poids;
    }
    public int getValeur() {
        return this.valeur;
    }
}
