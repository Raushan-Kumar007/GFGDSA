package mathematic;

public class GCDoftwonumber {
    public static  int GCD(int a, int b){
        int res = Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
            break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(GCD(a, b));
        
    }
}
