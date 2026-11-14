package streamio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Entry point, starts with the login view
public class AuthApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(AuthApp.class.getResource("login-view.fxml"));
        stage.setScene(new Scene(loader.load(), 600, 400));
        stage.setTitle("Pokedex Login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
