import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Button extends JComponent implements MouseInputListener {

    Color fill = Color.GRAY;
    Color stroke = Color.BLACK;

    int x, y, width;
    public Button(int a, int b, int w) {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        super.setPreferredSize(new Dimension(w, w));

        this.x = a;
        this.y = b;
        this.width = w;
    }

    @Override
    public void paintComponent(Graphics gIn) {
        Rectangle2D test = new Rectangle2D.Double(x, y, width, width);
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
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { 
        fill = Color.GRAY;
        stroke = Color.BLACK;
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Button pressed at " + x + ", " + y);
    }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) { 
        int mouseX = e.getX();
        int mouseY = e.getY();
        if (mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + width) {
            fill = Color.LIGHT_GRAY;
            stroke = Color.WHITE;
        } else {
            fill = Color.GRAY;
            stroke = Color.BLACK;
        }
    }

}