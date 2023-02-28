package com.example.calcolatricefx;

import java.util.Objects;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class calcolatricecontroller {
    @FXML
    private Label displayLabel;
    private boolean flgSostituisci = true;
    private double op1;//primo operando
    private double op2;//secondo operando
    private String tipoOp;
    private String tipoOp2;

    private double numMemoria;
    private boolean isUguale = false;
    @FXML
    protected void on1Click(){
        if (flgSostituisci){
            displayLabel.setText("1");
            flgSostituisci = false;
        }else {

            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "1";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("1");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on2Click(){
        if (flgSostituisci){
            displayLabel.setText("2");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "2";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("2");
                flgSostituisci = false;
            }
        }

    }
    @FXML
    protected void on3Click(){
        if (flgSostituisci){
            displayLabel.setText("3");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "3";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("3");
                flgSostituisci = false;
            }
        }

    }
    @FXML
    protected void on4Click(){
        if (flgSostituisci){
            displayLabel.setText("4");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "4";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("4");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on5Click(){
        if (flgSostituisci){
            displayLabel.setText("5");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "5";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("5");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on6Click(){
        if (flgSostituisci){
            displayLabel.setText("6");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "6";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("6");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on7Click(){
        if (flgSostituisci){
            displayLabel.setText("7");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "7";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("7");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on8Click(){
        if (flgSostituisci){
            displayLabel.setText("8");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "8";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("8");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on9Click(){
        if (flgSostituisci){
            displayLabel.setText("9");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "9";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("9");
                flgSostituisci = false;
            }
        }
    }
    @FXML
    protected void on0Click(){
        if (flgSostituisci){

            displayLabel.setText("0");
            flgSostituisci = false;


        }else {
            String dispString = displayLabel.getText() + "0";
            displayLabel.setText(dispString);
        }
    }
    @FXML
    protected void onmenoClick(){
        String strOperando1 = displayLabel.getText();
        op1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "-";
        tipoOp2 = "-";
    }
    @FXML
    protected void onmoltiplicazioneClick(){
        String strOperando1 = displayLabel.getText();
        op1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "*";
        tipoOp2 = "*";
    }
    @FXML
    protected void ondivClick(){
        String strOperando1 = displayLabel.getText();
        op1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "/";
        tipoOp2 = "/";
    }
    @FXML
    protected void onvirgolaClick(){ //la virgola viene riconosciuta come punto
        if (!displayLabel.getText().contains(".")) { //se la stringa non contiene la virgola, la mette, sennò non la mette
            String primaVirgola = displayLabel.getText() + ".";
            //op1 = Double.parseDouble(primaVirgola);
            flgSostituisci = false;
            displayLabel.setText(primaVirgola);

        }
    }

    @FXML
    protected void onpiuClick(){
        String strOperando1 = displayLabel.getText();
        op1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "+";
        tipoOp2 = "+";
    }
    @FXML
    protected void onugualeClick(){

        if (isUguale){
            double result = Double.parseDouble(displayLabel.getText());
            result = result + op2;
            displayLabel.setText(String.valueOf(result));
        }else {
            isUguale = true;
            String strOperando2 = displayLabel.getText();
            op2 = Double.parseDouble(strOperando2);
            flgSostituisci = true;
            String strSomma;

            switch (tipoOp) {
                case "+" -> {
                    strSomma = String.valueOf(op1 + op2);
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "-" -> {
                    if (op2 < 0){
                        //System.out.println("op2 = " + op2);
                        op2 = -op2;
                        strSomma = String.valueOf(op1 + op2);
                    }else{
                        strSomma = String.valueOf(op1 - op2);
                    }
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "*" -> {
                    strSomma = String.valueOf(op1 * op2);
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "/" -> {
                    strSomma = String.valueOf(op1 / op2);
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "%" -> {
                    switch (tipoOp2) {
                        case "+" -> {
                            strSomma = String.valueOf(op1 + (op1 * op2) / 100);
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                        case "-" -> {
                            strSomma = String.valueOf(op1 - (op1 * op2) / 100);
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                        case "*" -> {
                            strSomma = String.valueOf((op1 * op2) / 100);
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                        case "/" -> {
                            strSomma = String.valueOf(op1 * (100 / op2));
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                    }
                    tipoOp = null;
                }
            }
        }

    }
    private static String removeLastChar(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceFirst(".$", "");
    }

    @FXML
    protected void delete1char(){

        String dispString = displayLabel.getText();
        displayLabel.setText(removeLastChar((dispString)));
    }

    @FXML
    protected void deleteOperando(){ //CE

        if (tipoOp!=null){

            op2 =0;
            displayLabel.setText("0");
        }else {
            op1 =0;
            displayLabel.setText("0");
        }
    }

    @FXML
    protected void deleteTutto(){ //C

        op1 = 0;
        op2 = 0;

        displayLabel.setText("0");
        isUguale=false;
    }

    @FXML
    protected void onChangeSignClick(){

        double numero = Double.parseDouble(displayLabel.getText());
        numero = -numero;
        displayLabel.setText(String.valueOf(numero));
    }

}