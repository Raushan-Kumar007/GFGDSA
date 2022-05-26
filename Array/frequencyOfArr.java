package Array;

public class frequencyOfArr {
    // time Complexity is theta(n)
    static void FrequencyOfArray(int[] arr){
        int n = arr.length;
        int frequency = 1;
        int i = 1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                frequency++;
                i++;
            }
            System.out.print(arr[i-1]+" "+frequency+"\n");
            i++;
            frequency = 1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {40,50,50,50,60,60,70,70,70,80,80,80};
        FrequencyOfArray(arr);
    }
}
