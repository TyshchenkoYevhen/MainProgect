package HomeWork7;

//1. Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface Test {
    int a();
    int b();
}

class Sum {
    @Test(a = 38, b = 5)
    public static void test(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
}

public class Task7_1 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Sum.class;
            Method method = cls.getMethod("test", int.class, int.class);
            if (method.isAnnotationPresent(Test.class)) {

                Test ma = method.getAnnotation(Test.class);
                method.invoke(null, ma.a(), ma.b());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}