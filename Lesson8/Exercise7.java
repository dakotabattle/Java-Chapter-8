package Lesson8;

public class Exercise7 {

	public static void main(String[] args) {
		
		int[] array = {3, 5, 7}; 
		System.out.println(arePrimeFactors(105, array));
		

	}

	static boolean arePrimeFactors(int n, int[] arr)
	{
		int product = 1;
		for (int i : arr)
		{
			if (isPrime(i) == false)
			{
				return false;
			}
			product *= i;
			
		}
		
		if (product != n)
		{
			return false;
		}
		return true;
	}
	
	static boolean isPrime(int n) {
	    if (n % 2 == 0) 
	    {
	    	return false;
	    }
	    for(int i = 3 ; i * i <= n ; i += 2) 
	    {
	        if(n % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
	
}

