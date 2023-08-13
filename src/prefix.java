import java.util.Scanner;

public class prefix {
    static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++);{

        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr element of the matrix");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("numbers");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        printArr(arr);

    }
}
