package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class OwnCollection {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Kundan", 88.5));
        students.add(new Student(2, "Karan", 89.3));
        students.add(new Student(3, "Kiran", 91.3));

        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        Student topStudent = students.get(0);
        for(Student s : students){
            if(s.marks > topStudent.marks){
                topStudent = s;
            }
        }

        System.out.println("\nTop Scorer:");
        System.out.println(topStudent);

        students.sort(Comparator.comparingDouble(st -> st.marks));
        System.out.println("\nSorted by Marks (Low to High):");
        for (Student s : students) {
            System.out.println(s);
        }
    }

}
