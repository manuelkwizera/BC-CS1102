import javax.swing.JOptionPane;
public class SuperPower {

	public static void main(String[] args) {
		
		String power = JOptionPane.showInputDialog("What is your superpower: ");
        JOptionPane.showMessageDialog(null,power.toUpperCase() + " TO THE RESCUE!");
		

	}

}
