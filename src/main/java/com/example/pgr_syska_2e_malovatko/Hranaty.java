package com.example.pgr_syska_2e_malovatko;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Hranaty extends Tvar{
    Color color = Color.rgb(0,255,0);
    void namaluj(GraphicsContext gc){
        super.namaluj(gc,color);
    };
}
