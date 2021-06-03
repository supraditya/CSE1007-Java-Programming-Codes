import java.util.*;
class Add extends Thread{
    int x,y;
    Add(int a, int b)
    {
        x=a;
        y=b;
    }
    public void run()
    {
        System.out.println("In thread 1 (Addition), Sum="+(x+y));
        try  
        {  
            Thread.sleep(500);  
        }catch(InterruptedException e){System.out.println(e);}        
    }
}
class Subtract extends Thread{
    int x,y;
    Subtract(int a, int b)
    {
        x=a;
        y=b;
    }
    public void run()
    {
        System.out.println("In thread 2 (Subtraction), Diff="+(x-y));
        try  
        {  
            Thread.sleep(500);  
        }catch(InterruptedException e){System.out.println(e);}  
    }
}
class Multiply extends Thread{
    int x,y;
    Multiply(int a, int b)
    {
        x=a;
        y=b;
    }
    public void run()
    {
        System.out.println("In thread 3 (Multiplication), Prod="+(x*y));
        try  
        {  
            Thread.sleep(500);  
        }catch(InterruptedException e){System.out.println(e);}  
    }
}
class Divide extends Thread{
    int x,y;
    Divide(int a, int b)
    {
        x=a;
        y=b;
    }
    public void run()
    {
        System.out.println("In thread 4 (Division), Quotient="+(x/y));
        try  
        {  
            Thread.sleep(500);  
        }catch(InterruptedException e){System.out.println(e);}  
    }
}
class Modulus extends Thread{
    int x,y;
    Modulus(int a, int b)
    {
        x=a;
        y=b;
    }
    public void run()
    {
        System.out.println("In thread 5 (Modulus), Remainder="+(x%y));
        try  
        {  
            Thread.sleep(500);  
        }catch(InterruptedException e){System.out.println(e);}  
    }
}
public class thread_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Thread th1=new Add(x,y);
        Thread th2=new Subtract(x,y);
        Thread th3=new Multiply(x,y);
        Thread th4=new Divide(x,y);
        Thread th5=new Modulus(x,y);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
