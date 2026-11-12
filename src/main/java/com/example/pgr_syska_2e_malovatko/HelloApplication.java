package com.example.pgr_syska_2e_malovatko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public void clearCanvas(GraphicsContext gc,Canvas canvas) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
    @Override
    public void start(Stage stage) throws IOException {


        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1200, 600);

        Pane root = new Pane();
        Button buttonDel = new Button("Smazat");
        Button buttonSnehulak = new Button("Snehulak");
        VBox layout = new VBox();
        layout.setSpacing(50);
        HBox nav = new HBox();
        nav.getChildren().add(buttonDel);
        nav.getChildren().add(buttonSnehulak);
        nav.setSpacing(20);
        Pane canvasWrap = new Pane();
        Canvas canvas = new Canvas(1196,500);
        canvasWrap.getChildren().add(canvas);
        canvasWrap.setStyle(
                "-fx-border-color: black;" +
                        "-fx-border-width: 2px;"
        );
        layout.getChildren().add(nav);
        layout.getChildren().add(canvasWrap);
        root.getChildren().add(layout);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        buttonDel.setOnAction(event -> {
            clearCanvas(gc,canvas);
        });
        buttonSnehulak.setOnAction(event -> {
            Kruh k1 = new Kruh();
            Kruh k2 = new Kruh();
            Kruh k3 = new Kruh();

            k1.namaluj(gc,500,300,50);
            k2.namaluj(gc,510,225,40);
            k3.namaluj(gc,520,170,30);

            Obdelnik o1 = new Obdelnik();

            o1.namaluj(gc,520,130,60,50);

        });
        Scene scene = new Scene(root, 1200, 600);
        stage.setTitle("Malovatko");
        stage.setScene(scene);
        stage.show();
    }
}
