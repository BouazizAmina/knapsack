package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private ObservableList<String> objects,objetsfinal;
    static private ArrayList<Element> elements =new ArrayList<>();
    private int indice=1;
    private Element e;
    static  private  int poidsSac=0;

    @FXML
    private Button start_btn;
    @FXML
    private TextField capaciteSac;
    @FXML
    private TextField nbObjets;
    @FXML
    private TextField poidsObjet;
    @FXML
    private TextField gainObjet;
    @FXML
    private ListView<String> listObjets;
    @FXML
    private Label err_msg;
    @FXML
    private Button creerSolution;
    @FXML
    private Button retour_btn;
    @FXML
    private TextField profilMax;
    @FXML
    private ListView<String> listsol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        objects = FXCollections.observableArrayList();
        objetsfinal = FXCollections.observableArrayList();
    }

    public void goToSecondPage(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        if(event.getSource()==start_btn){
            stage = (Stage) start_btn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("secondPage.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void setObjet(){
        String objet="Poids : "+poidsObjet.getText()+ "\n"+"Gain : "+gainObjet.getText();
        if(objects.size() < Integer.parseInt(nbObjets.getText())){
            e= new Element(indice,Integer.parseInt(gainObjet.getText()),Integer.parseInt(poidsObjet.getText()));
            elements.add(e);
            System.out.println(elements.get(0).getValeur());
            objects.add(objet);
            listObjets.setItems(objects);
        }
        else{
            this.err_msg.setText("Vous avez depasser le nombre maximale d'objects ");
        }
    }

    public void creerSol(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        poidsSac=Integer.parseInt(capaciteSac.getText());
        if(event.getSource()==creerSolution){
            stage = (Stage) creerSolution.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("thirdPage.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void retour(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        if(event.getSource()==retour_btn){
            stage = (Stage) retour_btn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("secondPage.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            objects = FXCollections.observableArrayList();
            objetsfinal = FXCollections.observableArrayList();
            elements = new ArrayList<>();
        }
    }
    public void afficherResultat(){
        Probleme algo=new Probleme(elements,poidsSac);
        Solution sol =new Solution();
        sol = algo.resoudre();
        profilMax.setText(String.valueOf(sol.getProfit()));

        for(Element e:sol.getElements()){
            String objet="Poids : "+String.valueOf(e.getPoids())+ "\n"+"Gain : "+String.valueOf(e.getValeur());
            objetsfinal.add(objet);
        }
        listsol.setItems(objetsfinal);
    }

}
