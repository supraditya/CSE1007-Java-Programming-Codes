import java.util.*;
public class arrayDiagSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int [3][3];
        System.out.println("Enter a 3x3 Matrix");
        int i,j, sum;
        sum=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                    sum=sum+arr[i][j];
            }
        }
        System.out.println("The sum of left diagonal elements of matrix is: "+sum);
        sc.close();

    }
}