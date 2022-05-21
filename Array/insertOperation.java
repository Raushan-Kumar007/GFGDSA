/*
   insertion of element in array which having some space to adjust the element 
   Best Timecomplexity - o(1) ==> when we insert an element from last
   worst  Timecomplexity - o(n)==>when we insert an element from beginning or between

    
*/




package Array;

public class insertOperation {
    static int insert(int arr[], int n, int x, int cap, int pos)
    {
    	if(n == cap)
    		return n;

    	int idx = pos - 1;

    	for(int i = n - 1; i >= idx; i--)
    	{
    		arr[i + 1] = arr[i];
    	}

    	arr[idx] = x;

    	return n + 1;
    } 

    public static void main(String[] args) {
        int arr[] = new int[5], cap = 5, n = 3;

        arr[0] = 5; arr[1] = 10; arr[2] = 20;
 
        System.out.println("Before Insertion");
 
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
 
        System.out.println();
 
        int x = 7, pos = 2;
 
        n = insert(arr, n, x, cap, pos);
 
        System.out.println("After Insertion");
 
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
    }
}
