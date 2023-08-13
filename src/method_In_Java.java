public class method_In_Java {
    //we use void in method and we dont need return by using it
    static int additon(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=15;
        int b=25;
        int c;
        c = additon(a,b);
        int a1=25;
        int b1=10;
        int c1;
        c1 = additon(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
