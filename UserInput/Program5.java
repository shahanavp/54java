//Java Program to print the largest element in an array.

import java.util.Scanner;

public class Program5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for (int i = 0; i < size; i++) {
            if(max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Large element in the array is : "+max);
    }
}

