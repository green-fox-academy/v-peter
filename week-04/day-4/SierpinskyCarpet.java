import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



public class SierpinskyCarpet {

  static int WIDTH = 400;
  static int HEIGHT = 400;
  public static void mainDraw(Graphics g) {
    g.fillRect(WIDTH / 3,HEIGHT / 3,WIDTH / 3,HEIGHT / 3);
    rec(g, 0, 0, WIDTH / 3, HEIGHT / 3, 0, 4, 3);
  }

  public static void rec(Graphics g, int x, int y, int width, int height, int current, int limit, int div) {
    if (limit == current) return;
    else {
      for (int i = 0; i < div; i++) {
        for (int j = 0; j < div; j++) {
          g.fillRect(x + width / div + i * width, y + height / div + j * height, width / div, height / div);
          rec(g, x + i * width, y + j * height, width / div, height / div, current + 1, limit, div);
        }
      }
    }
  }



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

  public static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
