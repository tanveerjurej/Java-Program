class Employee{
    int id;
    String name;

    public void printdetails(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee tanveer = new Employee();
        tanveer.id=01;
        tanveer.name="Tanveer";

        Employee myself=new Employee();
        myself.id=05;
        myself.name="whatever";

        tanveer.printdetails();
        myself.printdetails();
    }

}
