package mathematic;

public class GCDoftwonumber {
    // time complexity = O(min(a,b))
   /* public static  int GCD(int a, int b){
        int res = Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
            break;
            }
            res--;
        }
        return res;
    }
    */
    // Eucledean Algorithm (let 'b' be smaller than 'a' GCD(a,b)=GCD(a-b, b))
    public static  int GCD(int a, int b){
        while(a!=b){
            if(a>b)
            a = a-b;
            else
            b = b - a;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(GCD(a, b));
        
    }
}
