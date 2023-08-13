import java.util.Scanner;
class Fact{
//    int sum=1;
//
//    public int factorial(int a){
//        if (a==0 || a==1){
//            System.out.println(1);
//        }
//        else{
//            sum=sum*a;
//            return sum;
//        }
//        retfactorial(a-1);
//
//    }
}

public class fibb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbr");
        int numb = input.nextInt();
//        int a=0;
//        int b=1;
//        for ( int i = 0 ; i<numb ; i++ ){
//            System.out.print(a);
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//        Fact factorials = new Fact();
//
//        System.out.println(factorials.factorial(numb));
        int sum=1;
        for (int i = numb; i>0; i--) {
            sum=sum*i;

        }
        System.out.println(sum);

    }
}
