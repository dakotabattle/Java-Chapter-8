package Lesson8;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		// Array is defined here
		double[] array = {1.0, 2.0, 3.0, 4.0};
		array = powArray(array, 3.0);
		printArray(array);
		
		// Spacing
		separation();
		int[] one = randomArray(100);
		int[] two = new int[100];
		
		two = histogram(one, two);
		printArray(two);
		
		
	}
	
	public static double[] powArray(double[] one, double raise) {
		
		for(int i = 0; i < one.length; i++) {
			one[i] = Math.pow(one[i], raise);
		}

		return one;
	}
	

	public static void printArray(double[] one) {
		System.out.print("{" + one[0]);
		
		for(int i = 1; i < one.length; i++) {
			System.out.print(", " + one[i]);
		}
		System.out.print("}");
	}
	

	public static void printArray(int[] one){
		System.out.print("{" + one[0]);
		
		// Prints every number found after the first one listed.
		for(int i = 1; i < one.length; i++) {
			System.out.print(", " + one[i]);
		}
		System.out.print("}");
		
	}

	
	// Searches for and returns the amount of times it occurs.
	public static int[] histogram(int[] one, int[] two) {
		for(int score: one) {
			two[score]++;
		}
		return two;
	}
	
	// Parameter controls the size of the Array, which is generated randomly.
	public static int[] randomArray(int size) {
	    Random random = new Random();
	    int[] a = new int[size];
	    for (int i = 0; i < a.length; i++) {
	        a[i] = random.nextInt(100);
	    }
	    return a;
	}
	
	public static void separation() {
		System.out.println("");
		System.out.println("");
	}
	
	
	
}