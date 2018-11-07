import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 256);
        }
        Color c = new Color(a[0], a[1], a[2]);
        int b = (int) (Math.random() * WIDTH);
        drawRainbow(b, c, graphics);
    }

    public static void drawRainbow(int a, Color c, Graphics g) {

        int gcd = gcdThing(a, (WIDTH - a) / 2);
        int n = WIDTH / gcd;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int b = (int) (Math.random() * 256);
                g.setColor(new Color(i * 256 / n, j * 256 / n, b));
                g.fillRect(i * gcd, j * gcd, gcd, gcd);

            }
        }
        g.setColor(c);
        g.fillRect((WIDTH - a) / 2, (HEIGHT - a) / 2, a, a);
    }

    private static int gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
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
