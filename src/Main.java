
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number");
//        int a = sc.nextInt();
//        System.out.println("enter second number");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("sum of the number is="+ sum);
        System.out.println("this programm is for calculating mark of cbse studen");
        Scanner sc = new Scanner(System.in);
        System.out.println("number in math out of 100");
        int a = sc.nextInt();
        System.out.println("number in physics out of 100");
        int b = sc.nextInt();
        System.out.println("number in chemistry out of 100");
        int c = sc.nextInt();
        System.out.println("number in Hindi out of 100");
        int d = sc.nextInt();
        System.out.println("number in english out of 100");
        int e = sc.nextInt();
        float percentage = (a+b+c+d+e)/5;
        System.out.println("total percentage is" + percentage);


    }
}