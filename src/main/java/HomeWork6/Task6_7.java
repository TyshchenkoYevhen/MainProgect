package HomeWork6;

//7. In the Example class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
//        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task6_7 {

    private final String first, last;


    public Task6_7(String first, String last) {
        this.first = first;
        this.last = last;
        return ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task6_7 task6_7 = (Task6_7) o;
        return first.equals(task6_7.first) &&
                last.equals(task6_7.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Task6_7> s = new HashSet<>();
        s.add(new Task6_7("Donald", "Duck"));
        System.out.println(s.contains(new Task6_7("Donald", "Duck")));
    }

}
