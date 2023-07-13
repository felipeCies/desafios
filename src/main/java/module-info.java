module com.example.desafios {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires java.desktop;


    opens com.example.desafios to javafx.fxml;
    exports com.example.desafios;
}