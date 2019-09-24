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