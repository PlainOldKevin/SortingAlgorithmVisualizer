package sorting;
import javax.swing.*;

public class App extends JFrame {
	
	public App() {
		// APP ATTRIBUTES
		super("Sorting Algorithm Visualizer"); // WINDOW TAB TEXT
		this.setSize(857, 600); // WINDOW SIZE
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // HIT 'X' TO CLOSE
		this.setLocationRelativeTo(null); // CENTER ON SCREEN
		this.setResizable(false); // CANNOT RESIZE THE WINDOW
		this.getContentPane().setLayout(null); // LAYOUT OF THE SCREEN (TO EASIER ADD ELEMENTS IN SPECIFIC SPOTS)
		SortingAlgorithms sort = new SortingAlgorithms(); // SORTING ALGORITHMS
		SortingPanel sp = new SortingPanel(); // SORTING PANEL
		sp.setSort(sort);
		ButtonPanel bp = new ButtonPanel(sp, sort); // BUTTON PANEL
		
		// ADDING PANELS
		this.add(bp);
		this.add(sp);
		
		// LAST STEP
		this.setVisible(true); // MAKE WINDOW VISIBLE ON SCREEN
	}
	
	public static void main(String[] args) { // MAIN METHOD
		new App();
	}
}
