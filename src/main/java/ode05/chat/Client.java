package ode05.chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Start with the login view
        FXMLLoader loader = new FXMLLoader(Client.class.getResource("login-view.fxml"));
        primaryStage.setScene(new Scene(loader.load(), 600, 400));
        primaryStage.setTitle("Der Klient mit TCP");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
