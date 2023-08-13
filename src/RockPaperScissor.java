import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        System.out.println("enter 1 for rock 2 for paper 3 for scissor");
        int number =sc.nextInt();
        int computer =rn.nextInt(3);
        if (number == computer){
            System.out.println("draw");
        }
        else if (number==1 && computer==3 || number==2 && computer==1 || number==3 && computer==2) {
            System.out.println("you win");

        }
        else{
            System.out.println("you loose");
        }
    }

}