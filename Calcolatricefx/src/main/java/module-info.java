module com.example.calcolatricefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcolatricefx to javafx.fxml;
    exports com.example.calcolatricefx;
}