import java.util.*;
interface arrayInsert{
    public static int[] insert(int arr[], int val, int n)
    {
        int arr1[]=new int[arr.length+1];
        arr1[n]=val;
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1.length-i-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        return arr1;
    }
}
interface displayArray{
    static void display(int arr[])
    {
        System.out.println("The array sorted after insertion is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class arrayInsertion implements arrayInsert, displayArray{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x;
        System.out.println("Enter the length of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array in sorted order");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be inserted");
        x=sc.nextInt();
        int arr2[]=arrayInsert.insert(arr,x,n);
        displayArray.display(arr2);
    }
}