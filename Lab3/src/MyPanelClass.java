import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        
//                        //Draws a Border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draws a second Border
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
                        
//                        //Draws a Oval
//                        g.setColor(Color.green);
//                        g.drawOval(x1, y1, width, height);
//                        g.fillOval((getWidth()/2) -27, (getHeight()/2) -27, 55, 55);
//                        //(posicionX, posicionY, height, width)

                        //Draws a Arrow
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //Draw a Star
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                        
                        //LA MONO-ESTRELLA!                          

                        //Franja Roja Superior
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1, y1);
                        p4.addPoint(x1,getHeight()/5);
                        p4.addPoint(width+1,getHeight()/5);
                        p4.addPoint(width+1,y1);
                        g.setColor(Color.RED);
                        g.fillPolygon(p4);
                        
                        
                        //Franja Blanca Superior
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1, getHeight()/5);
                        p5.addPoint(x1,(getHeight()*2)/5);
                        p5.addPoint(width+1,(getHeight()*2)/5);
                        p5.addPoint(width+1,(getHeight())/5);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p5);
                        
                        //Franja Roja Central
                        Polygon p6 = new Polygon();
                        p6.addPoint(x1,(getHeight()*2)/5);
                        p6.addPoint(x1,(getHeight()*3)/5);
                        p6.addPoint(width+1,(getHeight()*3)/5);
                        p6.addPoint(width+1,(getHeight()*2)/5);
                        g.setColor(Color.RED);
                        g.fillPolygon(p6);
                        
                      //Franja Blanca Inferior
                        Polygon p7 = new Polygon();
                        p7.addPoint(x1, (getHeight()*3)/5);
                        p7.addPoint(x1,(getHeight()*4)/5);
                        p7.addPoint(width+1,(getHeight()*4)/5);
                        p7.addPoint(width+1,(getHeight()*3)/5);
                        g.setColor(Color.white);
                        g.fillPolygon(p7);
                        
                      //Franja Roja Inferior
                        Polygon p8 = new Polygon();
                        p8.addPoint(x1, (getHeight()*4)/5);
                        p8.addPoint(x1,height+1);
                        p8.addPoint(width+1,height+1);
                        p8.addPoint(width+1,(getHeight()*4)/5);
                        g.setColor(Color.RED);
                        g.fillPolygon(p8);
                        
                        
                      //Triangulo
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(getWidth()/2, getHeight()/2);
                        p3.addPoint(x1, y2);
                        g.setColor(Color.CYAN);
                        g.fillPolygon(p3);
                        
                      //Estrella
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 10, y1 + 56);
                        p2.addPoint(x1 + 26, y1 + 56);
                        p2.addPoint(x1 + 32, y1 + 41);
                        p2.addPoint(x1 + 38, y1 + 56);
                        p2.addPoint(x1 + 54, y1 + 56);
                        p2.addPoint(x1 + 41, y1 + 66);
                        p2.addPoint(x1 + 46, y1 + 81);
                        p2.addPoint(x1 + 32, y1 + 71);
                        p2.addPoint(x1 + 19, y1 + 81);
                        p2.addPoint(x1 + 23, y1 + 66);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                   

                        
            }
}