import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;

public class Background extends JPanel {
    private Object[][] rectangles;

    private Color getRectangleColor(int x, int y) {
        for (Object[] rectData : rectangles) {
            Rectangle2D rect = (Rectangle2D) rectData[0];
            if (rect.contains(x, y)) {
                return (Color) rectData[1];
            }
        }
        return null;
    }
    
    
    public Background() {
        setPreferredSize(new Dimension(800, 600));
    
        // Define rectangle coordinates and colors
        int xCord = 470;
        int yCord = 267;
        rectangles = new Object[][] {
{new Rectangle2D.Double(xCord + 10, yCord + 20, 10, 10), new Color(0x13191A)},
{new Rectangle2D.Double(xCord + 20, yCord + 20, 10, 10), new Color(0x2F1C21)},
{new Rectangle2D.Double(xCord + 30, yCord + 20, 10, 10), new Color(0x47232C)},
{new Rectangle2D.Double(xCord + 40, yCord + 20, 30, 10), new Color(0x2F1C21)},
{new Rectangle2D.Double(xCord + 70, yCord + 20, 40, 10), new Color(0x413134)},
{new Rectangle2D.Double(xCord + 110, yCord + 20, 80, 10), new Color(0x322427)},
{new Rectangle2D.Double(xCord + 190, yCord + 20, 10, 10), new Color(0x47232C)},
{new Rectangle2D.Double(xCord + 200, yCord + 20, 10, 10), new Color(0x13191A)},
{new Rectangle2D.Double(xCord + 20, yCord + 30, 10, 10), new Color(0x4C1A28)},
{new Rectangle2D.Double(xCord + 30, yCord + 30, 20, 10), new Color(0x882139)},
{new Rectangle2D.Double(xCord + 50, yCord + 30, 120, 10), new Color(0xAE2444)},
{new Rectangle2D.Double(xCord + 170, yCord + 30, 20, 10), new Color(0x882139)},
{new Rectangle2D.Double(xCord + 190, yCord + 30, 10, 10), new Color(0x731E33)},
{new Rectangle2D.Double(xCord + 50, yCord + 40, 10, 10), new Color(0x882139)},
{new Rectangle2D.Double(xCord + 60, yCord + 40, 10, 10), new Color(0x551932)},
{new Rectangle2D.Double(xCord + 100, yCord + 40, 10, 10), new Color(0x882139)},
{new Rectangle2D.Double(xCord + 110, yCord + 40, 10, 10), new Color(0xCE2D48)},
{new Rectangle2D.Double(xCord + 120, yCord + 40, 10, 10), new Color(0x5C1D2D)},
{new Rectangle2D.Double(xCord + 150, yCord + 40, 10, 10), new Color(0xA2A9B1)},
{new Rectangle2D.Double(xCord + 160, yCord + 40, 10, 10), new Color(0x9C2C39)},
{new Rectangle2D.Double(xCord + 30, yCord + 50, 10, 10), new Color(0x6E2E34)},
{new Rectangle2D.Double(xCord + 40, yCord + 50, 40, 10), new Color(0xA63A3F)},
{new Rectangle2D.Double(xCord + 80, yCord + 50, 20, 10), new Color(0x9D2640)},
{new Rectangle2D.Double(xCord + 100, yCord + 50, 10, 10), new Color(0xB7303E)},
{new Rectangle2D.Double(xCord + 110, yCord + 50, 10, 10), new Color(0xD03442)},
{new Rectangle2D.Double(xCord + 120, yCord + 50, 70, 10), new Color(0xA52C39)},
{new Rectangle2D.Double(xCord + 190, yCord + 50, 10, 20), new Color(0x2F1C21)},
{new Rectangle2D.Double(xCord + 30, yCord + 60, 10, 10), new Color(0x612630)},
{new Rectangle2D.Double(xCord + 40, yCord + 60, 10, 10), new Color(0x91283A)},
{new Rectangle2D.Double(xCord + 50, yCord + 60, 10, 10), new Color(0xA42E42)},
{new Rectangle2D.Double(xCord + 60, yCord + 60, 90, 10), new Color(0x91283A)},
{new Rectangle2D.Double(xCord + 150, yCord + 60, 20, 10), new Color(0xA63A3F)},
{new Rectangle2D.Double(xCord + 170, yCord + 60, 20, 10), new Color(0x91283A)},
{new Rectangle2D.Double(xCord + 50, yCord + 70, 10, 10), new Color(0xA9423D)},
{new Rectangle2D.Double(xCord + 60, yCord + 70, 10, 100), new Color(0x551932)},
{new Rectangle2D.Double(xCord + 160, yCord + 70, 10, 10), new Color(0xA63A3F)},
{new Rectangle2D.Double(xCord + 50, yCord + 80, 10, 10), new Color(0x9B3C3E)},
{new Rectangle2D.Double(xCord + 160, yCord + 80, 10, 10), new Color(0xA53837)},
{new Rectangle2D.Double(xCord + 50, yCord + 90, 10, 10), new Color(0x933038)},
{new Rectangle2D.Double(xCord + 160, yCord + 90, 10, 30), new Color(0x9C2C39)},
{new Rectangle2D.Double(xCord + 50, yCord + 100, 10, 30), new Color(0x91283A)},
{new Rectangle2D.Double(xCord + 160, yCord + 120, 10, 30), new Color(0x9D2640)},
{new Rectangle2D.Double(xCord + 50, yCord + 130, 10, 10), new Color(0x9C2C39)},
{new Rectangle2D.Double(xCord + 50, yCord + 140, 10, 10), new Color(0x993434)},
{new Rectangle2D.Double(xCord + 50, yCord + 150, 10, 10), new Color(0x933038)},
{new Rectangle2D.Double(xCord + 160, yCord + 150, 10, 10), new Color(0xA52C39)},
{new Rectangle2D.Double(xCord + 50, yCord + 160, 10, 10), new Color(0x91283A)},
{new Rectangle2D.Double(xCord + 160, yCord + 160, 10, 10), new Color(0x9C2C39)},
{new Rectangle2D.Double(xCord + 50, yCord + 170, 10, 10), new Color(0x47232C)},
{new Rectangle2D.Double(xCord + 60, yCord + 170, 10, 10), new Color(0x47232C)},
{new Rectangle2D.Double(xCord + 160, yCord + 170, 10, 10), new Color(0x4F2531)},
{new Rectangle2D.Double(xCord + 170, yCord + 170, 5, 10), new Color(0x251A1F)},
{new Rectangle2D.Double(xCord + 50, yCord + 180, 10, 10), new Color(0x2A3133)},
{new Rectangle2D.Double(xCord + 60, yCord + 180, 10, 20), new Color(0x13191A)},
{new Rectangle2D.Double(xCord + 160, yCord + 180, 10, 10), new Color(0x393939)},
{new Rectangle2D.Double(xCord + 170, yCord + 180, 5, 20), new Color(0x13191A)},
{new Rectangle2D.Double(xCord + 50, yCord + 190, 10, 10), new Color(0x2B2D2B)},
{new Rectangle2D.Double(xCord + 160, yCord + 190, 10, 10), new Color(0x333333)},
        

//DETAILS 


{new Rectangle2D.Double(xCord + 170, yCord + 40, 5, 10), new Color(0x2D1F29)},
{new Rectangle2D.Double(xCord + 170, yCord + 70, 5, 60), new Color(0x262426)},
{new Rectangle2D.Double(xCord + 170, yCord + 130, 5, 70), new Color(0x13191a)},
{new Rectangle2D.Double(xCord + 175, yCord + 40, 5, 10), new Color(0x262426)},
{new Rectangle2D.Double(xCord + 175, yCord + 70, 5, 130), new Color(0x262426)},

{new Rectangle2D.Double(xCord + 75, yCord + 40, 25, 5), new Color(0x381B24)},
{new Rectangle2D.Double(xCord + 95, yCord + 45, 5, 5), new Color(0x2b0c1d)},
{new Rectangle2D.Double(xCord + 60, yCord + 50, 40, 5), new Color(0x581829)},
{new Rectangle2D.Double(xCord + 120, yCord + 50, 30, 5), new Color(0x581829)},
{new Rectangle2D.Double(xCord + 55, yCord + 35, 25, 5), new Color(0x761B38)},
{new Rectangle2D.Double(xCord + 65, yCord + 40, 5, 10), new Color(0x2B121E)},
{new Rectangle2D.Double(xCord + 65, yCord + 70, 5, 130), new Color(0x13191a)},
{new Rectangle2D.Double(xCord + 170, yCord + 35, 25, 5), new Color(0x381B24)},
{new Rectangle2D.Double(xCord + 130, yCord + 40, 25, 5), new Color(0x381B24)},


//shade orange for texturing
{new Rectangle2D.Double(xCord + 55, yCord + 75, 5, 15), new Color(0xDB5C4E)},
{new Rectangle2D.Double(xCord + 55, yCord + 120, 5, 10), new Color(0xDB5C4E)},
{new Rectangle2D.Double(xCord + 180, yCord + 55, 5, 8), new Color(0xE2554C)},
{new Rectangle2D.Double(xCord + 165, yCord + 95, 5, 30), new Color(0xBB3843)},
{new Rectangle2D.Double(xCord + 165, yCord + 130, 5, 15), new Color(0xC23C3D)},

//outlining 
{new Rectangle2D.Double(xCord + 20, yCord + 35, 25, 5), new Color(0x251A20)},
{new Rectangle2D.Double(xCord + 15, yCord + 30, 5, 5), new Color(0x14181A)},
{new Rectangle2D.Double(xCord + 10, yCord + 20, 10, 5), new Color(0x112019)},
{new Rectangle2D.Double(xCord + 5, yCord + 10, 5, 15), new Color(0x112019)},
{new Rectangle2D.Double(xCord + 175, yCord + 35, 25, 5), new Color(0x381B24)},
{new Rectangle2D.Double(xCord + 200, yCord + 30, 5, 5), new Color(0x14181A)},
{new Rectangle2D.Double(xCord + 205, yCord + 20, 10, 5), new Color(0x0E1814)},
{new Rectangle2D.Double(xCord + 205, yCord + 20, 10, 5), new Color(0x112019)},
{new Rectangle2D.Double(xCord + 210, yCord + 10, 5, 15), new Color(0x112019)},
{new Rectangle2D.Double(xCord + 145, yCord + 35, 20, 5), new Color(0x74293A)},
{new Rectangle2D.Double(xCord + 65, yCord + 65, 95, 5), new Color(0x381B24)},
{new Rectangle2D.Double(xCord + 30, yCord + 65, 20, 5), new Color(0x2B121E)},
            
//restructuring (less pixels not 10 by 10 anymore so mas detailed) 
{new Rectangle2D.Double(xCord + 10, yCord + 15, 95, 5), new Color(0x152222)},
{new Rectangle2D.Double(xCord + 120, yCord + 15, 95, 5), new Color(0x060D0D)},



};
    
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
    
                Color clickedColor = getRectangleColor(x, y);
    
                if (clickedColor != null) {
                    // Convert the Color object to a hexadecimal representation
                    String hexColor = String.format("#%02x%02x%02x", clickedColor.getRed(), clickedColor.getGreen(), clickedColor.getBlue());
                    System.out.println("Clicked at: (" + (x -470) + ", " + (y - 267) + ") - Color: " + hexColor);
                } else {
                    System.out.println("Clicked outside the panel or color not found.");
                }
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Clicked at: (" + (x - 470) + ", " + (y - 267) + ")");
            }
        });
    }
    
    // Helper method to get the color of a pixel
    private Color getPixelColor(int x, int y) {
        try {
            Robot robot = new Robot();
            return robot.getPixelColor(getLocationOnScreen().x + x, getLocationOnScreen().y + y);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
            new Mud(135, 471, "normal"),
            new Mud(149, 471, "normal"),  };

        // Paint each mud shape
        for (Mud m : mud) {
            Shape[] shapes = m.getShapes();
            Color[] colors = m.getColors();
            for (int i = 0; i < shapes.length; i++) {
                g2d.setColor(colors[i]);
                g2d.fill(shapes[i]);
            }
        }

  


        for (Object[] rectData : rectangles) {
            Rectangle2D rect = (Rectangle2D) rectData[0];
            Color color = (Color) rectData[1];
            g2d.setColor(color);
            g2d.fill(rect);
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
