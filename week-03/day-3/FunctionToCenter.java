import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        for (int i = 0; i < 320; i += 20) {
            graphics.drawLine(i, 0, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(0, i, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(i, HEIGHT, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(WIDTH, i, WIDTH / 2, HEIGHT / 2);
        }
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
