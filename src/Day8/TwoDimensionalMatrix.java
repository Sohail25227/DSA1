package Day8;

public class TwoDimensionalMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{1,2,3,3},{3,2,3,1},{2,4,5,7}};
        int row= arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("left diagnoal");

        //print left diagnoal
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            { if(i==j)
            {
                System.out.print(arr[i][j]+" ");
            }
            }
        }
        System.out.println();

        System.out.println("right diagnoal");

        //print right diagnoal
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            { if(i+j==row-1)   //and i!=j if want non repeating
            {
                System.out.print(arr[i][j]+" ");
            }
            }
        }
        System.out.println();
        // print boundary elements
        System.out.println("print boundary");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            { if(i==0 || j==0 || i==row-1 || j==col-1)
            {
                System.out.print(arr[i][j]+" ");
                if(j==0 && i!=0 && i!=row-1)
                {
                    System.out.print("  ");
                }
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }

        //print elements in z form
        for(int i=0;i<row;i++){
            System.out.print(arr[0][i]+" ");
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            { if(i+j==row-1 && i!=j & j!=col-1)   //and i!=j if want non repeating
            {
                System.out.print(arr[i][j]+" ");
            }
            }
        }

        for(int k=1;k<row;k++){
            System.out.print(arr[row-1][k]+" ");
        }


        //transpose of matrix
        System.out.println();
        System.out.println("transpose of matrix");
        int [][]arr2=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr2[i][j]=arr[j][i];
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
