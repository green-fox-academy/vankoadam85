import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

  public static void drawSquares (double coordX, double coordY, double size, Graphics g) {
    if (size > 1) {
      g.drawRect((int)coordX, (int)coordY, (int)size, (int)size);
      int newSize = (int)Math.round(size / 3);
      drawSquares(coordX + newSize, coordY, newSize, g);
      drawSquares(coordX, coordY + newSize, newSize, g);
      drawSquares(coordX + newSize * 2, coordY + newSize, newSize, g);
      drawSquares(coordX + newSize, coordY + newSize * 2, newSize, g);
    }
  }

  public static void mainDraw(Graphics graphics) {
    drawSquares(0, 0, WIDTH, graphics);
  }





  static int WIDTH = 729;
  static int HEIGHT = 729;

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
      setBackground(Color.YELLOW);
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

