/* 
   time complexity of deletion of element from array is o(n)
*/


package Array;

public class deleteOperation {
    static int delete(int arr[],int n,int x){
          int i = 0;
        for( i=0;i<n;i++){
         if(arr[i]==x)
         break;
        }
         if(i==n)
         return n;
         for(int j=i; j<n-1; j++){
         arr[j]=arr[j+1];
         }
         return n-1;
        }
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 5;

     

       System.out.println("Before Deletion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();
       

       n = delete(arr, n, x);

       System.out.println("After Deletion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}
    
