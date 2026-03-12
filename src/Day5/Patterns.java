package Day5;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Enter value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//pattern1
        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(0);
            }
            System.out.println();
        }
        //pattern2
        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(0);
            }
            System.out.println();
        }
        //pattern3
        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        //pattern4
        char a='A';
        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

        //pattern5
        for (int i=0;i<=n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print((char)(65+n-j-1));
            }
            System.out.println();
        }

        //pattern6
        for (int i=0;i<=n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print((char)(65+n-j-1));
            }
            System.out.println();
        }

        //pattern7
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

        //pattern8
        for (int i=1;i<=n;i++)
        {
            for (int k=n-i;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }

        //pattern9
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println( );
        }
        //pattern10
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int count=i;
            for(int j=i;j>=1;j--)
            {
                System.out.print(count++);
            }
            --count;
            for(int j=2;j<=i;j++)
            {
                System.out.print(--count);
            }
            System.out.println( );
        }
        //pattern11
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

        //pattern12
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        //patter13
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

        //patter14
        for(int i=1;i<=n;i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
                System.out.print(j);
                if (j == i) {
                    continue;
                }
                System.out.print("+");
            }

            System.out.println("=" + sum);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 2 * i + 1; j < 2 * n; j += 2) {
                System.out.print(j + " ");
            }
            int a1 = 1;
            for (int k = 0; k < i; k++) {
                System.out.print(a1 + " ");
                a1 += 2;
            }
            System.out.println();
        }

    }


}
