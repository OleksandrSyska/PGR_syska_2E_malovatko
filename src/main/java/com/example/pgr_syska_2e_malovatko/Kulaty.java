package com.example.pgr_syska_2e_malovatko;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Kulaty extends Tvar{
    Color color = Color.DODGERBLUE;
    void namaluj(GraphicsContext gc, int x , int y, int r){
        super.namaluj(gc,color);
    };
}
