package mathematic;

public class count{
     
    /*        iterative approch
    public static int countDigit(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    */
    public static int countDigit(int n){
        
        if(n==0)
          return 0;
          return 1 + countDigit(n/10);
    }
    public static void main(String args[]) {
    int num = 789;
   System.out.println(countDigit(num));
       
}    
}