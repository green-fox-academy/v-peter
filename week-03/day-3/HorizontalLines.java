import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * WIDTH);
            int b = (int) (Math.random() * HEIGHT);
            drawHorizontal(a, b, graphics);
        }


    }

    public static void drawHorizontal(int a, int b, Graphics g) {
        if (WIDTH - a >= 50) g.drawLine(a, b, a + 50, b);
        else g.drawLine(a, b, a - 50, b);
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