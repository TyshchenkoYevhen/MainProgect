package HomeWork7;

import java.lang.reflect.*;


public class Task7_2 {
    public static void main(String[] args) {

        Class<?> s = Saver.class;

        SaveTo saveto = s.getAnnotation(SaveTo.class);
        String path = saveto.path();
        String method = saveto.method();

        try{
            Method saving = s.getMethod(method, String.class);
            saving.invoke(null, path);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

