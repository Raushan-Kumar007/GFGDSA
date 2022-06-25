package Shorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void Merge(int arr1[], int arr2[]){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter array1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Enter array2");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("new array");
        Merge(arr1, arr2);
    }
}
