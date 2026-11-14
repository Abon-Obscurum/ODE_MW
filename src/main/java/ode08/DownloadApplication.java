package ode08;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DownloadApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader =  new FXMLLoader(DownloadApplication.class.getResource("download-view.fxml"));
        stage.setScene(new Scene(loader.load(), 700, 500));
        stage.setTitle("Kleiner Downloader");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
