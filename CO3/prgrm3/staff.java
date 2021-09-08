import java.util.Scanner;

class Person {
    String Name, Gender, Address;
    int Age;

    Person() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person Name : ");
        Name = sc.nextLine();
        System.out.println("Enter Person Gender : ");
        Gender = sc.nextLine();
        System.out.println("Enter Person Address : ");
        Address = sc.nextLine();
        System.out.println("Enter Person Age : ");
        Age = Integer.parseInt(sc.nextLine());

    }
}

class Employee extends Person {
    int Empid;
    String Company_Name, Qualification;
    double Salary;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        Empid = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Person Company Name : ");
        Company_Name = sc.nextLine();
        System.out.println("Enter Person Qualification : ");
        Qualification = sc.nextLine();
        System.out.println("Enter Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());

    }
}

class Teacher extends Employee {
    String Subject, Department;
    int TeacherId;

    Teacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher ID : ");
        TeacherId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Teacher Departmenet : ");
        Department = sc.nextLine();
        System.out.println("Enter Teacher Subject : ");
        Subject = sc.nextLine();
        System.out.println();
    }

    void Display() {
        System.out.println("Person Name : " + Name);
        System.out.println("Person Gender : " + Gender);
        System.out.println("Person Address : " + Address);
        System.out.println("Person Age : " + Age);
        System.out.println(" Employee ID : " + Empid);
        System.out.println("Comapny Name : " + Company_Name);
        System.out.println("Employee Qualification : " + Qualification);
        System.out.println("Employee Salary : " + Salary);
        System.out.println("Teacher ID : " + TeacherId);
        System.out.println("Teacher Department : " + Department);
        System.out.println("Teacher Subject : " + Subject);
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