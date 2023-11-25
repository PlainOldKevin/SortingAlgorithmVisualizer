package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.awt.BorderLayout;
import java.awt.Color;

// The JPanel for displaying the array
public class SortingPanel extends JPanel {

	// ATTRIBUTES OF CLASS
	private int len = 50;
	private int[] array;
	SortingAlgorithms sort;
	
	// GRAPH ATTRIBUTES
	private final int SIZE = 525;
	private int width = 17;
	
	
	// SortingPanel constructor
	public SortingPanel() {
		// SET CHARACTERISTICS OF PANEL
		this.setBounds(0, 50, 860, 525); // SET SIZE OF PANEL
		this.setBackground(new Color(47,47,47)); // SET BACKGROUND COLOR OF PANEL
		
		// SOME CLASS CREATION ATTRIBUTES
		array = new int[len]; // ARRAY INSTANTIATION
		
		fillArray(); // CREATE ARRAY
		repaint(); // DISPLAY ARRAY
		
		// ADD TO PANEL
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
	}
	
	// METHOD TO CREATE THE ARRAY USED FOR VISUALIZATION
	public void fillArray() {
		for(int i = 0; i < len; i++) {	// FILLS THE LIST FROM 1 -> LEN
			array[i] = i + 1;
		}
	}
	
	// METHOD TO SHUFFLE LIST; USED ON STARTUP AND WHEN SHUFFLE BUTTON PRESSED
	public void shuffle(int[] array) {
		for (int i = 0; i < len; i++) { // GO THRU ARRAY
			Random random = new Random(); // CREATE NEW RANDOM OBJECT FOR METHOD FUNCTIONALITY
			int randomIndexToSwap = random.nextInt(len); // CHOOSE A RANDOM INDEX TO SWAP WITH
			int temp = array[randomIndexToSwap]; // ASSIGN THAT INDEX'S VALUE TO A TEMP VARIABLE
			array[randomIndexToSwap] = array[i]; // ASSIGN THE CURRENT INDEX'S VALUE TO THE TEMP INDEX
			array[i] = temp; // ASSIGN THE RANDOM INDEX'S VALUE TO THE CURRENT INDEX
		}
		repaint(); // DISPLAY THE SHUFFLED LIST
	}
	
	// METHOD TO RETURN THE CURRENT LIST; MOSTLY USED IN BUTTON PANEL
	public int[] getArray() {
		return array;
	}
	
	// METHOD TO PAINT AND VISUALIZE THE GRAPH
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < len; i++) {	//RUNS TROUGH EACH ELEMENT OF THE LIST
			int HEIGHT = array[i]*width/2;	//SETS THE HEIGHT OF THE ELEMENT ON THE GRAPH
			
			// DRAWS THE BAR AND THE BLACK OUTLINE
			g.setColor(Color.white);	// GRAPH FILL COLOR
			g.fillRect(i*width, SIZE-HEIGHT, width, HEIGHT);
			g.setColor(Color.black);	// GRAPH OUTLINE COLOR
			g.drawRect(i*width, SIZE-HEIGHT, width, HEIGHT);
		}
	}
}
