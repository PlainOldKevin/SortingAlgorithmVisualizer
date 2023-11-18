package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;

// The JPanel with instructions for how and when the array will sort and re-shuffle
public class ButtonPanel extends JPanel {
	
	public ButtonPanel() {
		// SET CHARACTERISTICS OF BUTTON PANEL
		this.setBounds(0,0,850,50); // SET SIZE OF BUTTON PANEL
		this.setBackground(new Color(27,26,26)); // SET BACKGROUND COLOR OF BUTTON PANEL
		
		// START BUTTON
		JButton start = new JButton("Start"); // CREATE BUTTON AND GIVE IT TEXT
		start.setBounds(550,10,70,25);	// SET LOCATION OF THE BUTTON
		start.setBackground(Color.WHITE); // SET BACKGROUND COLOR
		
		// SHUFFLE BUTTON
		JButton shuffle = new JButton("Shuffle"); // CREATE BUTTON AND GIVE IT TEXT
		shuffle.setBounds(630,10,80,25); // SET LOCATION OF THE BUTTON
		shuffle.setBackground(Color.WHITE); // SET BACKGROUND COLOR
		
		// DROP-DOWN MENU
		String[] algorithms = {"Select", "Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort", "Quick Sort"}; // ARRAY FOR DROP-DOWN MENU TEXT
		JComboBox<String> dropDown = new JComboBox<String>(algorithms); // DROP-DOWN MENU CREATION
		dropDown.setBounds(720,10,100,25); // DROP-DOWN MENU LOCATION
		dropDown.setBackground(Color.WHITE); // SET BACKGROUND COLOR
		
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
		this.add(start); // ADD START BUTTON TO BUTTON PANEL
		this.add(shuffle); // ADD SHUFFLE BUTTON TO BUTTON PANEL
		this.add(dropDown); // ADD DROP-DOWN MENU TO BUTTON PANEL
	}

}
