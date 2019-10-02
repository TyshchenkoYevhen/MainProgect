package HomeWork5;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/*public class Task8 {

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

            System.out.println(" 'watermelon' + 'berry' " + myHashMap.containsKey("vegetable"));
        }

    }*/

public class Task8 {

    public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");

        System.out.println("\n1. Export Map Key to List...");

        List<Integer> result = new ArrayList(map.keySet());

        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");

        List<String> result2 = new ArrayList(map.values());

        result2.forEach(System.out::println);