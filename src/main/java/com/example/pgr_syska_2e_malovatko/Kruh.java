package com.example.pgr_syska_2e_malovatko;

import javafx.scene.canvas.GraphicsContext;


public class Kruh extends Kulaty{
    void namaluj(GraphicsContext gc,int x,int y, int r) {
        super.namaluj(gc,x,y,r);
        gc.fillOval(x, y, r * 2, r * 2);
    }
}
