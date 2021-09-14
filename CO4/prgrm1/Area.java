package Graphics;

import java.util.Scanner;

interface Areas{
    void area();
}

class Rectangle implements Areas{
    public void area(){
        Scanner sc=new Scanner(System.in);
        double l,b,area;
        System.out.println("Enter the Length of Rectangle: ");
        l=sc.nextDouble();
        System.out.println("Enter the Breadth of Rectangle : ");
        b=sc.nextDouble();
        area=l*b;
        System.out.println("Area of the Rectangle is : "+area);   
    }
}

class Triangle implements Areas{
    public void area(){
        Scanner sc=new Scanner(System.in);
        double b,h,area;
        System.out.println("Enter the Base of Triangle : ");
        b=sc.nextDouble();
        System.out.println("Enter the Height of Triangle : ");
        h=sc.nextDouble();
        area=((b*h)/2);
        System.out.println("Area of the Trinagle is : "+area);   
    }
}

class Square implements Areas{
    public void area(){
        Scanner sc=new Scanner(System.in);
        double s,area;
        System.out.println("Enter the side of Square : ");
        s=sc.nextDouble();
        area=s*s;
        System.out.println("Area of the Square is : "+area);   
    }
}

class Circle implements Areas{
    public void area(){
        Scanner sc=new Scanner(System.in);
        double r,area;
        System.out.println("Enter the Radious of Circle : ");
        r=sc.nextDouble();
        area=Math.PI*r*r;
        System.out.println("Area of the Circle is : "+area);   
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        Triangle Tri=new Triangle();
        Square Squ=new Square();
        Circle cir=new Circle();

        rec.area();
        Tri.area();
        Squ.area();
        cir.area();
    }
}