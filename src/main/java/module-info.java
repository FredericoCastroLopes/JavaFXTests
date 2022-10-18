module com.example.loginfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginfxml to javafx.fxml;
    exports com.example.loginfxml;
}