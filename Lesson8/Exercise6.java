package Lesson8;

public class Exercise6 {

	public static void main(String[] args) {
		
		int array[] = {2, 5};
		System.out.println(areFactors(10, array));

	}
	
	// Returns true only if int n i divisible by every number in array arr.
	static boolean areFactors(int n, int[] arr)
	{
		for (int i : arr)
		{
			if (n % i != 0)
			{
				return false;
			}
		}
		return true;
	}
}
