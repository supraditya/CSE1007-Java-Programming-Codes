import java.util.*;
class Compare
{
    public static void main(String[] args)
    {
        // Outputs the second largest number of the three entered numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x=sc.nextInt();
        System.out.println("Enter the second number:");
        int y=sc.nextInt();
        System.out.println("Enter the third number:");
        int z=sc.nextInt();
        if((x>y && x<z) || (x>z && x<y))
        {
            System.out.println(x+" is the second greatest number");
        }
        else if((y>x && y<z) || (y>z && y<x))
        {
            System.out.println(y+" is the second greatest number");
        }
        else if((z>y && z<x) || (z>x && z<y))
        {
            System.out.println(z+" is the second greatest number");
        }
        sc.close();
    }
}