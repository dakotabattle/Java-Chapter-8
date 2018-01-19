package Lesson8;

public class Exercise4 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3};
		System.out.println(indexOfMax(array));
	}
	
	/* Yes, you can use an enhanced For Loop for this method.
	   It automatically iterates through the whole array and assigns i to each int as it goes. */
	static int indexOfMax(int[] arr)
	{
		int max = 0;
		for (int i : arr)
		{
			if (i > max)
			{
				max = i;
			}
		}
		return max;
	}
	
}
