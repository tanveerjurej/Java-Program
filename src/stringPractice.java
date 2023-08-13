
import java.util.*;
//finding the spaces in string
public class stringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter third number");
        int c=sc.nextInt();
        if(a>b){
            if (a>c){
                System.out.println("a is the biggest");
            }
            else {
                System.out.println("c is the biggest");
            }

        }
        if (c>b){
            System.out.println("c is the biggest");
        }
        else {
            System.out.println("b is the biggest");
        }


    }
}