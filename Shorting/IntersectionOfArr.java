package Shorting;

public class IntersectionOfArr {

    // Naive approch with time complexity is BigO(n*m)

   /*  static void Intersection(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr1[i]==arr1[i-1])
            continue;
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
    */

    static void Intersection(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
   public static void main(String[] args) {
         int arr1[]={1,20,20,40,60};
         int arr2[]={2,20,20,40};
         int arr3[] = new int[arr1.length+arr2.length];
         Intersection(arr1, arr2);
         for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
         }
   } 
}
