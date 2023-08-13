class Student{
    int rollno;
    String name;
    int marks;
}

public class StudentDetail{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno=1;
        s1.marks=65;
        s1.name = "tanveer";

        s2.rollno=2;
        s2.marks=69;
        s2.name = "marwan";

        s3.rollno=3;
        s3.marks=75;
        s3.name = "jasim";
        Student[] std = new Student[3];
        std [0] = s1;
        std [1] = s2;
        std [2] = s3;
        for ( Student n : std)
        {
            System.out.println(n.name + " : " + n.rollno);
        }
    }
}



