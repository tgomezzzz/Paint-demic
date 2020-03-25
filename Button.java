import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Button extends JComponent implements MouseInputListener {

    Color fill, background;
    Color stroke = Color.BLACK;
    int col;
    Canvas c;

    public Button(Color bg, int cl, Canvas cnvs) {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        this.fill = bg;
        this.background = bg;
        this.col = cl;
        this.c = cnvs;
    }

    @Override
    public void paintComponent(Graphics gIn) {

        Rectangle2D test = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        Graphics2D g = (Graphics2D) gIn;
        g.setStroke(new BasicStroke(2));
        g.setColor(fill);
        g.fill(test);
        g.setColor(stroke);
        g.draw(test);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) { 
        fill = Color.LIGHT_GRAY;
        stroke = Color.WHITE;
    }

    @Override
    public void mouseExited(MouseEvent e) { 
        fill = background;
        stroke = Color.BLACK;
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        c.setColor(col);
    }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) { }

}