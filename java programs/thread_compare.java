import java.util.*;
class thread_greater extends Thread {
    int x,y;
    thread_greater(int a, int b)
    {
        x=a;
        y=b;
    }
    
    public void run()
    {
        if(x>y)
            System.out.println(x+" is the greatest number");
        else if(x<y)
            System.out.println(y+" is the greatest number");

    }
}
class thread_smaller extends Thread {
    int x,y;
    thread_smaller(int a, int b)
    {
        x=a;
        y=b;
    }
    public void run()
    {
        if(x>y)
            System.out.println(y+" is the smallest number");
        else if(x<y)
            System.out.println(x+" is the smallest number");

    }
}
public class thread_compare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Thread th1=new thread_greater(x,y);
        Thread th2=new thread_smaller(x,y);
        th1.start();
        th2.start();

    }

}
