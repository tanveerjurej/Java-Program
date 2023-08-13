
import java.util.Scanner;

public class practice_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of subjects");
        int size= sc.nextInt();
        int marks[] = new int[size];
        System.out.println("enter number got in the subject");

        for (int i=0; i<size; i++) {
             marks[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            if (marks[i]>=80){
                System.out.println("passed with 1st class with honour");
            } else if (marks[i]>=60) {
                System.out.println("passed with 1st class");
            }
            else if (marks[i]>=40){
                System.out.println("passed with second class");
            }
            else {
                System.out.println("failed "+ marks[i]);
            }
        }
        int sum=0;
        for (int i=0; i<size; i++){
            sum=sum+marks[i];
        }
        System.out.println(sum+" thats all you have got");

    }



}
