package Collections.List;

import java.util.ArrayList;
import java.util.List;

// Q3. Create a class Student(id, name, marks) and add 5 students in a List<Student>. Print all students.
// → Learn: List of custom objects, how for-each works.
class Student{
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return "Student{id=" + id + ", name=" + name + ", Marks=" + marks + "'}";
    }
}
public class CustomObjectHandling {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Kundan", 40.55));
        students.add(new Student(11, "Karan", 45.55));
        students.add(new Student(13, "Shankar", 65.55));
        students.add(new Student(14, "Aman" , 75.55));
        students.add(new Student(15, "Sandesh", 85.55));

        System.out.println("Students Data: ");
        for(Student s : students){
            System.out.println(s);
        }
    }
}
