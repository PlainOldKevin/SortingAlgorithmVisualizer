package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;

// The JPanel for displaying the array
public class SortingPanel extends JPanel {

	// ATTRIBUTES
	private int[] list;
	private int len = 60;
	private ButtonPanel bp;
	
	// SortingPanel constructor
	public SortingPanel() {
		// SET CHARACTERISTICS OF PANEL
		this.setBounds(0, 50, 850, 600); // SET SIZE OF PANEL
		this.setBackground(new Color(20,25,25)); // SET BACKGROUND COLOR OF PANEL
		
		
		// ADD TO PANEL
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
	}
	
	public void createList() {
		list = new int[len];	// CREATES A LIST EQUAL TO THE LENGTH
		for(int i = 0; i < len; i++) {	// FILLS THE LIST FROM 1 -> LEN
			list[i] = i+1;
		}
	}
}
