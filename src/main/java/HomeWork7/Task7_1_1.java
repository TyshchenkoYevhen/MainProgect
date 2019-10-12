package HomeWork7;

//1. Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface XMLElement {
    String name();
}

@Target(value= ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
@interface XMLRoot {
    String name();
}

class SimpleUser
{
    String firstName;
    String lastName;

    public SimpleUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}

@XMLRoot(name = "user")
class User
{
    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @XMLElement(name = "first")
    public String getFirstName(){
        return firstName;
    }

    @XMLElement(name = "last")
    public String getLastName(){
        return lastName;
    }
}


class XMLSerialiser {

    public static String serialise(Object obj){
        String result = "";

        if (obj == null) return null;
        Class<?> cls = obj.getClass();
        boolean isAnnotated = cls.isAnnotationPresent(XMLRoot.class);

        String rootElementName = "root";
        if (isAnnotated)
        {
            XMLRoot root = cls.getAnnotation(XMLRoot.class);
            rootElementName = root.name();
        }

        result += "<" + rootElementName + ">\n";

        Method[] methods = cls.getMethods();

            for(Method method : methods)  {
                if (isAnnotated)
                {
                    if (method.isAnnotationPresent(XMLElement.class) && method.getReturnType() != void.class && method.getParameterCount() == 0)
                    {
                        XMLElement element = method.getAnnotation(XMLElement.class);
                        result += SerializeElement(obj, method, element.name());
                    }
                }
                else
                {
                    if (method.getReturnType() != void.class && method.getParameterCount() == 0 && method.getName().startsWith("get")){
                        result += SerializeElement(obj, method, method.getName());
                    }
                }
            }

        result += "</" + rootElementName + ">";

        return result;
    }

    private static String SerializeElement(Object obj, Method method, String elementName){
        try {
            Object value = method.invoke(obj);
            String resStr = value != null ? value.toString() : "";
            return "<" + elementName + ">" + resStr + "</" + elementName + ">\n";
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return "";
    }
}

public class Task7_1_1 {
    public static void main(String[] args) {
        try {
            User user = new User("Vasia", "Pupkin");

            SimpleUser simpleUser = new SimpleUser("Simple", "Pupkin");

            String result = XMLSerialiser.serialise(user);

            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}