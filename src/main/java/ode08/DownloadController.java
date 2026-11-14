package ode08;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

public class DownloadController {

    @FXML private TextField urlField;
    @FXML private TextArea resultArea;
    private final DownloadService downloadService = new DownloadService();
    @FXML
    public void initialize(){
        downloadService.valueProperty().addListener((obs,oldValue,newValue) ->{
            if(newValue == null){
                return;
            }
            resultArea.setText(newValue);
        });
    }
    @FXML
    public void onDownload(){
        System.out.println("onDownload, Thread: " + Thread.currentThread().getName());
        downloadService.setUrl(urlField.getText());
        downloadService.restart();


    }

}
