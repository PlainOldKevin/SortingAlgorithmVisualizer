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
	
	// ATTRIBUTES FOR GRAPH VISUALIZATION
	SortingPanel sp;
	
	// ATTRIBUTES FOR ARRAY COMPARISON
	private int current = -1;
	private int check = -1;
	private int len = 50;
	private boolean isSorted = false;
	
	// BUBBLE SORT ALGORITHM
	public void BubbleSort(int[] array, SortingPanel sp) {
		for (int i = 0; i < len - 1; i++) { // GO THRU ARRAY
			current = i;
			check = i + 1;
			if (array[current] > array[check]) {
				int temp = array[current];
				array[current] = array[check];
				array[check] = temp;
			}
			sleep();
			sp.paintImmediately(0, 50, 860, 525);
		}
		isSorted(array);
		reset();
	}
	
	
	
	// METHOD TO CHECK IF THE ARRAY IS SORTED
	public boolean isSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) { // GO THRU ARRAY
	        if (array[i] > array[i + 1]) { // CHECK INDEX VALUES NEXT TO EACH OTHER
	        	isSorted = false;
	            return false; 
	        }
	    }
	    isSorted = true;
	    return true;
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
	public void sleep() {
		try {
			Thread.sleep(30);
		} catch(Exception e) {
			
		}
	}
}
