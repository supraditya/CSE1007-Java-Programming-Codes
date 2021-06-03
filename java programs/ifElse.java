
public class ifElse {
  public static void main(String[] args)
  {
    int x=5;
    if(x==5)
    {
        // This block is executed if x=5
        System.out.println("x is equal to 5");
    }
    else if(x<5)
    {
        // This block is executed is x<5 and if the first block is not executed instead
        System.out.println("x is less than 5");
    }
    else
    {
        // This block is executed only if neither of the above two blocks are executed
        System.out.println("x is neither equal to nor lesser than 5");
    }
  }  
}
