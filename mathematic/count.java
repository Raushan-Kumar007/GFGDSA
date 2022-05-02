package mathematic;

public class count{
     public static int countDigit(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
     
    public static void main(String args[]) {
    int num = 789;
   System.out.println(countDigit(num));
       
}    
}