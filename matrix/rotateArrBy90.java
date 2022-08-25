package matrix;

 

public class rotateArrBy90 {

    // naive approch 
    static int n = 4;
    // static void rotateArr(int arr[][]){
    //     int n = arr.length;
    //     int temp[][] = new int[n][n];

	// 	for(int i = 0; i < n; i++){
	// 		for(int j = 0; j < n; j++)
	// 			temp[n - j - 1][i] = arr[i][j];
    //     }

	// 	for(int i = 0; i < n; i++){
	// 		for(int j = 0; j < n; j++)
	// 			arr[i][j] = temp[i][j];
    //     }
    // }
 
// naive approch 
	static void swap(int mat[][], int i, int j)
	{
			int temp = mat[i][j];
			mat[i][j] = mat[j][i];
			mat[j][i] = temp;
	}
	
	static void swap2(int low, int high, int i, int mat[][])
	{
	    	int temp = mat[low][i];
			mat[low][i] = mat[high][i];
			mat[high][i] = temp;
	}

	static void rotate90(int mat[][])
	{

		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				swap(mat, i, j);
				
		for(int i = 0; i < n; i++)
		{
		    int low = 0, high = n - 1;
		    
		    while(low < high)
		    {
		        swap2(low, high, i, mat);
		        
		        low++;
		        high--;
		    }
		}
	}

	public static void main(String args[]) 
    {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	rotate90(arr);

    		for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					System.out.print(arr[i][j]+" ");
				}

				System.out.println();
			}	
    } 

}
