package mathematic;

public class convertCelciousToFaran {
    static int celciousToFaran(int C){
        int f = ((C*9)/5)+32;
        return f;
    }
    public static void main(String[] args) {
        int C = 32;
       System.out.println(celciousToFaran(C));
    }
}
