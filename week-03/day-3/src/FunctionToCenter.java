import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void centerLine (Graphics g, int coordX, int coordY) {
        g.drawLine(coordX, coordY, WIDTH / 2, HEIGHT / 2);
    }

    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        for (int i = 0; i <= WIDTH || i <= HEIGHT; i += 20) {
            if (WIDTH >= HEIGHT) {
                centerLine(graphics, i, 0);
                centerLine(graphics, i, HEIGHT);
                if (i <= HEIGHT) {
                    centerLine(graphics, 0, i);
                    centerLine(graphics, WIDTH, i);
                }
            }
            if (WIDTH < HEIGHT) {
                centerLine(graphics, 0, i);
                centerLine(graphics, WIDTH, i);
                if (i <= WIDTH) {
                    centerLine(graphics, i, 0);
                    centerLine(graphics, i, HEIGHT);
                }
            }
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