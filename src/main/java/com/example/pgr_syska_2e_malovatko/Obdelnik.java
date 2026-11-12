package com.example.pgr_syska_2e_malovatko;

import javafx.scene.canvas.GraphicsContext;

public class Obdelnik extends Hranaty{
    void namaluj(GraphicsContext gc, int x, int y, int w,int h) {
        super.namaluj(gc);
        gc.fillRect(x,y,w,h);
    }
}
