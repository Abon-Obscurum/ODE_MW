package ode05.chat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @FXML private TextField userName;
    @FXML private PasswordField password;
    @FXML private Label message;

    @FXML
    private void login() {
        try {
            Connection.connect();
            String answer = Connection.request("LOGIN," + userName.getText() + "," + password.getText());
            if ("OK".equals(answer)) {
                // Logged in: open the chat view
                FXMLLoader loader = new FXMLLoader(LoginController.class.getResource("client-view.fxml"));
                userName.getScene().setRoot(loader.load());
            } else {
                message.setText("Wrong username or password");
            }
        } catch (IOException e) {
            message.setText("Server not reachable");
        }
    }

    // Switch to the register view
    @FXML
    private void toRegister() throws IOException {
        FXMLLoader loader = new FXMLLoader(LoginController.class.getResource("register-view.fxml"));
        userName.getScene().setRoot(loader.load());
    }
}
