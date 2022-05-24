package Array;

public class leftRotateArr {
    static void lRotateOne(int[] arr, int n){
        int temp = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		arr[i - 1] = arr[i];
    	}

    	arr[n - 1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println("Before Rotation");
 
        for(int i = 0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
 
        System.out.println();
 
        lRotateOne(arr, n);
 
        System.out.println("After Rotation");
 
        for(int i = 0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
 
    }
}
