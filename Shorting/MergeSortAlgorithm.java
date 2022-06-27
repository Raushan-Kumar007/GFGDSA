package Shorting;

public class MergeSortAlgorithm {
    static void merge(int arr[], int l, int m, int h){
    
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];    
    }
    static void MergeSort(int arr[],int low,int high){
        int mid = low + (high-low)/2;
        if(high>low){
        MergeSort(arr, low, mid);
        MergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{10,5,30,15,7};
        int l=0,r=4;

        MergeSort(a,l,r);
        for(int x: a)
            System.out.print(x+" ");

    }
}
