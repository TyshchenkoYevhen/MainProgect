package HomeWork2;

//1. Print numbers from 10 to 20 using all known cycles.

/*public class SecondClass {
    public static void main (String [] args){
        for (int i = 10; i <= 20; i++)
            System.out.println(i);
        }
    }*/

/*import java.util.ArrayList;

class SecondClass {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}*/

/*import java.util.ArrayList;
class SecondClass {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        for (Object i:list) {
            System.out.println(i);
        }
    }
}*/

/*public class SecondClass {
    public static void main (String [] args){
        int i = 10;
        while ( i <= 20){
            System.out.println(i);
            i++;
        }
    }
}*/

 /*class SecondClass {
    public static void main (String [] args){
        int i = 9;
        do {
            i++;
            System.out.println(i);
        }
        while ( i < 20);
        }
    }*/

/*class SecondClass {

    public static void main(String[] args) {
        int[] array = {10,11,12,13,14,15,16,17,18,19,20};

        for (int i:array) {
            System.out.println(i);
        }
    }
}*/

/*class SecondClass {
    public static void main (String [] args){
        for (int i = 10; i <= 20; i++){
            if (i == 21)
                break;
            System.out.println(i);
        }
        }
    }*/

/*class SecondClass {
    public static void main(String[] args) {
        for (int i = 10; ; i++) {
            if (i <= 20) {
                System.out.println(i);
                continue;
            }
            if (i == 21) {
                break;
            }
        }
    }
}*/

//2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.
//class SecondClass {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 100; i++) {
//            int r = i % 3;
//            if (r == 0)
//                System.out.println(i);
//        }
//    }
//}

//3. Fill the array with numbers from 100 to 0.

//import java.util.Arrays;
//
//class SecondClass {
//    public static void main(String[] args) {
//        int[] Array1 = new int[101];
//
//        int i =100;
//        for(int j = 0; j < 100; j++) {
//
//            Array1[j]=i;
//            i--;
//
//        }
//        System.out.println(Arrays.toString(Array1));
//
//    }
//}
//4. Given an array of 10 integers. To display the sum of all its elements except the first and last.
//class SecondClass{
//
//    public static void main(String[] args) {
//
//        int[] array1 = new int[10];
//
//        array1[0]=1;
//        array1[1]=2;
//        array1[2]=3;
//        array1[3]=4;
//        array1[4]=5;
//        array1[5]=6;
//        array1[6]=7;
//        array1[7]=8;
//        array1[8]=9;
//        array1[9]=10;
//
//        int sum = 0;
//
//        for( int i = 1; i < array1[8]; i++){
//            sum += array1[i];
//        }
//
//        for( int i = 1; i < array1.length; i++){
//            System.out.println(array1[i]);
//        }
//
//        System.out.println("Сумма - "+ sum);
//
//    }
//}

//5. Write a function which calculates and returns the minimum of 4 arguments.

//class SecondClass {
//    public static void main(String[] args) {
//        int minOf4Arguments = min(8,2,3,4);
//        System.out.println(minOf4Arguments);
//    }
//
//    public static int min(int a, int b, int c, int d) {
//        return min(a, b) < min(c, d) ? min(a, b) : min (c, d);
//    }
//
//    public static int min(int a, int b) {
//        return (a < b) ? a : b;
//    }
//}


//import java.util.Arrays;
//import java.util.Collections;
//
//public class SecondClass {
//    public static void main(String[] args) {
//        Integer[] numbers = { 8, 2, 6, 7, 0};
//
//        int min = (int) Collections.min(Arrays.asList(numbers));
//        int max = (int) Collections.max(Arrays.asList(numbers));
//
//        System.out.println("Min number: " + min);
//        System.out.println("Max number: " + max);
//    }
//}

//6. Write a method named getEvenDigitSum with one parameter of the type "int".
//       The method should return the sum of even digits within the number. If the number is negative, method should return -1;


/*class SecondClass {
   public static void main(String[] args) {
        int getEvenDigitSum = conv(10);
        System.out.println(getEvenDigitSum);
    }

    public static int conv(int a) {
        if (a < 0) return -1;
        int b = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) b += i;
        }

        return b;
    }
}*/



//7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//        If one of the parameters is < 10, method should return -1 to indicate an invalid value.
 //       The method should return the greatest common divisor of two numbers.


class SecondClass {
    public static void main(String[] args) {
        int getGreatestCommonDivisor = div(120,140);
        System.out.println(getGreatestCommonDivisor);
    }

    static int div(int first, int second) {
        if (first < 10 || second < 10)
            return -1;
        if (first == 0)
            return -1;
        if (second == 0)
            return -1;
        for (; ; )
            if ((first %= second) == 0)
                return second;
            else if ((second %= first) == 0)
                return first;
    }
}


//8. Write a program which prints the next figure to the console:
//        **********
//        **********
//        **********
//        **********

//public class SecondClass{
//    public static void main(String[] args){
//
//        for(int i=0; i<4; i++){
//            for(int j=0; j<10; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//9. Write a program which prints the next figure to the console:
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *******
//public class SecondClass{
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 1; j++) {
//                System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//        for (int i = 2; i <= 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 3; i <= 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i <= 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 6; i <= 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//10*. Write a program which prints the next figure to the console:
//        **********
//        *           *
//        *           *
//        *           *
//        **********
//public class SecondClass {
//    public static void main(String[] args) {
//
//        for (int row = 0; row < 10; row++) {
//            for (int column = 0; column < 10; column++) {
//                if (row == 0 || row == 9 )
//                    System.out.print("* ");
//                else if (column == 0 || column == 9)
//                    System.out.print("* ");
//                else
//                    {System.out.print("  ");}
//
//            }
//            System.out.println();
//        }
//    }
//}