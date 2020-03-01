package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.util.Duration;
import java.util.Random;

public class JavaFXFirst extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        int viewWidth = 300;
        int viewHeight = 300;
        int PosY = 0;
        Random randy = new Random();
        int rand = randy.nextInt(viewWidth);

        stage.setTitle("Hello World!");
        stage.setWidth(viewWidth);
        stage.setHeight(viewHeight);
        VBox parent = new VBox(); // <-- This is the parent node as a layout manager

        Label label1 = new Label("Hello World!");// <-- child node
        TranslateTransition tt = new TranslateTransition(Duration.millis(4000), label1);
        tt.setByY(viewHeight);
        tt.setByX(200);
        tt.setCycleCount(rand);
        tt.play();


        parent.getChildren().add(label1);
        Scene scene1 = new Scene(parent);
        stage.setScene(scene1);
        stage.show();

    }
}
