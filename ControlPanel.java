import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    Canvas c;

    public ControlPanel(int width, int height, Canvas cnvs) {
        super.setPreferredSize(new Dimension(width, height));
        super.setBackground(new Color(128, 210, 255));

        this.c = cnvs;
    }

}