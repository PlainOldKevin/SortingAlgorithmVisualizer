package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;

// The JPanel with instructions for how and when the array will sort and re-shuffle
public class ButtonPanel extends JPanel {
	
	// ATTRIBUTES
	SortingPanel sp;
	SortingAlgorithms sort;
	private int chosenAlg = 0;
	
	// ButtonPanel constructor
	public ButtonPanel(SortingPanel sp, SortingAlgorithms sort) {
		// SET CHARACTERISTICS OF BUTTON PANEL
		this.setBounds(0,0,860,50); // SET SIZE OF BUTTON PANEL
		this.setBackground(new Color(42,43,46)); // SET BACKGROUND COLOR OF BUTTON PANEL
		
		// START BUTTON
		JButton start = new JButton("Start"); // CREATE BUTTON AND GIVE IT TEXT
		start.setBounds(550,10,70,25);	// SET LOCATION OF THE BUTTON
		start.setBackground(Color.WHITE); // SET BACKGROUND COLOR
		
		// SHUFFLE BUTTON
		JButton shuffle = new JButton("Shuffle"); // CREATE BUTTON AND GIVE IT TEXT
		shuffle.setBounds(630,10,80,25); // SET LOCATION OF THE BUTTON
		shuffle.setBackground(Color.WHITE); // SET BACKGROUND COLOR
		
		// DROP-DOWN MENU
		String[] algorithms = {"Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort", "Quick Sort"}; // ARRAY FOR DROP-DOWN MENU TEXT
		JComboBox<String> dropDown = new JComboBox<String>(algorithms); // DROP-DOWN MENU CREATION
		dropDown.setBounds(720,10,100,25); // DROP-DOWN MENU LOCATION
		dropDown.setBackground(Color.WHITE); // SET BACKGROUND COLOR
		
		// ADD ACTION LISTENERS
		
		// START BUTTON ACTION LISTENER
		start.addActionListener(new ActionListener() {
			@Override
			// TODO create and perfect algorithms in SA class
			public void actionPerformed(ActionEvent e) {
				switch(chosenAlg) {
					case 0:
						sort.bubbleSort(sp.getArray(), sp);
						break;
					case 1:
						sort.insertionSort(sp.getArray(), sp);
						break;
				}
				
			}			
		});
		
		// SHUFFLE BUTTON ACTION LISTENER
		shuffle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sp.shuffle(sp.getArray()); // SHUFFLE METHOD
			}
			
		});
		
		// COMBO BOX ITEM LISTENER
		dropDown.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				chosenAlg = dropDown.getSelectedIndex(); // RETURN THE USER'S SELECTED ALGORITHM IN THE DROP-DOWN 
			}
			
		});
		
		// ADD TO PANEL
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
		this.add(start); // ADD START BUTTON TO BUTTON PANEL
		this.add(shuffle); // ADD SHUFFLE BUTTON TO BUTTON PANEL
		this.add(dropDown); // ADD DROP-DOWN MENU TO BUTTON PANEL
	}
	
	

}
