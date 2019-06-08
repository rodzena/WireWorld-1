package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private Label l1;
    @FXML
    public Canvas c;

    CanvasPainter cp = new CanvasPainter();

    int array[][] = {{0, 1, 2, 3, 1, 0, 0, 0},
                    {0, 1, 2, 3, 2, 1, 1, 0},
                    {0, 1, 2, 3, 0, 0, 3, 2},
            {0, 1, 2, 3, 1, 0, 0, 0},
            {0, 1, 2, 3, 1, 0, 0, 0},
            {0, 1, 2, 3, 1, 0, 0, 0},
            {0, 1, 2, 3, 1, 0, 0, 0},
            {0, 1, 2, 3, 1, 0, 0, 0}};

    public void changel1() {
        l1.setText("ahoj");
        cp.drawCanvas(c, array);
    }
}

