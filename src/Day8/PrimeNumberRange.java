package Day8;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int startRange=sc.nextInt();
        int endRange=sc.nextInt();
        for(int i=startRange;i<=endRange;i++)
        {
            int count=0;
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    ++count;
                }
            }
            if(count<2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
