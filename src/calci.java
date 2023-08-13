import java.util.Scanner;

class cal{
    int r;
    public int add(int n , int n3){
        int a = n+n3;
        return a;
    }
    public int multiply(int a, int b){
        int m = a*b;
        return m;
    }
}

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        cal obj = new cal();
        int result = obj.add(n1,n2);
        System.out.println(result);
        int multi=obj.multiply(n1,n2);
        System.out.println(multi);
    }
}
