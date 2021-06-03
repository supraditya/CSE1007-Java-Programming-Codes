import java.util.*;
public class throwing {
    double div(double x, double y) throws ArithmeticException
    {
        if(y==0)
            throw new ArithmeticException();
        return x/y;
    }
    public static void main(String[] args) {
        throwing obj=new throwing();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to get the quotient");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        try {
            double b=obj.div(x,y);
            System.out.println(b);  
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by zero.");
        }
    }
}
