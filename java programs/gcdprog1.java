import java.util.*;
interface gcd{
    public abstract int computeGCD(int num1, int num2);
    
}
class approach1 implements gcd
{
    public int computeGCD(int num1, int num2)
    {
        // Euclidean algorithm
        if (num1 == 0)
            return num2;
         
        return computeGCD(num2%num1, num1);
    }
}
class approach2 implements gcd
{
    public int computeGCD(int num1, int num2)
    {
        // Factoring approach
        int min=1;
        int gcdval=1;
        if(num1>num2)
            min=num2;
        else
            min=num1;
        System.out.println("Common factors (using factoring method) are: ");
        for(int i=1;i<=min;i++)
        {
            if(num1%i==0 && num2%i==0)
                if(i>gcdval)
                {
                    System.out.print(i+",");
                    gcdval=i;
                }

        }
        System.out.println();
        return gcdval;
    }
}
public class gcdprog1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        approach1 obj1=new approach1();
        approach2 obj2=new approach2();
        System.out.println("Enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans1=obj1.computeGCD(a, b);
        System.out.println("Approach 1 using Euclidean algorithm= "+ans1);
        int ans2=obj2.computeGCD(a, b);
        System.out.println("Approach 2 using factoring= "+ans2);
        sc.close();
    }

}