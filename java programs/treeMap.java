import java.util.*;
public class treeMap {
    // Declaring a TreeMap
    static TreeMap<String, String> tree_map;

    public static void main(String[] args) 
    {
        // Creating an empty TreeMap
        tree_map= new TreeMap<String, String>();
        System.out.println("TreeMap successfully created");

        // Inserting nodes into the tree map
        tree_map.put( "18BCE0943", "Pranjal Kalbag");
        tree_map.put("18BCE0736", "Sagnik Sarkar");
        tree_map.put("18BCE2140", "Ipsita Goel");
        tree_map.put("18BEC0888", "Ayushman Mookherjee");
        tree_map.put("18BCE0942", "Atharva Khaire");
        tree_map.put("18BCE0773", "Srinivasan Sharma");
        tree_map.put("18BCE2094", "Sahaj Chawla");
        tree_map.put("18BCE2067", "Gagan Yadav");
        tree_map.put("18BCE2043", "Adittya Mittal");
        tree_map.put("18BCE2048", "Ansh Goel");
  
        // Displaying the tree map
        System.out.println("TreeMap: " + tree_map+"\n");

        // Deleting node from tree map
        tree_map.remove("18BCE0736");

        // Displaying tree map post deletion of node
        System.out.println("TreeMap after deletion of node: " + tree_map);
    }
    
}
