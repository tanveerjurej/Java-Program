import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int a= sc.nextInt();
        int c=1;
        do{
            if(c%2==1 && c%c==0){
                System.out.println(c);
            }
            c++;
        }while(c<=a);

    }
}
