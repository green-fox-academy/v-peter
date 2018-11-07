import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class StarryNight {

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int a = 3;
        for (int i = 0; i < 300; i++) {
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * WIDTH);
            graphics.setColor(new Color((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
            graphics.fillRect(x, y, a, a);
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
        jFrame.getContentPane().setBackground(Color.BLACK);
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
