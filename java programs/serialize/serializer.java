package serialize;

import java.io.*;
public class serializer {
   public static void main(String[] args) {
      Employee e = new Employee("Aditya Menon", "3102, Phillipa, Rodas Enclave", 12345678, 123 );
      try {
         FileOutputStream fileOut =
         new FileOutputStream("serialize/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.flush();
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
class Employee implements Serializable {
   public static final long serialVersionUID = 1L;
   public String name;
   public String address;
   public transient long SSN;
   public int number;
   Employee(String name, String addr, long ssn, int num)
   {
      this.name=name;
      this.address=addr;
      this.SSN=ssn;
      this.number=num;
   }
}
