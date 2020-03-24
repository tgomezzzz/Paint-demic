import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

public class Canvas extends JComponent implements MouseInputListener {

    public Canvas() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
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
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse at (" + x + ", " + y + ")");
    }

}