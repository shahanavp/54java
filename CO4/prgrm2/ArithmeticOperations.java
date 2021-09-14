/*Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic
operations. Test the package by implementing all operations on two given numbers.*/
package Arithmetic;

import java.util.Scanner;

interface Operation{
    void Addition();
    void Substraction();
    void Multiplication();
    void Division();
}

class Answer implements Operation{
    Scanner sc=new Scanner(System.in);
    double a,b,ans;
    public void Addition(){
        System.out.println("-----Addition-----");
        System.out.println("Enter First Number : ");
        a=sc.nextDouble();
        System.out.println("Enter Second Number : ");
        b=sc.nextDouble();
        ans=a+b;
        System.out.println("Sum of "+a+" and "+b+" is : "+ans);   
        System.out.println();
    }
    
    public void Substraction(){
        System.out.println("-----Substraction-----");
        System.out.println("Enter First Number : ");
        a=sc.nextDouble();
        System.out.println("Enter Second Number : ");
        b=sc.nextDouble();
        ans=a-b;
        System.out.println("Diffrence between "+a+" and "+b+" is : "+ans);   
        System.out.println();
    }

    public void Multiplication(){
        System.out.println("-----Multiplication-----");
        System.out.println("Enter First Number : ");
        a=sc.nextDouble();
        System.out.println("Enter Second Number : ");
        b=sc.nextDouble();
        ans=a*b;
        System.out.println(a+" Multiplied by "+b+" is : "+ans);  
        System.out.println(); 
    }

    public void Division(){
        System.out.println("-----Division-----");
        System.out.println("Enter First Number : ");
        a=sc.nextDouble();
        System.out.println("Enter Second Number : ");
        b=sc.nextDouble();
        ans=a/b;
        System.out.println(a+" Divided by "+b+" is : "+ans);   
        System.out.println();
    }
}

public class ArithmeticOperations {
    public static void main(String[] args) {
        Answer ans=new Answer();
        ans.Addition();
        ans.Substraction();
        ans.Multiplication();
        ans.Division();
    }
}