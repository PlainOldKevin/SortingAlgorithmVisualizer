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
	private int[] list;
	private ButtonPanel bp;
	private SortingAlgorithms sort;
	
	// GRAPH ATTRIBUTES
	private final int SIZE = 525;
	private int width = 17;
	private int type = 0;
	
	
	// SortingPanel constructor
	public SortingPanel() {
		// SET CHARACTERISTICS OF PANEL
		this.setBounds(0, 50, 860, 525); // SET SIZE OF PANEL
		this.setBackground(new Color(47,47,47)); // SET BACKGROUND COLOR OF PANEL
		
		// SOME CLASS CREATION ATTRIBUTES
		list = new int[len]; // ARRAY INSTANTIATION
		
		fillList();
		repaint();
		
		// ADD TO PANEL
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
	}
	
	// METHOD TO CREATE THE ARRAY USED FOR VISUALIZATION
	public void fillList() {
		for(int i = 0; i < len; i++) {	// FILLS THE LIST FROM 1 -> LEN
			list[i] = i + 1;
		}
	}
	
	// METHOD TO SHUFFLE LIST; USED ON STARTUP AND WHEN SHUFFLE BUTTON PRESSED
	public void shuffleList(int[] list) {
		for (int i = 0; i < len; i++) { // GO THRU ARRAY
			Random random = new Random(); // CREATE NEW RANDOM OBJECT FOR METHOD FUNCTIONALITY
			int randomIndexToSwap = random.nextInt(len); // CHOOSE A RANDOM INDEX TO SWAP WITH
			int temp = list[randomIndexToSwap]; // ASSIGN THAT INDEX'S VALUE TO A TEMP VARIABLE
			list[randomIndexToSwap] = list[i]; // ASSIGN THE CURRENT INDEX'S VALUE TO THE TEMP INDEX
			list[i] = temp; // ASSIGN THE RANDOM INDEX'S VALUE TO THE CURRENT INDEX
		}
		repaint(); // DISPLAY THE SHUFFLED LIST
	}
	
	// METHOD TO RETURN THE CURRENT LIST; MOSTLY USED IN BUTTON PANEL
	public int[] getList() {
		return list;
	}
	
	// METHOD TO CHECK IF THE ARRAY IS SORTED
	public boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) { // GO THRU ARRAY
            if (list[i] > list[i + 1]) { // CHECK INDEX VALUES NEXT TO EACH OTHER
                return false; 
            }
        }
        return true;
    }
	
	// METHOD TO PAINT AND VISUALIZE THE GRAPH
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < len; i++) {	//RUNS TROUGH EACH ELEMENT OF THE LIST
			int HEIGHT = list[i]*width/2;	//SETS THE HEIGHT OF THE ELEMENT ON THE GRAPH
		
			// DRAWS THE BAR AND THE BLACK OUTLINE
			g.setColor(Color.white);	// GRAPH FILL COLOR
			g.fillRect(i*width, SIZE-HEIGHT, width, HEIGHT);
			g.setColor(Color.black);	// GRAPH OUTLINE COLOR
			g.drawRect(i*width, SIZE-HEIGHT, width, HEIGHT);
		}
	}
}
