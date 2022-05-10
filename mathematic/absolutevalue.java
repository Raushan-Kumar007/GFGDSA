package mathematic;

public class absolutevalue {
    static int absvalue(int n){
        if(n<0)
        return -1*n;
        else
        return n;
    }
    public static void main(String[] args) {
       int n = -32;
       System.out.println(absvalue(n));
    }
}
