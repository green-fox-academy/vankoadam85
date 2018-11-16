import java.awt.*;

public class DrawCircles {

    public void drawCircles (int coordX, int coordY, int size, Graphics g) {
    if (size > 10) {
      int mod = size / 2 - size * 3 / 8;
      size *= (99 + Math.random() * 3) / 100;
      g.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
      g.drawOval(coordX, coordY, size, size);
      drawCircles(coordX + size / 4, coordY, size / 2, g);
      drawCircles(coordX + mod / 4, coordY + size / 2 - mod, size / 2, g);
      drawCircles(coordX + size / 2 - mod / 4, coordY + size / 2 - mod, size / 2, g);
    }
  }
}
