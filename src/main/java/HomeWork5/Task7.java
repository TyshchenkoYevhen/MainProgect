package HomeWork5;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("watermelon", "berry");
        myHashMap.put("banana", "fruit");
        myHashMap.put("cherry", "berry");
        myHashMap.put("pineapple", "fruit");
        myHashMap.put("melon", "vegetable");
        myHashMap.put("cranberry", "berry");
        myHashMap.put("apple", "fruit");
        myHashMap.put("iris", "flower");
        myHashMap.put("potato", "vegetable");
        myHashMap.put("carrot", "vegetable");

        for (Map.Entry entry : myHashMap.entrySet()) {
            if (entry.getValue() == "vegetable" )
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }
    }

