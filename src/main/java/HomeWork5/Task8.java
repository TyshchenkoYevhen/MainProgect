package HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task8 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("banana", "fruit");
        map.put("cherry", "berry");
        map.put("pineapple", "fruit");
        map.put("melon", "vegetable");
        map.put("cranberry", "berry");
        map.put("apple", "fruit");
        map.put("iris", "flower");
        map.put("potato", "vegetable");
        map.put("carrot", "vegetable");

        System.out.println("\n1. Export Map Key to List...");
        List<Integer> result = new ArrayList(map.keySet());
        result.forEach(System.out::println);
        System.out.println("\n2. Export Map Value to List...");

        List<String> result2 = new ArrayList(map.values());
        result2.forEach(System.out::println);

    }
}
