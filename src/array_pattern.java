import java.util.Scanner;
class printingPress{
    public void  matrix(int a, int b){
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (i>=j){
                    System.out.print(" "+1);
                }
                else {
                    System.out.print(" "+0);
                }
            }
            System.out.println();
        }
    }

}

public class array_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a square arrary");
        int n = sc.nextInt();
        int m= sc.nextInt();
        int arr[][]=new int[n][m];
        printingPress inh = new printingPress();
        inh.matrix(n,m);


    }
}
