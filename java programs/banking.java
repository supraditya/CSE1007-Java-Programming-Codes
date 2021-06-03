// Transaction data saved in transactions.txt

import java.util.*;
import java.io.*;


public class banking {
    public static void main(String[] args) {

        try {
            File txn = new File("transactions.txt");
            if (txn.createNewFile()) {
              System.out.println("File created: " + txn.getName());
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
            
        Scanner sc=new Scanner(System.in);
        int bal, amt;
        String ch="";
        bal=0;
 
        while(true)
        {
            try {
                // Reading balance
                File myObj = new File("transactions.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    bal=Integer.parseInt(data);
                }
                myReader.close();
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


            System.out.println("Current Balance= "+bal);
            System.out.println("Choose one, or type \"quit\" to exit");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            ch=sc.next();
            ch=ch.toLowerCase();
            ch=ch.trim();
            switch(ch)
            {
                case "1":
                    // Withdrawal
                    System.out.println("Enter the amount");
                    amt=sc.nextInt(); 
                    if(bal>=amt)
                    {
                        bal=bal-amt;
                        System.out.println("Withdrawal successful");
                        try 
                        {
                            // Updating balance in file
                            FileWriter myWriter = new FileWriter("transactions.txt", false);
                            myWriter.write(String.valueOf(bal));
                            myWriter.close();
                            
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        System.out.println("Insufficient funds");
                    }
                    break;

                case "2":
                    // Withdrawal
                    System.out.println("Enter the amount");
                    amt=sc.nextInt();
                    bal=bal+amt;
                    System.out.println("Deposit Successful");
                    try 
                    {
                        // Updating balance in file
                        FileWriter myWriter = new FileWriter("transactions.txt", false);
                        myWriter.write(String.valueOf(bal));
                        myWriter.close();

                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case "quit":
                System.out.println("Quitting...");
                break;
                default: 
                System.out.println("Invalid choice");
                ch="";
            }
            if(ch.equals("quit"))
            {
                break;
            }
        }


    }
    
}
