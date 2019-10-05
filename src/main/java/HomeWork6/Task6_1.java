package HomeWork6;

public class Task6_1 {

    public static void main(String[] args) {
        System.out.println(getNum(0));
    }

    public static int getNum(int a) throws IllegalArgumentException {
        if (a == 0){
            throw new IllegalArgumentException("Value can't be" + a);
        }
        {
        if ((a > 0) || (a < 0)) {
            System.out.println("Num > 0 or Num < 0");
            return a;
        }
        else
            System.out.println(a);
            return a;
        }
    }
}

