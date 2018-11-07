import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        int[] a = {0, 0};
        int[] b = {320, 320};
        int r = (int) (Math.random() * 2);
        if (r == 0) {
            graphics.setColor(new Color(0, 255, 0, 255));
            graphics.drawLine(a[0], a[1], b[0], b[1]);
        } else {
            graphics.setColor(new Color(255, 0, 0, 255));
            graphics.drawLine(b[0], b[1], a[0], a[1]);
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
