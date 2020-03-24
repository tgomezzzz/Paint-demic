import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;

import javafx.scene.shape.Rectangle;

import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.geom.Rectangle2D;


public class Canvas extends JComponent implements MouseInputListener {

    int pixels, pixelWidth;
    int[][] grid;
    Rectangle2D mouseOver;

    public Canvas(int size, int pxls) {
        super.setPreferredSize(new Dimension(size, size));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        this.pixels = pxls;
        this.pixelWidth = size / pixels;
        this.grid = new int[pixels][pixels];
    }

    @Override
    public void paintComponent(Graphics gIn) {
        Graphics2D g = (Graphics2D) gIn;

        if (mouseOver != null) {
            g.setColor(Color.LIGHT_GRAY);
            g.fill(mouseOver);
            g.draw(mouseOver);
        }
    }

    public int mouseToGridPos(int mousePos) {
        return mousePos / pixelWidth;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse dragged at (" + x + ", " + y + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int gridX = mouseToGridPos(y);
        int gridY = mouseToGridPos(x);
        //System.out.println("Mouse moved at (" + x + ", " + y + ") -> (" + gridX + ", " + gridY + ")");
        mouseOver = new Rectangle2D.Double(gridY * pixelWidth, gridX * pixelWidth, pixelWidth, pixelWidth);
        repaint();
    }
}