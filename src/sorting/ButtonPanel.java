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
		
		this.setBounds(0,0,900,75);
		this.setBackground(Color.BLACK);
		// instantiate start button
		JButton start = new JButton("Start");
		start.setBounds(650,10,90,30);
		
		// instantiate drop-down menu
		String[] algorithms = {"Select", "Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort", "Quick Sort"};
		JComboBox<String> dropDown = new JComboBox<String>(algorithms);
		
		
		this.add(start);
		this.setLayout(null);
		//this.add(dropDown);
	}

}
