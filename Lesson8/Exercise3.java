package Lesson8;

public class Exercise3 {

	/* array bob is {1, 2, 3, 4, 5}
	   array jub is  {2, 4, 6, 8, 10}
	   int fus is = 20
	   This takes place before the return of int mus occurs.
	   The final output comes out to be 30. */
	
	public static int[] make(int n) {
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	        a[i] = i + 1;
	    }
	    return a;
	}
	public static void dub(int[] jub) {
	    for (int i = 0; i < jub.length; i++) {
	        jub[i] *= 2;
	    }
	}
	public static int mus(int[] zoo) {
	    int fus = 0;
	    for (int i = 0; i < zoo.length; i++) {
	        fus += zoo[i];
	    }
	    return fus;
	}
	public static void main(String[] args) {
	    int[] bob = make(5);
	    dub(bob);
	    System.out.println(mus(bob));
	}

}