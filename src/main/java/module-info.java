module fhtw.chatroom_frontend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires lombok;

    opens fhtw.chatroom_frontend to javafx.fxml;
    exports fhtw.chatroom_frontend;
}