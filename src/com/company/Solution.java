package com.company;

import java.util.ArrayList;

public class Solution {
    // liste des éléments à mettre dans le sac pour avoir le profit maximal
    public ArrayList<Element> elements;
    // valeur maximale possible
    public int profit;

    public Solution(){

    }
    public Solution(ArrayList<Element> elements, int profit) {
        this.elements = elements;
        this.profit = profit;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public int getProfit() {
        return profit;
    }
}
