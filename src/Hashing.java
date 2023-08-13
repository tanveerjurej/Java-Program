
import java.util.HashMap;
import java.util.Scanner;


public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> attend = new HashMap<>();

        while (true){
            display();
            int user = sc.nextInt();

            if (user==1){
                System.out.println("enter the student detail");
                attend.put(sc.nextInt(), sc.nextLine());
                System.out.println("student detail added");

            }
            else if (user ==2 ) {
                System.out.println("which student you want to remove");
                int key = sc.nextInt();
                if (attend.containsKey(key)){
                    attend.remove(Integer.valueOf(key));
                }
                else {
                    System.out.println("wrong key");
                }
            } else if (user==3) {
                System.out.println(attend);

            }
            else {
                System.out.println("you have been out from student detail");
                break;
            }
        }
    }
    public static void display(){
        System.out.println("press 1 to add student detail");
        System.out.println("press 2 to remove student detail");
        System.out.println("press 3 to show all student detail");
        System.out.println("press 4 to backoff");

    }
}
