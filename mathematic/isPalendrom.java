package mathematic;

public class isPalendrom {
    public static boolean isPelNum(int n){
        int rev = 0;
        int temp = n;
        while (temp !=0) {
            int lastdigit = temp % 10; // remainder
            rev = (rev*10)+lastdigit;
            temp = temp/10; //quotent
        }
        return (rev==n);
    }
    
    public static void main(String[] args) {
        int num = 121;
        if (isPelNum(num)==true)
        System.out.println("yes : it's palindrom");
        else
        System.out.println("No : it's not a palindrom");
    }
}
