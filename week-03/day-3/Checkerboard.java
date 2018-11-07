import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        boolean isBlack = true;
        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        int field = WIDTH / 8;
        for (int i = 0; i < 8; i++) {
            isBlack = !isBlack;
            for (int j = 0; j < 8; j++) {
                if (isBlack) graphics.setColor(black);
                else graphics.setColor(white);
                graphics.fillRect(field * i, field * j, field, field);
                isBlack = !isBlack;
            }
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
