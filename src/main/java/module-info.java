module com.example.jeu6quiprend {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            requires eu.hansolo.tilesfx;
            requires com.almasb.fxgl.all;


    requires java.desktop;
    opens com.example.jeu6quiprend to javafx.fxml;
    exports com.example.jeu6quiprend;
}