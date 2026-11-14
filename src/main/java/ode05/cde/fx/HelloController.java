package ode05.cde.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField tfNum1;
    @FXML
    private TextField tfNum2;
    @FXML
    private Label lbResult;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onPlusClick(ActionEvent actionEvent) {
        String contentTf1 = tfNum1.getText();
        String contentTf2 = tfNum2.getText();
        double num1 = Double.parseDouble(contentTf1);
        double num2 = Double.parseDouble(contentTf2);

        double sum = num1 + num2;

        lbResult.setText("Ergebnis: " + sum);
    }
}
