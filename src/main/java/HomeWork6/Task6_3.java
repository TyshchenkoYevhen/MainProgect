package HomeWork6;

//3. Finish the program to handle all the possible exceptions:
  //  Print the cause of the exception to the console.

public class Task6_3 {

    public static void main(String[] args) {
       int a = args.length;
      //  int a = 1;
        System.out.println(a);

        int[] c = {1};
        try {
            int b = 10 / a;
            System.out.println(c[1]);
            } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Dividing by zero");
            }
            catch (ArrayIndexOutOfBoundsException  e) {
            e.printStackTrace();
            System.out.println("Length of array = 1");
        }
    }
}



