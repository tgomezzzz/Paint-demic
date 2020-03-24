import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JComponent comp1 = new ControlPanel();
        JComponent comp2 = new Canvas();
        JComponent comp3 = new JPanel();
        JComponent comp4 = new JPanel();


        comp1.setBackground(Color.BLUE);
        comp1.setPreferredSize(new Dimension(100, 100));

        comp2.setBackground(Color.RED);
        comp2.setPreferredSize(new Dimension(500, 100));

        comp3.setBackground(Color.GREEN);
        comp3.setPreferredSize(new Dimension(100, 100));

        comp4.setBackground(Color.ORANGE);
        comp4.setPreferredSize(new Dimension(100, 100));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.getContentPane().setSize(400, 400);
        frame.getContentPane().add(comp1, BorderLayout.CENTER);
        frame.getContentPane().add(comp2, BorderLayout.SOUTH);
        frame.getContentPane().add(comp3, BorderLayout.EAST);
        frame.getContentPane().add(comp4, BorderLayout.WEST);

        frame.pack();
        //frame.repaint();

    }

}