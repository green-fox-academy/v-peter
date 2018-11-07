import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawExample {
    private static final int WIDTH = 320;
    private static final int HEIGHT = 320;

    public static void mainDraw(Graphics graphics) {
        int[] xPoints = {10, 110, 110, 10};
        int[] yPoints = {50, 10, 110, 110};
        graphics.drawPolygon(xPoints, yPoints, 4);
        graphics.setColor(new Color(200, 200, 0, 150));
        graphics.fillRect(200, 200, 200, 200);
    }

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
