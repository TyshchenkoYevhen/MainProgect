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


