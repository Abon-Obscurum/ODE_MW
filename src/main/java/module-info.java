module at.fhtw.ode {
    requires javafx.controls;
    requires javafx.fxml;

    opens ode02.fx to javafx.fxml;
    opens ode03.medialibrary to javafx.fxml;
    opens ode05.networking.fx to javafx.fxml;
    opens ode05.chat to javafx.fxml;
    opens ode05.cde.fx to javafx.fxml;
    opens ode08 to javafx.fxml;

    exports ode02.fx;
    exports ode03.medialibrary;
    exports ode05.networking.fx;
    exports ode05.networking.pokedex;
    exports ode05.chat;
    exports ode05.cde.fx;
    exports ode08;
}