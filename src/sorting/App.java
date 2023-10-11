package sorting;
import javax.swing.*;

public class App extends JFrame {
	
	public App() {
		// set basic attributes
		super("Sorting Algorithm Visualizer");
		this.setSize(950, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// add mainpanel
		this.add(new MainPanel());
		
		// make visible
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new App();
	}
}
