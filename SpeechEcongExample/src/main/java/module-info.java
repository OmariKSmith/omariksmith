module org.javaclass.speechecongexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires fxgl.intelligence;
    requires sphinx4.core;

    opens org.javaclass.speechecongexample to javafx.fxml;
    exports org.javaclass.speechecongexample;
}