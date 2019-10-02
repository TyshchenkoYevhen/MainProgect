package HomeWork5;

import java.util.HashMap;

public class Task8 {

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

    }
