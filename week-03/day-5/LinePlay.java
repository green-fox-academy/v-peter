import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int lines = 16;
        for (int i = 1; i < lines; i++) {
            graphics.setColor(new Color(255, 0, 255));
            graphics.drawLine(i * (WIDTH / (lines)), 0, WIDTH, i * (WIDTH / (lines)));
            graphics.setColor(new Color(0, 255, 0));
            graphics.drawLine(0, i * (WIDTH / (lines)), i * (WIDTH / (lines)), WIDTH);
        }
    }

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
