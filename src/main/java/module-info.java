module com.fibonnaci.fibonnaci {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fibonnaci.fibonnaci to javafx.fxml;
    exports com.fibonnaci.fibonnaci;
}