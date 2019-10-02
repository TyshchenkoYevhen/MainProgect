package HomeWork5;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("BMW", "5");
        System.out.println("Do you have 'BMW'? " + myHashMap.containsKey("BMW"));
    }
}
