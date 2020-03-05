package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.util.Duration;
import java.util.Random;

public class JavaFXFirst extends Application {
    private int viewWidth = 500;
    private int initialXPos = viewWidth / 2; //100;
    private int initialYPos = viewWidth / 2;
    private int rectWidth = 30;
    private int currentPosX = initialXPos;
    private int currentPosY = initialYPos;
    private int objectposX = 250;
    private int objectposY = 30;


    @Override
    public void start(Stage stage) throws Exception {



        stage.setTitle("Hello World!");
        stage.setWidth(viewWidth);
        int viewHeight = 500;
        stage.setHeight(viewHeight);

        VBox parent = new VBox();
        Scene scene1 = new Scene(parent);

        Rectangle rect = new Rectangle();
        int rectHeight = 30;
        rect.setHeight(rectHeight);
        rect.setWidth(rectWidth);
        rect.setTranslateX(initialXPos);
        rect.setTranslateY(initialYPos);
        rect.setFill(Color.CHARTREUSE);

        Rectangle rect2 = new Rectangle();
        rect2.setTranslateX(objectposX);
        rect2.setTranslateY(objectposY);
        rect2.setFill(Color.RED);
        rect2.setHeight(rectHeight);
        rect2.setWidth(rectWidth);

        Label l = new Label();

        TranslateTransition tt = new TranslateTransition(Duration.millis(250), l);

        tt.setCycleCount(1);


        scene1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case UP:
                        currentPosY -= 5;
                        rect.setTranslateY(currentPosY);
                        System.out.println("going up!");
                        break;
                    case DOWN:
                        currentPosY += 5;
                        System.out.println("Going Down!");
                        rect.setTranslateY(currentPosY);
                        break;
                    case LEFT:
                        currentPosX -= 5;
                        System.out.println("Going Left!");
                        rect.setTranslateX(currentPosX);
                        break;
                    case RIGHT:
                        currentPosX += 5;
                        System.out.println("Going Right!");
                        rect.setTranslateX(currentPosX);
                        break;
                    case SPACE:
                        l.setText("*");
                        tt.setFromX(currentPosX + 10);
                        tt.setFromY(currentPosY  - 60);
                        tt.setToY(currentPosY - viewHeight);
                        tt.play();
                        System.out.println("BOMBS AWAY!");
                        break;
                }

                if(currentPosX == objectposX && currentPosY == objectposY) {
                    rect.setWidth(rectWidth *= 1.25);
                    Random randy = new Random(0);
                    int x = randNum();
                    int y = randNum();
                    objectposX = x;
                    objectposY = y;
                    rect2.setTranslateX(objectposX);
                    rect2.setTranslateY(objectposY);
                }

                System.out.println("Current Position: x = " + currentPosX  + " y = " + currentPosY);
                System.out.println("Object Position: x = " + objectposX + " y: " + objectposY);
            }
        });


        parent.getChildren().addAll(rect, rect2, l);
        stage.setScene(scene1);
        stage.show();

    }

    private int randNum() {
        int num;
        Random randy = new Random();
        do {
             num = randy.nextInt(viewWidth);
        } while(num % 5 != 0);
        return num;
    }
}
