package BitMagic;

public class countSetbit {
    static int countSet(int n){
        int count = 0;
        while(n!=0){
            if(n%2!=0)
            count++;
            n = n/2;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 9;
       System.out.println(countSet(n));
    }
}
