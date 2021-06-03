import java.util.*;
// one abs class, 2 methods inside (one concrete one abstract (input/display)
//2 more classes, implement heirarchical inheritance from abstract class
abstract class absClass {
    public abstract double inputValues();
    void display(double z)
    {
        System.out.println("The area is " +z);
    }
}
class Rectangle extends absClass{
    public double inputValues()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double x=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double y=sc.nextDouble();
        double z=x*y;
        return z;
        
    }
}
class Triangle extends absClass{
    public double inputValues()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of the triangle");
        double x=sc.nextDouble();
        System.out.println("Enter the base length of the triangle");
        double y=sc.nextDouble();
        double z=0.5*x*y;
        return z;
    }
}
class Main{
    public static void main(String[] args)
    {
        Rectangle obj1=new Rectangle();
        double a=obj1.inputValues();
        obj1.display(a);

        Triangle obj2=new Triangle();
        double b=obj2.inputValues();
        obj2.display(b);
    }
}