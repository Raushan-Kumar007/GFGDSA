package Array;

public class subarrayWithGivenSum {
    // efficient approch to find sum of sub array with time Complexity is theta(n)
    int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum = arr[0], start = 0, i; 

		// Pick a starting point 
		for (i = 1; i <= n; i++) 
		{ 
			// If curr_sum exceeds the sum, then remove the starting elements 
			while (curr_sum > sum && start < i-1) 
			{ 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 
			
			// If curr_sum becomes equal to sum, then return true 
			if (curr_sum == sum) 
			{ 
				int p = i-1; 
				System.out.println("Sum found between indexes " + start 
						+ " and " + p); 
				return 1; 
			} 
			
			// Add this element to curr_sum 
			if (i < n) 
			curr_sum = curr_sum + arr[i]; 
			
		} 

		System.out.println("No subarray found"); 
		return 0; 
	} 
   public static void main(String[] args) {
    subarrayWithGivenSum   arraysum = new  subarrayWithGivenSum (); 
    int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
    int n = arr.length; 
    int sum = 23; 
    arraysum.subArraySum(arr, n, sum); 
   } 
}
