package Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllPairs {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        takeInput(arr,n);
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum= arr.get(i)+arr.get(j);
                System.out.println("sum of "+ arr.get(i) +" and "+ arr.get(j)+"= "+sum);
            }
        }
    }


    public static void takeInput(ArrayList<Integer> arr,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++) {
            arr.add(i, sc.nextInt());
        }
    }
}
