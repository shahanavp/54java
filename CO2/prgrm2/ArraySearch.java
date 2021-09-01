//search an element in an array

import java.util.Scanner;

public class ArraySearch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        int elem;
        System.out.println("Enter the size of the Array : ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched : ");
        elem = sc.nextInt();

        for (int i = 0; i < size; i++) 
        {
            if (arr[i] == elem) 
            {
                System.out.println(elem + " found at position " + (i + 1));
                System.exit(0);
                ;
            }
        }
        System.out.println("Element not found");

    }

}