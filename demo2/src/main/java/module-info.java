module pe.edu.upeu.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.demo2 to javafx.fxml;
    exports pe.edu.upeu.demo2;
}