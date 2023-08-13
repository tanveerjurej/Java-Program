class circle{
    public int radius;
    circle(int r){
        System.out.println("this is acircle of parent class");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylindre extends circle {
    cylindre(int r, int h){
        super(r);
        System.out.println("i am cirlce constructor");
        this.height=h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

public class practiceConstructor {
    public static void main(String[] args) {
        circle cr= new circle(12);
        cylindre obj=new cylindre(12,15);
        System.out.println(obj.volume());
        System.out.println(cr.area());
    }
}
