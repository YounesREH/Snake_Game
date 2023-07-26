module com.example.sna {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sna to javafx.fxml;
    exports com.example.sna;
}