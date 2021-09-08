import java.util.Scanner;

interface Bill{
    void calculate();
}

class Invoice implements Bill{
    int Pid,Qty,Uprice,Total;
    String Pname;
    public void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product id of item ");
        Pid=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name of item ");
        Pname=sc.nextLine();
        System.out.println("Enter Quantity of item ");
        Qty=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Unit price of item ");
        Uprice=Integer.parseInt(sc.nextLine());
        Total=Qty*Uprice;    
    }
    public void PutData(){
        System.out.println("\t"+Pid+"\t\t"+Pname+"\t"+Qty+"\t\t"+Uprice+"\t\t"+Total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,Ono;
        int netA=0;
        String ddate;
        System.out.println("Enter Order Number : ");
        Ono=Integer.parseInt(sc.nextLine());
        System.out.println("Enter date(dd/MM/YYYY) : ");
        ddate=sc.nextLine();

        System.out.println("How many product you want to buy : ");
        n=Integer.parseInt(sc.nextLine());

        Invoice[] arr = new Invoice[n];
        for (int i = 0; i < n; i++) {
            arr[i]=new Invoice();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter detais of " + (i + 1) + " Product");
            arr[i].calculate();
        }
        System.out.println("\tOrder No. : "+Ono);
        System.out.println("\tDate : "+ddate);
        System.out.println("\tProduct Id"+"\tName"+"\tQuantity"+"\tunit price"+"\tTotal");
        System.out.println("________________________________________________________________________");
        for (int i = 0; i < n; i++) {
            arr[i].PutData();
        }
        System.out.println("________________________________________________________________________");
        for (int i = 0; i < n; i++) {
            netA=netA+arr[i].Total;
        }
        System.out.println("\t\t\t\t\t\t\tNet. Amount : "+netA);

    }
}