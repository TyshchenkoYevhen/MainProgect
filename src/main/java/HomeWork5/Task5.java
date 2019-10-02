package HomeWork5;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList <String> Names = new ArrayList<>();
        Names.add("Yevhen");
        Names.add("Roman");
        Names.add("Dmytriy");
        Names.add("Maria");
        Names.add("Taras");
        System.out.println(Names.size());
        for (String i : Names) {
            System.out.println(i);

        }
    }
}