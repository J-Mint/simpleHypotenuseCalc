import javax.swing.JOptionPane;


public class Calculator {

	public static void main (String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("What is the length of the first side of the triangle?"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("What is the length of the second side of the triangle?"));
		double z = (double) Math.sqrt(x*x + y*y);
		JOptionPane.showMessageDialog(null, "The Hypotenuse is " + z);
	}
	
	
}
