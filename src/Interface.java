interface car{
    int speed=45;
    void applybreak(int decrement);
    void speedUp(int increment);
}
class mercedeesCar implements car{
    int a;
    int a1;
    @Override
    public void speedUp(int increment) {
        a=speed+increment;
        System.out.println("speeding....");
    }

    @Override
    public void applybreak(int decrement) {
        a1=speed-decrement;
        System.out.println("slowing down...");
    }
}
public class Interface {
    public static void main(String[] args) {
        mercedeesCar MC=new mercedeesCar();
        MC.speedUp(45);
        MC.applybreak(12);
        System.out.println(MC.a);
        System.out.println(MC.a1);
    }
}
