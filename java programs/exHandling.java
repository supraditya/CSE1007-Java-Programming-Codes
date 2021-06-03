import java.util.*;
public class exHandling{
    public static void main(String[] args) {
        int arr[]=new int[3];
        try {
            int a=arr[4];
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("The array index used is greater than the array length");
        }

        try {
            int b=5/0;
        } catch (ArithmeticException e2) {
            System.out.println("A number cannot be divided by zero.");
        }

        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your age");
            int a=sc.nextInt();
        } catch (InputMismatchException e3) {
            System.out.println("Age cannot be a string, must be a number.");
        }

        try {
            Parent obj1=new Parent();
            Child obj2=(Child)obj1;

        } catch (ClassCastException e) {
            System.out.println("You cannot type cast a parent class object with a child class object");
        }
    }
}
class Parent extends exHandling{
    void main()
    {
        System.out.println("Inside parent class");
    }
}
class Child extends Parent{
    void main()
    {
        System.out.println("Inside child class");
    }
}