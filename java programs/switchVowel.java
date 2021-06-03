import java.util.*;
class switchVowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().toLowerCase().charAt(0);
        System.out.println(ch);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': 
                System.out.println("Character is a vowel");
                break;
            default: System.out.println("Character is not a vowel");
        }
        sc.close();
    }
}