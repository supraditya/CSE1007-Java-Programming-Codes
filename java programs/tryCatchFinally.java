import java.util.*;
public class tryCatchFinally{
    public static void main(String[] args)
    {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two numbers");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            // if b is 0, the following line will throw ArithmeticException, which will be caught
            double c=a/b;
            System.out.println(c);

        } catch (ArithmeticException e1) {
            System.out.println("You cannot divide by zero.");
        }
        finally{
            System.exit(0);
        }

    }
}