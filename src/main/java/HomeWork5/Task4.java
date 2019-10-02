package HomeWork5;

public class Task4 {
    public static void main(String[] args) {
        int[] Array4 = new int[]{3, 5, 6, 15, 24, 12, 44, 59, 77, 74, 14, 16, 100, 81, 38};
        int k = Array4.length;
        System.out.println("Quantity of value into array " + k);
        int b = 0;
        for (int i = 0; i < Array4.length; i++) {
            if (i % 2 == 0) {
                b++; }

//            for (int j = 0; j < Array4[i]; j++) {
//                System.out.println(Array4[j]);

            }
        System.out.println("Even: " + b);
        }
}


