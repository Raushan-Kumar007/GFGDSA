package Searching;

public class TwoPointerApproch {
    // naive approch for unshorted array
   /*  static void pairSum(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x)
                System.out.print(arr[i]+" "+arr[j]);
            }
        }
    }
    */
    // for shorted array finding sum two pinter approch is better then other approch
  /*   static void pairSum(int arr[],int x){
        int n = arr.length;
        int left = 0; int right = n-1; 
        while(left<=right){
            if(arr[left]+arr[right]==x){
                System.out.print(left+" "+right);
                break;
            }else if(arr[left]+arr[right]>x)
            right--;
            else
                left++;
        }
    }
    */
   // naive approch to find three sum

   /*  static void threepair(int arr[],int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                    System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
    }
    */
    	// returns true if there is triplet with sum equal 
	// to 'sum' present in A[]. Also, prints the triplet 
	boolean find3Numbers(int A[], int arr_size, int sum) 
	{ 
		int l, r; 

		/* Sort the elements */
		quickSort(A, 0, arr_size - 1); 

		/* Now fix the first element one by one and find the 
		other two elements */
		for (int i = 0; i < arr_size - 2; i++) { 

			// To find the other two elements, start two index variables 
			// from two corners of the array and move them toward each 
			// other 
			l = i + 1; // index of the first element in the remaining elements 
			r = arr_size - 1; // index of the last element 
			while (l < r) { 
				if (A[i] + A[l] + A[r] == sum) { 
					System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]); 
					return true; 
				} 
				else if (A[i] + A[l] + A[r] < sum) 
					l++; 

				else // A[i] + A[l] + A[r] > sum 
					r--; 
			} 
		} 

		// If we reach here, then no triplet was found 
		return false; 
	} 

	int partition(int A[], int si, int ei) 
	{ 
		int x = A[ei]; 
		int i = (si - 1); 
		int j; 

		for (j = si; j <= ei - 1; j++) { 
			if (A[j] <= x) { 
				i++; 
				int temp = A[i]; 
				A[i] = A[j]; 
				A[j] = temp; 
			} 
		} 
		int temp = A[i + 1]; 
		A[i + 1] = A[ei]; 
		A[ei] = temp; 
		return (i + 1); 
	} 

	/* Implementation of Quick Sort 
	A[] --> Array to be sorted 
	si --> Starting index 
	ei --> Ending index 
	*/
	void quickSort(int A[], int si, int ei) 
	{ 
		int pi; 

		/* Partitioning index */
		if (si < ei) { 
			pi = partition(A, si, ei); 
			quickSort(A, si, pi - 1); 
			quickSort(A, pi + 1, ei); 
		} 
	} 

	// Driver program to test above functions 

    public static void main(String[] args) {
        TwoPointerApproch triplet = new  TwoPointerApproch(); 
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
		int sum = 22; 
		int arr_size = A.length; 

		triplet.find3Numbers(A, arr_size, sum); 
    }
}
