package com.example.LoginForm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginFormApplication.class.getResource("loginForm-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 286, 203);
        stage.setTitle("Login Form Application!");
        stage.setScene(scene);
        stage.show();
    }
}
