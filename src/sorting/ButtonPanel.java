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
		this.setBounds(0,0,900,75); // SET SIZE OF BUTTON PANEL
		this.setBackground(Color.DARK_GRAY); // SET BACKGROUND COLOR OF BUTTON PANEL
		
		// START BUTTON
		JButton start = new JButton("Start"); // CREATE BUTTON AND GIVE IT TEXT
		start.setBounds(550,10,90,30);	// SET LOCATION OF THE BUTTON
		
		// DROP-DOWN MENU
		String[] algorithms = {"Select", "Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort", "Quick Sort"}; // ARRAY FOR DROP-DOWN MENU TEXT
		JComboBox<String> dropDown = new JComboBox<String>(algorithms); // DROP-DOWN MENU CREATION
		dropDown.setBounds(650,10,120,30); // DROP-DOWN MENU LOCATION
		
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
		this.add(start); // ADD START BUTTON TO BUTTON PANEL
		this.add(dropDown); // ADD DROP-DOWN MENU TO BUTTON PANEL
	}

}
