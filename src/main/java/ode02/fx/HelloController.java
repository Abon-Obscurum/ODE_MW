package ode02.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public Label display;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onOperator(){
        
    }
}
