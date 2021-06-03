import java.util.*;
/**
 * stringHandling
 */
public class stringHandling {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String x=sc.nextLine();

        // 1. Substring method
        System.out.println(x.substring(1));
        System.out.println(x.substring(1,3));

        // 2. Contains method
        System.out.println(x.contains("adi"));

        // 3. String join
        String y=String.join("-","Hello", "Aditya", "Menon");
        System.out.println(y);
        
        // 4. String equals
        System.out.println(y.equals("Hello-Aditya-Menon"));

        // 5. String isEmpty
        String z="";
        System.out.println(z.isEmpty());

        // 6. String concat
        System.out.println(x.concat(y));

        // 7. String replace
        System.out.println(y.replace("l", "w"));

        // 8. String equalsIgnoreCase
        System.out.println(y.equalsIgnoreCase("hello-aditya-menon"));

        // 9. String split
        System.out.println(y.indexOf("-"));

        // 10. toLowerCase
        System.out.println(y.toLowerCase());

        // 11. trim
        System.out.println("   BRUH   ".trim());

        // String valueOf
        System.out.println(String.valueOf("1"));

        sc.close();
    }
    
}