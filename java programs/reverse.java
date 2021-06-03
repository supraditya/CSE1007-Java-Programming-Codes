import java.util.*;
public class reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int nn=0;
        while(n!=0)
        {
            int r=n%10;
            nn=(nn*10)+r;
            n=n/10;
        }
        System.out.println("Reversed number is: "+nn);
        sc.close();
    }
    
}
