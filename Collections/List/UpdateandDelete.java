package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Q5. Update marks of student whose id is 101. Then remove student whose marks < 40.
// → Learn: .set(index, obj), .remove(), traversal logic.

/*
What I learned from this program:

1. How to create a List of custom objects (like Student) and add elements to it.
2. How to loop through a List using index-based for loop.
3. Use of students.size() → to get total number of elements in the List.
4. Use of students.get(index) → to access an element at a specific position.
5. How to update an object inside a List by:
     - Getting the object
     - Changing its fields
     - Setting it back using students.set(index, updatedObject)
6. How to remove elements from a List safely using Iterator to avoid ConcurrentModificationException.
7. Practical understanding of how List stores object references (changes in object reflect in the List).
8. Difference between reading, updating, and removing elements in a collection.
*/
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
        return "Student: {id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
}

public class UpdateandDelete {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Kundan", 55.3));
        students.add(new Student(102, "Karan", 80.3));
        students.add(new Student(103, "Shankar", 35.3));
        students.add(new Student(104, "Aman", 25.3));
        students.add(new Student(105, "Abdul", 95.3));

        System.out.println("Number of Students: ");
        for (Student s : students) {
            System.out.println(s);
        }

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);

            if (s.id == 101) {
                s.marks = 88;
                students.set(i, s);
                System.out.println("Updated marks of student whose id is 101: " + s);
            }

        }
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.marks < 40) {
                it.remove();
                System.out.println("Remove student whose marks < 40: "  + s);
            }

        }

    }
}
