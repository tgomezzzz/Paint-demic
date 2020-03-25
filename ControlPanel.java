import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    Canvas c;

    public ControlPanel(int width, int height, Canvas cnvs) {
        super.setPreferredSize(new Dimension(width, height));
        super.setBackground(new Color(128, 210, 255));
        super.setLayout(new GridLayout(1, 2));

        super.add(new Button(0, 0, 30));
        super.add(new Button(31, 0, 30));
        super.add(new Button(61, 0, 30));


        this.c = cnvs;
    }

}