package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		
		//"Bob"
		String person1 = JOptionPane.showInputDialog("Who do you not like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + person1 + "!");
		
		String person2 = JOptionPane.showInputDialog("Who is your best friend?");
		JOptionPane.showMessageDialog(null, person2 + " is as sweet as candy!");

	} 
}



