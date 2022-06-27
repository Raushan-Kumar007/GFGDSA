package Shorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    // Naive approch with theta(m+n)theta(log(m+n))

   /*  static void Merge(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int newArr[] = new int[m+n];
        for(int i=0;i<n;i++){
            newArr[i]=arr1[i];
        }
        for(int j=0; j<m; j++){
            newArr[j+n]=arr2[j];
        }
        Arrays.sort(newArr);
       for(int i=0; i<m+n; i++){
        System.out.print(newArr[i]+" ");
       }
    }
    */

    // efficient approch timecomplexity is theta(m+n) Auxullary space is bigO(1)

    static void Merge(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
         int i=0; int j = 0;
         while(i<n && j<m){
         if(arr1[i]<=arr2[j]){
            System.out.print(arr1[i]+" ");
            i++;
         }else{
            System.out.print(arr2[j]+" ");
            j++;
         }
        }
         while(i<n){
            System.out.print(arr1[i]+" ");
            i++;
         }
         while(j<m){
            System.out.print(arr2[j]+" ");
            j++;
         }
    }
    public static void main(String[] args) {
        int arr1[]={10,20,45,90};
        int arr2[]={1,3,25,40,65};
        int arr3[]=new int[arr1.length+arr2.length];
        Merge(arr1, arr2);
        for(int i=0;i<arr1.length+arr2.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
