package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("firstPage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Knapsack");
        //primaryStage.setScene(new Scene(root, 3000, 2000));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
//        Scanner s1 = new Scanner(System.in);
//        Scanner s2 = new Scanner(System.in);
//        System.out.println("Bienvenue a Knapsack solution \n");
//
//        System.out.println("Entrer la valeur du poids maximal : \n");
//        int w = s1.nextInt();
//
//        System.out.println("Entrer le nombre d'objets : \n");
//        int n = s1.nextInt();
//        int[] vi = new int[n];
//        int[] wi = new int[n];
//        int i;
//
//        System.out.println("Entrez le tableau des gains \n");
//        String str = s2.nextLine();
//        String[] arrOfStr = str.split(" ");
//        i = 0;
//        try {
//            for (String a : arrOfStr) {
//                vi[i] = parseInt(a);
//                i++;
//            }
//        }
//        catch (NumberFormatException nb){System.out.println("err");}
//        catch (ArrayIndexOutOfBoundsException ind){
//            System.out.println("Le nombre de gain attendus est supérieur au nombre de valeur introduit");
//        }
//
//        System.out.println("Entrez le tableau des poids \n");
//        str = s2.nextLine();
//        arrOfStr = str.split(" ");
//        i = 0;
//        try {
//            for (String a : arrOfStr) {
//                wi[i] = parseInt(a);
//                i++;
//            }
//        }
//        catch (NumberFormatException nb){System.out.println("err");}
//        catch (ArrayIndexOutOfBoundsException ind){
//            System.out.println("Le nombre de poids attendus est supérieur au nombre de valeur introduit");
//
//        }
//
//        Knapsack knapsack = new Knapsack(w,n,vi,wi);
//        knapsack.fillMatrix();
//        knapsack.printMatrix();
//        System.out.println("\nLe gain maximale est :" +knapsack.getMax());

    }
}
