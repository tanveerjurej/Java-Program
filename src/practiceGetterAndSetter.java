class cylinder{
    private int radius;
    private int height;
    public void cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public float surfaceArea(){
        return 3.14f*radius*radius;
    }
}
class rectangle{
    private int length;
    private int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}
public class practiceGetterAndSetter {
    public static void main(String[] args) {
       /* cylinder sclndr=new cylinder();
        sclndr.setHeight(12);
        sclndr.setRadius(10);
        System.out.println(sclndr.getHeight());
        System.out.println(sclndr.getRadius());
        */
        /*cylinder sclndr = new cylinder();
        sclndr.setRadius(12);
        sclndr.setHeight(5);
        System.out.println(sclndr.surfaceArea();
         */




    }
}
