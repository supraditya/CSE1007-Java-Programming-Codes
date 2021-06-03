import java.util.*;
public class arraySort {

    public int[] input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
class childSort extends arraySort{
    public int[] sort()
    {
        childSort obj=new childSort();
        int arr[]=obj.input();
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
class childDisplay extends childSort{
    public static void main(String[] args) {
        childDisplay obj=new childDisplay();
        int arr[]=obj.sort();
        System.out.println("Sorted array is ");
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}