package com.company;

/*public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello Java!");
    }
}
*/

//1. Write a program which prints to the console some string 5 times.
/*public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java!");
        System.out.println("Hello Java!");
        System.out.println("Hello Java!");
        System.out.println("Hello Java!");
        System.out.println("Hello Java!");
    }
}*/
/*
public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 6) {
            System.out.println("Hello Java!");
            i++;
        }
    }
}*/

//2. Write a program which creates and initializes all primitive data types.
/*public class Main {
    public static void main (String args[]){
        byte ByteFrom = -128;
        byte ByteTo = 127;
        short ShortFrom = -32768;
        short ShortTo = 32767;
        int IntFrom = -2147483648;
        int IntTo;
        IntTo = 2147483647;
        long LongFrom = -9223372036854775808L;
        long LongTo = 9223372036854775807L;
        float Fl = 2.5f;
        double Doub = 1.5;
        char Char = 'a';
        boolean Bool = true;
        System.out.println("Byte from " + ByteFrom + " to " +  ByteTo);
        System.out.println("Short from " + ShortFrom + " to " + ShortTo);
        System.out.println("Int from " + IntFrom + " to " + IntTo);
        System.out.println("Long from " + LongFrom + " to " + LongTo );
        System.out.println("Float " + Fl);
        System.out.println("Double " + Doub);
        System.out.println("Char " + Char);
        System.out.println("Boolean " + Bool);
    }
}
*/

//3. Create a program which calculates square of a rectangle.
/*public class Main {
    public static void main (String args[]){
        int a = 3;
        int b = 7;
        int s = a*b;
        System.out.print( "Square of a rectangle is " + s);
    }
}*/

//4. Fix the program to get the correct result:
/*public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double result = (double) a / b;
        System.out.println(result);
    }
}*/

//5. Change the operations  to get the result 20:
/*public class Main {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result =  - a + b - c + d;

        System.out.println(result);
    }
}*/

//6. Comment redundant strings to get the output "Happy Java Learning":
/*public class Main {
    public static void main(String[] args) {
       // String s = "Java";
        //System.out.print("Happy");
        //System.out.print("Java Learning");
        //System.out.println("programming");
        System.out.print("Happy Java");
        //System.out.println("weekend");
       // System.out.println(s);
       // System.out.print("Python");
        System.out.print(" ");
        System.out.println("Learning");
    }
}*/
//7. Comment variables which are never used.
/*public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}
*/


//8*. Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.

public class Main {

    public static void main(String[] args) {
        printList(transformIntToChar(72, 69, 108, 108, 111, 32, 87, 111, 114, 108, 100));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}
