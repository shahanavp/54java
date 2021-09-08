/*Create an interface having prototypes of functions area() and perimeter(). Create two
classes Circle and Rectangle which implements the above interface. Create a menu driven
program to find area and perimeter of objects.*/

import java.util.Scanner;

interface Prot{
    void area();
    void perimeter();
}

class Circle implements Prot{
    double rad;
    public void getcdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radious of the circle : ");
        rad=sc.nextDouble();
    }
    public void area(){
        System.out.println();
        System.out.println("The Area of the Circle is : "+Math.PI*rad*rad);
    }

    public void perimeter(){
        System.out.println("The Perimeter of the Circle is : "+2*Math.PI*rad);
        System.out.println();
    }
}

class Rectangle implements Prot{
    double len;
    double bred;
    public void getrdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle : ");
        len=sc.nextDouble();
        System.out.println("Enter the breadth of the Rectangle : ");
        bred=sc.nextDouble();
    }
    
    public void area(){
        System.out.println();
        System.out.println("The Area of the Rectangle is : "+(len*bred));
    }

    public void perimeter(){
        System.out.println("The Perimeter of the Rectangle is : "+(2*(len+bred)));
        System.out.println();
    }
}

public class Menu {
    public static void main(String[] args) {
        Circle ob1=new Circle();
        Rectangle ob2=new Rectangle();

        Scanner sc=new Scanner(System.in);

        boolean i=true;
        int ch;
        while(i){
            System.out.println();
            System.out.println("-----Area & Perimeter-----");
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Exit");
            System.out.println();
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                ob1.getcdata();
                ob1.area();
                ob1.perimeter();
                break;

                case 2:
                ob2.getrdata();
                ob2.area();
                ob2.perimeter();
                break;

                case 3:
                i=false;
                break;

            
                default:
                System.out.println();
                System.out.println("Enter a valid Choice!!!");
                break;
            }

        }

    }
}