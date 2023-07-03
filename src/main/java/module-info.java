module com.example.desafios {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.desafios to javafx.fxml;
    exports com.example.desafios;
}