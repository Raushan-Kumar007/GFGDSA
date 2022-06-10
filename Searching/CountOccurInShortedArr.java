package Searching;

public class CountOccurInShortedArr {
    // Naive approch to find countOccurence in shorted array using bigO(n) time complexity
   /* static int countOccurInArr(int arr[], int x){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
           if(arr[i]==x){
           count++;
           }
        }
        return count;
    }*/
    static int firstOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
	}

	static int lastOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}

		return -1;
	}
	
	
	static int countOcc(int arr[], int n, int x)
	{
		int first = firstOcc(arr, n, x);

		if(first == -1)
			return 0;
		else 
			return lastOcc(arr, n, x) - first + 1;
	}

  public static void main(String[] args) {
     int arr[] = {10,20,20,20,30,30}; 
     int x = 20;
     int n =6;
     System.out.println(countOcc(arr, n, x));
  }  
}
