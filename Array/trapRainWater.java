package Array;

/*  Navive APPROCH
    timeComplexity is theta(n^2)
*/

public class trapRainWater {
  /*  static int getWater(int[] arr, int n){
        int res = 0;
        for(int i=1; i<n-1; i++){
            
        
            int Lmax = arr[i];
            for(int j=0; j<i; j++)               // this for Lmax 
            Lmax = Math.max(Lmax, arr[j]);
                                
       
            int Rmax = arr[i];                   // this is for Rmax
            for(int j=i+1; j<n; j++)
            Rmax = Math.max(Rmax,arr[j]);
           
           
            res = res + (Math.min(Lmax,Rmax)-arr[i]);
        }
        return res;
    }*/

    // efficient approch timeComplexity is Theta(n)
    static int getWater(int[] arr, int n){
        int res = 0;
        int[] Lmax = new int[n];
        int[] Rmax = new int[n];
        Lmax[0]=arr[0];
        for(int i=1; i<n; i++)
        Lmax[i] = Math.max(arr[i],Lmax[i-1]);
        Rmax[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--)
        Rmax[i]=Math.max(arr[i],Rmax[i+1]);
        for(int i=1; i<n-1; i++){
            res = res + (Math.min(Lmax[i],Rmax[i])-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5}; int n = 5;
        System.out.println(getWater(arr, n));
    }
}
