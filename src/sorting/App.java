package sorting;
import javax.swing.*;

public class App extends JFrame {
	
	public App() {
		// set basic attributes
		super("Sorting Algorithm Visualizer");
		this.setSize(850, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// add main panel
		this.add(new MainPanel());
		
		// make visible
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new App();
	}
}
