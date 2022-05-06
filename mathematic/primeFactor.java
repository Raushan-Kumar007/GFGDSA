package mathematic;

public class primeFactor {
    public static void primeFactor(int n){
        if(n<=0)
        return ;
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if(n>1){
            System.out.print(n+" ");
            System.out.println();
        }
     
    }
    public static void main(String[] args) {
        int n = 250;
        primeFactor(n);
       
    }
}
