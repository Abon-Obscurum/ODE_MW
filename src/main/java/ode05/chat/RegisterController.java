package ode05.chat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegisterController {
    @FXML private TextField userName;
    @FXML private PasswordField password;
    @FXML private Label message;

    @FXML
    private void register() {
        try {
            Connection.connect();
            String answer = Connection.request("REGISTER," + userName.getText() + "," + password.getText());
            if ("OK".equals(answer)) {
                message.setText("Registered, you can log in now");
                password.clear();
            } else {
                message.setText("Invalid input or user already exists");
            }
        } catch (IOException e) {
            message.setText("Server not reachable");
        }
    }

    // Switch to the login view
    @FXML
    private void toLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(RegisterController.class.getResource("login-view.fxml"));
        userName.getScene().setRoot(loader.load());
    }
}
