import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void circles (int coordX, int coordY, int size, Graphics g) {
    if (size > 10) {
      int mod = size / 2 - size * 3 / 8;
//      size *= (99 + Math.random() * 3) / 100;
      g.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
      g.drawOval(coordX, coordY, size, size);
      circles(coordX + size / 4, coordY, size / 2, g);
      circles(coordX + mod / 4, coordY + size / 2 - mod, size / 2, g);
      circles(coordX + size / 2 - mod / 4, coordY + size / 2 - mod, size / 2, g);
    }
  }

  public static void mainDraw(Graphics graphics) {
    circles(0, 0, HEIGHT, graphics);
  }





  static int WIDTH = 540;
  static int HEIGHT = 540;

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

