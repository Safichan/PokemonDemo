module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.json;


    opens pokemon.userinterface to javafx.fxml;
    exports pokemon.userinterface;
}