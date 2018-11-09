import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = HEIGHT;
        int a = 20;
        for (int j = 0; j < HEIGHT / a; j++) {
            for (int i = 0; i < WIDTH / a - j; i++) {
                drawTriangle(graphics, a, a * i + j * a / 2, y - j * (int) (a / 2 * Math.sqrt(3)));
            }
        }

    }

    public static void drawTriangle(Graphics g, int a, int x, int y) {
        g.drawLine(x, y, x + a, y);
        g.drawLine(x + a, y, x + (a / 2), (int) (y - (a / 2 * Math.sqrt(3))));
        g.drawLine(x + (a / 2), (int) (y - (a / 2 * Math.sqrt(3))), x, y);
    }

    static int WIDTH = 420;
    static int HEIGHT = 420;

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
