/*Create classes Student and Sports. Create another class Result inherited from Student and
Sports. Display the academic and sports score of a student.*/

import java.util.Scanner;
interface ResultInt{
    void res();
}

class Student implements ResultInt{
    int id,age,std,acres;
    String name;
    public void StudentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student id : ");
        id=Integer.parseInt(sc.nextLine());
        System.out.println("Enter student name : ");
        name=sc.nextLine();
        System.out.println("Enter student Age : ");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Student class : ");
        std=Integer.parseInt(sc.nextLine());
        System.out.println("Enter academic Result in % : ");
        acres=Integer.parseInt(sc.nextLine());

    }
    public void res(){
        System.out.println("---------------");
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Age : "+age);
        System.out.println("Student Class : "+std);
        System.out.println("Academic Result : "+acres+"%"); 
    }
}

class Sports implements ResultInt{
    int sres;
    String Sname;
    public void SportsDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your participation sports name : ");
        Sname=sc.nextLine();
        System.out.println("Enter sports Result in % : ");
        sres=Integer.parseInt(sc.nextLine());
    }
    public void res(){
        System.out.println("Participation sports name : "+Sname);
        System.out.println("Sports score : "+sres+"%");
    }
}

public class Result {
    public static void main(String[] args) {
        Student ob1=new Student();
        Sports ob2=new Sports();
        ob1.StudentDetails();
        ob2.SportsDetails();
        ob1.res();
        ob2.res();
    }
}