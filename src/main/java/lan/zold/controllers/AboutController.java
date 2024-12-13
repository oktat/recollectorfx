/*
* File: AboutController.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-13
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lan.zold.App;

public class AboutController {

    @FXML
    private Button backButton;

    @FXML
    public void initialize() {
        backButton.setOnAction(event -> {
            App.setRoot("mainScene");
        });
    }

}
