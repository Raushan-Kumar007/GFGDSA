package matrix;

public class SearchElmIn2Dmat {
    // Naive approch 
    // static void search(int mat[][], int x){
    //     int R = mat.length;
    //     int C = mat.length;
    //     for(int i=0;i<R;i++){
    //         for(int j=0;j<C;j++){
    //             if(mat[i][j]==x){
    //                System.out.println("found at C"+i+","+j);
    //                return;
    //             }
    //         }
    //     }
    //     System.out.println("NotFound");
    // }
    // efficient Approch
    static void search(int mat[][], int x){
        int R = mat.length;
        int C = mat.length;
        int i=0, j=C-1;
        while(i<R && j>=0){
            if(mat[i][j]==x){
                System.out.println("found at C"+i+","+j);
                return;
            }else if(mat[i][j]>x)
            j--;
            else
            i++;
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int arr[][] = {{12,13,14,15},{20,21,22,23},{32,33,34,35},{44,45,46,47}};
        search(arr, 21);
    }
}
