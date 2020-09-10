module de.sterzsolutions {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.sterzsolutions to javafx.fxml;
    exports de.sterzsolutions;
}