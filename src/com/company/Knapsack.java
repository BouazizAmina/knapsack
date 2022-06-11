package com.company;

import static java.lang.Integer.parseInt;

public class Knapsack {

    private int w;
    private int n;
    private int[] vi;
    private int[] wi;
    private int[][] matrix;
    public Knapsack(int w, int n, int[] vi, int[] wi) {
        this.w = w;
        this.n = n;
        this.vi = vi;
        this.wi = wi;
    }

    public void fillMatrix(){
        matrix = new int[n+1][w+1];
        for (int i = 0 ; i<= n;i++){
            for (int j = 0 ; j<= w;j++){
                if (i == 0 || j == 0){
                    matrix[i][j] = 0;
                }
                else {
                    if (j-wi[i-1] < 0){
                        matrix[i][j] = matrix[i-1][j] ;
                    }
                    else {
                        matrix[i][j] = Math.max(matrix[i-1][j] , matrix[i-1][j-wi[i-1]] + vi[i-1]);
                    }
                }
            }
        }
    }

    public void printMatrix(){
        System.out.println("\nLa matrice de knapsack");
        for (int i = 0 ; i<= n;i++){
            System.out.print("|");
            for (int j = 0 ; j<= w;j++){
                System.out.print(matrix[i][j] +" | ");
            }
            System.out.println("");        }
    }

    public int getMax(){
        return matrix[n][w];
    }

}

