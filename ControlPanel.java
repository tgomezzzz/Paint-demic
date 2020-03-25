import javax.swing.*;
import java.awt.*;


//JPanel requires that entire panel is filled, consider using component
public class ControlPanel extends JPanel {

    Canvas c;

    public ControlPanel(int width, int height, Canvas cnvs) {
        super.setPreferredSize(new Dimension(width, height));
        super.setBackground(new Color(128, 210, 255));
        super.setLayout(new GridLayout(2, 2));

        this.c = cnvs;

        super.add(new Button(Color.RED, 1, c));
        super.add(new Button(Color.GREEN, 2, c));
        super.add(new Button(Color.BLUE, 3, c));
        super.add(new Button(Color.ORANGE, 4, c));

    }

}