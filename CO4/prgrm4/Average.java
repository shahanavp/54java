//Find the average of N positive integers, raising a user defined exception for each negative input
import java.util.Scanner;

class NegativeInputError extends Exception{
    int num;

    NegativeInputError(int n){
        num=n;
    }

    public String NegativeExp(){
        return "NegativeInputError["+num+"]";
    }

}

public class Average {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int lim,num;
            float sum=0;
            float avg=0;
            System.out.println("Enter the limit : ");
            lim=sc.nextInt();
            for (int i = 0; i < lim; i++) {
                System.out.println("Enter "+(i+1)+" th number");
                num=sc.nextInt();
                if (num < 0) {
                    throw new NegativeInputError(num);
                }else{
                    sum+=num;
                }
            }
            avg=sum/lim;
            System.out.println("Average is : "+avg);
        } catch (NegativeInputError e) {
            System.out.println("Negative numbers are not allowed!!!");
        }
    }    
}