package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=arraySum(arr);
        System.out.println("sum of the values of array "+ sum);
    }
    public static int arraySum(int[] arr){
     int sum = 0;
     for(int val:arr)
     {
         sum+=val;
     }
        return sum;
    }
}
