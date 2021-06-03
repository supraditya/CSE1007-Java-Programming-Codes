// import java.util.*;
public class pattern 
{
    public static void main(String[] args)
    {
        int i,j,k,l;
        k=1;
        for(i=0;i<5;i++)
        {
            for(l=(5-i);l>0;l--)
                System.out.print(" ");
            for(j=1;j<=k;j++)
            {
                if(k!=9)
                {
                    if(j==1 || j==k)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                    System.out.print("*");

            }
            k=k+2;
            System.out.println();
        }
    }
    
}
