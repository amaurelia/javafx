module com.example.test {

    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.test;
    exports com.example.test.model;

    opens com.example.test.controller to javafx.fxml;
    opens com.example.test.model to javafx.base;
}