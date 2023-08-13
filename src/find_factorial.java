import java.util.Scanner;

public class find_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be factorial");
        int number= sc.nextInt();
        int sum=1;
        for (int i=1; i<=number; i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
