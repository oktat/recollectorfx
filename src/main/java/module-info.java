module lan.zold {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;

    opens lan.zold to javafx.fxml;
    opens lan.zold.controllers to javafx.fxml;
    
    exports lan.zold;
}
