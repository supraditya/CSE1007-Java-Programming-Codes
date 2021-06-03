import aditya.*;
import aditya.subAditya.*;
import java.util.*;
public class packageDriver {
    public static void main(String[] args) {
        Add obj1=new Add();
        Calc obj2=new Calc();
        Mul obj3=new Mul();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();

        int sum=obj1.add(x,y);
        int pow=obj2.powerFour(x);
        int prod=obj3.mul(x, y);
        System.out.println("Sum="+sum);
        System.out.println("Fourth power of first number is "+pow);
        System.out.println("Product is "+prod);   
    }
}
