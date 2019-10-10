package HomeWork7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Task7_1 {
    int a();
    int b();
}

class MyAnnotations {
    @Task7_1(a = 2, b = 5)
    public static void equation() {
        MyAnnotations myAnnotations = new MyAnnotations();
    }
}


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