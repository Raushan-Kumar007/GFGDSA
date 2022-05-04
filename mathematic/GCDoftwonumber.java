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
   /* public static  int GCD(int a, int b){
        while(a!=b){
            if(a>b)
            a = a-b;
            else
            b = b - a;
        }
        return a;
    }
    */
    // efficient solution of Eucledean Algorithm
    public static  int GCD(int a, int b){
        if(b==0)
        return a;
        else
        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        System.out.println(GCD(a, b));
        
    }
}
