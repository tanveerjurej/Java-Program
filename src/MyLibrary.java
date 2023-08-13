import java.util.ArrayList;
import java.util.Scanner;

public class MyLibrary {
    public static void main(String[] args) {
        ArrayList<String>library = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            display();
            System.out.println();


        }
    }
    public static void display(){
        System.out.println("press 1 for add book in library");
        System.out.println("press 2 for remove book in library");
        System.out.println("press 3 for search book in library");
        System.out.println("press 4 for display book in library");
        System.out.println("press 5  to return from library");


    }
}
