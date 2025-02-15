import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Background extends JPanel {

    public Background() {
        // Set preferred size to 800x600
        setPreferredSize(new Dimension(800, 600));
    }

    // Inner class for Mud
    public class Mud {
        private Shape[] shapes;
        private Color[] colors;

        public Mud(double x, double y) {
            // Define the colors for the mud rectangles
            colors = new Color[] { new Color(0x896a30), new Color(0x6f4e27), new Color(0x4e342e) };

            // Define the positions and sizes of the mud rectangles
            shapes = new Shape[] {
                new Rectangle2D.Double(x, y, 9, 2),
                new Rectangle2D.Double(x + 10, y, 9, 2),
                new Rectangle2D.Double(x + 20, y, 9, 2)
            };
        }

        public Shape[] getShapes() {
            return shapes;
        }

        public Color[] getColors() {
            return colors;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Color highestCloud = new Color(0x72a1ab);
        Color secondCloud = new Color(0x7cbcbc);
        Color thirdCloud = new Color(0xb1cbca);
        Color brownMain = new Color(0x251716);

        // Define colors
        Color[] cloudsColors = {secondCloud, secondCloud, secondCloud, secondCloud, secondCloud, secondCloud, secondCloud, thirdCloud, new Color(0xcde5e5)};

        // Define cloud positions and sizes
        Shape[] clouds = {
            new Ellipse2D.Double(21, 34, 23, 7),
            new Ellipse2D.Double(12, 35, 23, 7),
            new Ellipse2D.Double(4, 38, 23, 7),
            new Ellipse2D.Double(0, 43, 23, 7),
            new Ellipse2D.Double(80, 30, 97, 20),
            new Ellipse2D.Double(45, 35, 97, 20),
            new Ellipse2D.Double(15, 40, 60, 20),
            new Ellipse2D.Double(41, 52, 14, 15),
            new Ellipse2D.Double(90, 80, 400, 200),
            new Ellipse2D.Double(110, 110, 400, 200)
        };

        // Paint each cloud layer with the corresponding color
        for (int i = 0; i < cloudsColors.length; i++) {
            g2d.setColor(cloudsColors[i]);
            g2d.fill(clouds[i]);
        }

        Color[] floorColors = {brownMain};

        Shape[] floor = {
            new Rectangle2D.Double(0, 470, 800, 130),
        };

        // Paint each floor layer with the corresponding color
        for (int i = 0; i < floorColors.length; i++) {
            g2d.setColor(floorColors[i]);
            g2d.fill(floor[i]);
        }

        // Define mud shapes with colors
        Mud[] mud = {
            new Mud(62, 471),
            new Mud(500, 471)
        };

        // Paint each mud shape
        for (Mud m : mud) {
            Shape[] shapes = m.getShapes();
            Color[] colors = m.getColors();
            for (int i = 0; i < shapes.length; i++) {
                g2d.setColor(colors[i]);
                g2d.fill(shapes[i]);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cloud Layering");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Background cloudLayering = new Background();
        cloudLayering.setOpaque(true);  // Ensure JPanel background is painted
        cloudLayering.setBackground(new Color(0x72a1ab));  // Set desired background color

        frame.add(cloudLayering);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       
    }
}
