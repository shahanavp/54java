import java.util.Scanner;

class Employee {
    int Empid;
    String Name, Address;
    double Salary;

    Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Id : ");
        Empid = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Employee Name : ");
        Name = sc.nextLine();
        System.out.println("Enter the Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Employee Address : ");
        Address = sc.nextLine();
    }
}

class Teacher extends Employee {
    String Department;
    String Subjects_taught;

    Teacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Department : ");
        Department = sc.nextLine();
        System.out.println("Enter the Subject ");
        Subjects_taught = sc.nextLine();
        System.out.println();
    }

    void Display() {
        System.out.println("Employee Id : " + Empid);
        System.out.println("Employee Name : " + Name);
        System.out.println("Employee Salary : " + Salary);
        System.out.println("Employee Address : " + Address);
        System.out.println("Department : " + Department);
        System.out.println("Subjects : " + Subjects_taught);
        System.out.println();
    }
} 

public class Staff {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teachers : ");
        num = sc.nextInt();
        Teacher[] teacher = new Teacher[num];
        for (int i = 0; i < num; i++) {
            teacher[i] = new Teacher();
        }
        System.out.println("Details of Teachers : ");
        for (int i = 0; i < num; i++) {
            System.out.println();
            teacher[i].Display();
        }
    }

}