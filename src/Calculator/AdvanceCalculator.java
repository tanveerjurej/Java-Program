package Calculator;

import java.util.Scanner;

public class AdvanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr first number");
        int x = sc.nextInt();
        System.out.println("enetr second number");
        int y = sc.nextInt();

        Addition add = new Addition();
        Multiplication multi = new Multiplication();
        System.out.println("here is your addition");
        System.out.println(add.addition(x, y));
        System.out.println("here is your multiplication");
        System.out.println(multi.multiply(x,y));
    }
}
