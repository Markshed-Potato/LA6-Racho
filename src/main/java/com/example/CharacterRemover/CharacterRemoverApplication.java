package com.example.CharacterRemover;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterRemoverApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CharacterRemoverApplication.class.getResource("characterRemover-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 436, 194);
        stage.setTitle("Character Remover");
        stage.setScene(scene);
        stage.show();
    }
}
