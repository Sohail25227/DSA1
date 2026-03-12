package Day8;

import Day7.SumOfAllPairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        SumOfAllPairs.takeInput(arr,n);
        int vis[]=new int[n];
        Arrays.fill(vis,0);
        for(int i=0;i<n;i++)
        {   int count=0;
            if(vis[i]==0)
            {
                vis[i]=1;
                count++;
                for(int j=i+1;j<n;j++)
                {
                    if(arr.get(i) == arr.get(j))
                    {   vis[j]=1;
                        count++;
                    }
                }
                System.out.println(arr.get(i)+"-> "+count);
            }
        }
    }
}
