module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens pokemon.userinterface to javafx.fxml;
    exports pokemon.userinterface;
}