module com.example.la6githubracho {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.CharacterCounter to javafx.fxml;
    exports com.example.CharacterCounter;

    opens com.example.CharacterRemover to javafx.fxml;
    exports com.example.CharacterRemover;

    opens com.example.LoginForm to javafx.fxml;
    exports com.example.LoginForm;
}