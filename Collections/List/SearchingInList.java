package Collections.List;
// Q4. From above student list, print only those who scored above 80 marks.

import java.util.ArrayList;
import java.util.List;

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
        return "Student: {id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
}
public class SearchingInList {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Kundan", 40.55));
        students.add(new Student(11, "Karan", 45.55));
        students.add(new Student(13, "Shankar", 65.55));
        students.add(new Student(14, "Aman" , 75.55));
        students.add(new Student(15, "Sandesh", 85.55));

        System.out.println("Students scored above 80 marks : ");
        for(Student s : students){
            if(s.marks > 80){
                System.out.println(s);
            }
        }
        
    }
}
