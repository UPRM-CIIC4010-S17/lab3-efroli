import javax.swing.JFrame;
public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Efrain Oliveras");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Adjust .setLocation to aprox the center of the display
		myFrame.setLocation(800,350);
		myFrame.setSize(400, 400);
		
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
		
		
	}
}