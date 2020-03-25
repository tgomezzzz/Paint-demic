import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int CANVAS_SIZE = 600;
    public static final int CONTROL_PANEL_HEIGHT = 75;
    public static final int BIT_SIZE = 20;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Canvas canvas = new Canvas(CANVAS_SIZE, BIT_SIZE);
        ControlPanel controls = new ControlPanel(CANVAS_SIZE, CONTROL_PANEL_HEIGHT, canvas);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(controls, BorderLayout.NORTH);
        frame.getContentPane().add(canvas, BorderLayout.CENTER);

        frame.pack();

    }

}