package HomeWork4;

public class Dogs {
    private String name = "Sharik";
    private int age = 4;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name != "Sharik"){
            System.out.println("Is not Sharik");
        }else {
            this.name = name ;}
    }
    public int getAge (){
        return age;
    }
    public void setAge (int age){
        if (age < 0) {
            System.out.println("variable can not be less than 0");
        }else {
            this.age =age;
        }
    }
}
