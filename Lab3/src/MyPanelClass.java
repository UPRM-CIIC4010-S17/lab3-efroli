import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel 
{
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) 
            {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1); 
                        
//                        //Draw a Border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a second Border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+5, y1+5, width-10, height-10);
//                        
//                        //Diagonal Line (Top Left to Bottom Right)
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                      //Diagonal Line (Top Right to Bottom Left)
//                        g.setColor(Color.RED);
//                        g.drawLine(width, y1, x1, y2);
                        
                        //Draw a Oval
                        g.setColor(Color.green);
//                        g.drawOval(x1, y1, width, height);
                        g.fillOval((getWidth()/2) -27, (getHeight()/2) -27, 55, 55);
                        //(posicionX, posicionY, height, width)
                        
            }
}