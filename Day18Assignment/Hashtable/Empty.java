package Hashtable;
import java.util.*;
public class Empty {

public class Hash_Table_Demo {
    public static void main(String[] args)
    {
        Hashtable<String, Integer> hash_table = new Hashtable<String, Integer>();
        hash_table.put("hi", 10);
        hash_table.put("how", 15);
        hash_table.put("are", 20);
        hash_table.put("you", 25);
        hash_table.put("buddy", 30);
        System.out.println("The table is: " + hash_table);
        System.out.println("Is the table empty? " + hash_table.isEmpty());
    }
}
}