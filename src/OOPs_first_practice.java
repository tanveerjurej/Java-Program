/*class worker{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}

public class OOPs_first_practice {
    public static void main(String[] args){
        worker harry = new worker();
        harry.setName("code with harry");
        harry.salary=233;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    }


}*/
/*class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void callFriend(){
        System.out.println("calling friend");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
        }
public class OOPs_first_practice {
    public static void main(String[] args) {
        cellphone asus = new cellphone();
        asus.ring();
        asus.callFriend();
        asus.vibrate();
    }
}*/
class square{
    int side;
    int side2;
    public int area(){
        return side*side2;
    }
    public int perimeter(){
        return 2*side+2*side2;
    }
}
class triangle{
    int base;
    int perpendicular;
    int hypotaneous;
    public float area(){
        return 0.5f*base*perpendicular;
    }
    public int perimeter(){
        return base+perpendicular+hypotaneous;
    }
}
public class OOPs_first_practice {
    public static void main(String[] args) {
        square sq = new square();
        sq.side=3;
        sq.side2=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        triangle ar= new triangle();
        ar.base=15;
        ar.perpendicular=12;
        ar.hypotaneous=18;
        System.out.println    (ar.area());
        System.out.println(ar.perimeter());
    }
}
