import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Background extends JPanel {

    public Background() {
        setPreferredSize(new Dimension(800, 600));
    }

    // Inner class for Mud
    public class Mud {
        private Shape[] shapes;
        private Color[] colors;

        public Mud(double x, double y, String type) {

            if(type.equals("normal")) { 
            // Define the colors for the mud rectangles
                colors = new Color[] { new Color(0x473818), new Color(0x896a30), new Color(0x74552a), new Color(0x6a492a), new Color(0x6c4b28), new Color(0x7b5a2d), new Color(0x7b5a2d),
                     new Color(0x5b4123), new Color(0x5b4123), 
                     new Color(0x614227), new Color(0x614227),
                     new Color(0x482e1c), new Color(0x513520), new Color(0x4a301c),
                    };

            // Define the positions and sizes of the mud rectangles
            shapes = new Shape[] {
                new Rectangle2D.Double(x, y-1, 9, 1),
                new Rectangle2D.Double(x, y, 9, 2),
                new Rectangle2D.Double(x, y+1, 9, 1),
                new Rectangle2D.Double(x, y+2, 9, 2),
                new Rectangle2D.Double(x+2, y+4, 5, 3),
                new Rectangle2D.Double(x-1, y, 1, 2),
                new Rectangle2D.Double(x+9, y, 1, 2),
                new Rectangle2D.Double(x-1, y+1, 1, 3),
                new Rectangle2D.Double(x+9, y+1, 1, 3),
                new Rectangle2D.Double(x+2, y+2, 1, 3),
                new Rectangle2D.Double(x+6, y+2, 1, 3),
                
                //shadow

                new Rectangle2D.Double(x+5, y+7, 4, 3),
                new Rectangle2D.Double(x+7, y+4, 4, 3),
                new Rectangle2D.Double(x+10, y+2, 2, 4),

            
            };





            }
            
            else if(type.equals("withShadow")) {
                // Define the colors for the mud rectangles
                colors = new Color[] { new Color(0x473818), new Color(0x896a30), new Color(0x74552a), new Color(0x6a492a), new Color(0x6c4b28), new Color(0x7b5a2d), new Color(0x7b5a2d),
                    new Color(0x5b4123), new Color(0x5b4123), 
                    new Color(0x614227), new Color(0x614227) 
                   };

           // Define the positions and sizes of the mud rectangles
           shapes = new Shape[] {
               new Rectangle2D.Double(x, y-1, 9, 1),
               new Rectangle2D.Double(x, y, 9, 2),
               new Rectangle2D.Double(x, y+1, 9, 1),
               new Rectangle2D.Double(x, y+2, 9, 2),
               new Rectangle2D.Double(x+2, y+4, 5, 3),
               new Rectangle2D.Double(x-1, y, 1, 2),
               new Rectangle2D.Double(x+9, y, 1, 2),
               new Rectangle2D.Double(x-1, y+1, 1, 3),
               new Rectangle2D.Double(x+9, y+1, 1, 3),
               new Rectangle2D.Double(x+2, y+2, 1, 3),
               new Rectangle2D.Double(x+6, y+2, 1, 3),
           };
        }
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

        Color[] floorColors = {brownMain, new Color(000000), new Color(0x1b1f24), new Color(0x382615), new Color(0x6d4c29), new Color(0x462f1d), new Color(0x332019)};

        Shape[] floor = {
            new Rectangle2D.Double(0, 470, 800, 130),
            new Rectangle2D.Double(0, 468, 800, 2),
            new Rectangle2D.Double(0, 467, 800, 1),
            new Rectangle2D.Double(0, 470, 800, 1),
            new Rectangle2D.Double(0, 471, 800, 2),
            new Rectangle2D.Double(0, 473, 800, 1),
            new Rectangle2D.Double(0, 474, 800, 14),

        };

        // Paint each floor layer with the corresponding color
        for (int i = 0; i < floorColors.length; i++) {
            g2d.setColor(floorColors[i]);
            g2d.fill(floor[i]);
        }

        // Define mud shapes with colors
        Mud[] mud = {
            new Mud(7, 471, "normal"),
            new Mud(18, 471, "withShadow"),
            new Mud(32, 471, "normal"),
            new Mud(48, 471, "withShadow"),
            new Mud(62, 471, "normal"),
            new Mud(75, 471, "normal"),
            new Mud(92, 471, "withShadow"),
            new Mud(105, 471, "withShadow"),
            new Mud(119, 471, "normal"),
            new Mud(119, 471, "withShadow"),
            new Mud(135, 471, "withShadow"),
            new Mud(149, 471, "normal"),









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
