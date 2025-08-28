package Collections.List;
// Q6. Sort students based on marks (ascending). Then sort by name (alphabetically).
// → Learn: Collections.sort() with Comparator.

import java.util.*;

class Student{
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks){
        this.id = id;
        this.name=name;
        this.marks = marks;
    }

    public String toString(){
        return "Student: {id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
}
public class Sorting {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Kundan", 40.55));
        students.add(new Student(11, "Karan", 45.55));
        students.add(new Student(13, "Shankar", 65.55));
        students.add(new Student(14, "Aman" , 75.55));
        students.add(new Student(15, "Sandesh", 85.55));

        Collections.sort(students, new Comparator<Student>() {
    public double compare(Student s1, Student s2) {
        if (s1.marks != s2.marks) {
            return s1.marks - s2.marks; 
        } else {
            return s1.name.compareTo(s2.name);
        }
    }
});
            
        for(Student s : students){
            System.out.println(s);
        }
    }
}
