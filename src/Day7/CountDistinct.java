package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CountDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n= sc.nextInt();
        SumOfAllPairs.takeInput(arr,n);
        int vis[]=new int[101];
        Arrays.fill(vis,0);
        int cd=0;
        for(int i=0;i<n;i++)
        {
            if(vis[arr.get(i)]==0)
            {
                cd++;
                vis[arr.get(i)]=-1;
            }
        }
        System.out.println("Distinct Elements in Array "+cd);
}}
