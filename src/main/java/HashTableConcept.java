
//A hash table is a data structure that is used to store keys/value pairs

import java.util.Hashtable;

public class HashTableConcept {

    public static void main(String[] args) {

        Hashtable Table = new Hashtable();

        Table.put("Key","1");
        Table.put("Key1","10");
        Table.put("Key2","100");
        Table.put("Key3","100");

        System.out.println(Table.size());
        System.out.println(Table.get("Key1"));

    }


}
