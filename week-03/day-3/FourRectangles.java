import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 4; i++) {

            int[] n1 = new int[2];
            n1[0] = (int) (Math.random() * WIDTH);
            n1[1] = (int) (Math.random() * HEIGHT);


            int[] n2 = new int[2];

            n2[0] = (int) (Math.random() * (WIDTH - n1[0]));
            n2[1] = (int) (Math.random() * (HEIGHT - n1[1]));


            int[] n3 = new int[3];
            for (int j = 0; j < 3; j++) {
                n3[j] = (int) (Math.random() * 256);
            }
            graphics.setColor(new Color(n3[0], n3[1], n3[2]));

            graphics.fillRect(n1[0], n1[1], n2[0], n2[1]);

        }


    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 400;

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
