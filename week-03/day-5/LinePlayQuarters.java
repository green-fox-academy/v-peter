import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int[] array = {2, 4, 8};
        int r = (int) (Math.random() * 3);
        int div = array[r];
        int lines = 16;
        int edge = WIDTH / div;
        int offX = 0;
        int offY = 0;
        for (int i = 0; i < div; i++) {
            offX = i * edge;
            for (int j = 0; j < div; j++) {
                offY = j * edge;
                drawLinesOffset(lines, edge, graphics, offX, offY);
            }
        }

    }

    public static void drawLinesOffset(int lines, int edge, Graphics graphics, int offX, int offY) {
        for (int i = 1; i < lines; i++) {
            graphics.setColor(new Color(255, 0, 255));
            graphics.drawLine(i * (edge / (lines)) + offX, 0 + offY, edge + offX, i * (edge / (lines)) + offY);
            graphics.setColor(new Color(0, 255, 0));
            graphics.drawLine(0 + offX, i * (edge / (lines)) + offY, i * (edge / (lines)) + offX, edge + offY);
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
