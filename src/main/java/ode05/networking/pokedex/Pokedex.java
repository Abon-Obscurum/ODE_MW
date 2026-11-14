package ode05.networking.pokedex;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pokedex extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<String> pokemon = FXCollections.observableArrayList();
        BorderPane root = new BorderPane();

        ListView<String> listViewPokemon = new ListView();
        listViewPokemon.setItems(pokemon);
        root.setCenter(listViewPokemon);

        TextField name = new TextField();
        TextField level = new TextField();

        Button addPokemon = new Button("Add Pokemon");
        addPokemon.setOnAction(e -> {
            Pokemon enteredPokemon = new Pokemon();
            enteredPokemon.name = name.getText();
            enteredPokemon.level = level.getText();
            pokemon.add(enteredPokemon.toString());
        });

        Button releasePokemon = new Button("Release Pokemon");
        releasePokemon.setOnAction(e -> {
            pokemon.remove(listViewPokemon.getSelectionModel().getSelectedItem());
        });

        VBox vBoxPokemon = new VBox();
        vBoxPokemon.getChildren().addAll(name, level, addPokemon, releasePokemon);

        root.setLeft(vBoxPokemon);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Pokedex");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
