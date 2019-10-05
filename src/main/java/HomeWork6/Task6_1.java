package HomeWork6;

public class Task6_1 {

    public static void main(String[] args) {
        try {
            System.out.println(getNum(15));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int getNum(int a) {
        if (a > 0) {
            System.out.println("Num > 0");
        } else if (a < 0) {
            System.out.println("Num < 0");
        } else {
            throw new IllegalArgumentException("Value can't be" + a);
        }
        return a;
    }
}
