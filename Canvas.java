import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.geom.Rectangle2D;


public class Canvas extends JComponent implements MouseInputListener {

    int pixels, pixelWidth;
    int[][] grid;
    Rectangle2D[][] display;
    Rectangle2D mouseOver;
    long startTime;

    public Canvas(int size, int pxls) {
        super.setPreferredSize(new Dimension(size, size));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        this.pixels = pxls;
        this.pixelWidth = size / pixels;
        this.grid = new int[pixels][pixels];
        this.display = new Rectangle2D[pixels][pixels];
        this.startTime = System.nanoTime();
    }

    @Override
    public void paintComponent(Graphics gIn) {
        Graphics2D g = (Graphics2D) gIn;

        if (mouseOver != null) {
            g.setColor(Color.LIGHT_GRAY);
            g.fill(mouseOver);
            g.draw(mouseOver);
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                if (grid[r][c] > 0) {
                    g.setColor(Color.GREEN);
                    g.fill(display[r][c]);
                    g.draw(display[r][c]);
                }
            }
        }

        repaint();
    }

    public int mouseToGridPos(int mousePos) {
        return mousePos / pixelWidth;
    }

    public boolean isValidTile(int r, int c) {
        if (r < 0 || c < 0 || r > grid.length - 1 || c > grid.length - 1) {
            return false;
        }
        return true;
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
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int gridX = mouseToGridPos(y);
        int gridY = mouseToGridPos(x);

        if (isValidTile(gridX, gridY)) {
            grid[gridX][gridY] = 1;
            display[gridX][gridY] = new Rectangle2D.Double(gridY * pixelWidth, gridX * pixelWidth, pixelWidth, pixelWidth);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int gridX = mouseToGridPos(y);
        int gridY = mouseToGridPos(x);
        if (isValidTile(gridX, gridY)) {
            mouseOver = new Rectangle2D.Double(gridY * pixelWidth, gridX * pixelWidth, pixelWidth, pixelWidth);
        } else {
            mouseOver = null;
        }
    }
}