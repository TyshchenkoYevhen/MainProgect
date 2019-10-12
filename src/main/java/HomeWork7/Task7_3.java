package HomeWork7;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task7_3 {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {

        TextContainer testConteiner = new TextContainer();
        Class<?> classClass = testConteiner.getClass();

        if (!classClass.isAnnotationPresent(SaveTo.class)) {
            System.out.println("Class is not annotated");
        } else {
            Method[] methods = classClass.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(SaveTo.class)) {
                    SaveTo saveTo = classClass.getAnnotation(SaveTo.class);
                    method.invoke(testConteiner, testConteiner.text, saveTo.path());
                } else {
                    System.out.println("method is not annotated");
                }
            }
        }
    }
}
