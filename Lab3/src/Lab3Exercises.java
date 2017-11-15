import javax.swing.JFrame;
public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Efrain Oliveras");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Adjust .setLocation to aprox the center of the display
		myFrame.setLocation(800,350);
		
		myFrame.setSize(200, 200); //FRAME TO FINISH OVAL
		
//		myFrame.setSize(225, 150); //FLAG FRAME
//        myFrame.getContentPane().add(myPanel);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
        
		myFrame.setVisible(true);
		
		
	}
}