package com.example.CharacterCounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CharacterCounterController {

    @FXML
    private TextArea messageTextArea;

    @FXML
    private TextField characterTextField;

    @FXML
    private Label countLabel;

    @FXML
    protected void onCountButtonClick() {
        String text = messageTextArea.getText().toLowerCase();
        String targetStr = characterTextField.getText().toLowerCase();

        if (targetStr.isEmpty()) {
            countLabel.setText("Count: Please enter a character");
            return;
        }

        char targetChar = targetStr.charAt(0);
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == targetChar) {
                count++;
            }
        }

        countLabel.setText("Count: " + count);
    }
}