import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void triangle (Graphics g, int coordX, int coordY, int size,  int rows) {
        double mod = (size / Math.sqrt(3));
        for (int i = 0; i < rows ; i++) {
            g.drawLine(coordX - (int) Math.round((i + 1) * mod), coordY + (i + 1) * size,
                    coordX + (int) Math.round((i + 1) * mod), coordY + (i + 1) * size);
            g.drawLine(coordX + (int) Math.round(i * mod), coordY + i * size,
                    coordX - (int) Math.round(rows * mod) + (int) Math.round(i * mod * 2), coordY + rows * size);
            g.drawLine(coordX - (int) Math.round(i * mod), coordY + i * size,
                    coordX + (int) Math.round(rows * mod) - (int) Math.round(i * mod * 2), coordY + rows * size);
        }
    }

    public static void mainDraw(Graphics graphics){
        triangle(graphics, 320, 20, 20, 22);


    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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