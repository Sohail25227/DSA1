package Day8;

import Day7.SumOfAllPairs;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstndLastIndex {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Enter Size Of Array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        SumOfAllPairs.takeInput(arr,n);
        int First_Index=-1;
        int Last_Index=-1;
        System.out.println("Enter Number u want ");
        int p=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr.get(i)==p){
                First_Index=i;
                break;
            }
        }
        for(int k=arr.size()-1;k>0;k--)
        {
            if(arr.get(k)==p){
                Last_Index=k;
                break;
            }
        }
        System.out.println("First And Last Index of Element "+p+" is "+First_Index+" "+Last_Index);
    }

}
