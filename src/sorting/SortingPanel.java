package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;

// The JPanel for displaying the array
public class SortingPanel extends JPanel {

	// ATTRIBUTES OF CLASS
	private int len = 50;
	private int[] list;
	private ButtonPanel bp;
	private Random random;
	
	// GRAPH ATTRIBUTES
	private final int SIZE = 500;
	private int current = -1;
	private int check = -1;
	private int width = SIZE/len;
	private int type = 0;
	
	
	// SortingPanel constructor
	public SortingPanel() {
		// SET CHARACTERISTICS OF PANEL
		this.setBounds(0, 50, 850, 530); // SET SIZE OF PANEL
		this.setBackground(new Color(22,23,25)); // SET BACKGROUND COLOR OF PANEL
		
		list = new int[len];
		
		fillList();
		repaint();
		
		// ADD TO PANEL
		this.setLayout(null); // LAYOUT TO NULL TO PUT THINGS IN CERTAIN SPOTS
	}
	
	// METHOD TO CREATE THE ARRAY USED FOR VISUALIZATION
	public void fillList() {
		for(int i = 0; i < len; i++) {	// FILLS THE LIST FROM 1 -> LEN
			list[i] = i + 2;
		}
	}
	
	// METHOD TO PAINT AND VISUALIZE THE GRAPH
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < len; i++) {	//RUNS TROUGH EACH ELEMENT OF THE LIST
			int HEIGHT = list[i]*width;	//SETS THE HEIGHT OF THE ELEMENT ON THE GRAPH
			g.setColor(Color.white);	//DEFAULT COLOR
		
			// DRAWS THE BAR AND THE BLACK OUTLINE
			g.fillRect(i*width, SIZE-HEIGHT, width, HEIGHT);
			g.setColor(Color.black);
			g.drawRect(i*width, SIZE-HEIGHT, width, HEIGHT);
		}
	}
}
