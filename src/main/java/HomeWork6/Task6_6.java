package HomeWork6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Task6_6 {

    public static void main (String [] args){

        readData ();
    }

    private static void readData () {
        ArrayList<Integer> arrTest = new ArrayList<>();
        int b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int a = sc.nextInt();
            arrTest.add(a);
            while (true) {
                System.out.println("Again number :");
                a = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Value can't be text");
            e.printStackTrace();
        }
        for (int i = 0; i < arrTest.size(); i++ )
        System.out.println(arrTest);
    }
}


