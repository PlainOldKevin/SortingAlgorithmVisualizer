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
	private int chonk = -1;
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
			current = len - alreadySorted;
			alreadySorted++;
			if (isSorted(array)) swapped = false;	
		}
		reset();
		sp.repaint();
	}
	
	// INSERTION SORT ALGORITHM
	public void insertionSort(int[] array, SortingPanel sp) {
        for (int i = 1; i < array.length; i++) {
        	current = i;
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
	
	// MERGE SORT ALGORITHM
	public void mergeSort(int l, int r, int[] array, SortingPanel sp) {
		if (l < r) {
			int m = (l+r)/2;
			current = r;
			mergeSort(l, m, array, sp);
			mergeSort(m+1, r, array, sp);
			
			merge(l, m, r, array, sp);
		}
	}
	
	// MERGE ALGORITHM USED IN MERGE SORT
	public void merge(int l, int m, int r, int[] array, SortingPanel sp) {
		// TWO SUBARRAY SIZES
		int n1 = m - l + 1;
		int n2 = r-m;
		
		// TEMP ARRAYS
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		// COPY DATA TO TEMP ARRAYS
        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];
        
        // MERGE ARRAYS NEXT
        
        // START OF BOTH SUBARRAYS
        int i = 0;
        int j = 0;
        // FIRST INDEX OF MERGED SUBARRAY
        int k = l;
        
        // COPY CORRECT ELEMENTS INTO SUBARRAYS
        while (i < n1 && j < n2) {
        	check = k+1;
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
            sp.paintImmediately(0, 50, 860, 525);
            sleep();
        }
 
        // COPY THE REST OF THE ELEMENTS INTO LEFT ARRAY
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
            sp.paintImmediately(0, 50, 860, 525);
			sleep();
        }
 
        // COPY THE REST OF THE ELEMENTS INTO RIGHT ARRAY
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
            sp.paintImmediately(0, 50, 860, 525);
			sleep();
        }
        sp.paintImmediately(0, 50, 860, 525);
        reset();
        sp.paintImmediately(0, 50, 860, 525);
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
		chonk = -1;
	}
	
	// CHECK GETTER
	public int getCheck() {
		return check;
	}
	
	// CHONK1 GETTER
	public int getChonk() {
		return chonk;
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
