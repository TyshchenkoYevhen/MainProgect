package HomeWork7;

class ClassToTestA {
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    @Task7_1(a = 2, b = 5)
    public static boolean test(int a, int b){

        if (sum(a, b) == 7)
            return true;
        else
            return false;
    }
}
