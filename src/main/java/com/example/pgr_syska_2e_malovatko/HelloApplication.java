package com.example.pgr_syska_2e_malovatko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    // VARS
    public void drawPolygon(GraphicsContext gc, double[] x, double[] y, Color color) {
        gc.setFill(color);
        gc.fillPolygon(x, y, x.length);

        gc.setStroke(Color.BLACK);
        gc.strokePolygon(x, y, x.length);
    }
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1200, 600);

        Pane root = new Pane();

        Button buttonFox = new Button("Liska");
        Button buttonDel = new Button("Smazat");
        VBox layout = new VBox();
        layout.setSpacing(50);
        HBox nav = new HBox();
        nav.getChildren().add(buttonFox);
        nav.getChildren().add(buttonDel);
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

        buttonFox.setOnAction(event -> {
            gc.fillRect(50, 50, 200, 100);

        });
        buttonFox.setOnAction(event -> {
            //HEAD
            drawPolygon(
                    gc,
                    new double[]{
                            92, 98, 107, 118, 131, 142, 159, 169, 176, 184,
                            187, 187, 184, 180, 178, 180, 173, 168, 162, 158,
                            155, 148, 144, 135, 127, 119, 114, 108, 103, 99,
                            98, 97, 95, 94, 90, 89, 87, 87, 92, 90, 89, 90, 93
                    },
                    new double[] {
                            129, 132, 136, 136, 136, 134, 126, 120, 114, 104,
                            95, 88, 85, 84, 84, 77, 75, 73, 69, 66,
                            62, 60, 58, 56, 58, 60, 63, 67, 71, 76,
                            83, 88, 94, 99, 105, 109, 111, 113, 115, 120,
                            123, 127, 130
                    },
                Color.ORANGE
            );
            //RIGHT EAR
            drawPolygon(
                    gc,
                    new double[]{
                            148, 147, 147, 146,
                            147, 147, 149, 150, 152, 154, 158, 162, 164, 167,
                            170, 173, 174, 174, 174, 173, 172, 171, 167, 164,
                            160, 156, 152, 148
                    },
                    new double[] {
                            59, 55, 52, 47,
                            45, 41, 36, 31, 28, 26, 28, 33, 36, 41,
                            47, 56, 61, 68, 72, 72, 73, 74, 72, 70,
                            68, 64, 61, 58
                    },
                    Color.ORANGE
            );
            //LEFT EAR
            drawPolygon(
                    gc,
                    new double[]{
                            86, 82, 80, 78, 76, 74, 73, 72, 71, 71,
                            71, 73, 76, 81, 85, 89, 91, 94, 95, 97,
                            98, 97, 96, 95, 95, 93, 92, 90
                    },
                    new double[]{
                            103, 99, 96, 93, 90, 85, 80, 76, 71, 66,
                            61, 57, 57, 59, 61, 64, 67, 69, 72, 75,
                            78, 83, 87, 90, 93, 98, 102, 105
                    },
                    Color.ORANGE

            );
            //BODY
            drawPolygon(
                    gc,
                    new double[]{
                            113, 110, 107, 104, 100, 95, 92, 89, 88, 89,
                            88, 90, 94, 98, 105, 111, 116, 118, 121, 126,
                            130, 134, 136, 136, 133, 129, 132, 135, 135, 134,
                            128, 128, 127, 125, 121, 117, 111, 109, 115, 119,
                            122, 125, 127, 128, 128, 128, 128, 128, 130, 133,
                            136, 136, 142, 150, 154, 152, 149, 151, 153, 152,
                            157, 160, 162, 159, 162, 162, 157, 155, 152, 151,
                            151, 150, 150, 150, 151, 156, 160, 163, 165, 166,
                            166, 165, 163, 161, 159, 157, 151, 147, 140, 132,
                            126, 119, 115
                    },
                    new double[]{
                            141, 145, 148, 152, 156, 162, 168, 173, 178, 183,
                            186, 193, 198, 201, 204, 206, 206, 209, 210, 210,
                            209, 208, 206, 204, 201, 200, 200, 202, 199, 195,
                            195, 190, 184, 180, 176, 174, 173, 172, 173, 175,
                            178, 181, 187, 176, 168, 162, 173, 177, 183, 188,
                            194, 200, 210, 210, 207, 204, 202, 203, 206, 209,
                            207, 205, 200, 198, 202, 197, 193, 193, 186, 181,
                            178, 173, 160, 175, 179, 172, 166, 160, 153, 148,
                            143, 137, 134, 131, 128, 126, 130, 132, 134, 136,
                            137, 136, 137
                    },
                    Color.ORANGE
            );
            //PAW
            drawPolygon(
                    gc,
                    new double[]{
                            166, 172, 174, 179, 184, 191, 193, 193, 193, 191,
                            188, 184, 180, 177, 174, 171, 163, 165, 166, 166, 166
                    },
                    new double[]{
                            155, 151, 147, 144, 137, 134, 130, 126, 122, 119,
                            118, 115, 116, 118, 121, 127, 132, 138, 145, 151, 155
                    },
                    Color.ORANGE
            );
            //TAIL
            drawPolygon(
                    gc,
                    new double[]{
                            91, 89, 87, 86, 85, 84, 84, 84, 82, 80,
                            76, 71, 66, 59, 53, 47, 42, 38, 34, 32,
                            36, 38, 40, 40, 39, 38, 35, 35, 36, 39,
                            41, 45, 49, 56, 62, 70, 79, 86, 90, 93,
                            90, 88, 88, 88, 89, 91, 92, 95, 95
                    },
                    new double[]{
                            158, 154, 151, 146, 141, 137, 133, 126, 120, 115,
                            110, 104, 100, 99, 99, 101, 105, 108, 113, 118,
                            119, 122, 126, 131, 135, 142, 150, 160, 169, 179,
                            184, 190, 194, 198, 201, 203, 204, 201, 199, 195,
                            193, 188, 182, 178, 173, 170, 167, 164, 162
                    },
                    Color.ORANGE
            );
        });
        Scene scene = new Scene(root, 1200, 600);
        stage.setTitle("Malovatko");
        stage.setScene(scene);
        stage.show();
    }
}
