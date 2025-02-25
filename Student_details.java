import java.util.Scanner;
public class Student_details {
    Scanner inputnum=new Scanner(System.in);
    Scanner inputstring=new Scanner(System.in);
    String name ,course;
    int roll;
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Course: "+course);
        System.out.println("Roll No.: "+roll);
    }
    public void insert(){
        System.out.print("Enter name of student: ");
        name=inputstring.nextLine();
        System.out.print("Enter course: ");
        course=inputstring.nextLine();
        System.out.print("Enter roll no.: ");
        roll= inputnum.nextInt();
    }
    public static void main(String[] args) {
        Student_details std_1=new Student_details();
        Student_details std_2=new Student_details();
        System.out.println("Enter the details of first student");
        std_1.insert();
        System.out.println("Enter the details of second student");
        std_2.insert();
        System.out.println("Details of both student are..");
        std_1.display();
        std_2.display();

    }
}
