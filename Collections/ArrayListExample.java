package Collections;

import java.util.*;

class Employee{
int id;
String name;
String department;

Employee(int id, String name, String department){
    this.id = id;
    this.name = name;
    this.department = department;
}

public String toString(){
    return "Employee{id=" + id + ", name=" + name + ", department=" + department + "'}";
}
}
public class ArrayListExample {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Karan", "Electrical"));
        employees.add(new Employee(102, "Kundan", "Software"));
        employees.add(new Employee(103, "Sopandeo", "Chemical"));

        for(Employee e: employees){
            System.out.println(e);
        }


    }
}
