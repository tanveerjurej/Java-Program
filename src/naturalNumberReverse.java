import java.util.Scanner;

public class naturalNumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be print in reverse");
        int a = sc.nextInt();
        for (int i=a; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("natural number printed in reverse form");
    }
}
