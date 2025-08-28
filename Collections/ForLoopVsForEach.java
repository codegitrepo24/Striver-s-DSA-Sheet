package Collections;

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
public class ForLoopVsForEach {
    public static void main(String[] args){
        Employee[] employees = {
            new Employee(1,"Karan","Electrical"),
            new Employee(1,"Kundan","Software"),
            new Employee(1,"Sopandeo","Chemical")

        };

        System.out.println("=====Using For Loop=====");
        for(int i=0;i<employees.length;i++){
            System.out.println("Index" + i + ": " +employees[i]);
        }

        System.out.println("\n Using For Each loop");
        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
