import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void eStar (Graphics g, int coordX, int coordY, int size) {
        for (int i = 0; i <= size / 2; i += size / 28) {
                g.drawLine(coordX - size / 2 + i, coordY, coordX, coordY - i);
                g.drawLine(coordX - size / 2 + i, coordY, coordX, coordY + i);
                g.drawLine(coordX + size / 2 - i, coordY, coordX, coordY - i);
                g.drawLine(coordX + size / 2 - i, coordY, coordX, coordY + i);
        }
    }

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        eStar(graphics, 160, 160, 300);
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