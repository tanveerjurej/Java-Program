import java.util.Scanner;

public class arrayadd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no element in rows");
        int row = sc.nextInt();
        System.out.println("enter no element in column");
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        System.out.println("enter elements");
        for ( int i=0; i<row; i++){
            for ( int j = 0; j<column; j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        for ( int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(" " + arr[i][j]);

            }
            System.out.println();
        }
    }

}
