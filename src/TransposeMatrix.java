import java.util.Scanner;

public class TransposeMatrix {
    static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix, int r, int c){
        int [][] ans = new int[c][r];
        for (int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of rows");
        int r = sc.nextInt();
        System.out.println("no of coloms");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("enter elements of matrix");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);
        System.out.println("transpose of matrix");
        int ans[][]= findTranspose(matrix, r,c);
        printMatrix(ans);

    }
}
