package recursion;

public class subsets {
    static void Subset(String str,String curr,int i){
         
         if(i==str.length()){
             System.out.print(curr);
             return;
         }
         Subset(str, curr, i+1);
         Subset(str, curr+str.charAt(i), i+1);
    }
    public static void main(String[] args) {
        String str = "ABC";
         Subset(str, " ", 0);
    }
}
