package HomeWork6;

//5. Throw a NullPointerException from the method iCanThrowException();
//Handle it in the main method.

public class Task6_5 {

        public static void main(String[] args)
        {
            try {
                iCanThrowException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void iCanThrowException() {
             throw new NullPointerException("Parameter Type cannot be null");

        }
    }
