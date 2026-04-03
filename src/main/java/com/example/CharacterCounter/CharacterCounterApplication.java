package com.example.CharacterCounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterCounterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CharacterCounterApplication.class.getResource("characterCounter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 397, 324);
        stage.setTitle("Character Counter!");
        stage.setScene(scene);
        stage.show();
    }
}
