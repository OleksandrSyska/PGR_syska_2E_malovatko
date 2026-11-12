package com.example.pgr_syska_2e_malovatko;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tvar {
    Color color;
    void namaluj(GraphicsContext gc,Color color){
        this.color = color;
        gc.setFill(this.color);
    };
}
