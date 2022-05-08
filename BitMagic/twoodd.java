package BitMagic;

public class twoodd {
// naive solution for two odd pair count with time complexity is O(n^2) and space complexity is O(n)
  /*  static void pairodd(int[] arr, int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j])
                  count++;
                }
                if(count % 2 != 0)
              System.out.println(arr[i]+" ");
            }
        }
    */ 
    // efficient way to find od appearing with timecomplexity is O(N) and sapce complexity is O(1)
    static void oddAppearing(int arr[], int n){
        int XOR = 0, res1 = 0,  res2 = 0;
        for(int i=0; i<n; i++){
            XOR = XOR ^ (XOR-1);
        }
        int sn = XOR & ~(XOR-1);
            for(int j=0; j<n; j++){
                if((arr[j] & sn) != 0)
                res1 = res1 ^ arr[j];
                else
                res2 = res2 ^ arr[j];
            }
          System.out.println(res1+" "+res2);
        }
    public static void main(String[] args) {
        int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;
        oddAppearing(arr, n);
    }
}
