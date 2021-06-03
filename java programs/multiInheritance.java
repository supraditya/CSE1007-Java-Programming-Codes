// Since Java does not support multiple class inheritance, we instead inherit multiple interfaces
// to get around the problem

interface First{
    public void first();
}
interface Second{
    public void second();
}
interface End extends First, Second{
    //This interface inherits the fields and methods of classes
    // First and Second
    public void end();   
}
public class multiInheritance{
    public static void main(String[] args)
    {
        // Creating object of interface End
        End obj=new End(){
            public void first()
            {
                System.out.println("This method has been inherited from class First");
            }
            public void second()
            {
                System.out.println("This method has been inherited from class Second");
            }
            public void end()
            {
                System.out.println("This method is local to the class 'End'");
            }
        };
        obj.first();
        obj.second();
        obj.end();
    }
}