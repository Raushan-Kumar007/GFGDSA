package Array;

public class secondLargest {

 /*   naive approch 
 static int getLarge(int arr[]){
      int  n = arr.length;
        int  largest = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }

        }
        return largest;
    }
    static int secLargest( int arr[]){
        int n = arr.length;
        int largest = getLarge(arr);
        int res =-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1)
                res = i;
                else if(arr[i]>arr[res])
                    res = i;
          }
        }
        return res;
    }
    */
    // efficient approch
   static int secondlargest(int a[] )
    {   int n = a.length;
        int largest=0;
        int res=-1;
        
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[largest])
            {
                res=largest;
                largest=i;
            }
            else if(a[i]!=a[largest])
            {
                if(res==-1||a[i]>a[res])
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,7,30,100};
        System.out.println( secondlargest(arr));
        
    }
    
}
