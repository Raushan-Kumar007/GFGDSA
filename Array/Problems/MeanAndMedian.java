package Array.Problems;

import java.util.Arrays;

public class MeanAndMedian {
    public int median(int A[],int N)
    {
      
       Arrays.sort(A);
         double median = N/2;
      int index = (int)(median);
      if (N % 2 != 0) {
          return A[index];
      }else {
          
          return (A[index] + A[index - 1])/2; 
      }
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
        int sum = 0;
      for (int i = 0; i < N; i++) {
          sum += A[i];
      }
      double mean = sum/N;
      return sum/N;
    }
}
