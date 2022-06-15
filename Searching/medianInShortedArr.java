package Searching;

public class medianInShortedArr {
    static double median(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int left = 0;
        int right = n;
        while(left<=right){
            int i1 = (left+right)/2;
            int i2 = (n+m+1)/2-i1;
            int min1 = (i1==n)?Integer.MAX_VALUE:arr1[i1];
            int max1 = (i1 == 0)?Integer.MIN_VALUE:arr1[i1-1];
            int min2 = (i2==m)?Integer.MAX_VALUE:arr2[i2];
            int max2 = (i2==0)?Integer.MIN_VALUE:arr2[i2-1];
            if(max1<=min2  && max2<=min1){
                if((n+m)%2==0)
                return (double)(Math.max(max1,max2)+Math.min(min1,min2))/2;
                else
                return (double)Math.max(max1,max2);
            }
            else if(max1 > min2)
            right = i1-1;
            else{
                left=i1+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50},  arr2[] = {5, 15, 25, 35, 45};
        System.out.println(median(arr1, arr2));
    }
}
