import java.util.*;
  
public class linkedListCollection{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll
            = new LinkedList<Integer>();
        while(true)
        {
            System.out.println("1. Add an element to the List");
            System.out.println("2. Remove an element from the List");
            System.out.println("3. Display linked list");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int x=sc.nextInt();
            int flag1=0;
            int flag=0;
            switch(x)
            {
                case 1:
                    // Adding an element to the list
                    System.out.println("Enter the element to be added");
                    int a=sc.nextInt();
                    ll.addLast(a);
                break;
                case 2:
                    // Removing an element from the list
                    System.out.println("Enter the element to be removed");
                    int b=sc.nextInt();
                    for (int i = 0; i < ll.size(); i++) {
    
                        // Extracting each element in
                        // the Linked List
                        int llElement = ll.get(i);
            
                        // Checking if the extracted element is equal to
                        // the element to be searched
                        if (llElement == b) 
                        {
                            ll.remove(i);
                            flag1++;
                            break;
                        }
                    }
                    if(flag1==0)
                    {
                        System.out.println("Element not found");
                    }
                    break;
                case 3:
                    System.out.println(ll);
                    break;
                
                case 4:
                    flag=1;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if(flag==1)
            {
                break;
            }
        }
    }
}
