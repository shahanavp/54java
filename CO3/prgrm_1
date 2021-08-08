import java.util.Scanner;

class Shape{
    float x;
    Shape(float a){
        x=a;
    }
}

class Square extends Shape{
    Square(float s){
        super(s);
    }
    void Area(float x){
        System.out.println("The area of Square is : "+(x*x));
    }
}

class Rectangle extends Shape{
    float y;   
    Rectangle(float l,float b){
        super(l);
        y=b;
    }
    void Area(float x,float y){
        System.out.println("The area of Rectangle is : "+(x*y));
    }
}

class Circle extends Shape{
    Circle(float r){
        super(r);
    }
    void Area(double x){
        double z=Math.PI*x*x;
        System.out.println("The area of the Circle is : "+z);
    }
}

public class Overload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float SqSide;
        float Length;
        float Breadth;
        float Radious;

        System.out.println("Enter the Side of the Square : ");
        SqSide=sc.nextFloat();
        Square p=new Square(SqSide);

        System.out.println("Enter the Length of the Reactangle : ");
        Length=sc.nextFloat();
        System.out.println("Enter the Breadth of the Rectangle : ");
        Breadth=sc.nextFloat();
        Rectangle lb=new Rectangle(Length, Breadth);

        System.out.println("Enter the Radious of the Circle : ");
        Radious=sc.nextFloat();
        Circle r=new Circle(Radious);

        p.Area(SqSide);
        lb.Area(Length, Breadth);
        r.Area(Radious);
    }
}
