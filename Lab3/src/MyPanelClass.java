import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel
{
	/**
	 *
	 */
	private static final long serialVersionUID = 7057541440811488699L;

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
		g.setColor(Color.WHITE);
		g.fillRect(x1, y1, width + 1, height + 1);
		//g.fillRect(x1, y1, width, height);

		//        //Draw a Border
		//        g.setColor(Color.BLUE);
		//        g.drawRect(x1, y1, width, height);
		//      
		//        //Draw Inner Border
		//        g.setColor(Color.GREEN);
		//        g.drawRect(x1+10, y1+10, width-20, height-20);
		//        
		//        //Draw a Line
		//        g.setColor(Color.WHITE);
		//        g.drawLine(x1, y1, x2, y2);
		//        
		//        //Draw a Line (top right to bottom left)
		//        g.setColor(Color.RED);
		//        g.drawLine(x1,y2,x2,y1); 
		//        // Note: Value of x is chosen (left) then you determine if it is top or bottom based on y's value.
		//       

		
////INCOMPLETE OVAL
//  			  //Draw a Oval
//				  g.setColor(Color.LIGHT_GRAY);
//        		  g.fillOval(x1, y1, width-320, height-300);
//        
		       

		//        //Draw an Arrow
		//        Polygon p = new Polygon();
		//        p.addPoint(x1 + 5, y1 + 25);
		//        p.addPoint(x1 + 20, y1 + 10);
		//        p.addPoint(x1 + 35, y1 + 25);
		//        p.addPoint(x1 + 25, y1 + 25);
		//        p.addPoint(x1 + 25, y1 + 45);
		//        p.addPoint(x1 + 15, y1 + 45);
		//        p.addPoint(x1 + 15, y1 + 25);
		//        g.setColor(Color.YELLOW);
		//        //g.fillPolygon(p);
		//      
		//        //Draw a Star
		//        Polygon p2 = new Polygon();
		//        p2.addPoint(x1 + 25, y1 + 73);
		//        p2.addPoint(x1 + 41, y1 + 73);
		//        p2.addPoint(x1 + 47, y1 + 58);
		//        p2.addPoint(x1 + 53, y1 + 73);
		//        p2.addPoint(x1 + 69, y1 + 73);
		//        p2.addPoint(x1 + 56, y1 + 83);
		//        p2.addPoint(x1 + 61, y1 + 98);
		//        p2.addPoint(x1 + 47, y1 + 88);
		//        p2.addPoint(x1 + 34, y1 + 98);
		//        p2.addPoint(x1 + 38, y1 + 83);
		//        g.setColor(Color.WHITE);
		//        g.drawPolygon(p2);

		
		//NUESTRA BANDERA! P.U.R. 
		
			//Stripes
				 g.setColor(Color.RED);
				 
				 Polygon topStripe = new Polygon();
				 topStripe.addPoint(x1, y1); 
				 topStripe.addPoint(x1+225, y1); 
				 topStripe.addPoint(x1+225, y1+25);
				 topStripe.addPoint(x1, y1+25);
				 g.fillPolygon(topStripe);

				 Polygon middleStripe = new Polygon();
				 middleStripe.addPoint(x1, y1+45); 
				 middleStripe.addPoint(x1+225, y1+45); 
				 middleStripe.addPoint(x1+225, y1+75);
				 middleStripe.addPoint(x1, y1 + 75);
				 g.fillPolygon(middleStripe);

				 Polygon bottomStripe = new Polygon();
				 bottomStripe.addPoint(x1, y1+100); 
				 bottomStripe.addPoint(x1+225, y1+100); 
				 bottomStripe.addPoint(x1+225, y1+130);
				 bottomStripe.addPoint(x1, y1+130);
				 g.fillPolygon(bottomStripe);

			//Triangle
				 Color realBlue = new Color(40, 200, 230);
				 this.setForeground(realBlue);

				 Polygon p3 = new Polygon();
				 p3.addPoint(x1, y1);
				 p3.addPoint(x1 + 115, y1 + 59);
				 p3.addPoint(x1, y2);
				 g.setColor(realBlue);
				 g.fillPolygon(p3);

			//Star
				 Polygon p2 = new Polygon();
				 p2.addPoint(x1 + 25, y1 + 73);
				 p2.addPoint(x1 + 41, y1 + 73);
				 p2.addPoint(x1 + 47, y1 + 58);
				 p2.addPoint(x1 + 53, y1 + 73);
				 p2.addPoint(x1 + 69, y1 + 73);
				 p2.addPoint(x1 + 56, y1 + 83);
				 p2.addPoint(x1 + 61, y1 + 98);
				 p2.addPoint(x1 + 47, y1 + 88);
				 p2.addPoint(x1 + 34, y1 + 98);
				 p2.addPoint(x1 + 38, y1 + 83);
				 p2.translate(x1-10, y1-20);
				 g.setColor(Color.white);
				 g.fillPolygon(p2);


	}
}