package Shorting;

import java.util.Arrays;

public class UnionOfTwoSortedArr {
    static void Union(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
       int arr3[] = new int[n+m];
       for(int i=0;i<n;i++){
        arr3[i]=arr1[i];
       }
       for(int j=0;j<m;j++){
        arr3[j+n]=arr2[j];
       }
       Arrays.sort(arr3);
       for(int i=0;i<arr3.length;i++){
        if(i==0 || arr3[i]!=arr3[i-1]){
            System.out.print(arr3[i]+" ");
        }
       }
    }
    public static void main(String[] args) {
        int arr1[] = {3,5,8};
        int arr2[] = {2,8,9,10,15};
        int arr3[] = new int[arr1.length+arr2.length];
        Union(arr1, arr2);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
