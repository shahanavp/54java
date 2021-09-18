import java.util.Scanner;

class Fibonacci implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3, lim;
        System.out.println("Enter the limit for fibonacci  : ");
        lim = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i < lim; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Even implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int lim;
        System.out.println("Enter the limit for even : ");
        lim = sc.nextInt();
        for (int i = 1; i <= lim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class FibAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------");
        System.out.println("1.Fibonacci");
        System.out.println("2.Even");
        System.out.println("-----------");
        System.out.println("Enter your choice : ");
        int ch = sc.nextInt();
        if (ch == 1) {
            Fibonacci f1 = new Fibonacci();
            Thread t1 = new Thread(f1);
            t1.start();
        } else if (ch == 2) {
            Even e1 = new Even();
            Thread t2 = new Thread(e1);
            t2.start();
        } else {
            System.out.println("wrong choice!!!");
        }

    }
}