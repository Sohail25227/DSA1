package Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenIndex {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int eSum=0,oSum=0;
        for(int i=0;i<n;i++)
        {
            arr.add(i,sc.nextInt());
            if(i%2==0) {
                eSum += arr.get(i);
            }else {
                oSum+=arr.get(i);
            }
        }
        System.out.println("Even idx Sum " +eSum +" Odd idx Sum "+oSum);



    }
}
