import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistPractice{
    public static void main(String[] args) {
        ArrayList<Integer>number = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            displayMenu();
            int user = input.nextInt();
            if (user==1){
                System.out.println("enter element");
                number.add(input.nextInt());
                System.out.println("added");
            } else if (user==2){
                System.out.println("enter number to be removed");
                int elementToRemove = input.nextInt();
                if (number.contains(elementToRemove)){
                    number.remove(Integer.valueOf(elementToRemove));
                    System.out.println("element removed");
                }else
                    System.out.println("number not found");

            } else if (user==3) {
                System.out.println(number);
            } else if (user==4) {
                System.out.println("good  bye love");
                break;
            }

        }
//        ArrayList<String>Words = new ArrayList<>();
//        System.out.println("enter number of words");
//        Scanner input = new Scanner(System.in);
//        int s = input.nextInt();
//        for (int i=0; i<s; i++){
//            String temp= input.next();
//            if(!Words.contains(temp))
//                Words.add(temp);
//        }
//        Collections.sort(Words);
//        System.out.println(Words);
    }
    private static void displayMenu(){
        System.out.println("1.Add an element");
        System.out.println("2.remove an element");
        System.out.println("3.display an element");
        System.out.println("4. exit");
        System.out.println();
        System.out.println("your choice:");


    }


}
