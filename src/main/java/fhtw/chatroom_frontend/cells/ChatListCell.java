package fhtw.chatroom_frontend.cells;

import fhtw.chatroom_frontend.HelloApplication;
import fhtw.chatroom_frontend.chat.PrivateChat;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.util.Callback;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


public class ChatListCell implements Callback<ListView<PrivateChat>, ListCell<PrivateChat>> {

    @FXML
    private Label username;
    @FXML
    private Label shownMessage;


    public ListCell<PrivateChat> call(ListView<PrivateChat> param) {
        return new ListCell<PrivateChat>() {
            public void updateItem(PrivateChat privateChat, boolean empty) {
                super.updateItem(privateChat, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else if (privateChat != null) {
                    // Create an HBox to hold all the elements
                    HBox hbox = new HBox();
                    Image img = new Image("file:./src/main/resources/assets/woman.png");
                    // Create an ImageView
                    ImageView imageView = new ImageView(img);
                    imageView.setFitHeight(60.0);
                    imageView.setFitWidth(60.0);

                    // Create a VBox for the labels
                    VBox labelVBox = new VBox();
                    labelVBox.setAlignment(Pos.CENTER_RIGHT);

                    // Create labels
                    Label nameLabel = new Label(privateChat.getMember().toString());
                    nameLabel.setFont(Font.font("Open Sans Bold", 18.0));


                    // Add labels to the VBox
                    labelVBox.getChildren().addAll(nameLabel);


                    hbox.getChildren().addAll(imageView, labelVBox);
                    //hbox.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));

                    // Set the HBox as the graphic for the cell
                    setGraphic(hbox);


                } else {
                    setText("null");
                    setGraphic(null);
                }
            }
        };
    }
}
