package com.example.sae201;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MainMenuController {

    @FXML
    private void handleNewGame(MouseEvent event) {
        System.out.println("Nouvelle partie clicked");
        // Add logic for starting a new game
    }

    @FXML
    private void handleResumeGame(MouseEvent event) {
        System.out.println("Reprendre la partie clicked");
        // Add logic for resuming a game
    }

    @FXML
    private void handleManageDecks(MouseEvent event) {
        System.out.println("Gérer les decks clicked");
        // Add logic for managing decks
    }

    @FXML
    private void handleSettings(MouseEvent event) {
        System.out.println("Paramètres clicked");
        // Add logic for settings
    }

    @FXML
    private void handleClose(MouseEvent event) {
        System.out.println("Fermer clicked");
        // Add logic for closing the application
        // Example: close the current window
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
} 