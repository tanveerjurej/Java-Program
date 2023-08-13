import java.util.Scanner;


public class pascal_triangle {
    static void PrintMatrix (int[][] matrix){
        for ( int i=0; i< matrix.length; i++ ){
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] triangle(int n){
        int pascal[][] = new int[n][];
        for (int i=0; i<n; i++){
            pascal[i]=new int[i+1];
            pascal[i][0]=pascal[i][i]=1;
            for (int j=1; j<i; i++){
                pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];
            }

        }
        return pascal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n = sc.nextInt();
        int[][] pascal = triangle(n);
        PrintMatrix(pascal);

    }
}
