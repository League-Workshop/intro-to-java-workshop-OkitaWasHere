package section3;

import javax.swing.JOptionPane;

public class NicestProgramEver{
	public static void main(String[] args) {
	String greeting = "Good morning! :)";
	String SystemSetup = "Beep Boop-- Please stand by. System Setup occuring. Beep.";
	    JOptionPane.showMessageDialog(null, SystemSetup);
	    JOptionPane.showMessageDialog(null, "20% Complete...");
	    JOptionPane.showMessageDialog(null,"40% Complete...");
	    JOptionPane.showMessageDialog(null, "60% Complete...");
	    JOptionPane.showMessageDialog(null, "80% Complete...");
	    JOptionPane.showMessageDialog(null, "100% Complete!");
	    
	    JOptionPane.showMessageDialog(null, greeting);
	    JOptionPane.showMessageDialog(null, "You are beautiful just the way you are.");
	    JOptionPane.showMessageDialog(null, "Don't change a thing about yourself.");
	    JOptionPane.showMessageDialog(null, "You have the power to achieve anythng you set your mind to.");
	    JOptionPane.showMessageDialog(null, "Happy birthday!");
	    
	    
	    //"Bob"
	    JOptionPane.showMessageDialog(null, "Welcome to the Love Bot! :)");
	    String person = JOptionPane.showInputDialog(null, "What's your name?");
	    
	    JOptionPane.showMessageDialog(null, "Good morning, " + person + "!");
	    JOptionPane.showMessageDialog(null, "It's a pleasure to meet you.");
	    
	}
}
