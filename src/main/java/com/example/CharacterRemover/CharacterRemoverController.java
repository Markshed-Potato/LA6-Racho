package com.example.CharacterRemover;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CharacterRemoverController {
    @FXML
    private Label textLabel;
    @FXML
    private CheckBox vowelCheckbox;
    @FXML
    private CheckBox consonantCheckbox;
    @FXML
    private CheckBox numberCheckbox;

    @FXML
    protected void onButtonClickRemove(){
        String str = textLabel.getText();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            boolean rem = false;

            if(vowelCheckbox.isSelected()){
                if("aeiouAEIOU".indexOf(c) != - 1){
                    rem = true;
                }
            }
            if (consonantCheckbox.isSelected()) {
                if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                    rem = true;
                }
            }
            if (numberCheckbox.isSelected()) {
                if (Character.isDigit(c)) {
                    rem = true;
                }
            }
            if (!rem) {
                sb.append(c);
            }


        }
        textLabel.setText(sb.toString());
    }
    @FXML
    protected void onButtonClickRestore(){
        textLabel.setText("ABCDEFHIJKLMNOPQRSTUVWXYZ1234567890");
    }



}
