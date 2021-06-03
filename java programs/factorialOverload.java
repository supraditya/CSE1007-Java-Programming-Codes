import java.util.*;
public class factorialOverload {

    // Function with no arguments
    void factorial()
    {
        System.out.println("In function 1,");
        int x=5;
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial for x=5 is "+fact);
    }

    // Function with only one argument
    void factorial(int x)
    {
        System.out.println("In function 2,");
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial for entered value is "+fact);
    }

    // Function with 2 arguments
    void factorial(int x, int y)
    {
        System.out.println("In function 3,");
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial for entered value is "+fact);
        if(fact==y)
            System.out.println("x! is equal to y");
        else
            System.out.println("x! is not equal to y");
        
    }
    public static void main(String[] args)
    {
        factorialOverload obj=new factorialOverload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for x and y:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.factorial();
        obj.factorial(a);
        obj.factorial(a,b);
        sc.close();
    }
}
