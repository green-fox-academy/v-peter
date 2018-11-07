import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        getRandomColor(graphics);
        graphics.drawLine(10, 10, 110, 10);
        getRandomColor(graphics);
        graphics.drawLine(110, 10, 110, 110);
        getRandomColor(graphics);
        graphics.drawLine(110, 110, 10, 110);
        getRandomColor(graphics);
        graphics.drawLine(10, 110, 10, 10);
    }

    public static void getRandomColor(Graphics graphics) {
        graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), 150));
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }


}
