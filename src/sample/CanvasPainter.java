package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class CanvasPainter {

    void drawCanvas (Canvas c, int[][] arr) {
        GraphicsContext gc = c.getGraphicsContext2D();
        int arr_h = arr.length;
        int arr_w = arr[0].length;
        int sq_h = 500 / arr_h;
        int sq_w = 500 / arr_w;
        drawsquares(gc, arr, arr_h, arr_w, sq_h, sq_w);
        drawgrid(gc, arr_h, arr_w, sq_h, sq_w);
    }

    void drawsquares (GraphicsContext gc, int[][] arr, int arr_h, int arr_w, int sq_h, int sq_w) {

        for(int i = 0; i < arr_h; i++) {
            for(int j = 0; j < arr_w; j++) {
                drawsquare(gc, sq_w * j,sq_h * i, sq_w, sq_h, arr[i][j]);
            }
        }
    }

    void drawsquare (GraphicsContext gc, int x, int y, int a, int b, int state) {
        switch (state) {
            case 0:
                gc.setFill(Color.rgb(0, 0, 0));
                break;
            case 1:
                gc.setFill(Color.rgb(0, 132, 255));
                break;
            case 2:
                gc.setFill(Color.rgb(255, 63, 0));
                break;
            case 3:
                gc.setFill(Color.rgb(255, 209, 0));
                break;
            default:
                gc.setFill(Color.rgb(255, 255, 255));
                break;
        }
        gc.setLineWidth(5);
        gc.fillRect(x, y, a, b);
    }

    void drawgrid (GraphicsContext gc, int arr_h, int arr_w, int sq_h, int sq_w) {
        gc.setStroke(Color.rgb(54, 54, 54));
        gc.setLineWidth(2);
        //drawing horizontal lines
        for (int i = 0; i <= arr_h; i++) {
            gc.strokeLine(3, sq_h * i, 496, sq_h * i);
        }
        //drawing vertical lines
        for (int j = 0; j <= arr_w; j++) {
            gc.strokeLine(sq_w * j, 3, sq_w * j, 496);
        }
    }

}
