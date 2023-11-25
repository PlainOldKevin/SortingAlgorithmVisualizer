package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;

// This class will store all of the sorting algorithms used to visually sort the array in the SortingPanel
public class SortingAlgorithms {
	
	// ATTRIBUTES FOR ARRAY COMPARISON
	private int current = -1;
	private int check = -1;
	
	// ATTRIBUTES FOR GRAPH VISUALIZATION
	SortingPanel sp;
	
	// BUBBLE SORT ALGORITHM
	public void BubbleSort() {
		
	}
	
	
	
	
	
	
	// METHOD FOR SIMPLE SWAPPING OF INDEXES
	public void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	// METHOD TO RESET ATTRIBUTES FOR CONTINUED SORTING
	public void reset() {
		current = -1;
		check = -1;
	}
	
	// METHOD TO SEND SortingPanel THE CHECK ATTRIBUTE
	public int getCheck() {
		return check;
	}
	
	// METHOD TO SEND SortingPanel THE CURRENT ATTRIBUTE
		public int getCurrent() {
			return current;
		}
	
	// METHOD INSERTED INTO SORTING ALGORITHMS TO DELAY THE SORTING, THUS HIGHLIGHTING THE SORTING PROCESS FOR THE USER
	public void sleep() throws InterruptedException {
		Thread.sleep(20);
	}
}
