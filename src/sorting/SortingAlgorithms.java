package sorting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;

// This class will store all of the sorting algorithms used to visually sort the array in the SortingPanel
public class SortingAlgorithms {
	
	// ATTRIBUTES FOR ARRAY COMPARISON
	private int current = -1;
	private int check = -1;
	private int len = 50;
	private int doneSort; // VARIBALE TO HOLD 'SORTED UP TO THIS POINT'
	
	// BUBBLE SORT ALGORITHM
	public void bubbleSort(int[] array, SortingPanel sp) {
		int alreadySorted = 1; // VARIABLE TO HELP TRACK DoneSort
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < len - alreadySorted; i++) { // GO THRU ARRAY
				check = i + 1;
				if (array[i] > array[check]) {
					int temp = array[i];
					array[i] = array[check];
					array[check] = temp;
				}
				sp.paintImmediately(0, 50, 860, 525);
				sleep();
				swapped = true;
			}
			doneSort = len - alreadySorted;
			alreadySorted++;
			if (isSorted(array)) swapped = false;	
		}
		reset();
		sp.repaint();
	}
	
	// INSERTION SORT ALGORITHM
	public void insertionSort(int[] array, SortingPanel sp) {
        for (int i = 1; i < array.length; i++) {
        	doneSort = i;
        	check = i;
        	while(array[check] < array[check-1]) {
        		int temp = array[check];
        		array[check] = array[check-1];
        		array[check-1] = temp;
        		sp.paintImmediately(0, 50, 860, 525);
				sleep();
				if(check > 1) {
					check--;
				}
        	}
        }
        reset();
        sp.repaint();
    }
	
	
	// METHOD TO GET FINISHED SORTING INDEX IN CERTAIN SORT ALGORITHMS
	public int getDoneSort() {
		return doneSort;
	}


	// METHOD TO SET FINISHED SORTING INDEX IN CERTAIN SORT ALGORITHMS
	public void setDoneSort(int doneSort) {
		this.doneSort = doneSort;
	}

	// METHOD TO CHECK IF THE ARRAY IS SORTED
	public boolean isSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) { // GO THRU ARRAY
	        if (array[i] > array[i + 1]) { // CHECK INDEX VALUES NEXT TO EACH OTHER
	            return false; 
	        }
	    }
	    return true;
	}
	
	// METHOD TO RESET ATTRIBUTES FOR CONTINUED SORTING
	public void reset() {
		current = -1;
		check = -1;
		doneSort = 0;
	}
	
	// CHECK GETTER
	public int getCheck() {
		return check;
	}
	
	// CURRENT GETTER
	public int getCurrent() {
		return current;
	}
	
	// METHOD INSERTED INTO SORTING ALGORITHMS TO DELAY THE SORTING, THUS HIGHLIGHTING THE SORTING PROCESS FOR THE USER
	public void sleep() {
		try {
			Thread.sleep(30);
		} catch(Exception e) {
			
		}
	}
}
