class MyEmployee{
    int id;
    String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class constructor {
    public static void main(String[] args) {
        MyEmployee tanveer = new MyEmployee();
        tanveer.setId(45);
        tanveer.setName("tanveer is learning");
        System.out.println(tanveer.getId());
        System.out.println(tanveer.getName());

    }
}
