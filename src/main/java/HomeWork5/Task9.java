package HomeWork5;

import java.util.ArrayList;
import java.util.HashSet;

public class Task9 {
    public static void main(String[] args) {
        int number = 100;
        ArrayList<Integer> mark = new ArrayList<Integer>(number);

        for (int i = 0; i < number; i++) {
            int a = (int) (Math.random() * 100);
            mark.add(a);
        }
        System.out.println(mark);

        HashSet<Integer> setUniqueNumbers = new HashSet<Integer>();
       for(int x : mark) {
            setUniqueNumbers.add(x);
        }
        System.out.println(setUniqueNumbers);
    }
}






