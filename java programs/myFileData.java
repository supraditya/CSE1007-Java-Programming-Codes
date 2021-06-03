//data saved in myFile.txt

import java.util.*;
import java.io.*;

public class myFileData {
    public static void main(String[] args) {

        try {
            File info = new File("myFile.txt");
            if (info.createNewFile()) {
              System.out.println("File created: " + info.getName());
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your address");
        String add=sc.nextLine();
        System.out.println("Enter your Register Number");
        String reg=sc.nextLine();
        System.out.println("Enter the number of siblings you have");
        int s=sc.nextInt();
        name=name+"\n";
        add=add+"\n";
        reg=reg+"\n";
        try {
            FileWriter myWriter = new FileWriter("myFile.txt", false);
            myWriter.write(name);
            myWriter.write(add);
            myWriter.write(reg);
            myWriter.write(String.valueOf(s));
            myWriter.close();   
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // BufferedWriter br = new BufferedWriter(myWriter);
        // br.write("BAL: "+bal+"\n");
        // br.close();
        System.out.println("What do you want to do?");
        System.out.println("1. Read using byteStream");
        System.out.println("2. Read using character stream");
        System.out.println("Enter your choice");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
                // Reading from file using FileInputStream (bytestream)
                try{    
                    FileInputStream in=new FileInputStream("myFile.txt");    
                    int i=0;    
                    while((i=in.read())!=-1){    
                     System.out.print((char)i);    
                    }    
                    in.close();    
                  }catch (Exception e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                    }   
            break;

            case 2:
                // Reading from file using character stream
                try {
                    FileReader sourceStream = new FileReader("myFile.txt");
                    System.out.println("The file contents are:");
                    int temp;
                    while ((temp = sourceStream.read()) != -1)
                        System.out.print((char)temp);
                }catch (Exception e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }  

            break;

            default:
                System.out.println("Invalid choice");
                
        }

    }
}
