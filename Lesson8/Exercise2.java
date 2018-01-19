package Lesson8;

public class Exercise2 {

	/* This method multiplies int kiwi by every individual number in array a. 
	   Once it has done this, it returns the resulting value. */
	public static int banana(int[] a) {
	    int kiwi = 1;
	    int i = 0;
	    while (i < a.length) {
	        kiwi = kiwi * a[i];
	        i++;
	    }
	    return kiwi;
	}
	
	/* After int grape is defined, the method checks through each value in the array to see if
	   grape is anywhere to be found in the array. If it is, it returns the index it is found at.*/
	public static int grapefruit(int[] a, int grape) {
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] == grape) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	/* Looks to see if int apple is found in array pineapple. For every time it is found,
	   pear is increased by one. At the end, it returns pear, or the number of times it occurs. */

	public static int pineapple(int[] a, int apple) {
	    int pear = 0;
	    for (int pine: a) {
	        if (pine == apple) {
	            pear++;
	        }
	    }
	    return pear;
	}
}

