/*
* File: MainController.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-13
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold.controllers;

import java.util.ArrayList;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import lan.zold.App;
import lan.zold.models.Page;

public class MainController {

    @FXML
    private Button aboutButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button filterButton;

    @FXML
    private Button lowercaseButton;

    @FXML
    private Button pasteButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button startButton;

    @FXML
    private TextField statusField;

    @FXML
    private TextField urlField;

    @FXML
    private ListView<String> wordsList;

    @FXML
    public void initialize() {
        //Button handlsers
        /************ pasteButton ****************/
        pasteButton.setOnAction(event -> {
            System.out.println("beillesztés...");
            urlField.paste();
            statusField.setText("Beillesztve");
        });


        /************ startButton ****************/
        startButton.setOnAction(event -> {
            statusField.setText("Futtatva");
            String utvonal = urlField.getText();
            if (utvonal.isEmpty()) {
                statusField.setText("Automatikus útvonal");
                utvonal = "https://index.hu";
            }
            Page page = new Page();
            page.setUrl(utvonal);
            ArrayList<String> w = page.getContent();

            for(String word : w) {
                wordsList.getItems().add(word);
            }
            Integer wordCount = wordsList.getItems().size();
            statusField.setText(wordCount + " szöveg");
        });


        /************ aboutButton ****************/
        aboutButton.setOnAction(event -> {
            App.setRoot("aboutScene");
        });


        /************ exitButton ****************/
        exitButton.setOnAction(event -> {
            Platform.exit();
        });


        /************ deleteButton ****************/
        deleteButton.setOnAction(event -> {
            statusField.setText("Törlve");
        });


        /************ lowercaseButton ****************/
        lowercaseButton.setOnAction(event -> {
            statusField.setText("Kisbetükben");
        });

        /************ filterButton ****************/
        filterButton.setOnAction(event -> {
            statusField.setText("Szöveg");
        });


        /************ saveButton ****************/
        saveButton.setOnAction(event -> {
            statusField.setText("Mentve");
        });

    }


}
