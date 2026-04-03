package com.example.LoginForm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField passwordTextField;

    @FXML
    protected void onLoginButtonClick() {
        String password = "admin";
        String username = "admin";
        String inPassword = passwordTextField.getText();
        String inUsername = userNameTextField.getText();
        if(inUsername.equals(username) && inPassword.equals(password)){
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-successfully.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Status");
                stage.setScene(scene);
                stage.show();
            }catch(IOException _){
            }
        }else{
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-failed.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Status");
                stage.setScene(scene);
                stage.show();
            }catch(IOException _){
            }
        }
    }
}
