module com.example.iphone2017functionality {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iphone2017 to javafx.fxml;
    exports com.iphone2017;
}