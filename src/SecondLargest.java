import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of element");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter "+ n + " element");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.print(" " + arr[i]);
        }


    }
}
