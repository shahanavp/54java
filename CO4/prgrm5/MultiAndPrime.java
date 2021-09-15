import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5 is : ");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " x 5 =" + (i * 5));
        }
    }
}

class Prime extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int lim;
        System.out.println();
        System.out.println("Enter the limit : ");
        lim = sc.nextInt();
        System.out.println("Prime numbers upto " + lim + " are : ");
        for (int i = 2; i <= lim; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}

public class MultiAndPrime {
    public static void main(String[] args) {
        Multiplication T1= new Multiplication();
        Prime T2=new Prime();

        T1.start();
        T2.start();
    }
}