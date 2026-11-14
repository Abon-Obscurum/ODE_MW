package ode05.chat;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ClientController {
    // Injected from FXML via fx:id
    @FXML private TextField messageField;
    @FXML private ListView<String> messageList;

    // Called automatically after the FXML is loaded
    @FXML
    public void initialize() {
        // Connection already exists from the login, just start reading
        new ReaderThread(Connection.getIn(), messageList).start();
    }

    // Called when the Send button is clicked
    @FXML
    private void onSend() {
        String message = messageField.getText();
        if (message.isBlank()) {
            return;
        }
        Connection.send(message);
        messageField.setText("");
    }
}
